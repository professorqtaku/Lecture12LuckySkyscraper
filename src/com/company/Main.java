package com.company;

public class Main {

    public static void main(String[] args) throws Exception {
	    Skyscraper mannen = new Skyscraper.SkyscraperBuilder(10).
            name("Mannen")
            .build();

	    LuckySkyscraper.floorList(200);
    }
}