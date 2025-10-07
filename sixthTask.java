//Day 05 --- Typecasting --- PITP 

class Main{
    public static void main(String[] args){

    //Narrowing (Explicit Casting)
	//question 1
	double Num1 = 9.7;
	int Num2 = (int)Num1;
	System.out.println("Double is " + Num1);
	System.out.println("Integer is " + Num2 + "\n");

	//question 2
	float f = 123.45f;
	int i = (int)f;
	System.out.println("Float is " + f);
	System.out.println("Integer is " + i + "\n");
		
	//question 3
	long l = 100000;
	short s = (short)l;
	System.out.println("Long is " + l);
	System.out.println("Short is " + s + "\n");
	
	//question 4
	double price = 99.99;
	byte price2 = (byte)price;
	System.out.println("Price in double " + price);
	System.out.println("Price in byte is " + price2 + "\n");
		
	//question 5
	double num1 = 10.75;
	double num2 = 20.89;
	int intNum1 = (int)num1;
	int intNum2 = (int)num2;
	int sum = intNum1 + intNum2;
	System.out.println("Double numbers are " + num1 + " & " + num2);
	System.out.println("Integers numbers are " + intNum1 + " & " + intNum2);
	System.out.println("Sum: " + sum);
	}
}


import java.util.Scanner;

public class Main{
    
	public static void main(String[] args){
        
	Scanner obj = new Scanner(System.in);
        
	//(System.in);
        
	System.out.print("Enter your name : ");
        
	String name = obj.nextLine();
        
	System.out.println("Hi " + name);
    

	}

}
