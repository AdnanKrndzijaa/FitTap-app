package com.example.fittap;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class ListAdapter extends BaseAdapter {
    private Context context;
    private List<Workouts> workoutsList;

    public ListAdapter(Context context, List<Workouts> workoutsList) {
        this.context = context;
        this.workoutsList = workoutsList;
    }

    @Override
    public int getCount() {
        return workoutsList.size();
    }

    @Override
    public Object getItem(int i) {
        return workoutsList.get(i);
    }

    @Override
    public long getItemId(int i) {
        return workoutsList.get(i).getId();
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        LayoutInflater inflater = LayoutInflater.from(context);
        view = inflater.inflate(R.layout.workout_list_items, viewGroup,false);
        Workouts workouts = workoutsList.get(i);

        ImageView imageView = view.findViewById(R.id.exercise_image);
        TextView titleTextView = view.findViewById(R.id.name_view);
        TextView descriptionTextView = view.findViewById(R.id.duration_view);


        imageView.setImageResource(workouts.getImage());
        titleTextView.setText(workouts.getName());
        descriptionTextView.setText(workouts.getDuration());

        return view;
    }
}
