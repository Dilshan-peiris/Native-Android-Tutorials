package com.example.beginnertutorial2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText firstName, lastName, eMail;
    TextView txtFirstName, txtLastName, txtEMail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClickRegister(View view){
        firstName = findViewById(R.id.edtTxtFirstName);
        lastName = findViewById(R.id.edtTxtLastName);
        eMail = findViewById(R.id.edtTxtEmailAddress);


        txtFirstName = findViewById(R.id.textViewFirstName);
        txtFirstName.setText(firstName.getText().toString());

        txtLastName = findViewById(R.id.textViewLastName);
        txtLastName.setText(lastName.getText().toString());

        txtEMail = findViewById(R.id.textViewEmail);
        txtEMail.setText(eMail.getText().toString());




    }
}