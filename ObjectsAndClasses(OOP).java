//OOP --- CORE JAVA --- PITP 2 --- 14/10/2025 --- Classes and Objects | Introduction

/*public class Cars{
    String name = "Toyota";
    int model = 1995;
    
    public static void
}*/

public class Main {
    
    String fName, lName;
    int age;
    
	public static void main(String[] args) {
	    Main obj = new Main();
		obj.fName = "Abdul";
		obj.lName = "Hadi";
		obj.age = 19;
		System.out.println("FirstName: " + obj.fName + " LastName: " + obj.lName + " Age: " + obj.age);
		
		obj.fName = "Riaz";
		obj.lName = "Ahmed";
		obj.age = 67;
		System.out.println("FirstName: " + obj.fName + " LastName: " + obj.lName + " Age: " + obj.age);
	}
}