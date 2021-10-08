package com.arbiiapplication.signupapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.service.autofill.FillEventHistory;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText FName;
    EditText LName;
    EditText Gender;
    EditText DOB;
    EditText Email;
    EditText Password;
    EditText CPassword;
    Button button;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FName = findViewById(R.id.Fname);
        LName = findViewById(R.id.Lname);
        Gender = findViewById(R.id.gender);
        DOB = findViewById(R.id.dob);
        Email = findViewById(R.id.email);
        Password = findViewById(R.id.password);
        CPassword = findViewById(R.id.cpassword);


    }
    public void signup(View view){
        if(LName.getText().toString().equals("") || LName.getText().toString().equals("") || Gender.getText().toString().equals("")
                || DOB.getText().toString().equals("") || Email.getText().toString().equals("") || Password.getText().toString().equals("")
                || CPassword.getText().toString().equals(""))
            Toast.makeText(MainActivity.this,"UnSuccessful Sign UP", Toast.LENGTH_SHORT ).show();
        else {
            Toast.makeText(this, "Suscessfully Sign UP", Toast.LENGTH_SHORT).show();
        }
    }
}