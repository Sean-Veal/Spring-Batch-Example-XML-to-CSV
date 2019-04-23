package com.example.listeners;

import com.example.model.Anime;
import org.springframework.batch.core.ItemWriteListener;

import java.util.List;

public class CustomItemWriterListener implements ItemWriteListener<Anime> {

    public void beforeWrite(List<? extends Anime> list) {
        System.out.println("ItemWriteListener - beforeWrite");
    }

    public void afterWrite(List<? extends Anime> list) {
        System.out.println("ItemWriteListener - afterWrite");
    }

    public void onWriteError(Exception e, List<? extends Anime> list) {
        System.out.println("ItemWriteListener - onWriteError");
    }
}
