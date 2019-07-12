import java.util.Scanner;
public class RoshamboApp {

	public static void main(String[] args) {

		Scanner scnr = new Scanner(System.in);
		String userContinue = "";
		System.out.println("Please enter your name: ");
		String name = scnr.next();

		UserPlayer player1 = new UserPlayer(name, scnr);
		int opponent;
		do {
			
			do {
				System.out.println("Choose an opponent: (1) or (2) ");
				opponent = scnr.nextInt();
			}
			while(!Validator.validateOpponent(opponent));
			if (opponent == 1) {
				RockPlayer rock = new RockPlayer("Danny");
				rock.generateRoshambo();
				Roshambo playerMove = player1.generateRoshambo();

				if (playerMove == Roshambo.valueOf("ROCK")) {
					System.out.println("Is a draw! :|  ");
				}else if (playerMove == Roshambo.valueOf("PAPER")) {
					System.out.println("YOU WIN! :)  ");
				}else if (playerMove == Roshambo.valueOf("SCISSORS")) {
					System.out.println("you lose :(  ");
				}
				System.out.println("Do you want to keep playing? (y/n) ");
				userContinue = scnr.next();

			}else if (opponent == 2) {
				RandomPlayer random = new RandomPlayer("Cecy"); 
				Roshambo randomMove = random.generateRoshambo();
				Roshambo playerMove = player1.generateRoshambo();

				if (playerMove == Roshambo.valueOf("ROCK")) {
					if (randomMove == Roshambo.valueOf("ROCK")) {
						System.out.println("Is a draw! :|");
					}else if (randomMove == Roshambo.valueOf("SCISSORS")) {
						System.out.println("YOU WIN! :)");
					}else if (playerMove == Roshambo.valueOf("PAPER")) {
						System.out.println("you lose :(");
					}
				}else if (playerMove == Roshambo.valueOf("PAPER")) {
					if (randomMove == Roshambo.valueOf("PAPER")) {
						System.out.println("Is a draw! :|");
					}else if (randomMove == Roshambo.valueOf("ROCK")) {
						System.out.println("YOU WIN! :)");
					}else if (playerMove == Roshambo.valueOf("SCISSORS")) {
						System.out.println("you lose :(");
					}
				}else if(playerMove == Roshambo.valueOf("SCISSORS")) {
					if (randomMove == Roshambo.valueOf("SCISSORS")) {
						System.out.println("Is a draw! :|");
					}else if (randomMove == Roshambo.valueOf("PAPER")) {
						System.out.println("YOU WIN! :)");
					}else if (playerMove == Roshambo.valueOf("ROCK")) {
						System.out.println("you lose :(");
					}
				}
				System.out.println("Do you want to keep playing? (y/n) ");
				userContinue = scnr.next();
			}
		}//do while
		while ((userContinue.equals("y")) || (userContinue.equals("y")));

	}//end main



}//end RoshamboApp
