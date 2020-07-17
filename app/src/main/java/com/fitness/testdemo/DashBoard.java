package com.fitness.testdemo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;

import java.util.ArrayList;

public class DashBoard extends AppCompatActivity {
    RecyclerView featuredRecycler, mostviewedRecycler, categoriesRecycler;
    RecyclerView.Adapter adapter;
    private GradientDrawable gradient1, gradient2, gradient3, gradient4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_dash_board);
        //hooks
        featuredRecycler=findViewById(R.id.featured_recycler);
        mostviewedRecycler=findViewById(R.id.mostviewedrecycler);
        categoriesRecycler=findViewById(R.id.categoriesrecycler);
        featuredRecycler();
        mostviewedRecycler();
        categoriesRecycler();
    }

    private void categoriesRecycler() {
        //All Gradients
        gradient2 = new GradientDrawable(GradientDrawable.Orientation.LEFT_RIGHT, new int[]{0xffd4cbe5, 0xffd4cbe5});
        gradient1 = new GradientDrawable(GradientDrawable.Orientation.LEFT_RIGHT, new int[]{0xff7adccf, 0xff7adccf});
        gradient3 = new GradientDrawable(GradientDrawable.Orientation.LEFT_RIGHT, new int[]{0xfff7c59f, 0xFFf7c59f});
        gradient4 = new GradientDrawable(GradientDrawable.Orientation.LEFT_RIGHT, new int[]{0xffb8d7f5, 0xffb8d7f5});
        ArrayList<CategoriesHelperClass> categoriesHelperClasses = new ArrayList<>();
        categoriesHelperClasses.add(new CategoriesHelperClass(R.drawable.katrina2, "Katrina", gradient1));
        categoriesHelperClasses.add(new CategoriesHelperClass(R.drawable.katrina1, "Katrina K", gradient2));
        categoriesHelperClasses.add(new CategoriesHelperClass(R.drawable.katrina3, "Katrina Ka", gradient3));
        categoriesHelperClasses.add(new CategoriesHelperClass(R.drawable.katrina4, "Katrina Kai", gradient4));
        categoriesHelperClasses.add(new CategoriesHelperClass(R.drawable.kplogo126, "Sudhir S", gradient1));


        categoriesRecycler.setHasFixedSize(true);
        adapter = new CategoriesAdapter(categoriesHelperClasses);
        categoriesRecycler.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));
        categoriesRecycler.setAdapter(adapter);

    }

    private void mostviewedRecycler() {
        mostviewedRecycler.setHasFixedSize(true);
        mostviewedRecycler.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL,false));
        ArrayList<MostViewedHelperClass> mostViewedHelperClasses = new ArrayList<>();
        mostViewedHelperClasses.add(new MostViewedHelperClass(R.drawable.katrina2,"Katrina Kaif","Without any doubt she is the most beautiful actress of all time"));
        mostViewedHelperClasses.add(new MostViewedHelperClass(R.drawable.katrina3, "Katrina K", "Without any doubt she is the most beautiful actress of all time"));
        mostViewedHelperClasses.add(new MostViewedHelperClass(R.drawable.katrina4, "Katrina Kai", "Without any doubt she is the most beautiful actress of all time"));
        mostViewedHelperClasses.add(new MostViewedHelperClass(R.drawable.katrina1, "Katrina Ka", "Without any doubt she is the most beautiful actress of all time"));
        adapter=new MostViewedAdapter(mostViewedHelperClasses);
        mostviewedRecycler.setAdapter(adapter);
    }

    private void featuredRecycler() {
        featuredRecycler.setHasFixedSize(true);
        featuredRecycler.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));
        ArrayList<FeaturedHelperClass> featuredLocations = new ArrayList<>();
        featuredLocations.add(new FeaturedHelperClass(R.drawable.katrina2, "Katrina Kaif", "Without any doubt she is the most beautiful actress of all time"));
        featuredLocations.add(new FeaturedHelperClass(R.drawable.katrina3, "Katrina K", "Without any doubt she is the most beautiful actress of all time"));
        featuredLocations.add(new FeaturedHelperClass(R.drawable.katrina4, "Katrina Kai", "Without any doubt she is the most beautiful actress of all time"));
        featuredLocations.add(new FeaturedHelperClass(R.drawable.katrina1, "Katrina Ka", "Without any doubt she is the most beautiful actress of all time"));
        adapter=new FeaturedAdapter(featuredLocations);
        featuredRecycler.setAdapter(adapter);
    }
}