import java.util.ArrayList;
import java.util.List;

/*    Block class
      Author:   Howard
	  Purpose:  this class models Duplo blocks
 */

public  class  Block {
	private  int  length;
	private  int  width;
	private  int  height;
	private  String colour;
	private  boolean hasWheels;
	private  boolean hasDoor;
	private  boolean hasEyes;

	// used to verify solution (students should ignore
	private Block onTop;
	private int clicks;
	private int rotation;
	private static List<Block> bottom=new ArrayList<>();

	// Default constructor
	public Block()
	{
		this(1,1,1,"white",false,false,false);		
	}

	// Initial constructor
	public Block (int l, int w, int h, String c, boolean hw, boolean hd, boolean he)
	{
		length=l;
		width=w;
		height=h;
		colour=c;
		hasWheels=hw;
		hasDoor=hd;
		hasEyes=he;
		System.out.print("Created ");
		view();
		System.out.println();
		onTop=null;
		clicks=0;
		rotation=0;
		bottom.add(this);
	}

	// Copy constructor
	public Block(Block block)
	{
		this(block.length,
				block.width,
				block.height,
				block.colour,
				block.hasWheels,
				block.hasDoor,
				block.hasEyes);		
	}


	// Place one on top of another
	public void placeOnTop (Block top)
	{ 
		System.out.print("Put "); 
		top.view();
		System.out.print("on top of "); 
		view();
		System.out.println();
		onTop=top;
		bottom.remove(top);
	}

	// Rotate one 
	public void rotate ( ) 
	{
		prettyPrint("Rotate"); 		
		rotation = ++rotation%4;
	}

	//	Move one ‘click’ forward
	public void moveForward ( )
	{
		prettyPrint("Move one click forward"); 
		clicks++;
	}

	//	Move one ‘click’ backward
	public void moveBackward ( ) 
	{
		prettyPrint("Move one click backward"); 
		clicks--;
	}

	//	View characteristics of one	
	public void view ( )
	{
		System.out.print(colour+" "+length+"x"+width+"x"+height+" ");
		if(hasWheels) System.out.print("with wheels ");
		if(hasDoor) System.out.print("with doors ");
		if(hasEyes) System.out.print("with eyes ");
	}

	// Pretty print an action
	private void prettyPrint(String action)
	{
		System.out.print(action+" "); 
		view();
		System.out.println();	
	}

	/* -------------------------------------------------------------------
	 * Verify solution
	 --------------------------------------------------------------------- */

	public static void Verify()
	{
		System.out.println("\n*****************************");	
		if(bottom.size()!=1)
		{
			System.out.println("There should only be one block on the bottom");
			return;
		}
		Block current=bottom.get(0);
		if(!current.check(6,2,1,"red", true, false, false,0,0))
		{
			return;
		}
		current=current.onTop;
		if(!current.check(4,2,1,"blue", false, false, false,0,1))
		{
			return;
		}
		current=current.onTop;
		if(!current.check(4,2,2,"green", false, false, true,0,0))
		{
			return;
		}
		current=current.onTop;
		if(!current.check(2,2,1,"yellow", false, false, false,0,0))
		{
			return;
		}
		current=current.onTop;
		if(current!=null)
		{
			System.out.println("There shouldn't be anything on top of the yellow block");
			return;
		}

		System.out.println("Congratulations, you did it right");	

	}

	private boolean check(int l, int w, int h, String c, boolean hw, boolean hd, boolean he,int cl,int rot)
	{
		boolean result = 
				length==l &&
				width==w &&
				height==h &&
				colour.equalsIgnoreCase(c) &&
				hasWheels==hw &&
				hasDoor==hd &&
				hasEyes==he &&
				clicks==cl &&
				rotation==rot;

		if (!result)
			System.out.println("Error in "+colour+" block");

		return result;
	}
}
