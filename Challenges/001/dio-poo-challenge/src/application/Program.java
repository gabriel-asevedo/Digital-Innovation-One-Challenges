package application;

import java.time.LocalDate;

import entities.Course;
import entities.Mentoring;

public class Program {

	public static void main(String[] args) {

		Course course1 = new Course("Curso Java", "Bootcamp Java Banco Pan", 8);
		Mentoring mentoring1 = new Mentoring("Mentoria Java", "Mentoria Java", LocalDate.now());

		System.out.println(course1);
		System.out.println(mentoring1);

	}

}
