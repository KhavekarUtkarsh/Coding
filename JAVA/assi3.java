import java .util.Scanner;
class Employee{
    String Emp_name;
    int Emp_id;
    String addr;
    String Mail_id;
    long Mobile_no;
    Scanner sc=new Scanner(System.in);
    public void Read(){
        System.out.println("Enter the Employee Name-");
        Emp_name=sc.nextLine();
        System.out.println("Enter the Employee ID-");
        Emp_id=sc.nextInt();
        System.out.println("Enter the Employee Address-");
        addr=sc.next();
        System.out.println("Enter the Employee E-mail ID-");
        Mail_id=sc.next();
        System.out.println("Enter the Employee Mobile No.-");
        Mobile_no=sc.nextLong();
    }    
    public void Display(){
        System.out.println("\n\n____EMPLOYEE DETAILS____");
        System.out.println("Name-"+Emp_name);
        System.out.println("ID-"+Emp_id);
        System.out.println("Address-"+addr);
        System.out.println("E-mail ID-"+Mail_id);
        System.out.println("Mobile No.-"+Mobile_no);
    }
}
class Programmer extends Employee{
    double BP,DA,HRA,PF,SCF;
    double Gross_sal,Net_sal;
    Programmer(){
        BP=100000;
    }
    public void Calc(){
        DA=0.97*BP;
        HRA=0.10*BP;
        PF=0.12*BP;
        SCF=0.001*BP;
        Gross_sal=BP+DA+HRA;
        Net_sal=Gross_sal-(PF+SCF);
        System.out.println("\n\n____SALARY DETAILS____");
        System.out.println("BP="+BP);
        System.out.println("DA="+DA);
        System.out.println("HRA="+HRA);
        System.out.println("PF="+PF);
        System.out.println("SCF="+SCF);
        System.out.println("Gross Salary="+Gross_sal);
        System.out.println("Net Salary="+Net_sal);
    }
}
class Team_Lead extends Employee{
    double BP,DA,HRA,PF,SCF;
    double Gross_sal,Net_sal;
    Team_Lead(){
        BP=150000;
    }
    public void Calc(){
        DA=0.97*BP;
        HRA=0.10*BP;
        PF=0.12*BP;
        SCF=0.001*BP;
        Gross_sal=BP+DA+HRA;
        Net_sal=Gross_sal-(PF+SCF);
        System.out.println("\n\n____SALARY DETAILS____");
        System.out.println("BP="+BP);
        System.out.println("DA="+DA);
        System.out.println("HRA="+HRA);
        System.out.println("PF="+PF);
        System.out.println("SCF="+SCF);
        System.out.println("Gross Salary="+Gross_sal);
        System.out.println("Net Salary="+Net_sal);
    }
}
class AssistantProjectManager extends Employee{
    double BP,DA,HRA,PF,SCF;
    double Gross_sal,Net_sal;
    AssistantProjectManager(){
        BP=200000;
    }
    public void Calc(){
        DA=0.97*BP;
        HRA=0.10*BP;
        PF=0.12*BP;
        SCF=0.001*BP;
        Gross_sal=BP+DA+HRA;
        Net_sal=Gross_sal-(PF+SCF);
        System.out.println("\n\n____SALARY DETAILS____");
        System.out.println("BP="+BP);
        System.out.println("DA="+DA);
        System.out.println("HRA="+HRA);
        System.out.println("PF="+PF);
        System.out.println("SCF="+SCF);
        System.out.println("Gross Salary="+Gross_sal);
        System.out.println("Net Salary="+Net_sal);
    }
}
class ProjectManager extends Employee{
    double BP,DA,HRA,PF,SCF;
    double Gross_sal,Net_sal;
    ProjectManager(){
        BP=100000;
    }
    public void Calc(){
        DA=0.97*BP;
        HRA=0.10*BP;
        PF=0.12*BP;
        SCF=0.001*BP;
        Gross_sal=BP+DA+HRA;
        Net_sal=Gross_sal-(PF+SCF);
        System.out.println("\n\n____SALARY DETAILS____");
        System.out.println("BP="+BP);
        System.out.println("DA="+DA);
        System.out.println("HRA="+HRA);
        System.out.println("PF="+PF);
        System.out.println("SCF="+SCF);
        System.out.println("Gross Salary="+Gross_sal);
        System.out.println("Net Salary="+Net_sal);
    }
}
public class assi3{
    public static void main(String args[]){
        int ch;
        Programmer p=new Programmer();
        Team_Lead t=new Team_Lead();
        AssistantProjectManager apm= new AssistantProjectManager();
        ProjectManager pm=new ProjectManager();
        do{
            System.out.println("\n____MENU____");
            System.out.println("\n1:Programmer\n2:Team_Lead\n3:Assistant Project Manager\n4:Project Manager\n5:Exit");
            System.out.println("Enter your choice-");
            Scanner sc=new Scanner(System.in);
            ch=sc.nextInt();
            switch(ch){
                case 1: p.Read();
                        p.Display();
                        p.Calc();
                        break;
                case 2: t.Read();
                        t.Display();
                        t.Calc();
                        break;
                case 3: apm.Read();
                        apm.Display();
                        apm.Calc();
                        break;
                case 4: pm.Read();
                        pm.Display();
                        pm.Calc();
                        break;
                case 5: System.out.println("Exited!!");
            }
        }while(ch!=5);
    }
}