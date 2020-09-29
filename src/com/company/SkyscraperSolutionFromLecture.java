package com.company;

public class SkyscraperSolutionFromLecture {

    static public void floorList(int totalRealFloors){
        var fakeFloor = 1;
        for(var realFloor = 1; realFloor <= totalRealFloors; realFloor++){
            System.out.println("realFloorNo: " + realFloor + " fakeFloor " + fakeFloor);
            do {
                fakeFloor++;
            } while(fakeFloor % 10 == 4 || fakeFloor % 100 == 13);
        }
    }
}
