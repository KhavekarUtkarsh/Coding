import java.util.Scanner;
class Hypotenuse{
    public static void main(String args[]){
        double a,b,c;
        System.out.println("\nEnter two numbers-");
        Scanner br=new Scanner(System.in);
        a=br.nextDouble();
        b=br.nextDouble();
        br.close();
        c=Math.sqrt(a*a+b*b);
        System.out.println("\nHypotenuse="+c);
    }
}