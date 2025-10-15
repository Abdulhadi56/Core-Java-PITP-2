//PITP - 2 ---- CORE JAVA ---- Objects And Classes(OOPs) ---- Methods & Objects
import java.util.Scanner;
/*class Cars{
    String name;
    String color;
    
    public static void topSpeed(){
        System.out.print("Top speed of car");
    }
}*/


public class Main{
    /*//methods
    public void myPublicFunc(){
        System.out.println("Hello World1");    
    }
    
    static void myStaticFunc(){
        System.out.println("Hello World2");
    }*/
    
	public static void main(String[] args) {
	    //main class
	    /*System.out.println("Class 1: Main");
	    Main obj = new Main();
	    obj.myPublicFunc();
		myStaticFunc();
		System.out.println("\n");
		
		
		//main2 class
		System.out.println("Class 2: Main2");
	    Main2 obj2 = new Main2();
	    obj2.myFunc();
	    System.out.println("Sum: " + obj2.sumFunc(9, 5));
	    System.out.println("\n");
	    
	
	    //main3 class
	    System.out.println("Class 3: Cars");
	    Cars obj3 = new Cars();
	    obj3.name = "Toyota";
	    obj3.color = "Black";
	    System.out.println("Car name is " + obj3.name);
	    System.out.println("Car color is " + obj3.color);*/
	    
	    Scanner sc = new Scanner(System.in);
	    Main2 obj = new Main2();
	    
	    while(true){
	        System.out.println("\n");
	        System.out.print("Enter the operator(+, -, *, /): ");
	        String opt = sc.next();
	        System.out.print("Enter first number: ");
	        int num1 = sc.nextInt();
	        System.out.print("Enter second number: ");
	        int num2 = sc.nextInt();
	        if(opt.equalsIgnoreCase("+")){
	            System.out.println("Sum of num1 and num2 = " + obj.sumNums(num1, num2));
	        }else if(opt.equalsIgnoreCase("-")){
	            System.out.println("Sutraction of num1 and num2 = " + obj.subtNums(num1, num2));
	        }else if(opt.equalsIgnoreCase("*")){
	            System.out.println("Multiplication of num1 and num2 = " + obj.multNums(num1, num2));
	        }else if(opt.equalsIgnoreCase("/")){
	            System.out.println("Division of num1 and num2 = " + obj.divideNums(num1, num2));
	        }else{
	            System.out.println("Invalid input....");
	        }
	    }
	}
}





class Main2{
    
    /*public static void myFunc(){
        System.out.println("My function..");
    }
    
    public static int sumFunc(int a, int b){
        return a + b;
    }*/
    
    public static int sumNums(int a, int b){
        return a + b;
    }
    
    public static int subtNums(int a, int b){
        return a - b;
    }
    
    public static int multNums(int a, int b){
        return a * b;
    }
    
    public static int divideNums(int a, int b){
        return a / b;
    }
}
