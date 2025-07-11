import java.util.Scanner;
abstract class Publication{
    String title;
    int price,copies;
    abstract void saleCopy();
    abstract void setPrice();
    Scanner sc = new Scanner(System.in);
}
class Book extends Publication{
    String author;
    void saleCopy(){
        System.out.println("Book Name-"+title);
        System.out.println("Author Name-"+author);
        System.out.println("Price per Book-"+price);
        System.out.println("Copies Ordered-"+copies);
        System.out.println("Total Sales-"+copies*price);
    }
    void orderCopies(){
        System.out.println("Enter the quantity-");
        copies=sc.nextInt();
    }
    void setPrice(){
        System.out.println("Enter the Title of Book-");
        title=sc.nextLine();
        System.out.println("Enter the Author's Name-");
        author=sc.nextLine();
        System.out.println("Enter the price of one Book-");
        price=sc.nextInt();
    }
}
class Magzine extends Publication{
    String currIssue;
    void saleCopy(){
        System.out.println("Magzine Name-"+title);
        System.out.println("current Issue-"+currIssue);
        System.out.println("Price per Magzine-"+price);
        System.out.println("Copies Ordered-"+copies);
        System.out.println("Total sales-"+copies*price);
    }
    void orderQuantity(){
        System.out.println("Enter the Quantity of Magzine-");
        copies=sc.nextInt();
    }
    void currIssue(){
        System.out.println("The Current Issue of Magzine is-"+currIssue);
    }
    void receiveIssue(){
        System.out.println("You will receive "+currIssue+" Magzine Soon!!");
    }
    void setIssue(){
        System.out.println("Enter the title of Magzine-");
        title=sc.nextLine();
        System.out.println("Enter the Current Issue-");
        currIssue=sc.nextLine();
    }
    void setPrice(){
        System.out.println("Enter the price of Magzine-");
        price=sc.nextInt();
    }
}
public class assi2{
    public static void main(String args[]){
        System.out.println("\n____BOOK DEPARTMENT____");
        Book b=new Book();
        b.setPrice();
        b.orderCopies();
        System.out.println("\n____Details of Book Registered Now____");
        b.saleCopy();
        System.out.println("\n____MAGZINE DEPARTMENT____");
        Magzine m= new Magzine();
        m.setIssue();
        m.setPrice();
        m.orderQuantity();
        System.out.println("\n____Details of Magzine Registered Now____");
        m.saleCopy();
        m.receiveIssue();
    }
}