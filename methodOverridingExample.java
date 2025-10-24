
//CORE JAVA TASKS --- PITP 2 --- Method Overriding Example code

class Shape{
    public void calculateArea(){
        System.out.println("calculating Area for shape");
    }    
}

class Circle extends Shape{
    public void calculateArea(){
        System.out.println("Circle's Area Formula: pi * r^2");
    } 
}

class Triangle extends Shape{
    public void calculateArea(){
        System.out.println("Triangle's Area Formula: 1/2 bh");
    }    
}


class Main{
    
	public static void main(String[] args) {
	    
	Shape obj = new Shape();
	Shape obj1 = new Circle();
	Shape obj2 = new Triangle();
	
	obj.calculateArea();
	obj1.calculateArea();
	obj2.calculateArea();
		
	}
}
