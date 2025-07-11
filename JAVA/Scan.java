import java.util.Scanner;
public class Scan{
    public static void main(String args[]){
        int a,b,res;
        System.out.println("Enter two numbers-");
        Scanner br=new Scanner(System.in);
        a=br.nextInt();
        b=br.nextInt();
        res=a+b;
        System.out.println("Addition= "+res);
        res=a-b;
        System.out.println("Substraction= "+res);
        br.close();
    }
}