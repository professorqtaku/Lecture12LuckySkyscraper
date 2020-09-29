package com.company;

public class Main {

    public static void main(String[] args) throws Exception {
	    Skyscraper mannen = new Skyscraper.SkyscraperBuilder(100).
            name("Mannen")
            .build();

        System.out.println(mannen.toRealFloor(15));
        System.out.println(SolutionFromLecture.toRealFloor(15));
    }
}
