package com.example.viewcontainer;

import androidx.appcompat.app.AppCompatActivity;

import android.app.TabActivity;
import android.os.Bundle;
@SuppressWarnings("deprecation") //부모클래스 탭액티비티의 경고를 막기위한 코드
public class TabHost extends TabActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tab_host);

        android.widget.TabHost tabHost = getTabHost(); //탭호스트 변수 생성

        //탭스펙 생성
        android.widget.TabHost.TabSpec tabSpecSong = tabHost.newTabSpec("SONG").setIndicator("음악별");
        tabSpecSong.setContent(R.id.tabSong); //탭스펙을 탭과 연결
        tabHost.addTab(tabSpecSong); //탭을 탭호스트에 부착

        android.widget.TabHost.TabSpec tabSpecArtist = tabHost.newTabSpec("ARTIST").setIndicator("가수별");
        tabSpecSong.setContent(R.id.tabArtist);
        tabHost.addTab(tabSpecArtist);

        android.widget.TabHost.TabSpec tabSpecAlbum = tabHost.newTabSpec("ALBUM").setIndicator("앨범별");
        tabSpecSong.setContent(R.id.tabAlbum);
        tabHost.addTab(tabSpecAlbum);

        tabHost.setCurrentTab(0);
    }
}