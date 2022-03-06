/**
 * 
 * @author netanel cohen gindi
 * this is just the class of point use to represent square's top left corner
 */
public class Point
{
	private int x;
	private int y;

	public Point(int newx, int newy)
	{
		this.x = newx;
		this.y = newy;
	}

	public int getx()
	{
		return this.x;
	}

	public int gety()
	{
		return this.y;
	}

	public void setx(int newx)
	{
		this.x = newx;
	}

	public void sety(int newy)
	{
	this.y=newy;
	}

}
