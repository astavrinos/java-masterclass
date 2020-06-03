package com.blockbaster;

import java.io.PrintStream;

public class EternalSunshine extends Movie {

    @Override
    public String movieTitle() {
        return "Eternal Sunshine of the Spotless Mind";
    }

    @Override
    public String mainActors() {
        return "Jim Carrey";
    }

    @Override
    public String description() {
        return "Eternal Sunshine of the Spotless Mind is a 2004 American science fiction romantic drama film written by Charlie Kaufman and directed by Michel Gondry. It follows an estranged couple who have erased each other from their memories.";
    }

    @Override
    public String duration() {
        return "1:48";
    }

    @Override
    public double rentPrice() {
        return 3.99;
    }

    @Override
    public void printDetails() {
        System.out.printf("Title: %s\nActors: %s\nDescription: %s\nDuration: %s\nRental Price: %.2f", movieTitle(), mainActors(), description(), duration(), rentPrice());
    }
}
