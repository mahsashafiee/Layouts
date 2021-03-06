package com.example.layouts;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.layouts.adapters.UserAdapter;
import com.example.layouts.models.User;
import com.example.layouts.repository.UserRepository;

import java.util.List;

public class UserListFragment extends Fragment {

    RecyclerView mRecyclerView;

    public UserListFragment() {
        // Required empty public constructor
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_user_list, container, false);
        mRecyclerView = view.findViewById(R.id.recyclerView);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        List<User> users = UserRepository.getInstance().getUsers();
        mRecyclerView.setAdapter(new UserAdapter(users, getContext()));
        return view;
    }


}