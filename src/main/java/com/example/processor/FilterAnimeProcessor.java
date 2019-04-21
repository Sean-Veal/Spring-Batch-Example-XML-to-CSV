package com.example.processor;

import com.example.model.Anime;
import org.springframework.batch.item.ItemProcessor;

public class FilterAnimeProcessor implements ItemProcessor<Anime, Anime>{

    public Anime process(Anime anime) throws Exception {

        //filter object with status = Completed
        if (anime.getMyStatus().equals("Completed")) {
            return null;
        }

        return anime;
    }
}
