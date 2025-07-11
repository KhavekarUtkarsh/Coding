import java.util.Scanner;
public class assi6{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String a,b;
        int num1,num2;
        int arr[]=new int[2];
        try{
            System.out.println("Enter the first number-");
            a=sc.nextLine();
            System.out.println("Enter second number-");
            b=sc.nextLine();
            num1=Integer.parseInt(a);
            num2=Integer.parseInt(b);
        }
        catch(NumberFormatException e){
            System.out.println("Number Format Exception.");
        }
        try{
            System.out.println("Enter the first number-");
            num1=sc.nextInt();
            System.out.println("Enter the second number-");
            num2=sc.nextInt();
            int q=num1/num2;
            System.out.println("Result="+q);
        }catch(ArithmeticException e){
            System.out.println("Arithmetic Exception:Can't Divide by Zero.");
        }
        try{
            System.out.println("Enter the first number-");
            num1=sc.nextInt();
            System.out.println("Enter the second number-");
            num2=sc.nextInt();
            System.out.println("Enter the third number-");
            int num3=sc.nextInt();
            System.out.println("Array element at index 2="+arr[3]);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Array Index Out of Bounds Exception.");
        }
        sc.close();
    }
}