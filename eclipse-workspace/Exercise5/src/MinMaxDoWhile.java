import java.util.Random;

public class MinMaxDoWhile {

	public static void main (String[] args) {
		Random random = new Random();

		int count = 1;
		int value;
		int min = 500;
		int max = 0;

		do {
			value = random.nextInt(500);

			System.out.println("Value #" + count + " = " + value);

			count++;
			if (value < min) {
				min = value;
			}
			if (value > max) {
				max = value;
			}
		} while(count <= 5);

	System.out.println("Max = " + max);
	System.out.println("Min = " + min);
}

}
