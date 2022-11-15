package com.example.whatsapp;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;


public class CallsFragment extends Fragment {
    RecyclerView callRecyclerView;
    CallAdapter callAdapter;
    ArrayList<CallData> callData = new ArrayList<>();

    public CallsFragment() {
    }



    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        return inflater.inflate(R.layout.fragment_calls, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        setUpRecycler(view);
    }

    private void setUpRecycler(View view){

        callData.add(new CallData("YASMINE","Today, 11:00 AM",R.drawable.user_image));
        callData.add(new CallData("YASMINE","Today, 11:00 AM",R.drawable.user_image));
        callData.add(new CallData("YASMINE","Today, 11:00 AM",R.drawable.user_image));
        callData.add(new CallData("YASMINE","Today, 11:00 AM",R.drawable.user_image));
        callData.add(new CallData("YASMINE","Today, 11:00 AM",R.drawable.user_image));
        callData.add(new CallData("YASMINE","Today, 11:00 AM",R.drawable.user_image));
        callData.add(new CallData("YASMINE","Today, 11:00 AM",R.drawable.user_image));
        callData.add(new CallData("YASMINE","Today, 11:00 AM",R.drawable.user_image));
        callData.add(new CallData("YASMINE","Today, 11:00 AM",R.drawable.user_image));


        callRecyclerView = view.findViewById(R.id.call_recyclerview);
        callAdapter = new CallAdapter(callData);
        callRecyclerView.setAdapter(callAdapter);
        callRecyclerView.setLayoutManager(new LinearLayoutManager(requireContext()));


    }
}