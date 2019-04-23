package com.example.listeners;

import com.example.model.Anime;
import org.springframework.batch.core.ItemReadListener;

public class CustomItemReaderListener implements ItemReadListener<Anime> {

    public void beforeRead() {
        System.out.println("ItemReadListener - beforeRead");
    }

    public void afterRead(Anime anime) {
        System.out.println("ItemReadListener - afterRead");

    }

    public void onReadError(Exception e) {
        System.out.println("ItemReadListener - onReadError");
    }
}
