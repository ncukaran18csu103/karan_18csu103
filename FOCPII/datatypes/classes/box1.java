import java.util.*;
class Box
{
	double Width;
	double Height;
	double Depth;
	void setdim(double w,double h,double d)
	{
		Width=w;
		Height=h;
		Depth=d;
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
 	b.setdim(1,12,3);
 		double Vol=b.Volume();
 		System.out.println(Vol);

 	}	
 
 }