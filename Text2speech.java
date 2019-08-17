package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.speech.tts.TextToSpeech;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Locale;

public class Text2speech extends AppCompatActivity implements View.OnClickListener {
Button b1,b2;
EditText t1;
String text;
TextToSpeech tts;
int r;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_text2speech);
        b1=findViewById(R.id.but13);
        b2=findViewById(R.id.but14);
        t1=findViewById(R.id.textV8);
        b1.setOnClickListener(this);
        b2.setOnClickListener(this);
        tts= new TextToSpeech(this, new TextToSpeech.OnInitListener() {
            @Override
            public void onInit(int i) {
                if(i==TextToSpeech.SUCCESS)
                {
                   r= tts.setLanguage(Locale.ENGLISH);
                }
                else
                {
                    Toast.makeText(getApplicationContext(),"FEATURE NOT SUPPORTED",Toast.LENGTH_SHORT).show();
                }
            }
        });

    }

    @Override
    public void onClick(View view) {
        switch (view.getId())
        {
            case R.id.but13:
                if(r==TextToSpeech.LANG_NOT_SUPPORTED||r==TextToSpeech.LANG_MISSING_DATA)
                {
                    Toast.makeText(getApplicationContext(),"FEATURE NOT SUPPORTED",Toast.LENGTH_SHORT).show();
                }
                else
                {
                    text=t1.getText().toString();
                    tts.speak(text,TextToSpeech.QUEUE_FLUSH,null);
                }
                break;
            case R.id.but14:
                if(tts!=null)
                {
                    tts.stop();

                }
                break;
        }
    }

    @Override
    protected void onDestroy() {
        if(tts!=null)
        {
            tts.stop();
            tts.shutdown();

        }
        super.onDestroy();
    }
}
