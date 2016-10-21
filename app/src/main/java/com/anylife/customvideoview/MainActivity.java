package com.anylife.customvideoview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    private LiveVideoView liveVideoView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        liveVideoView=(LiveVideoView)findViewById(R.id.videoView);
        liveVideoView.setVideoPath("http://chyd-wsvod.wasu.tv/data13/ott/344/2015-05/28/1432782476341_377935/playlist.m3u8");

    }
}
