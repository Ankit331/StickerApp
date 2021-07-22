package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.graphics.Color;
import android.os.Bundle;
import android.text.Layout;

import com.example.myapplication.util.StickerList;
import com.xiaopo.flying.sticker.StickerView;
import com.xiaopo.flying.sticker.TextSticker;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    StickerView stickerView;
    RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        stickerView=(StickerView) findViewById(R.id.sticker_view);
        recyclerView=findViewById(R.id.stickerRecyclerview);


//        TextSticker textSticker=new TextSticker(this);
//        textSticker.setDrawable(ContextCompat.getDrawable(getApplicationContext(),R.drawable.sticker_transparent_background));
//        textSticker.setTextColor(Color.BLACK);
//        textSticker.setText("Hello");
//        textSticker.setTextAlign(Layout.Alignment.ALIGN_CENTER);
//        textSticker.resizeText();
//        stickerView.addSticker(textSticker);


            // List Of stickers
            ArrayList<StickerModel> stickerList= StickerList.getStickerList();
            Adapter adapter=new Adapter(stickerList,this );
            recyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext(),LinearLayoutManager.HORIZONTAL, false));
            recyclerView.setAdapter(adapter);

    }
}