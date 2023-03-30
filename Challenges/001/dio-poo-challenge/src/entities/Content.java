package entities;

public abstract class Content {

	protected static final double XP_STANDART = 10d;
	protected String title;
	protected String description;

	public Content() {
	}

	public Content(String title, String description) {
		this.title = title;
		this.description = description;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public abstract double calculateXp();

}
