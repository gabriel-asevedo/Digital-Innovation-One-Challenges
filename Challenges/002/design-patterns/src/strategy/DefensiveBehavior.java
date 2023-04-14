package strategy;

public class DefensiveBehavior implements Behavior {

	@Override
	public void toMove() {
		System.out.println("moving defensively...");
	}

}
