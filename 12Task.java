import java.util.Scanner;

class Main2{
    
public static void main(String[] args){
        
Scanner obj = new Scanner(System.in);
        
        
//LOOPS in JAVA ----- FOR(), WHILE()
        
	//ATM System
        
	int balance = 10000;
        
	//int withdrawAmount;
        
	//int depositAmount;
        
        
	int pinNum  = 123;
        
        
	System.out.println("--- Welcome to ATM System---");
        
	System.out.print("Enter Your PIN Number: ");
        
	int userPin = obj.nextInt();
        
        
	if(userPin != pinNum){
                
		System.out.println("Invalid Pin, Please try again");
                
		return;
        
	}    
        
        
		while(true){
            
			System.out.println("Would you like any Transaction[Yes/No]: ");
            
			String userChoice = obj.next();
            
            
			if(userChoice == "Yes"){
            
			System.out.println("Select the Transactionfrom the following");
            
			System.out.println("Check Balance");
            
			System.out.println("Deposit Amount");
            
			System.out.println("Withdraw Amount");
            
			System.out.println("Receipt");
            
			System.out.println("Exit");
            
			System.out.println("\n");
            
            
			String userTransactionType;
            
			System.out.print("Enter Your Transaction Type: ");
            
			userTransactionType = obj.next();
            
                    
			if(userTransactionType == "Balance"){
                        
			System.out.println("Current Balance: " + balance);
                    
			}else if(userTransactionType == "WithDraw"){
                        
			System.out.print("Enter amount you want to withdraw: ");
                        
			int withdrawAmount = obj.nextInt();
                        
			System.out.println("WithDraw Amount: " + withdrawAmount);
                        
			System.out.println("Your Current Balance: " + (balance - withdrawAmount));
                    
			}else if(userTransactionType == "Deposit"){
                        
			System.out.print("Enter amount you want to Deposit: ");
                        
			int depositAmount = obj.nextInt();
                        
			System.out.println("Deposit Amount: " + depositAmount);
                        
			System.out.println("Your Current Balance: " + (balance + depositAmount));
                    
			}else if(userTransactionType == "Receipt"){
                        
			System.out.println("Printing receipt..");
                    
			}else if(userTransactionType == "Exit"){
                        
			System.out.println("Exiting...");
                    
			}else{
                        
			System.out.println("Insufficient Balance...");
                
			}
            
			}else if(userChoice == "No"){
                    
			System.out.println("Thank You..");
                    
			break;
            
			}else{
                    
			System.out.println("Invalid Input, please type Yes or No");
            
			}
        
		}
            
    
	}

}