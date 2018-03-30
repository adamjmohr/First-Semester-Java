
public class Demo {

	public static void main(String[] args) {
		Block red = new Block (6,2,1,"Red", true, false, false);
		Block blue = new Block (4,2,1,"Blue", false, false, false);
		Block green = new Block (4,2,2,"Green", false, false, true);
		Block yellow = new Block (2,2,1,"Yellow", false, false, false);
		blue.rotate();
		red.placeOnTop(blue);
		blue.placeOnTop(green);
		green.placeOnTop(yellow);
		Block.Verify();

	}

}
