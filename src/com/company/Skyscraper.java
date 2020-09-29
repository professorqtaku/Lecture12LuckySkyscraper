package com.company;

import java.util.ArrayList;

public class Skyscraper {
    public ArrayList<Integer> realFloors;
    public ArrayList<Integer> fakeFloors;
    private int floorsToBuild;
    private String name;

    public Skyscraper(SkyscraperBuilder builder){
        this.floorsToBuild = builder.floors;
        this.name = builder.name;
        this.realFloors = new ArrayList<Integer>();
        this.fakeFloors = new ArrayList<Integer>();
        fakeFloors();
    }

    public void fakeFloors(){
        int currentFloor = 0;
        while(fakeFloors.size()< this.floorsToBuild){
            currentFloor++;
            if(currentFloor <= floorsToBuild)
                this.realFloors.add(currentFloor);
            if(currentFloor % 10 == 4 || currentFloor % 100 == 13)
                continue;
            this.fakeFloors.add(currentFloor);
        }
    }

    public int toRealFloor(int floor){
        if(floor % 10 == 4 || floor % 100 == 13){
            System.out.println("This floor does not exist as a fake floor!");
            return 0;
        }
        return realFloors.get(fakeFloors.indexOf(floor));
    }
    public int toFakeFloor(int floor){
        if(floor > this.floorsToBuild){
            System.out.println("The building only has " + this.floorsToBuild + " floors!");
            return 0;
        }
        return fakeFloors.get(realFloors.indexOf(floor));
    }

    public static class SkyscraperBuilder{
        private String name;
        private final int floors;

        public SkyscraperBuilder(int floors){
            this.floors = floors;
        }
        public SkyscraperBuilder name(String name){
            this.name = name;
            return this;
        }

        public Skyscraper build() throws Exception{
            Skyscraper skyscraper = new Skyscraper(this);
            validatedSkyscrapersObject(skyscraper);
            return skyscraper;
        }

        private void validatedSkyscrapersObject(Skyscraper skyscraper) throws Exception{
            if(skyscraper.floorsToBuild <= 0){
                throw new Exception("NEED floors to build a building");
            }
        }

    }

}
