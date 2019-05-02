package com.ethan.birbs;

import java.util.*;

public class BirdService {

    private Map<String, BirdData> birdMap = new HashMap<>();

    public BirdService() {

    }

    public void addBird(String name, String latinName) {

        birdMap.put(name, new BirdData(name, latinName));
    }

    public BirdData showBird(String name) {

        return birdMap.get(name);
    }

    public void observe(String name) {

        BirdData bd = birdMap.get(name);
        if (bd != null) {
            bd.addObservation();
        }
    }

    public void statistics() {

        for (BirdData bd : birdMap.values()) {
            System.out.println(bd);
        }
    }
}
