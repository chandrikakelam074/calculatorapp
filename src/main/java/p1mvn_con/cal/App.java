package p1mvn_con.cal;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
         
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num1");
        int num1 = sc.nextInt();
        
        System.out.println("Enter num2");
        int num2 = sc.nextInt();
         
        calculator calc = new calculator();
        
        System.out.println("Addition of 2 numbers :" + calc.add(num1,num2 ));
        System.out.println( "Substraction of 2 numbers :" +calc.substract(num1,num2));
        System.out.println("multiplication of 2 numbers :" + calc.multiply (num1,num2));
        System.out.println("Division of 2 numbers :" + calc.divide(num1,num2));
        
    }
}
