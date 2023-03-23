package com.example.technobytes;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Register extends AppCompatActivity {

    EditText etName, etPassword;
    Button btnConfirm;

    String getName, getPassword;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        UserInfo userInfo = new UserInfo();
        setContentView(R.layout.activity_register);

        etName = findViewById(R.id.etName);
        etPassword = findViewById(R.id.etPassword);
        btnConfirm = findViewById(R.id.btnConfirm);

        btnConfirm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getName = etName.getText().toString();
                getPassword = etPassword.getText().toString();

                if (getName.equals("") || getPassword.equals("")) {
                    if (getName.equals("")) {
                        Toast.makeText(Register.this, "Please fill up Username", Toast.LENGTH_SHORT).show();
                    } else if (getPassword.equals("")) {
                        Toast.makeText(Register.this, "Please fill up Password", Toast.LENGTH_SHORT).show();
                    }
                } else {

                    toMain();
                    Toast.makeText(Register.this, "Registered Successfully", Toast.LENGTH_SHORT).show();
                    userInfo.setUsername(getName);
                    userInfo.setPassword(getPassword);
                    System.out.println(userInfo.getUsername() + " " + userInfo.getPassword());
                }
            }
        });
    }

    public void toMain() {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
        finish();
    }
}