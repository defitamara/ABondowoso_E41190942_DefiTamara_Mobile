package com.def.minggu4listrecyclerview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MahasiswaAdapter extends RecyclerView.Adapter<MahasiswaAdapter.MahasiswaViewHolder> {

    private ArrayList<Mahasiswa> dataList;

    public MahasiswaAdapter(ArrayList<Mahasiswa> dataList) {
        this.dataList = dataList;
    }

    @NonNull
    @Override
    public MahasiswaAdapter.MahasiswaViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.row_mahasiswa,parent,false);
        return new MahasiswaViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MahasiswaAdapter.MahasiswaViewHolder holder, int position) {
        holder.txtNama.setText(dataList.get(position).getNama());
        holder.txtNim.setText(dataList.get(position).getNim());
        holder.txtNoHp.setText(dataList.get(position).getNoHp());
    }

    @Override
    public int getItemCount() {
        return (dataList != null) ? dataList.size() : 0 ;
    }

    public class MahasiswaViewHolder extends RecyclerView.ViewHolder {
        private TextView txtNama, txtNim, txtNoHp;

        public MahasiswaViewHolder(@NonNull View itemView) {
            super(itemView);
            txtNama = itemView.findViewById(R.id.tx_nama_mahasiswa);
            txtNim = itemView.findViewById(R.id.tx_nim_mahasiswa);
            txtNoHp = itemView.findViewById(R.id.tx_nohp_mahasiswa);
        }
    }
}
