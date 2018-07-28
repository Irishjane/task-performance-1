package com.pabi.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.app.*;
import android.os.*;
import android.text.method.ScrollingMovementMethod;
import android.view.*;
import android.widget.*;

public class MyActivity extends AppCompatActivity {
    private Button post;
    EditText lname,mname,fname;
    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my);
        post =(Button) findViewById(R.id.click);
        tv = (TextView) findViewById(R.id.display);
        tv.setMovementMethod(new ScrollingMovementMethod());

        post.setOnClickListener(new View.OnClickListener()){
            @Override
                    public void onClick(View v){
                fname =(EditText)findViewById(R.id.text);
                mname = (EditText)findViewById(R.id.text1);
                lname =(EditText)findViewById(R.id.text2);
                tv.setText("Your Input: \n"+fname.getText().toString()+"\n"+mname.getText().toString()+"\n"+lname.getText().toString()+".");

            }
        }
    }
}
