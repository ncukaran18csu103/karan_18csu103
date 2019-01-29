class Circle
{
	private double radius;
	private Sting color;
	public Circle()
	{
	   this.radius= 1.0;
	   this.color= "red";
	}
	public Circle(double r,String c)
	{
	   this.radius= r;
	   this.color= c;
	}
	public Circle(double r)
	{
	   this.radius= r;
	   this.color= "red";
	}
	public double getRadius()
	{
	  return radius;
	}
	public void setRadius(double r)
	{
	  this.radius= r;
	}
	public String getColor()
	{
	  return color;
	}
	public void setColor(String c)
	{
	 color= s;
	}
	public double getArea()
	{
	  return 3.14*radius*radius;
	}
}