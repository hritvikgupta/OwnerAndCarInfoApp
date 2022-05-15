package com.example.ownerandcarinfoapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class carAdapter extends RecyclerView.Adapter<carAdapter.ViewHolder> {
    ArrayList<car> cars;
    ItemClicked activity;
    public interface ItemClicked
    {
        void onItemClicked(int index);
    }
    public carAdapter(Context context, ArrayList<car> cars)
    {
        this.cars = cars;
        activity  = (ItemClicked) context;

    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        ImageView ivMakeAdap;
        TextView tvModelAdap, tvOwnerAdap;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            ivMakeAdap = itemView.findViewById(R.id.ivMakeAdap);
            tvModelAdap = itemView.findViewById(R.id.tvModelAdap);
            tvOwnerAdap = itemView.findViewById(R.id.tvOwnerAdap);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    activity.onItemClicked(cars.indexOf((car) view.getTag()));

                }
            });



        }
    }

    @NonNull
    @Override
    public carAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.raw_layout, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull carAdapter.ViewHolder holder, int position) {
            holder.itemView.setTag(cars.get(position));
            holder.tvOwnerAdap.setText(cars.get(position).getOwnerName());
            holder.tvModelAdap.setText(cars.get(position).getModel());
            if(cars.get(position).getMake().equals("volkswagen"))
            {
                holder.ivMakeAdap.setImageResource(R.drawable.volkswagen);

            }
            else if(cars.get(position).getMake().equals("nissan"))
            {
                holder.ivMakeAdap.setImageResource(R.drawable.nissan);

            }
            else
            {
                holder.ivMakeAdap.setImageResource(R.drawable.mercedes);
            }

    }

    @Override
    public int getItemCount() {
        return cars.size();
    }
}
