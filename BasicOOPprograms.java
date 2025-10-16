//PITP 2 ---- CORE JAVA ---- OOP TASKS ---- 

import java.util.Scanner;

//Task 1 --- Students Info Task(Using OOP Concepts)



class Student{
    
	String name;
    
	String ID;
    
	int age;
    
    
	public static void displayStdInfo(String name, String ID, int age){
        
		System.out.println("-------Student's Info-------");
        
		System.out.println("Student's Name:  " + name);
        
		System.out.println("Student's age: " + age);
        
		System.out.println("Student's ID:  " + ID);
    
	} 

} 
    


public class Main{
	
	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
		
	Student std = new Student();
		
	std.name = "Abdul Hadi";
		
	std.age = 19;
		
	std.ID = "2401-BSSE012";
		
	std.displayStdInfo(std.name, std.ID, std.age);
		
		
	}







/*//PITP 2 ---- CORE JAVA ---- OOP TASKS ---- 

import java.util.Scanner;

//Task2 --- Car Info Task(Using OOP Concepts)



class Car{
    
String name;
    
String model;
    
int year;
    
    

public static void displayCarInfo(String name, String model, int year){
        
	System.out.println("-------Car's Details-------");
        
	System.out.println("Car's Name:  " + name);
        
	System.out.println("Car's Model: " + model);
        
	System.out.println("Car's year:  " + year);
    
	}

}    
    


class Main{
	
	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
		
	Car carO = new Car();
		
	carO.name = "Toyota Corolla";
		
	carO.model = "E/Classic-987";
		
	carO.year = 2019;
		
	carO.displayCarInfo(carO.name, carO.model, carO.year);
	

	}

}






/*//PITP 2 ---- CORE JAVA ---- OOP TASKS ---- 
/*
import java.util.Scanner;

//Task 3 --- Calculator(Using OOP Concepts)


	class Calculator{
  
  
    
	public static int addNums(int a, int b){
        
		return a + b;
    
	}
 
   
    
	public static int subtNums(int a, int b){
        
		return a - b;
    
	}
  
  
    
	public static int multNums(int a, int b){
        
	return a * b;
    
	}
 
   
    
	public static int divdNums(int a, int b){
        
		return a / b;
    
	}

    
    
	public static int modNums(int a, int b){
        
		return a % b;
    
	}

}*/





/*class Main{
  
  
	public static void main(String[] args){
        
	Scanner obj = new Scanner(System.in);
        
	Calculator cal = new Calculator();
        
        
	while(true){
        
        
		System.out.println("\n");
        
		System.out.print("Enter an maths's operator(+, -, /, * %): ");
        
		String opt = obj.next();
        
        
		System.out.print("Enter first integer(Positive Number): ");
        
		int num1 = obj.nextInt();
        
        
		System.out.print("Enter second integer(Positive Number): ");
        
		int num2 = obj.nextInt();
        
            

	switch(opt){
                
		case "+":
                    
			System.out.println("Summation of Nums: " + cal.addNums(num1, num2));
                    
			break;
                
                

		case "-":
                    
			System.out.println("Subtraction of Nums: " + cal.subtNums(num1, num2));
                    
			break;

                
                
			case "*":
                    
			System.out.println("Multiplication of Nums: " + cal.multNums(num1, num2));
                    
			break;
                
                

		case "%":
                    
		System.out.println("Modulas of Nums: " + cal.modNums(num1, num2));
                    
			break;
                
                

		case "/":
                    
			if(num2 != 0){
                        
				System.out.println("Division of Nums: " + cal.divdNums(num1, num2));
                    
			}else{
                        
				System.out.println("Cannot divide...");
                    
			}
                    
			break;    
                

		default:
                    
			System.out.println("Invalid operator, please try again");
                    
			break;  
            
			}
        
		}
    

	}

}*/