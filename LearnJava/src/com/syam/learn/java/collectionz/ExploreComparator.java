package com.syam.learn.java.collectionz;

import java.util.Comparator;
import java.util.HashSet;
import java.util.TreeSet;

public class ExploreComparator {

	public static void main(String[] args) {
		TreeSet<Movie> movies = new TreeSet<>(new MovieComparision());
//		HashSet<Movie> movies = new HashSet<>();
		movies.add(new Movie("Okkadu", 2003, "Gunasekhar"));
		movies.add(new Movie("Boys", 2003, "Shankar"));
		movies.add(new Movie("Bahubali", 2020, "Raja Mouli"));
		movies.add(new Movie("Kalki", 2024, "Nag Aswin"));

		for (Movie movie : movies) {
			System.out.println(movie.getDirector());
		}

		System.out.println(movies);
	}
}

class MovieComparision implements Comparator<Movie> {

	@Override
	public int compare(Movie m1, Movie m2) {
		return m1.getDirector().compareTo(m2.getDirector());
	}

}

class Movie {
	String name;
	int year;
	String director;

	@Override
	public String toString() {
		return "Movie [name=" + name + ", year=" + year + ", director=" + director + "]";
	}

	public Movie(String name, int year, String director) {
		super();
		this.name = name;
		this.year = year;
		this.director = director;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

}
