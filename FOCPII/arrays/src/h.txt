import java.util.*;
class array1
{
	public static void main(String args[])
	{
		Scanner con=new Scanner(System.in);
		int[] arr=new int[10];
		System.out.println("Enter 10 elements --");
		for(int x=0;x<10;x++)
		{
			arr[x]=con.nextInt();
		}
		for(int y=0;y<10;y++)
		{
			System.out.println("["+ (y+1) +"] "+arr[y]);
		}
		System.out.print("\n\nEnter Number to be searched : ");
		int ch=con.nextInt();
		int no=0;
		for(int z=0;z<10;z++)
		{
			if(ch==arr[z])
			System.out.println(z+1);

			else
			no++;
		}
		if(no==10)
		System.out.print("-1");
	}
}