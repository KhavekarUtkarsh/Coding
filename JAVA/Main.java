//Assignment No.-11

import java.io.IOException;
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
interface PaymentStrategy {
	public void pay(double amnt);
	public void info() throws IOException;
}
class CreditcadStartegy implements PaymentStrategy{
	public String name,card_no,cvv,dob;
	public void info() throws IOException{
		BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter Your Name : ");
		name=b.readLine();
		System.out.print("Enter Your Card Number : ");
		card_no=b.readLine();
		System.out.print("Enter Your CVV : ");
		cvv=b.readLine();
		System.out.print("Enter Your Date Of Expiry : ");
		dob=b.readLine();
	}
	public void pay(double amnt) {
		System.out.println(amnt+" Paid using Credit card Successfully\nThank You !!");
	}
}
class PaypalStrategy implements PaymentStrategy{
	private String email_id,paswrd;
	public void info() throws IOException{
		BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter Your Email ID : ");
		email_id=b.readLine();
		System.out.print("Enter Your Password : ");
		paswrd=b.readLine();
	}
	
	public void pay(double amnt) {
		System.out.println(amnt+" Paid using Paypal Successfully\nThank You !!");
	}
}
class BitCoinStrategy implements PaymentStrategy {
    public String name, key;
    public void pay(double amnt) {
        System.out.println(amnt+" Paid using Bitcoin Successfully\nThank You !!");
    }
    public void info() throws IOException {
        BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter Your Username : ");
        name=b.readLine();
        System.out.print("Enter Your Bitcoin key : ");
        key=b.readLine();
    }
}
class ShoppingCart {
    List<Item> items;
    public ShoppingCart(){
        this.items=new ArrayList<Item>();
    }
    public void addItem(Item item){
        this.items.add(item);
    }
    public void removeItem(Item item){
        this.items.remove(item);
    }
    public int calculateTotal(){
        int sum = 0;
        for(Item item : items){
            sum += item.getPrice();
        }
        return sum;
    }
    public void pay(PaymentStrategy paymentMethod) throws IOException {
        int amount = calculateTotal();
        System.out.println();
        paymentMethod.info();
        System.out.println();
        paymentMethod.pay(amount);
    }
}
class Item {
    private String upcCode;
    private int price;
    public Item(String upc, int cost){
        this.upcCode=upc;
        this.price=cost;
    }
    public String getUpcCode() {
        return upcCode;
    }
    public int getPrice() {
        return price;
    }
}
public class Main {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		ShoppingCart cart = new ShoppingCart();
		Item item1 = new Item("Clothes",100);
		Item item2 = new Item("Shoes",1250);
		Item item3 = new Item("Books",400);
		cart.addItem(item1);
		cart.addItem(item2);
		cart.addItem(item3);
		cart.removeItem(item1);
		int ch;
		do{
			System.out.print("\n1.By Card \t2.By Paypal \t3.By Bitcoin \nHow will you do the payment : ");
			ch =sc.nextInt();
			sc.close();
			switch(ch){
				case 1 : cart.pay(new CreditcadStartegy());
					break;
				case 2 :cart.pay(new PaypalStrategy());
					break;
				case 3 :cart.pay(new BitCoinStrategy());
					break;
				default:System.out.print("\nPlease Enter correct choice 1/2/3");
			}
		}while (ch<4);
	}
}