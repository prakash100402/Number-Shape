package com.iams0nu.numbershape;

import androidx.appcompat.app.AppCompatActivity;

import android.icu.text.IDNA;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
TextView txt;



    class Number {

                int number;

                public boolean isSquare() {

                    double squareRoot = Math.sqrt(number);

                    if (squareRoot == Math.floor(squareRoot)) {

                        return true;

                    } else {

                        return false;

                    }

                }

                public boolean isTriangular() {

                    int x = 1;

                    int triangularNumber = 1;

                    while (triangularNumber < number) {

                        x++;

                        triangularNumber = triangularNumber + x;

                    }

                    if (triangularNumber == number) {

                        return true;

                    } else {

                        return false;

                    }

                }


            }

 public void mynumber(View view)
 {
     Log.i( "Info","Button pressed");
     EditText editText = (EditText) findViewById(R.id.editTextNum);
     txt = findViewById(R.id.textView2);
     Number num = new Number();
     num.number=Integer.parseInt(editText.getText().toString());
     String message = editText.getText().toString();
     if (num.isSquare() && num.isTriangular())
     {
         message += " It is both Square and triangular";
     }
     else if (num.isSquare())
     {
         message += " It iS Square";
     }
     else if (num.isTriangular())
     {
         message +=" It is Triangular";
     }
     else
     {
         message += " Neither triangular nor Square";
     }

     txt.setText(message);
 }





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}