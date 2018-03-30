import java.util.Random;

public class MinMaxFor {
	
	public static void main (String[] args) {
		Random random = new Random();
		
		
		int value;
		int min = 500;
		int max = 0;
		
		for(int count = 1; count <= 5; count++) {
			
			value = random.nextInt(500);
			
			System.out.println("Value #" + count + " = " + value);

			if (value < min) {
				min = value;
			}
			if (value > max) {
				max = value;
			}
			
		}
		System.out.println("Max = " + max);
		System.out.println("Min = " + min);
	}
}
