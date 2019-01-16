import java.util.*;
class Box
{
	double Width;
	double Height;
	double Depth;
    Box (double w,double h,double d)
	{
		this.Width=w;
		this.Height=h;
		this.Depth=d;
	}
	Box()
	{
		Width=5;
		Height=6;
		Depth=4;
	}
  double Volume()
  {
  	double Volume=Height*Width*Depth;
  	return Volume;
  }
	
}class Boxdemo
{
 public static void main (String args[])
 {
 	Box b=new Box();
 		double Vol=b.Volume();
 		System.out.println(Vol);

 	}	
 
 }