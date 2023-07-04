package com.example.demo_du_an_mau.adapter;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.demo_du_an_mau.R;
import com.example.demo_du_an_mau.Sach.PhieuMuon;

import java.util.ArrayList;

public class PhieuMuonadapter extends RecyclerView.Adapter<PhieuMuonadapter.ViewHolder>{
    private ArrayList<PhieuMuon> list;

    public PhieuMuonadapter(ArrayList<PhieuMuon> list, Context context) {
        this.list = list;
        this.context = context;
    }

    private Context context;
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = ((Activity)context).getLayoutInflater();
        View view =inflater.inflate(R.layout.item_recycler_phieumuon,parent);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.txtMaPM.setText("Mã PM"+list.get(position).getMapm());
    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public  class  ViewHolder extends RecyclerView.ViewHolder{
        TextView txtMaPM,txtMaTV,txtTenTV,txtMaTT,txtMaSach,txtTenSach,txtNgay,txtTrangThai,txtTien;
        Button btnTraSach;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            txtMaPM=itemView.findViewById(R.id.txtMaPM);
            txtMaTV=itemView.findViewById(R.id.txtMaTV);
            txtTenTV=itemView.findViewById(R.id.txtTenTv);
            txtMaPM=itemView.findViewById(R.id.txtMaPM);
            txtTien=itemView.findViewById(R.id.txtTien);
            txtTrangThai=itemView.findViewById(R.id.txtTrangThai);
            txtNgay =itemView.findViewById(R.id.txtNgay);
        }
    }
}
