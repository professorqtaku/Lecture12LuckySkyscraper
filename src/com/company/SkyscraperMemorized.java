package com.company;

import java.util.*;

public class SkyscraperMemorized {
    private static boolean showTiming = true;
    private ArrayList<Integer> fakeFloorNumbers = new ArrayList<>();

    public SkyscraperMemorized(int numberOfRealFloors){
        var fakeFloorNo = 1;
        for(var realFloor = 1; realFloor <= numberOfRealFloors; realFloor++){
            fakeFloorNumbers.add(fakeFloorNo);
            do{
                fakeFloorNo++;
            }while(fakeFloorNo % 10 == 4 || fakeFloorNo % 100 == 13);
        }
    }

    public int toRealFloor(int fakeFloor){
        var startTime = System.nanoTime();
        var result = fakeFloorNumbers.indexOf(fakeFloor) +1;
        var takenTime = System.nanoTime() - startTime;
        if(showTiming)
        System.out.println("fake floor TIME (ns): " + takenTime);
        return result;
    }

    public int toFakeFloor(int realFloor){
        var startTime = System.nanoTime();
        var result = fakeFloorNumbers.get(realFloor-1);
        var takenTime = System.nanoTime() - startTime;
        if(showTiming)
            System.out.println("real floor TIME (ns): " + takenTime);
        return result;
    }
}
