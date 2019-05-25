package com.example.bumjin.dialog;

import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final Button button1 = (Button)findViewById(R.id.button1);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder dlg = new AlertDialog.Builder(MainActivity.this);
                dlg.setTitle("제목입니다.");
                dlg.setMessage("이곳이 내용입니다.");
                dlg.setIcon(R.mipmap.ic_launcher);
                dlg.setPositiveButton("확인",null);
                dlg.show();

            }
        });
    }
}
/*
	1. 일단 listButton 을 만들어 주고,
	2. onClickListener를 이용해서 클릭 이벤트를 만들어 줍니다.
	3. 그때 AlertDialog.Builder 를 이용하는데, -> 그것을 MainActivitiy.this 를 통해 연결해주고
	4. 빌더에 타이틀과 아이템을 만들어주고(Toast를 이용해서),
	5. 그것을 alertDialog 에 담아줍니다.
	6. 그리고 보여주는 것이지요.
*/

