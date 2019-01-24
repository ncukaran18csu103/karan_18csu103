import java.util.*;
class arraysQ1
{
	
	public static void input(int [] arr)
	{
		Scanner sc= new Scanner (System.in);
		System.out.print("Enter Value: ");
		for(int x=0;x<5;x++)
		{
			arr[x]=sc.nextInt();
		}
	}  
	public static void output(int [] arr)
	{
		for (int x=0;x<5;x++)
		{
			System.out.println("Value at arr("+x+") is: "+arr[x]);
		}
	}
	public static int svalue()
	{
		Scanner sc= new Scanner (System.in);
		System.out.print("Enter Value to be searched:");
		int searchVal= sc.nextInt();
		return searchVal;
	}
	public static void ival(int searchVal, int [] arr)
	{
		int index=-1;
		for(int x=0;x<5;x++)
		{
			if(searchVal==arr[x])
			{
				index=x;
			}
		}
		System.out.print("index:" +index);
	}
	public static void main(String [] args)
	{
		int [] arr = new int[10];
		int searchVal;
		input(arr);
		output(arr);
		searchVal=svalue();
		ival(searchVal,arr);
	}
}