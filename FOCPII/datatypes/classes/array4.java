import java.util.*;
class EXarrayQ2
{
	static  public void main(String args[])
	{
     int[] arr=new int[5];
     input(arr);
     do 

	}
	static void input(int[] a)
    {
    	Scanner con=new Scanner(system.in);
    	System.out.println("enter Five elements:");
    	for(int i=0;i<5;i++)
    	{
    		a[i]=con.nextInt();
    	} 
    }
	StackTraceElementvoid disp(int[] a)
	{
		System.out.println("enter elements in array:");
		for(int i=0;i<5;i++)
		{
			System.out.println(a[i]);
		}
	} 
	Static int sum (int[] a)
	{
		int sum=0;
		for(int i=0;i<5;i++)
		{
			sum=sum=a[i];
			return sum;
		}
	static int lar1(int[] a)
	{
		int 1=a[0];
		for(int i=0;i<5;i++)
			{ 
				if(1<a[i])
				{
					1=a[i];
				}					
			}	
		return 1;
	}
	static int samll(int[] a)
	{
		int s=a[0];
		for(int i=0;i<5;i++)
		{
			if(s>a[i])
			{
				s=a[i];
			}
		}
	return s;
	}
	static int lar2(int[] a)
	{
		int 1;
		for(int i-0;i<5;i++)
		{
			for(int i=0;i<5;i++)
			{
			if(a[i]<a[j])
			{
				1=a[i];
				a[i]=a[j];
				a[j]=1;
			}
			}
		}
		return a[1];	
	}
	static int altsum(int[] a)
	{
		int sum=0;
		for(int i=0;i<5;i++)
		{
			if(a[i]%2==0)
			{
				count++;
			}
		}
	}


}