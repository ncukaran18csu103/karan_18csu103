<<<<<<< HEAD
import java.util.**
class Question3
 {   
  public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        System.out.print("Input floating-point number: ");
        double x = in.nextDouble();
        System.out.print("Input floating-point another number: ");
        double y = in.nextDouble();

        x = Math.round(x * 1000);
        x = x / 1000;

        y = Math.round(y * 1000);
        y = y / 1000;

        if (x == y)
        {
            System.out.println("Numbers are same up to three decimal places");
        }
        else
        {
            System.out.println("Numbers are different");
        }
    }
=======
import java.util.**
class Question3
 {   
  public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        System.out.print("Input floating-point number: ");
        double x = in.nextDouble();
        System.out.print("Input floating-point another number: ");
        double y = in.nextDouble();

        x = Math.round(x * 1000);
        x = x / 1000;

        y = Math.round(y * 1000);
        y = y / 1000;

        if (x == y)
        {
            System.out.println("Numbers are same up to three decimal places");
        }
        else
        {
            System.out.println("Numbers are different");
        }
    }
>>>>>>> b812c7cda74fb20516eff697cad5b220d2c126be
}