import java.lang.Math;
public class RandomPlayer extends Player {

	public RandomPlayer(String name) {
		super(name);
	}

	@Override
	public Roshambo generateRoshambo() {
		Roshambo objects[] = Roshambo.values();
		return objects[(int) (Math.random() * 3)];
	}

}
