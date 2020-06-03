package com.blockbaster;

public class Main {

    public static void main(String[] args) {

        Movie movies = new EternalSunshine();
//        Movie movies = new BadMoms();

        movies.printDetails();

        System.out.println(movies.description());

//        System.out.printf("Title: %s\nActors: %s\nDescription: %s\nDuration: %s\nRental Price: %.2f",movies.movieTitle(),movies.mainActors(),movies.description(),movies.duration(),movies.rentPrice());

    }
}
