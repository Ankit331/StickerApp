package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.graphics.Color;
import android.os.Bundle;
import android.text.Layout;

import com.xiaopo.flying.sticker.StickerView;
import com.xiaopo.flying.sticker.TextSticker;

public class MainActivity extends AppCompatActivity {
    StickerView stickerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        stickerView=(StickerView) findViewById(R.id.sticker_view);

        TextSticker textSticker=new TextSticker(this);
        textSticker.setDrawable(ContextCompat.getDrawable(getApplicationContext(),R.drawable.sticker_transparent_background));
        textSticker.setTextColor(Color.BLACK);
        textSticker.setText("Hello");
        textSticker.setTextAlign(Layout.Alignment.ALIGN_CENTER);
        textSticker.resizeText();
        stickerView.addSticker(textSticker);

    }
}