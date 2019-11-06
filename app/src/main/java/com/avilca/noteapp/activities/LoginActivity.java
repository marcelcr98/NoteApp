package com.avilca.noteapp.activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.avilca.noteapp.R;

public class LoginActivity extends AppCompatActivity {
    private EditText userinput,passinput;
    private Button ingresar,register;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        userinput=findViewById(R.id.user_input);
        passinput=findViewById(R.id.pass_input);
        ingresar=findViewById(R.id.sigin_button);
        register=findViewById(R.id.register_button);
        ingresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                callingresar();
            }
        });
        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                callregister();
            }
        });
    }
    public void callregister(){
        startActivity(new Intent(this,RegisterActivity.class));
        finish();
    }
    public void callingresar(){

    }
}
