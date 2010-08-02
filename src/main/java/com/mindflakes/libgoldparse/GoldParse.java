package com.mindflakes.libgoldparse;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

public class GoldParse {
    private GoldParse(){}

    public GoldSchedule parse(String html) {
        Document doc = Jsoup.parse(html);
        return new GoldSchedule();  
    }
    
    public boolean valid(){
    	return true;
    }
}
