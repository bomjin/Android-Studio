package com.example.bumjin.actionbar;

import android.app.ActionBar;
import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentTransaction;
import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

public abstract class MainActivity extends Activity implements ActionBar. // implements 구현
        TabListener { //인터페이스 구현
    ActionBar.Tab tabSong, tabArtist, tabAlbum; //탭변수


    MyTabFragment myFrags [] = new MyTabFragment[3]; // 배열 선언


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActionBar bar = getActionBar(); //액셔바 가져오기
        bar.setNavigationMode(ActionBar.NAVIGATION_MODE_TABS); //액션바의 모드

        tabSong = bar.newTab(); //바의 텝을 tabSong 정의
        tabSong.setText("음악별");
        tabSong.setTabListener(this);
        bar.addTab(tabSong); //탭 추가


        tabArtist = bar.newTab();
        tabArtist.setText("가수별");
        tabArtist.setTabListener(this);
        bar.addTab(tabArtist);


        tabAlbum = bar.newTab();
        tabAlbum.setText("앨범별");
        tabAlbum.setTabListener(this);
        bar.addTab(tabAlbum);

        }
        public void onTabSelected(ActionBar.Tab tab, FragmentTransaction ft) { //탭을 선택하면 동작하는 코드
            MyTabFragment myTabFrag = null; //현재 선택한 프로그래먼트로 사용할 변수이다.

            if(myFrags[tab.getPosition()]==null) {
                myTabFrag = new MyTabFragment(); //새로운 프로그먼트 생성
                Bundle data = new Bundle(); // 프로그먼트의 값을 지정
                data.putString("tabName",tab.getText().toString());
                myTabFrag.setArguments(data);
                myFrags[tab.getPosition()] = myTabFrag;

            }
            else myTabFrag = myFrags[tab.getPosition()]; //배열의 해당위치에 출력

            ft.replace(android.R.id.content, myTabFrag); //액션바 아래쪽에 화면애 출
        }
        public void onTabUnselected(ActionBar.Tab tab, FragmentTransaction ft) {
            MyTabFragment myTabFrag = null;

            if(myFrags[tab.getPosition()]==null) {
                myTabFrag = new MyTabFragment();
                Bundle data = new Bundle();
                data.putString("tabName",tab.getText().toString());
                myTabFrag.setArguments(data);
                myFrags[tab.getPosition()] = myTabFrag;

            }
            else myTabFrag = myFrags[tab.getPosition()];

            ft.replace(android.R.id.content, myTabFrag);

    }
        public void onTabReselected(ActionBar.Tab tab, FragmentTransaction ft) {
            MyTabFragment myTabFrag = null;

            if(myFrags[tab.getPosition()]==null) {
                myTabFrag = new MyTabFragment();
                Bundle data = new Bundle();
                data.putString("tabName",tab.getText().toString());
                myTabFrag.setArguments(data);
                myFrags[tab.getPosition()] = myTabFrag;

            }
            else myTabFrag = myFrags[tab.getPosition()];

            ft.replace(android.R.id.content, myTabFrag);

    }

    public static class MyTabFragment extends Fragment {
        String tabName; //문자열 tabName
        public void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            Bundle date = getArguments(); //
            tabName = date.getString("tabName"); //이름

        }
        public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
            LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT,LinearLayout.LayoutParams.MATCH_PARENT);
            LinearLayout baseLayout = new LinearLayout(super.getActivity());
            baseLayout.setOrientation(LinearLayout.VERTICAL);
            baseLayout.setLayoutParams(params); //프로그먼트 화면 구성

            if(tabName == "음악별") baseLayout.setBackgroundColor(Color.RED); //탭별 화면 구성
            if(tabName == "가수별") baseLayout.setBackgroundColor(Color.GREEN);
            if(tabName == "앨범별") baseLayout.setBackgroundColor(Color.BLUE);

            return baseLayout; //레이아웃 반환
        }

    }

}
