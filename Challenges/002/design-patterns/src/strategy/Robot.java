package strategy;

public class Robot {
	private Behavior behavior;

	public void setStrategy(Behavior behavior) {
		this.behavior = behavior;
	}

	public void toMove() {
		behavior.toMove();
	}
}
