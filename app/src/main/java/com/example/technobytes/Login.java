package com.example.technobytes;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Login extends AppCompatActivity {

    EditText etName, etPassword;
    Button btnConfirm;

    String getName, getPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        UserInfo userInfo = new UserInfo();
        setContentView(R.layout.activity_login);

        etName = findViewById(R.id.etName);
        etPassword = findViewById(R.id.etPassword);
        btnConfirm = findViewById(R.id.btnConfirm);

        btnConfirm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //getting user input
                getName = etName.getText().toString();
                getPassword = etPassword.getText().toString();

                //check if field is empty / else check if name and password is correct
                if (getName.equals("") || getPassword.equals("")) {
                    if (getName.equals("")) {
                        Toast.makeText(Login.this, "Please fill up Username", Toast.LENGTH_SHORT).show();
                    } else if (getPassword.equals("")) {
                        Toast.makeText(Login.this, "Please fill up Password", Toast.LENGTH_SHORT).show();
                    }
                } else {
                    //test db
                    String getUsername = userInfo.getUsername();
                    String getPass = userInfo.getPassword();


                    //check if name and password user input is incorrect
                    if (!(getName.equals("test")) || !(getPassword.equals("test"))) {
                        if (!(getName.equals("test"))) {
                            Toast.makeText(Login.this, "Incorrect Username", Toast.LENGTH_SHORT).show();
                        } else if (!(getPassword.equals("test"))) {
                            Toast.makeText(Login.this, "Incorrect Password", Toast.LENGTH_SHORT).show();
                        }
                    } else if (getName.equals("test") || getPass.equals("test")){
                        System.out.println(getName + " " + getPassword);
                        toShop();
                        Toast.makeText(Login.this, "Logged in Successfully", Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });
    }

    private void toShop() {
        Intent intent = new Intent(this, Shop.class);
        startActivity(intent);
        finish();
    }
}