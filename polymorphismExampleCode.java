
//CORE JAVA TASKS --- PITP 2 --- Polymorphism Example code

class Vehicle{
    public void startEnginge(){
        System.out.println("Engine Starting");
    }    
    
}

class Car extends Vehicle{
    public void startEnginge(){
        System.out.println("Car engine is starting");
    }
}


class Main{
    
	public static void main(String[] args) {
	    //Polymorphism -- referncing from parent class
	    Vehicle obj = new Car();
	    obj.startEnginge();
		
	}
}
