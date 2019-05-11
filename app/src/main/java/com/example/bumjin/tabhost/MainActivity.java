package com.example.bumjin.tabhost;

import android.app.TabActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TabHost;

public class MainActivity extends TabActivity { //상속을 TabActivity로

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TabHost tabHost = getTabHost(); // 탭호스트 변수에 xml에서 생성한 탭호스트를 가져옴(객체 생성)

        TabHost.TabSpec tabSpecSong = tabHost.newTabSpec("song").setIndicator("음악별"); //tabSpec은 탭을 구성하는 요소들의 집합  텝스펙  텝호스트 연결 > 탭
        tabSpecSong.setContent(R.id.tab1); //아이디랑 연결
        tabHost.addTab(tabSpecSong); // 을 탭호스에 부착

        TabHost.TabSpec tabSpecArtist = tabHost.newTabSpec("song").setIndicator("가수별");
        tabSpecArtist.setContent(R.id.tab2);
        tabHost.addTab(tabSpecArtist);

        TabHost.TabSpec tabSpecAlbum = tabHost.newTabSpec("song").setIndicator("앨범별");
        tabSpecAlbum.setContent(R.id.tab3);
        tabHost.addTab(tabSpecAlbum);

        tabHost.setCurrentTab(0); //초기 Tab 설정












    }





}
