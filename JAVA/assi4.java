import java.util.Scanner;
abstract class Shape{
    double base,height;
    abstract void compute_area();
    Shape(){
        base=height=0;
    }
    Shape(double base,double height){
        this.base=base;
        this.height=height;
    }
    double getBase(){
        return base;
    }
    double getHeight(){
        return height;
    }
    void setBase(double base){
        this.base=base;
    }
    void setHeight(double height){
        this.height=height;
    }
}
class Rectangle extends Shape{
    void compute_area(){
        System.out.println("Area of Rectangle="+base*height);
    }
}
class Triangle extends Shape{
    void compute_area(){
        System.out.println("Area of Triangle="+0.5*base*height);
    }
}
public class assi4{
    public static void main(String args[]){
        int ch;
        System.out.println("\nEnter the Base-");
        Scanner sc=new Scanner(System.in);
        double b=sc.nextDouble();
        System.out.println("Enter the Height-");
        double h=sc.nextDouble();
        do{
            System.out.println("\n____MENU____");
            System.out.println("\n1:Area of Rectangle\n2:Area of Tringle\n3:Exit");
            System.out.println("Enter your choice-");
            ch=sc.nextInt();
            Shape s;
            switch(ch){
                case 1: s=new Rectangle();
                        s.setBase(b);
                        s.setHeight(h);
                        s.getBase();
                        s.getHeight();
                        s.compute_area();
                        break;
                case 2: s=new Triangle();
                        s.setBase(b);
                        s.setHeight(h);
                        s.getBase();
                        s.getHeight();
                        s.compute_area();
                        break;
                case 3: System.out.println("Exited!!");
            }
        }while(ch!=3);
    }
}