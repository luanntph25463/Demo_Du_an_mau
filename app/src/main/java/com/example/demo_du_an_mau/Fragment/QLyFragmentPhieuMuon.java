package com.example.demo_du_an_mau.Fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import com.example.demo_du_an_mau.R;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class QLyFragmentPhieuMuon extends Fragment {
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_qlyphieumuon,container,false);
        RecyclerView  recyclerViewQlPhieuMuon = view.findViewById(R.id.recyclerQLphieumuon);
        FloatingActionButton flatadd = view.findViewById(R.id.floatadd);
        //giao dien

        //data

        //adapter
        return view;
    }
}
