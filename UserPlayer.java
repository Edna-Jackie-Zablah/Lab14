import java.util.Scanner;

public class UserPlayer extends Player{
	private Scanner scnr;

	public UserPlayer(String name, Scanner scnr) {
		super(name);
		this.scnr = scnr;
	}

	@Override
	public Roshambo generateRoshambo() {

		int choice;
		do {
			System.out.println ("\nSelect an object: 1(ROCK) 2(PAPER) or 3(SCISSORS) ");
			choice = scnr.nextInt();
		}
		while(!Validator.validateObject(choice));
		Roshambo objects[] = Roshambo.values();
		return objects[choice - 1];
	}

}
