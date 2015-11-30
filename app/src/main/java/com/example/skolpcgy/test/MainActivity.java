package com.example.skolpcgy.test;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button buttonplus, buttonminus,buttonganger,buttondela;
    private TextView textViewresultat;
    private EditText editText1, editText2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();

    }

        private void init(){
        buttonplus =(Button)findViewById(R.id.buttonplus);
            buttonminus =(Button)findViewById(R.id.buttonminus);
            buttonganger =(Button)findViewById(R.id.buttonganger);
            buttondela =(Button)findViewById(R.id.buttondela);
            editText1=(EditText)findViewById(R.id.editText1);
            editText2=(EditText)findViewById(R.id.editText2);
            textViewresultat = (TextView)findViewById(R.id.textViewresultat);

            buttonplus.setOnClickListener(this);
            buttonminus.setOnClickListener(this);
            buttonganger.setOnClickListener(this);
            buttondela.setOnClickListener(this);


    }

            @Override
            public void onClick(View view) {
              String num1 = editText1.getText().toString();
                String num2 = editText2.getText().toString();
                switch (view.getId()){

                  case R.id.buttonplus:
                      int plus = Integer.parseInt(num1)+ Integer.parseInt(num2);
                      textViewresultat.setText(String.valueOf(plus));
                      break;
                  case R.id.buttonminus:
                      int minus = Integer.parseInt(num1)- Integer.parseInt(num2);
                      textViewresultat.setText(String.valueOf(minus));
                      break;
                  case R.id.buttondela:
                      try{
                          int dela = Integer.parseInt(num1)/ Integer.parseInt(num2);
                          textViewresultat.setText(String.valueOf(dela));


                      }catch (Exception e)
                      {
                          textViewresultat.setText("Kan ej dela!");
                      }
                      break;
                  case R.id.buttonganger:
                      int ganger = Integer.parseInt(num1)*Integer.parseInt(num2);
                      textViewresultat.setText(String.valueOf(ganger));
                      break;
                }
            }
}



