package com.example.bumjin.layoutexam;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
// 계산기

    EditText edit1, edit2;
    Button btnAdd, btnSub, btnMui, btnDiv;
    TextView textResult;
    String num1, num2;
    Integer result;
    Button [] numButtonse = new Button[12];
    Integer[] numBtnIDs = {R.id.button1, R.id.button2, R.id.button3, R.id.button4, R.id.button5,
            R.id.button6, R.id.button7, R.id.button8, R.id.button9, R.id.button10,R.id.button11,R.id.button12};
    int i;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        edit1 = (EditText) findViewById(R.id.editText1);
        edit2 = (EditText) findViewById(R.id.editText2);
        btnAdd = (Button) findViewById(R.id.button13);
        btnSub = (Button) findViewById(R.id.button14);
        btnMui = (Button) findViewById(R.id.button15);
        btnDiv = (Button) findViewById(R.id.button16);

        textResult = (TextView) findViewById(R.id.textView);

        btnAdd.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View arg0, MotionEvent arg1) {
                num1 = edit1.getText().toString(); // edittext에 입력된 값을 num1, num2 변수에 대입
                num2 = edit2.getText().toString(); //
                result = Integer.parseInt(num1) + Integer.parseInt(num2); // 메소드를 사용하여 num1, nmu2를 정수형으로 변환한 후 두 값을 더한다 iInteger.prarsenlt() 메소드는 정적메소드로 문자열을 정수형으로 변경
                textResult.setText("계산 결과 : " + result.toString()); // 정수형 결과를 다시 문자열로 택스트뷰애 setText를 이용해서 대입한
                return false;
            }
        });
        btnSub.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View arg0, MotionEvent arg1) {
                num1 = edit1.getText().toString(); // edittext에 입력된 값을 num1, num2 변수에 대입
                num2 = edit2.getText().toString(); //
                result = Integer.parseInt(num1) - Integer.parseInt(num2); // 메소드를 사용하여 num1, nmu2를 정수형으로 변환한 후 두 값을 더한다 iInteger.prarsenlt() 메소드는 정적메소드로 문자열을 정수형으로 변경
                textResult.setText("계산 결과 : " + result.toString()); // 정수형 결과를 다시 문자열로 택스트뷰애 setText를 이용해서 대입한
                return false;
            }
        });

        btnMui.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View arg0, MotionEvent arg1) {
                num1 = edit1.getText().toString(); // edittext에 입력된 값을 num1, num2 변수에 대입
                num2 = edit2.getText().toString(); //
                result = Integer.parseInt(num1) * Integer.parseInt(num2); // 메소드를 사용하여 num1, nmu2를 정수형으로 변환한 후 두 값을 더한다 iInteger.prarsenlt() 메소드는 정적메소드로 문자열을 정수형으로 변경
                textResult.setText("계산 결과 : " + result.toString()); // 정수형 결과를 다시 문자열로 택스트뷰애 setText를 이용해서 대입한
                return false;
            }
        });

        btnDiv.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View arg0, MotionEvent arg1) {
                num1 = edit1.getText().toString(); // edittext에 입력된 값을 num1, num2 변수에 대입
                num2 = edit2.getText().toString(); //
                result = Integer.parseInt(num1) / Integer.parseInt(num2); // 메소드를 사용하여 num1, nmu2를 정수형으로 변환한 후 두 값을 더한다 iInteger.prarsenlt() 메소드는 정적메소드로 문자열을 정수형으로 변경
                textResult.setText("계산 결과 : " + result.toString()); // 정수형 결과를 다시 문자열로 택스트뷰애 setText를 이용해서 대입한
                return false;
            }
        });


        for (i = 0; i < numBtnIDs.length; i++) {
            numButtonse[i] = (Button) findViewById(numBtnIDs[i]); //12번 반복하는 개념
        }

        for (i=0; i < numBtnIDs.length; i ++) {
            final int index;
            index = i; //증가변수 i를 index 변수에 넣었다. index 변수는 9행과 그 내부에서 사용된다. index 변수는 배열로 리스너를 정의할 때 표준적으로 사용하는 방식으러 잘 기억

            numButtonse[index].setOnClickListener(new View.OnClickListener() {//index
                @Override
                public void onClick(View v) {

                    if (edit1.isFocused() == true) {
                        num1 = edit1.getText().toString() + numButtonse[index].getText().toString();
                        edit1.setText(num1);
                    }else if (edit2.isFocused() == true) {
                        num2 = edit2.getText().toString() + numButtonse[index].getText().toString();
                        edit2.setText(num2);
                    }else{
                        Toast.makeText (getApplicationContext(), "먼저 에디트텍스를 선택하세요",Toast.LENGTH_SHORT).show();
                    }
                }
            });
        }


    }






}
