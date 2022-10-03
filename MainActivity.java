package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private Button btn_Convert, btn_Virgula, btn_Reset, btn_0, btn_1, btn_2, btn_3, btn_4, btn_5,
            btn_6, btn_7, btn_8, btn_9;

    private TextView txtResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Initialize();
        btn_0.setOnClickListener(this);
        btn_1.setOnClickListener(this);
        btn_2.setOnClickListener(this);
        btn_3.setOnClickListener(this);
        btn_4.setOnClickListener(this);
        btn_5.setOnClickListener(this);
        btn_6.setOnClickListener(this);
        btn_7.setOnClickListener(this);
        btn_8.setOnClickListener(this);
        btn_9.setOnClickListener(this);
        btn_Virgula.setOnClickListener(this);
        btn_Convert.setOnClickListener(this);
        btn_Reset.setOnClickListener(this);
        txtResult.setOnClickListener(this);

        btn_Convert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double value, result, dolar = 5;
                value = Double.parseDouble(txtResult.getText().toString());
                result = value * dolar;
                txtResult.setText(String.valueOf(result));
            }
        });
    }

    private void Initialize(){
        txtResult = (TextView) findViewById(R.id.txtResult);
        btn_Convert = (Button) findViewById(R.id.btnConvert);
        btn_Virgula = (Button) findViewById(R.id.btnVirgula);
        btn_Reset = (Button) findViewById(R.id.btnReset);
        btn_0 = (Button) findViewById(R.id.btn0);
        btn_1 = (Button) findViewById(R.id.btn1);
        btn_2 = (Button) findViewById(R.id.btn2);
        btn_3 = (Button) findViewById(R.id.btn3);
        btn_4 = (Button) findViewById(R.id.btn4);
        btn_5 = (Button) findViewById(R.id.btn5);
        btn_6 = findViewById(R.id.btn6);
        btn_7 = findViewById(R.id.btn7);
        btn_8 = findViewById(R.id.btn8);
        btn_9 = findViewById(R.id.btn9);
    }


    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btn0:
                txtResult.append("0");
                break;

            case R.id.btn1:
                txtResult.append("1");
                break;

            case R.id.btn2:
                txtResult.append("2");
                break;

            case R.id.btn3:
                txtResult.append("3");
                break;

            case R.id.btn4:
                txtResult.append("4");
                break;

            case R.id.btn5:
                txtResult.append("5");
                break;

            case R.id.btn6:
                txtResult.append("6");
                break;

            case R.id.btn7:
                txtResult.append("7");
                break;

            case R.id.btn8:
                txtResult.append("8");
                break;

            case R.id.btn9:
                txtResult.append("9");
                break;

            case R.id.btnVirgula:
                txtResult.append(",");
                break;

            case R.id.btnReset:
                txtResult.setText("");
                break;

        }

    }
}
