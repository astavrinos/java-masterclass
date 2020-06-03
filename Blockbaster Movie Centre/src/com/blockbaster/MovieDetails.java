package com.blockbaster;

import java.io.PrintStream;

public interface MovieDetails {
    public String movieTitle();
    public String mainActors();
    public String description();
    public String duration();
    public double rentPrice();
    public void printDetails();
}
