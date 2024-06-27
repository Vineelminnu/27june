package banking1;
import java.util.*;
public class simplebankingsystem {
		   double balance=100;
		   String name = "vineel";
		   long accNum=2000220202;
	      void show() {
	    	  System.out.println("account details:"+name+","+accNum+","+balance);
	      }
		 

		   void deposit(int amount) {
		    if (amount > 0) {
		      balance += amount;
		      System.out.println("Deposit Successful!!! balance:" + balance);
		    } else {
		      System.out.println("Invalid deposit amount");
		    }
		  }

		  public void withdraw(int amount) {
		    if (amount > 0 && amount <= balance) {
		      balance -= amount;
		      System.out.println("Withdrawal Successful! balance: " + balance);
		    } else {
		      System.out.println("Insufficient funds");
		    }
		  }

		  public void checkBalance() {
		    System.out.println("Balance:" + balance);
		  }
		

		  @SuppressWarnings("resource")
		public static void main(String[] args) {
			  simplebankingsystem o = new simplebankingsystem();
		    o.show();

		    int n;
		    Scanner sc = new Scanner(System.in);

		    do {
		      System.out.println("welcome");
		      System.out.println("1. Deposit");
		      System.out.println("2. Withdraw");
		      System.out.println("3. Check Balance");
		      System.out.println("4. Exit");
		      System.out.print("Enter your choice: ");

		       n = sc.nextInt();

		      switch (n) {
		        case 1:
		          System.out.print("Enter amount to deposit: $");
		          
		          int dep = sc.nextInt();
		          o.deposit(dep);
		          break;
		        case 2:
		          System.out.print("Enter amount to withdraw: $");
		          int wit = sc.nextInt();
		          o.withdraw(wit);
		          break;
		        case 3:
		          o.checkBalance();
		          break;
		        case 4:
		          System.out.println("check balance:");
		          break;
		        default:
		          System.out.println("Please try again");
		      }
		    }
		    while(n!=0);
		  
		}
	
}
