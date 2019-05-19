package com.example.bumjin.menu;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {


    LinearLayout baseLayout;
    Button button1;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("배경색 바꾸기");
        baseLayout = (LinearLayout) findViewById(R.id.baseLayout); //레이아웃 이어줌
        button1 = (Button) findViewById(R.id.button1); // 버튼 이어줌
    }

    @Override //옵션 메뉴 등록 메소드
    public boolean onCreateOptionsMenu(Menu menu) {   //상위 클래스의 생성자를 실행한다.
        super.onCreateOptionsMenu(menu);
        MenuInflater minflater = getMenuInflater(); // 메뉴 인플레이터를 생성
        minflater.inflate(R.menu.menu1,menu); // xxl파일 등록
        return true; // true 반환 boolean > true or false
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.itemRed:
                baseLayout.setBackgroundColor(Color.RED);
                return true;
            case R.id.itemGreen:
                baseLayout.setBackgroundColor(Color.GREEN);
                return true;
            case R.id.itemBlue:
                baseLayout.setBackgroundColor(Color.BLUE);
                return true;
            case R.id.subRotate:
                button1.setRotation(45); // 회전 45
                return true;
            case R.id.subSize:
                button1.setScaleX(2); //버튼 2배 확대
                return true;

        }
        return false;
    }
}
