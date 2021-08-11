package com.example.schatzsuche;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class StudiumDetailsRecylerAdapter extends RecyclerView.Adapter<StudiumDetailsRecylerAdapter.MyViewHolder> {
    private ArrayList<Veranstaltung> lvs;

    public StudiumDetailsRecylerAdapter(ArrayList<Veranstaltung> lvs) {
        this.lvs = lvs;

    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.studium_aussicht, parent, false);
        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

        String name = lvs.get(position).getName();
        Integer ects = lvs.get(position).getECTS();

        holder.nametxt.setText(name);
        holder.ects.setText(ects.toString());
    }

    @Override
    public int getItemCount() {
        // System.out.println("size of lvs :" + lvs);
        return lvs.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        private TextView nametxt;
        private TextView ects;
        public MyViewHolder(final View view) {
            super(view);
            nametxt = view.findViewById(R.id.nameLv);
            ects = view.findViewById(R.id.ectsText);
        }

    }


}
