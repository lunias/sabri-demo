package com.ethan.birbs;

import java.util.Objects;
import java.util.StringJoiner;

public class BirdData extends Object {

    private String name;
    private String latinName;
    private int numObeservations = 0;

    public BirdData(String name, String latinName) {

        this.name = name;
        this.latinName = latinName;
    }

    public BirdData(String name, String latinName, int numObeservations) {

        this(name, latinName);
        this.numObeservations = numObeservations;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLatinName() {
        return latinName;
    }

    public void setLatinName(String latinName) {
        this.latinName = latinName;
    }

    public int getNumObeservations() {
        return numObeservations;
    }

    public void setNumObeservations(int numObeservations) {
        this.numObeservations = numObeservations;
    }

    public void addObservation() {
        this.numObeservations++;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BirdData birdData = (BirdData) o;
        return numObeservations == birdData.numObeservations &&
                Objects.equals(name, birdData.name) &&
                Objects.equals(latinName, birdData.latinName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, latinName, numObeservations);
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", BirdData.class.getSimpleName() + "[", "]")
                .add("name='" + name + "'")
                .add("latinName='" + latinName + "'")
                .add("numObeservations=" + numObeservations)
                .toString();
    }
}
