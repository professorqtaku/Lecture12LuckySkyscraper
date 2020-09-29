package com.company;

public class SolutionFromLecture {

    private static boolean showTiming = false;

    static public int toFakeFloor(int realFloorGoal){
        var startTime = System.nanoTime(); //time in nanoseconds
        var fakeFloor = 1;
        for(var realFloor = 1; realFloor < realFloorGoal; realFloor++){
            do {
                fakeFloor++;
            } while(fakeFloor % 10 == 4 || fakeFloor % 100 == 13);
        }
        var endTime = System.nanoTime();
        var timeTaken = endTime - startTime;
        if(showTiming)
        System.out.println("Fake floor (ns): " + timeTaken);
        return fakeFloor;
    }

    static public int toRealFloor(int fakeFloorGoal){
        var startTime = System.nanoTime();
        var fakeFloor = 1;
        for(var realFloor = 1; realFloor <= fakeFloorGoal; realFloor++){
            if(fakeFloorGoal == fakeFloor){
                var endTime = System.nanoTime();
                var timeTaken = endTime - startTime;
                if(showTiming)
                System.out.println("Real floor (ns): " + timeTaken);
                return realFloor;
            }
            do {
                fakeFloor++;
            } while(fakeFloor % 10 == 4 || fakeFloor % 100 == 13);
        }
        return -1; // could not find real floor number
    }
}
