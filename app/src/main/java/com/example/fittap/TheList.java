package com.example.fittap;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;

import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.example.fittap.databinding.ActivityTheListBinding;

import java.util.List;

public class TheList extends AppCompatActivity {
    public static final String EXTRA_WORK_ID = "TheList/EXTRA_WORK_ID";
    private ListView listView;
    private TextView listTitle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_the_list);
        listTitle = findViewById(R.id.listTitle);
        Bundle extras = getIntent().getExtras();

        listView = findViewById(R.id.list_view_container);

        setupListAdapter(extras.getString(HomePage.EXTRA_TYPE));

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                long idd = parent.getItemIdAtPosition(position);
                Intent intent = new Intent(TheList.this,TheSelectedWorkout.class);
                intent.putExtra(EXTRA_WORK_ID,idd);
                startActivity(intent);
            }
        });
    }

    private void setupListAdapter(String type){
        List<Workouts> work = Database.getInsance(this).workoutsDao().getByType(type);
        ListAdapter adapter = new ListAdapter(this,work);
        listView.setAdapter(adapter);
    }
}