import java.util.Scanner;
public class Calender{
    public static void main(String args[]){
        int a,b,c;
        int arr[]={31,29,31,30,31,30,31,31,30,31,30,31};
        String ar[]={"January","February","March","April","May","June","July","August","September","October","November","December"};
        for(int i=0;i<1;i++){
            for(String element:ar){
                System.out.println(element+" "+arr[i]);
            }
        }
        System.out.println("Enter the month number which is to be selected-");
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        a=a-1;
        System.out.println("Enter the date-");
        b=sc.nextInt();
        c=b+1;
        sc.close();
        if(c%7==0){
            System.out.println("The day on that date is Sunday");
        }
        if(c%7==1){
            System.out.println("The day on that date is Monday");
        }
    }
}