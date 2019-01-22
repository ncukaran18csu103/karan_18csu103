import java.util.*;
{
	void circle();
}
class AreaOfCircle implements AreaCal
{
	 double area;
	public void circle(double r)
	{
	area= (22*r*r)/7;
	}
   public static void main(String args[]) 
    {
      AreaOfCircle x;   
      Scanner s= new Scanner(System.in);
      System.out.println("Enter the radius:");
      double rad= s.nextDouble();
      x=new AreaOfCircle();
      x.circle(rad);      
      System.out.println("Area of Circle is: " + x.area);      
   }
 }