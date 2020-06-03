package com.blockbaster;

import java.io.PrintStream;

abstract class Movie implements MovieDetails {

    @Override
    public String movieTitle() {
        return null;
    }

    @Override
    public String mainActors() {
        return null;
    }

    @Override
    public String description() {
        return null;
    }

    @Override
    public String duration() {
        return null;
    }

    @Override
    public double rentPrice() {
        return 0;
    }

    @Override
    public void printDetails() {

    }
}
