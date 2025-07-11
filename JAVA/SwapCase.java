import java.util.Scanner;
public class SwapCase{
    public static void main(String args[]){
        int a,b,temp;
        System.out.println("\nEnter numbers a&b-");
        Scanner br=new Scanner(System.in);
        a=br.nextInt();
        b=br.nextInt();
        br.close();
        System.out.println("\nEntered values are-\n"+"a="+a+"\nb="+b);
        temp=a;
        a=b;
        b=temp;
        System.out.println("\nNew values of a&b are-");
        System.out.println("\na="+a+"\nb="+b);
    }
}