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
 public Static void main (String args[])
 {
 	Box b=new Box();
 	b.setdim(1,2,3);
 		doubl Vol=b.Volume();
 		system.out.println("Vol");

 	}	
 
 }