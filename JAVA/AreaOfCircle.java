import java.util.Scanner;
class AreaOfCircle{
    public static void main(String args[]){
    double pi=3.1415;
    System.out.println("\nEnter the radius-");
    Scanner br=new Scanner(System.in);
    double r=br.nextDouble();
    double a=pi*r*r;
    System.out.println("\nArea="+a);
    br.close();
    }
}