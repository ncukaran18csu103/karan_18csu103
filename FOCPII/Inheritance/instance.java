public class Instance
{
	public static void main(String args[])
	{
	Shape s = new Shape();
	Shape c =new Circle();
	System.out.println("s instance of Shape" + (s instanceof Shape));
	System.out.println("s instance of Shape" + (s instanceof Shape));
	System.out.println("s instance of Circle" + (c instanceof Circle));
	System.out.println("s instance of Circle" + (c instanceof Circle));
	}
}