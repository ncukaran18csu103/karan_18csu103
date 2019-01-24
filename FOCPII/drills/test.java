import java.util.**;
class Question2
{
	public static void main(String args[])
	{
		int b;
		do
		{
		Scanner con=new Scanner(System.in);
		System.out.print("Enter Number : ");
		int no=con.nextInt();
		switch(no)
		{
			case 1:System.out.println("\nMonth : January");break;
			case 2:System.out.println("\nMonth : February");break;
			case 3:System.out.println("\nMonth : March");break;
			case 4:System.out.println("\nMonth : April");break;
			case 5:System.out.println("\nMonth : May");break;
			case 6:System.out.println("\nMonth : June");break;
			case 7:System.out.println("\nMonth : July");break;
			case 8:System.out.println("\nMonth : August");break;
			case 9:System.out.println("\nMonth : September");break;
			case 10:System.out.println("\nMonth : October");break;
			case 11:System.out.println("\nMonth : November");break;
			case 12:System.out.println("\nMonth : December");break;
			default:System.out.println(" attemt is wrong");
                        break;
		}
		System.out.print("\nif you want ti=o run program again? Then\nIf yes then press 1");
		int a=con.nextInt();
		System.out.print("\n");
		b=a;
		}while(b==1);
	}
} 