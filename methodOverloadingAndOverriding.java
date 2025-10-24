//CORE JAVA TASKS --- PITP 2 --- Method Overloading and overriding Example code

class addNums{
    public int sum(int a, int b){
        return a + b;
    }   
    
    public float sum(float a, float b){
        return a + b;
    } 
    
    public int sum(int a, int b, int c){
        return a + b + c;
    }
}

class Main{
    
	public static void main(String[] args) {
		
		//method overloading
		addNums obj = new addNums();
		
		//method with integer ---> sum method with int return type
		System.out.println("The sum of two integer numbers are " + obj.sum(5, 6));
		
		//method with float ---> sum method with float return type
		System.out.println("The sum of two float numbers are " + obj.sum(5.7f, 6.2f));
		
		//method with integer ---> sum method with int return type
		System.out.println("The sum of three integer numbers are " + obj.sum(5, 6, 7));
		
	}
}
