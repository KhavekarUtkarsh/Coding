// Assignment 1

import java.util.Scanner;
class Complex{
    private float real;
    private float imag;
    Complex(){
        real=0;
        imag=0;
    }
    Complex(float real,float imag){
        this.real=real;
        this.imag=imag;
    }
    public void Add(Complex c1,Complex c2){
        float areal, aimag;
        areal=(c1.real+c2.real);
        aimag=(c1.imag+c2.imag);
        System.out.println("Addition="+areal+"+"+aimag+"i");
    }
    public void Sub(Complex c1,Complex c2){
        float sreal,simag;
        sreal=(c1.real-c2.real);
        simag=(c1.imag-c2.imag);
        System.out.println("Substraction="+sreal+"+"+simag+"i");
    }
    public void Multiply(Complex c1,Complex c2){
        float mreal,mimag;
        mreal=(c1.real*c2.real-c1.imag*c2.imag);
        mimag=(c1.real*c2.imag+c2.real*c1.imag);
        System.out.println("Multiplication="+mreal+"+"+mimag+"i");
    }
    void Divide(Complex c1,Complex c2){
        float dreal,dimag,deno;
        deno=(c2.real*c2.real+c2.imag*c2.imag);
        dreal=(c1.real*c2.real+c1.imag*c2.imag);
        dimag=(c2.real*c1.imag-c1.real*c2.imag);
        System.out.println("Division="+dreal+"/"+deno+"+"+dimag+"i"+"/"+deno);
    }
}
public class Driver_1{
    public static void main(String args[]){
        int ch=0;
        float num1, num2, num3, num4;
        Scanner input=new Scanner(System.in);
        System.out.println("Enter first no.-");
        num1=input.nextFloat();
        num2=input.nextFloat();
        Complex co1=new Complex(num1,num2);
        System.out.println("Enter second no.-");
        num3=input.nextFloat();
        num4=input.nextFloat();
        Complex co2=new Complex(num3,num4);
        Complex co3=new Complex();
        input.close();
        do{
            System.out.println("\n____MENU____");
            System.out.println("1:Add");
            System.out.println("2:Substract");
            System.out.println("3:Multiply");
            System.out.println("4:Divide");
            System.out.println("5:Exit");
            System.out.println("Enter your choice-");
            ch=input.nextInt();
            switch(ch){
                case 1: co3.Add(co1,co2);
                        break;
                case 2:co3.Sub(co1,co2);
                        break;
                case 3: co3.Multiply(co1,co2);
                        break;
                case 4: co3.Divide(co1,co2);
                        break;
                case 5: System.out.println("Wrong Choice");
            }
        }
        while(ch!=5);
    }
}