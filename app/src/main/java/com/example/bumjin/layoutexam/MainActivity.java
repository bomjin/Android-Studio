package com.example.bumjin.layoutexam;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    EditText edit1, edit2;
    Button btnAdd, btnSub, btnMui, btnDiv;
    TextView textResult;
    String num1, num2;
    Integer result;
    Button [] numButtonse = new Button[10];
    Integer[] numBtnIDs = {R.id.button1,}

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }



}
