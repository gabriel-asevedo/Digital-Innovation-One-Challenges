package entities;

import java.time.LocalDate;

public class Mentoring extends Content {

	private LocalDate date;

	public Mentoring() {
	}
	
	public Mentoring(String title, String description, LocalDate date) {
		super(title, description);
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	@Override
	public double calculateXp() {
		return XP_STANDART + 20d;
	}

	@Override
	public String toString() {
		return "Mentoring{Title: " + title 
				+ ",  Description: " + description 
				+ ",  Date :" + date;
	}

}
