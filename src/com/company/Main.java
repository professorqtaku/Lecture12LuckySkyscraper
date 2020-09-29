package com.company;

public class Main {

    public static void main(String[] args) throws Exception {
	    Skyscraper mannen = new Skyscraper.SkyscraperBuilder(100).
            name("Mannen")
            .build();
	    /*
	    
        System.out.println(mannen.toRealFloor(15));
        System.out.println(SolutionFromLecture.toRealFloor(15));
        for(var floor = 1; floor <= 220; floor++){
            var fakeFloor = SolutionFromLecture.toFakeFloor(floor);
            System.out.printf("floor: %d fakefloor: %d, back to real: %d\n", floor, fakeFloor, SolutionFromLecture.toRealFloor(fakeFloor)==floor ? 1: 0);
        }
        */

        var skyScarper  = new SkyscraperMemorized(220);
        for(var floor = 1; floor <=220; floor++) {
            System.out.print("Floor: " + floor);
            var fakeFloor = skyScarper.toFakeFloor(floor);
            System.out.print(" fake floor: " + fakeFloor);
            var realFloor = skyScarper.toRealFloor(fakeFloor);
            System.out.println(" real floor: " + realFloor);
        }
    }
}
