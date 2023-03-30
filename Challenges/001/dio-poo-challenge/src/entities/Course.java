package entities;

public class Course extends Content {

	private Integer workload;

	public Course() {
	}

	public Course(String title, String description, Integer workload) {
		super(title, description);
		this.workload = workload;
	}

	public Integer getWorkload() {
		return workload;
	}

	public void setWorkload(Integer workload) {
		this.workload = workload;
	}

	@Override
	public double calculateXp() {
		return XP_STANDART * workload;
	}

	@Override
	public String toString() {
		return "Course{Title: " + title 
				+ ",  Description: " + description 
				+ ",  Workload: " + workload;
	}
}
