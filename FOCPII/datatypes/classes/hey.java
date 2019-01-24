import java.util.*;
class Distance
{
	private double x,y,dis;
	Distance()
	{
		this.x=0;
		this.y=0;	
	}
	Distance (double x)
	{
		this.x=x;
		this.y=0;
	}
	Distance(Double x,double y)
	{
		this.x=x;
		this.y=y;
	}
	public void getx(double x)
	{
		this.x=x;
	}
	public double setx()
	{
		return this.x;
	}
	public void gety(double y)
	{
		this.y=y;
	}
	public double setx()
	{
		return this.y;
	}
	public CalculateDistance (Distance x1,Distance x2 )
	{
		distance= Math.sqrt((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1)));
		{
			return distance;
		}
	}
	public static void main(String [] args)
	{
		Distance x1 =new Distance();
		Distance x2 =new Distance();
		double distance= D1.calculateDistance(D1,D2);
		System.out.println("Distance is "+distance);
	}
}
