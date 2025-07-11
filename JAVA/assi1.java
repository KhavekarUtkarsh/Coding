import java.util.Scanner;
class Complex{
    private float real;
    private float imag;
    Complex(){
        real=0;
        imag=0;
    }
    Complex(float real, float imag){
        this.real=real;
        this.imag=imag;
    }
    public void Add(Complex c1,Complex c2){
        float areal,aimag;
        areal=(c1.real+c2.real);
        aimag=(c1.imag+c2.imag);
        System.out.println("Addition="+areal+"+"+aimag+"i");
    }
    public void Substract(Complex c1, Complex c2){
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
    public void Divide(Complex c1,Complex c2){
        float deno,dreal,dimag;
        deno=(c2.real*c2.real+c2.imag*c2.imag);
        dreal=(c1.real*c2.real+c1.imag*c2.imag);
        dimag=(c2.real*c1.imag-c1.real*c2.imag);
        System.out.println("Division="+dreal+"/"+deno+"+"+dimag+"i"+"/"+deno);
    }
}
public class assi1{
    public static void main(String args[]){
        int ch;
        float num1,num2,num3,num4;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the first number-");
        num1=sc.nextFloat();
        num2=sc.nextFloat();
        Complex co1=new Complex(num1,num2);
        System.out.println("Enter the second number-");
        num3=sc.nextFloat();
        num4=sc.nextFloat();
        Complex co2=new Complex(num3,num4);
        Complex co3=new Complex();
        do{
            System.out.println("____MENU____");
            System.out.println("\n1:Addition\n2:Substraction\n3:Multiplication\n4:Division\n5:Exit");
            System.out.println("Enter your choice-");
            ch=sc.nextInt();
            switch(ch){
                case 1: co3.Add(co1,co2);
                        break;
                case 2: co3.Substract(co1, co2);
                        break;
                case 3: co3.Multiply(co1,co2);
                        break;
                case 4: co3.Divide(co1,co2);
                        break;
                case 5: System.out.println("Exited!!");
            }
        }while(ch!=5);
        sc.close();
    }
}