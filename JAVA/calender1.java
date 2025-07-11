import java.util.Scanner;
public class calender1{
    public static void main(String args[]){
        int a,date;
        String array[]={"January(1)", "February(2)", "March(3)", "April(4)", "May(5)", "June(6)", "July(7)", "August(8)", "September(9)", "October(10)", "November(11)", "December(12)"};
        for(int i=0;i<1;i++){
            for(String element:array){
                System.out.println(element);
            }
        }
        System.out.println("Enter the number of the month to be selected-");
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        switch(a){
            case 1,10: System.out.println("Enter the date-");
                    date=sc.nextInt();
                    date=date+2;
                    if(date%7==0){
                        System.out.println("Sunday");
                    }
                    else if(date%7==1){
                        System.out.println("Monday");
                    }
                    else if(date%7==2){
                        System.out.println("Tuesday");
                    }
                    else if(date%7==3){
                        System.out.println("Wednesday");
                    }
                    else if(date%7==4){
                        System.out.println("Thursday");
                    }
                    else if(date%7==5){
                        System.out.println("Friday");
                    }
                    else{
                        System.out.println("Saturday");
                    }
                    break;
            case 2: 
                    System.out.println("Enter the date-");
                    date=sc.nextInt();
                    date=date-2;
                    if(date%7==0){
                        System.out.println("Sunday");
                    }
                    else if(date%7==1){
                        System.out.println("Monday");
                    }
                    else if(date%7==2){
                        System.out.println("Tuesday");
                    }
                    else if(date%7==3){
                        System.out.println("Wednesday");
                    }
                    else if(date%7==4){
                        System.out.println("Thursday");
                    }
                    else if(date%7==5){
                        System.out.println("Friday");
                    }
                    else{
                        System.out.println("Saturday");
                    }
                    break;
            case 3,11:  System.out.println("Enter the date-");
                        date=sc.nextInt();
                        date=date-2;
                        if(date%7==0){
                            System.out.println("Sunday");
                        }
                        else if(date%7==1){
                            System.out.println("Monday");
                        }
                        else if(date%7==2){
                            System.out.println("Tuesday");
                        }
                        else if(date%7==3){
                            System.out.println("Wednesday");
                        }
                        else if(date%7==4){
                            System.out.println("Thursday");
                        }
                        else if(date%7==5){
                            System.out.println("Friday");
                        }
                        else{
                            System.out.println("Saturday");
                        }
                        break;
            case 4,7: System.out.println("Enter the date-");
                    date=sc.nextInt();
                    date=date+1;
                    if(date%7==0){
                        System.out.println("Sunday");
                    }
                    else if(date%7==1){
                        System.out.println("Monday");
                    }
                    else if(date%7==2){
                        System.out.println("Tuesday");
                    }
                    else if(date%7==3){
                        System.out.println("Wednesday");
                    }
                    else if(date%7==4){
                        System.out.println("Thursday");
                    }
                    else if(date%7==5){
                        System.out.println("Friday");
                    }
                    else{
                        System.out.println("Saturday");
                    }
                    break;
            case 5:System.out.println("Enter the date-");
                    date=sc.nextInt();
                    date=date+3;
                    if(date%7==0){
                        System.out.println("Sunday");
                    }
                    else if(date%7==1){
                        System.out.println("Monday");
                    }
                    else if(date%7==2){
                        System.out.println("Tuesday");
                    }
                    else if(date%7==3){
                        System.out.println("Wednesday");
                    }
                    else if(date%7==4){
                        System.out.println("Thursday");
                    }
                    else if(date%7==5){
                        System.out.println("Friday");
                    }
                    else{
                        System.out.println("Saturday");
                    }break;
            case 6:System.out.println("Enter the date-");
                    date=sc.nextInt();
                    date=date-1;
                    if(date%7==0){
                        System.out.println("Sunday");
                    }
                    else if(date%7==1){
                        System.out.println("Monday");
                    }
                    else if(date%7==2){
                        System.out.println("Tuesday");
                    }
                    else if(date%7==3){
                        System.out.println("Wednesday");
                    }
                    else if(date%7==4){
                        System.out.println("Thursday");
                    }
                    else if(date%7==5){
                        System.out.println("Friday");
                    }
                    else{
                        System.out.println("Saturday");
                    }
                    break;
            case 8:System.out.println("Enter the date-");
                    date=sc.nextInt();
                    date=date-3;
                    if(date%7==0){
                        System.out.println("Sunday");
                    }
                    else if(date%7==1){
                        System.out.println("Monday");
                    }
                    else if(date%7==2){
                        System.out.println("Tuesday");
                    }
                    else if(date%7==3){
                        System.out.println("Wednesday");
                    }
                    else if(date%7==4){
                        System.out.println("Thursday");
                    }
                    else if(date%7==5){
                        System.out.println("Friday");
                    }
                    else{
                        System.out.println("Saturday");
                    }break;
            case 9,12:System.out.println("Enter the date-");
                    date=sc.nextInt();
                    if(date%7==0){
                        System.out.println("Sunday");
                    }
                    else if(date%7==1){
                        System.out.println("Monday");
                    }
                    else if(date%7==2){
                        System.out.println("Tuesday");
                    }
                    else if(date%7==3){
                        System.out.println("Wednesday");
                    }
                    else if(date%7==4){
                        System.out.println("Thursday");
                    }
                    else if(date%7==5){
                        System.out.println("Friday");
                    }
                    else{
                        System.out.println("Saturday");
                    }
                    break;
            
        }
    }
}
