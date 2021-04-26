package com.example.demo_recylview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
//use alt enter
//my viewholder is a method of class AdotarMatch
//create subclass extend with recycle view
//all method implement by alt+ enter
//implement super on sub class
public class AdapterMatch extends RecyclerView.Adapter<AdapterMatch.Myviewholder> {

    Context context;
    ArrayList<Pojo> data = new ArrayList<>();

    public AdapterMatch(Context context, ArrayList<Pojo> data) {
        this.context = context;
        this.data = data;
    }

    @NonNull
    @Override
    public AdapterMatch.Myviewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_design, parent, false);
        return new AdapterMatch.Myviewholder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull AdapterMatch.Myviewholder holder, int position) {
        Pojo pojo = data.get(position);
        holder.date.setText(pojo.getDate());
        holder.team1.setText(pojo.getTeam1());
        holder.team2.setText(pojo.getTeam2());
        holder.time.setText(pojo.getTime());

    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    public class Myviewholder extends RecyclerView.ViewHolder{
        TextView date,team1,team2,time;

        public Myviewholder(@NonNull View itemView) {
            super(itemView);
            date = itemView.findViewById(R.id.date);
            team1= itemView.findViewById(R.id.team1);
            team2 = itemView.findViewById(R.id.team2);
            time = itemView.findViewById(R.id.time);
        }
    }

}
