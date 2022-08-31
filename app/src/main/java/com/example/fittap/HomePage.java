package com.example.fittap;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class HomePage extends AppCompatActivity {
    public static final String EXTRA_TYPE = "HomePage/EXTRA_TYPE";
    private TextView theText;
    private ImageView imageAb, imageArm, imageLeg, imageSholder;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);

        imageAb = findViewById(R.id.abbImageButton);
        imageArm = findViewById(R.id.bicepsImageButton);
        imageLeg = findViewById(R.id.legImageButton);
        imageSholder = findViewById(R.id.sholderImageButton);
        theText=findViewById(R.id.welcome_text);

        theText.setText("Welcome to Your Future ");
        imageAb.setImageResource(R.drawable.aby);
        imageArm.setImageResource(R.drawable.army);
        imageSholder.setImageResource(R.drawable.sholdery);
        imageLeg.setImageResource(R.drawable.legy);
    }

    public void onAbbClick(View view){
        Intent intent = new Intent(this,TheList.class);
        intent.putExtra(EXTRA_TYPE,"Ab");
        startActivity(intent);
    }

    public void onLegClick(View view){
        Intent intent = new Intent(this,TheList.class);
        intent.putExtra(EXTRA_TYPE,"Leg");
        startActivity(intent);
    }

    public void onBackClick(View view){
        Intent intent = new Intent(this,TheList.class);
        intent.putExtra(EXTRA_TYPE,"Sholder");
        startActivity(intent);
    }

    public void onArmClick(View view){
        Intent intent = new Intent(this,TheList.class);
        intent.putExtra(EXTRA_TYPE,"Arm");
        startActivity(intent);
    }
}