import java.util.*;
class array2
{
	public static void main(String args[])
	{
		Scanner con=new Scanner(System.in);
		int[] arr=new int[10];
		input(arr);
		output(arr);
		System.out.print("Enter number to be checked : ");
		int a=con.nextInt();
		search(a,arr);
	}

	static void input(int[] arr)
	{
		Scanner co=new Scanner(System.in);
		System.out.println("Enter 10 elements --");
		for(int x=0;x<10;x++)
		{
			arr[x]=co.nextInt();
		}
	} 

	static void output(int[] arr)
	{
		for(int x=0;x<10;x++)
		{
			System.out.println("["+(x+1)+"] "+arr[x]);
		}
	}

	static void search(int a,int[] arr)
	{
		boolean check=false;
		for(int x=0;x<10;x++)
		{
			if(a==arr[x])
			{
				System.out.println(x+1);
				check=true;
			}
		}
		if(check==false)
		{
			System.out.println("-1");
		}
	}
}