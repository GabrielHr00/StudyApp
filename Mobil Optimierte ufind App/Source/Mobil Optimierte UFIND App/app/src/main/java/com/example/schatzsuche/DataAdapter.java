package com.example.schatzsuche;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;


import androidx.annotation.NonNull;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.RecyclerView;

import com.example.schatzsuche.databinding.ItemDataBinding;

import java.util.Vector;

public class DataAdapter extends RecyclerView.Adapter<DataAdapter.DataVH> {

    Vector<String> list;
    Context context;

    public DataAdapter(Vector<String> list, Context context) {
        this.list = list;
        this.context = context;
    }

    @NonNull
    @Override
    public DataVH onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        ItemDataBinding binding = DataBindingUtil
                .inflate(LayoutInflater.from(parent.getContext()), R.layout.item_data, parent, false);
        return new DataVH(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull DataVH holder, int position) {
        holder.binding.nameTv.setText(list.get(position));
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    static class DataVH extends RecyclerView.ViewHolder {
        ItemDataBinding binding;

        public DataVH(@NonNull ItemDataBinding binding) {
            super(binding.getRoot());
            this.binding = binding;

        }
    }

}
