package com.example.phrases;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    public void buttonTapped(View view){
        int id=view.getId();
        String ourId="";
        ourId=view.getResources().getResourceEntryName(id);
        int resouceId=getResources().getIdentifier(ourId,"raw","com.example.phrases");
        MediaPlayer mplayer=MediaPlayer.create(this,resouceId);
        mplayer.start();
        Log.i("Button Tapped",ourId);

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
