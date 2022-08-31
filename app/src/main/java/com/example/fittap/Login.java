package com.example.fittap;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Login extends AppCompatActivity {
    public static final String EXTRA_USER_ID = "Login/EXTRA_USER_ID";
    private EditText name_surname, password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        name_surname = findViewById(R.id.reg_name);
        password = findViewById(R.id.login_password);
    }

    public void onSignIn(View view){

        if(Database.getInsance(this).usersDao().getUserByNameSurnamePassword(name_surname.getText().toString(), password.getText().toString()) != null) {
            Intent intent = new Intent(Login.this, HomePage.class);
            startActivity(intent);
        }
        else{
            Intent intent = new Intent(Login.this, MainActivity.class);
            startActivity(intent);
            Toast.makeText(getApplicationContext(), "Name or Password is wrong", Toast.LENGTH_LONG).show();
        }
    }
}