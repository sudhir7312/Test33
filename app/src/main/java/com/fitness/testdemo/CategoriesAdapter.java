package com.fitness.testdemo;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class CategoriesAdapter extends RecyclerView.Adapter<CategoriesAdapter.AdapterAllCategoriesViewholder> {
    ArrayList<CategoriesHelperClass> categoriesLocations;

    public CategoriesAdapter(ArrayList<CategoriesHelperClass> categoriesLocations) {
        this.categoriesLocations = categoriesLocations;
    }

    @NonNull
    @Override
    public AdapterAllCategoriesViewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.categories_card_design,parent,false);
        AdapterAllCategoriesViewholder lvh = new AdapterAllCategoriesViewholder(view);
        return lvh;
    }

    @Override
    public void onBindViewHolder(@NonNull AdapterAllCategoriesViewholder holder, int position) {
       CategoriesHelperClass helperClass = categoriesLocations.get(position);
       holder.imageView.setImageResource(helperClass.getImagec());
       holder.textView.setText(helperClass.getTitlec());
       holder.relativeLayout.setBackground(helperClass.getRlayout());
    }

    @Override
    public int getItemCount() {
        return categoriesLocations.size();
    }

    public static class AdapterAllCategoriesViewholder extends RecyclerView.ViewHolder {
        RelativeLayout relativeLayout;
        ImageView imageView;
        TextView textView;

        public AdapterAllCategoriesViewholder(@NonNull View itemView) {
            super(itemView);
            //hooks
            relativeLayout=itemView.findViewById(R.id.background_gradient);
            imageView=itemView.findViewById(R.id.categories_image);
            textView=itemView.findViewById(R.id.categories_title);
        }
    }
}
