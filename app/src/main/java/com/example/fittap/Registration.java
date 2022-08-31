package com.example.fittap;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.NotificationCompat;
import androidx.core.app.NotificationManagerCompat;

import android.app.AlertDialog;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Registration extends AppCompatActivity {
    private EditText name, age, password;
    public static final String CHANNEL_ID="My channel";
    public static final int NOT_ID=1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);
        name = findViewById(R.id.reg_name);
        age = findViewById(R.id.reg_age);
        password = findViewById(R.id.reg_password);

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O){
            NotificationChannel channel= new NotificationChannel(CHANNEL_ID, "My custom channel", NotificationManager.IMPORTANCE_DEFAULT);
            NotificationManager manager=getSystemService(NotificationManager.class);

            manager.createNotificationChannel(channel);
        }
    }

    public void onSave(View view){
        if(Database.getInsance(this).usersDao().getUserByNameSurnamePassword(name.getText().toString(),
                                                                             password.getText().toString()) == null) {
            String value = age.getText().toString();
            Users user = new Users(name.getText().toString(), Integer.parseInt(value), password.getText().toString());
            Database.getInsance(this).usersDao().add(user);
            Intent intent = new Intent(this, MainActivity.class);
            startActivity(intent);

            }
        else{
            new AlertDialog.Builder(Registration.this)
                    .setMessage("FitTap")
                    .setTitle("WROOOONG")
                    .show();

            NotificationCompat.Builder builder=new NotificationCompat.Builder(Registration.this,CHANNEL_ID );
            builder.setContentTitle("WROOOONG")
                    .setContentText("The user already exists")
                    .setSmallIcon(R.drawable.viber_image_2022_03_26_18_31_00_873)
                    .setPriority(NotificationCompat.PRIORITY_DEFAULT)
                    .setColor(Color.RED);

            NotificationManagerCompat managerCompat = NotificationManagerCompat.from(Registration.this);
            managerCompat.notify(NOT_ID, builder.build());
        }
    }
}