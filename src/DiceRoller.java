import java.util.Scanner;

public class DiceRoller {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String answer;
		int rollCount = 1;
		do {
			int numSides;
			System.out.println("How many sides do the dice have?");
			numSides = in.nextInt();
			int dice1 = generateRandomDieRoll(numSides);
			int dice2 = generateRandomDieRoll(numSides);
			System.out.println("Roll " + rollCount + ":");
			System.out.println(+ dice1);
			System.out.println(+ dice2);

			System.out.println("Do you wish to continue? (yes/nno): ");
			answer = in.next();
			rollCount++;
		} while (answer.equalsIgnoreCase("yes"));
		in.close();
	}
	static int generateRandomDieRoll(int numSides) {
		int dice = (int) (Math.random()*numSides) + 1;
		return dice;
	}
}