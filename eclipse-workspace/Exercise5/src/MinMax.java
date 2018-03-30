import java.util.Random;

public class MinMax {
	
	public static void main (String[] args) {
		Random random = new Random();
		
		int count = 1;
		int value;
		int min = 500;
		int max = 0;
		
		while(count <= 5) {
			
			value = random.nextInt(500);
			
			System.out.println("Value #" + count + " = " + value);
			count++;
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
