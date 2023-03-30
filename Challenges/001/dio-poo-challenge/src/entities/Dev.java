package entities;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

public class Dev {

	private String name;
	private Set<Content> writtenContent = new LinkedHashSet<>();
	private Set<Content> completedContent = new LinkedHashSet<>();

	public Dev() {
	}

	public Dev(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Set<Content> getWrittenContent() {
		return writtenContent;
	}

	public void setWrittenContent(Set<Content> writtenContent) {
		this.writtenContent = writtenContent;
	}

	public Set<Content> getCompletedContent() {
		return completedContent;
	}

	public void setCompletedContent(Set<Content> completedContent) {
		this.completedContent = completedContent;
	}

	public void signUpForBootcamp(Bootcamp bootcamp) {
		this.writtenContent.addAll(bootcamp.getContents());
		bootcamp.getSubscribedDevelopers().add(this);
	}

	public void toProgress() {
		Optional<Content> content = this.writtenContent.stream().findFirst();
		if (content.isPresent()) {
			this.completedContent.add(content.get());
			this.writtenContent.remove(content.get());
		} else {
			System.err.println("You are not subscribed to any content!");
		}
	}

	public double calculateTotalXp() {
		return this.completedContent.stream().mapToDouble(content -> content.calculateXp()).sum();
	}

	@Override
	public int hashCode() {
		return Objects.hash(completedContent, name, writtenContent);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Dev other = (Dev) obj;
		return Objects.equals(completedContent, other.completedContent) && Objects.equals(name, other.name)
				&& Objects.equals(writtenContent, other.writtenContent);
	}

}
