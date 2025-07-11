import java.util.Scanner;
class Switch{
    public static void main(String args[]){
        int a,b,ch;
        float r;
        System.out.println("\nEnter two numbers-");
        Scanner br=new Scanner(System.in);
        a=br.nextInt();
        b=br.nextInt();
        br.close();
        System.out.println("\n____MENU____");
        System.out.println("\n1:Addition \n2:Substraction \n3:Multiplication \n4:Division");
        System.out.println("\nEnter your choice-");
        ch=br.nextInt();
        switch(ch){
            case 1: r=a+b;
                    System.out.println("\nAddition="+r);
                    break;
            case 2: r=a-b;
                    System.out.println("\nSubstraction="+r);
                    break;
            case 3: r=a*b;
                    System.out.println("\nMultiplication="+r);
                    break;
            case 4: r=a/b;
                    System.out.println("\nDivision="+r);
                    break;
            default: System.out.println("\nWrong choice");
                    break;                 
        }
    }
}