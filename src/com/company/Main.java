package com.company;

public class Main {

    public static void main(String[] args) throws Exception {
	    Skyscraper mannen = new Skyscraper.SkyscraperBuilder(100).
            name("Mannen")
            .build();

        System.out.println(mannen.toRealFloor(15));
        System.out.println(SolutionFromLecture.toRealFloor(15));
        for(var floor = 1; floor <= 220; floor++){
            var fakeFloor = SolutionFromLecture.toFakeFloor(floor);
            System.out.printf("floor: %d fakefloor: %d, back to real: %d\n", floor, fakeFloor, SolutionFromLecture.toRealFloor(fakeFloor)==floor ? 1: 0);
        }
    }
}
