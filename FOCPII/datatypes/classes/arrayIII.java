import java.util.*;
class array3
{
	public static void main(String args[])
	{
		Scanner con=new Scanner(System.in);
		int[] arr=new int[5];	
		int[] arr2=new int[5];
		System.out.print("Enter first element : ");
		arr[0]=con.nextInt();
		arr2[0]=arr[0];
		boolean check;
		int m=1;
		for(int x=1;x<5;x++)
		{
			System.out.print("\nEnter next element : ");
			arr[x]=con.nextInt();
			check=false;
			for(int j=0;j<=(x-1);j++)
			{
				if(arr[x]==arr[j])
				{
					check=true;
				}
			}
			if(check==false)
			{
				arr2[m]=arr[x];
				m++;
			}
			for(int n=0;n<m;n++)
			{
				System.out.print(arr2[n]+"\t");
			}
		}
		if(m==5)
		{
			System.out.println("Worst Case :(");
		}
	}
}