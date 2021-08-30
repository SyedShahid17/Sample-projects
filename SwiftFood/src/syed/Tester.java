package syed;

import java.text.DecimalFormat;
import java.util.List;
import java.util.Scanner;


/*public class Tester {
	public static void main(String args[]) {
		
		// Object creation
		Customer customer = new Customer();
		/*System.out.println(customer.customerId);
		System.out.println(customer.customerName);
		System.out.println(customer.contactNumber);
        System.out.println(customer.address);*/
		
		// Assigning values to the instance variables
		/*customer.customerId = "C101";
		customer.customerName = "Stephen Abram";
		customer.contactNumber = 7856341287L;
		customer.address = "D089, St. Louis Street, Springfield, 62729";
		
		customer.displayCustomerDetails();
		customer.payBill(500, 10);

	}
}

import java.util.*;

import java.text.*;

class Main{

  public static void main (String[] args) {

      DecimalFormat df2 =new DecimalFormat("0.00");

      Scanner sc= new Scanner (System.in);

      System.out.println("Enter the no of liters to fill the tank");

      int ltt =sc.nextInt();

      double lt= (ltt*1.00);

      if(ltt<1){

          System.out.println(ltt+" is an Invalid Input");

          System.exit(0);

      }

      System.out.println("Enter the distance covered");

      int diss =sc.nextInt();

      double dis= (diss*1.00);

      if(diss<1){

          System.out.println(diss+" is an Invalid Input");

          System.exit(0);

      }

      double hundered = ((lt/dis)*100);

      System.out.println("Liters/100KM");

      System.out.println(df2.format(hundered));

      double miles = (dis*0.6214);

      double gallons =(lt*0.2642);

      double mg = miles/gallons;

      System.out.println("Miles/gallons");

      System.out.println(df2.format(mg));

  }  

}
*/
class Restaurant {
	private String restuarnatName;
	private long[] restaurantContacts;
	private String restaurantAddress;
	private float rating;
	
	public Restaurant(String name, long[] restaurantContacts, String restaurantAddress, float rating) {
	this.restuarnatName = name;
	this.restaurantContacts = restaurantContacts;
	this.restaurantAddress = restaurantAddress;
	this.rating = rating;
	}
	
	public String getRestuarnatName() {
		return restuarnatName;
	}
	public void setRestuarnatName(String restuarnatName) {
		this.restuarnatName = restuarnatName;
	}
	public long[] getRestaurantContact() {
		return restaurantContacts;
	}
	public void setRestaurantContact(long[] restaurantContacts) {
		this.restaurantContacts = restaurantContacts;
	}
	public String getRestaurantAddress() {
		return restaurantAddress;
	}
	public void setRestaurantAddress(String restaurantAddress) {
		this.restaurantAddress = restaurantAddress;
	}
	public float getRating() {
		return rating;
	}
	public void setRating(float rating) {
		this.rating = rating;
	}
	public void displayRestaurantDetails() {
	System.out.println("Displaying restaurant details \n***************");
	System.out.println("Restaurant Name : "+this.restuarnatName);
	System.out.println("Restaurant Rating : "+this.rating);
	System.out.println("Restaurant Contacts:");
	for (int index = 0; index < this.restaurantContacts.length; index++)
		System.out.println(this.restaurantContacts[index]);
	System.out.println("Restaurant Address : "+this.restaurantAddress);
	System.out.println();
	}
}
public class Tester {
	public static void main(String[] args) {
		long[] restaurantContacts = { 9992346725L, 9992346726L, 9992346727L };
		Restaurant restaurant1 = new Restaurant("SwiftFood",
				restaurantContacts, "Carolina Street, Springfield, 62702", 4.1f);
		restaurant1.displayRestaurantDetails();
	}
}


