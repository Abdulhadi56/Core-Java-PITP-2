/*
//CORE JAVA TASKS --- PITP 2 --- Method Overloading Example code

class Shape{
    public float calculateArea(float a){
        return a * a;
    }    
    
    public float calculateArea(float a, float b){
        return a * b;
    }
}


class Main{
    
	public static void main(String[] args) {
	    
	//showing method overloading with Shape's class having two same methods having distinct parameters    
    Shape obj = new Shape();
    
    //overloading --> calculating squares area
    System.out.println("calculating area of Square shape: " + obj.calculateArea(2.3f));
    
    //overloading --> calculating rectangle area
    System.out.println("calculating area of Rectangle shape: " + obj.calculateArea(2.3f, 3.4f));
		
	}
}*/
