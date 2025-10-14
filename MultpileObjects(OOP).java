//OOP --- CORE JAVA --- PITP 2 --- 14/10/2025 --- Multiple Objects

public class Main {
    
    String fName, lName;
    int age;
    
	public static void main(String[] args) {
	    Main obj1 = new Main();
	    Main obj2 = new Main();
	    
	    System.out.println("OOP Task of Classes and Objects | Introduction")
	    
		obj1.fName = "Abdul Hadi";
		obj1.lName = "Khawaja";
		obj1.age = 19;
		System.out.println("My Name is " + obj1.fName + ", my Surname is " + obj1.lName + ", and I am " + obj1.age + " years old.");
		
		obj2.fName = "Riaz Ahmed";
		obj2.lName = "Khawaja";
		obj2.age = 67;
		System.out.println("My Name is " + obj2.fName + ", my Surname is " + obj2.lName + ", and I am " + obj2.age + " years old.");
	}
} 