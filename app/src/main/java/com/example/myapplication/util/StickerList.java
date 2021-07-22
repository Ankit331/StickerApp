package com.example.myapplication.util;

import com.example.myapplication.R;
import com.example.myapplication.StickerModel;

import java.util.ArrayList;

public class StickerList {


    public static ArrayList<StickerModel> getStickerList()
    {
        ArrayList<StickerModel> stickerList =new ArrayList<>();
        stickerList.add(new StickerModel(R.drawable.airhighfive));
        stickerList.add(new StickerModel(R.drawable.cuppy_lol));
        stickerList.add(new StickerModel(R.drawable.cuppy_smile));
        stickerList.add(new StickerModel(R.drawable.ok));
        return stickerList;
    }
}
