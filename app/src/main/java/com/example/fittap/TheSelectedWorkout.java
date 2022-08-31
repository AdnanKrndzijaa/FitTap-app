package com.example.fittap;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class TheSelectedWorkout extends AppCompatActivity {
    private TextView title, desc, duration;
    private ImageView image;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_the_selected_workout);

        title = findViewById(R.id.workout_title);
        desc = findViewById(R.id.workout_description);
        duration = findViewById(R.id.workout_duration);
        image = findViewById(R.id.workout_image);

        Bundle extras = getIntent().getExtras();
        if(extras != null) {
            long iddd = extras.getLong(TheList.EXTRA_WORK_ID);
            Workouts workout = Database.getInsance(this).workoutsDao().getWorkoutById(iddd);
            title.setText(workout.getName());
            duration.setText(workout.getDuration());
            desc.setText(workout.getDescription());

            image.setImageResource(workout.getImage());
        }
    }
}