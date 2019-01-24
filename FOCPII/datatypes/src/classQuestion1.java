import java.util.**;
class Question1
{
	public static void main(String args[])
	{
		Scanner con=new Scanner(System.in);
		System.out.print("Enter coefficient of x^2 - " );
		int a=con.nextInt();
		System.out.print("Enter coefficient of x - " );
		int b=con.nextInt();
		System.out.print("Enter constant term - " );
		int c=con.nextInt();
		double r1,r2,d=b*b-4*a*c;
		if(d==0)
		{
			r1=(-1*b)/(2*a);
			r2=r1;
			System.out.println("Roots are "+r1+" and "+r2);
		}
		else if(d>0) 
		{
			r1=((-1*b)+Math.sqrt(d))/(2*a);
			r2=((-1*b)-Math.sqrt(d))/(2*a);
			System.out.println("Roots are "+r1+" and "+r2);
		}
		else
		{
			System.out.println("No root");
		}
	}
} 
=======
import java.util.**;
class Question1
{
	public static void main(String args[])
	{
		Scanner con=new Scanner(System.in);
		System.out.print("Enter coefficient of x^2 - " );
		int a=con.nextInt();
		System.out.print("Enter coefficient of x - " );
		int b=con.nextInt();
		System.out.print("Enter constant term - " );
		int c=con.nextInt();
		double r1,r2,d=b*b-4*a*c;
		if(d==0)
		{
			r1=(-1*b)/(2*a);
			r2=r1;
			System.out.println("Roots are "+r1+" and "+r2);
		}
		else if(d>0) 
		{
			r1=((-1*b)+Math.sqrt(d))/(2*a);
			r2=((-1*b)-Math.sqrt(d))/(2*a);
			System.out.println("Roots are "+r1+" and "+r2);
		}
		else
		{
			System.out.println("No root");
		}
	}
} 
>>>>>>> b812c7cda74fb20516eff697cad5b220d2c126be
