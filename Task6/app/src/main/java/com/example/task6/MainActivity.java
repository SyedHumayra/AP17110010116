package com.example.task6;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText name,rollnum,phnum,email,password;
    RadioButton r_male,r_female,r_cse,r_ece,r_mech;
    String gender;
    String branch;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        name=findViewById(R.id.Name);
        rollnum=findViewById(R.id.RollNum);
        phnum=findViewById(R.id.Phnum);
        email=findViewById(R.id.Email);
        password=findViewById(R.id.pwd);
        r_male=findViewById(R.id.male);
        r_female=findViewById(R.id.female);
        r_cse=findViewById(R.id.CSE);
        r_ece=findViewById(R.id.ECE);
        r_mech=findViewById(R.id.MECH);
    }


    public void submit(View view) {
        String S = name.getText().toString();
        String S1 = rollnum.getText().toString();
        String S2 = phnum.getText().toString();
        String S3= email.getText().toString();
        String S4=password.getText().toString();
        if(r_male.isChecked()){
            gender = r_male.getText().toString();
        }
        if(r_female.isChecked()){
            gender = r_female.getText().toString();
        }
        if(r_cse.isChecked()){
            branch = r_cse.getText().toString();
        }
        if(r_ece.isChecked()){
            branch = r_ece.getText().toString();
        }
        if(r_mech.isChecked()){
            branch = r_mech.getText().toString();
        }

        setContentView(R.layout.activity_main2);
        TextView tv;
        tv=findViewById(R.id.View);
        tv.setText(S+"\n"+S1+"\n"+S2+"\n"+S3+"\n"+S4+"\n"
                +gender+"\n"+branch+"\n");

    }
}