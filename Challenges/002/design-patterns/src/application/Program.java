package application;

import facade.Facade;
import singleton.SingletonEager;
import singleton.SingletonLazy;
import singleton.SingletonLazyHolder;
import strategy.AggressiveBehavior;
import strategy.Behavior;
import strategy.DefensiveBehavior;
import strategy.NormalBehavior;
import strategy.Robot;

public class Program {

	public static void main(String[] args) {

		// Singleton

		SingletonLazy lazy = SingletonLazy.getInstance();
		System.out.println(lazy);
		lazy = SingletonLazy.getInstance();
		System.out.println(lazy);

		SingletonEager eager = SingletonEager.getInstance();
		System.out.println(eager);
		eager = SingletonEager.getInstance();
		System.out.println(eager);

		SingletonLazyHolder lazyHolder = SingletonLazyHolder.getInstance();
		System.out.println(lazyHolder);
		lazyHolder = SingletonLazyHolder.getInstance();
		System.out.println(lazyHolder);

		System.out.println();

		// Strategy

		Behavior normal = new NormalBehavior();
		Behavior defensive = new DefensiveBehavior();
		Behavior aggressive = new AggressiveBehavior();

		Robot robot = new Robot();
		robot.setStrategy(normal);
		robot.toMove();
		robot.setStrategy(defensive);
		robot.toMove();
		robot.setStrategy(aggressive);
		robot.toMove();

		System.out.println();

		// Facade
		Facade facade = new Facade();
		facade.migrateClient("Gabriel", "010101010");
	}

}