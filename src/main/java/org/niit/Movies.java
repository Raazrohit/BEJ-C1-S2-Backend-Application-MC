package org.niit;

public class Movies {
    private int movieId;
    private String movieName;
    private double movieDuration;
    private int releaseYear;

    public Movies(int movieId, String movieName, double movieDuration, int releaseYear) {
        this.movieId = movieId;
        this.movieName = movieName;
        this.movieDuration = movieDuration;
        this.releaseYear = releaseYear;
    }

    @Override
    public String toString() {
        return "Movies{" +
                "movieId=" + movieId +
                ", movieName='" + movieName + '\'' +
                ", movieDuration=" + movieDuration +
                ", releaseYear=" + releaseYear +
                '}';
    }
}
