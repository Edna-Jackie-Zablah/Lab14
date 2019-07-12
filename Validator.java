
public class Validator {
	public static boolean validateOpponent(int userInput) {
		if(userInput==1 || userInput==2) {
			return true;
		}
		else {
			System.out.println ("That is not an option.");
			return false;
		}
	}
	public static boolean validateObject(int userInput) {
		if(userInput==1 || userInput==2 || userInput==3) {
			return true;
		}
		else {
			System.out.println ("That is not an option.");
			return false;
		}
	}
}
