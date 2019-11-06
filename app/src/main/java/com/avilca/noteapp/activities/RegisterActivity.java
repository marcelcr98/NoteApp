package com.avilca.noteapp.activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.avilca.noteapp.R;
import com.avilca.noteapp.Repository.UserRepository;

public class RegisterActivity extends AppCompatActivity {
    private EditText usernameinput,fullnameinput,emailinput,passwordinput;
    private static final int REGISTER_FORM_REQUEST = 100;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        usernameinput=findViewById(R.id.username_input);
        fullnameinput=findViewById(R.id.fullname_input);
        emailinput=(EditText) findViewById(R.id.email_input);
        passwordinput=(EditText) findViewById(R.id.password_input);
    }
    public void Registrar(View view) {
        String username = usernameinput.getText().toString();
        String fullname = fullnameinput.getText().toString();
        String email = emailinput.getText().toString();
        String password = passwordinput.getText().toString();
        if (username.isEmpty() || fullname.isEmpty() || email.isEmpty() || password.isEmpty()) {
            Toast.makeText(this, "Completar todos los campos", Toast.LENGTH_SHORT).show();
            return;
        }
        UserRepository.create(username,fullname,email,password);
        startActivityForResult(new Intent(this,RegisterActivity.class),REGISTER_FORM_REQUEST);
        finish();
    }
}
