package application;

import java.time.LocalDate;

import entities.Bootcamp;
import entities.Course;
import entities.Dev;
import entities.Mentoring;

public class Program {

	public static void main(String[] args) {

		Course course1 = new Course("Curso Java", "Bootcamp Java Banco Pan", 8);
		Course course2 = new Course("Curso JavaScript", "Bootcamp JavaScript", 6);
		Mentoring mentoring = new Mentoring("Mentoria Java", "Mentoria Java", LocalDate.now());

		// System.out.println(course1);
		// System.out.println(mentoring);

		Bootcamp bootcamp = new Bootcamp("Bootcamo Java Developer", "Descrição");
		bootcamp.getContents().add(course1);
		bootcamp.getContents().add(course2);
		bootcamp.getContents().add(mentoring);

		Dev dev1 = new Dev("Gabriel Asevedo");
		dev1.signUpForBootcamp(bootcamp);
		System.out.println("Subscribed contents " + dev1.getName() + ": " + dev1.getWrittenContent());
		dev1.toProgress();
		System.out.println("Subscribed contents " + dev1.getName() + ": " + dev1.getWrittenContent());
		System.out.println("Finished content " + " " + dev1.getName() + ": " + dev1.getCompletedContent());

		System.out.println();

		Dev dev2 = new Dev("Dorothy Vaughan");
		dev2.signUpForBootcamp(bootcamp);
		System.out.println("Subscribed contents " + dev2.getName() + ": " + dev2.getWrittenContent());
		dev2.toProgress();
		System.out.println("Subscribed contents " + dev2.getName() + ": " + dev2.getWrittenContent());
		System.out.println("Finished content " + " " + dev2.getName() + ": " + dev2.getCompletedContent());

	}
}
