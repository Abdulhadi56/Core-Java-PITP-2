//Day 05 --- Typecasting --- PITP 

public class Main
{
	
	public static void main(String[] args) {
		
	int num1 = 12;
		
	System.out.println("Integer value " + num1);
		
	double num2 = num1;
		
	System.out.println("Double value " + num2);
		
	int num3 = (int)num2;
		
	System.out.print("Integer value " + num3);



	//Widening(Implicit casting)
	//question 1
	int num1 = 10;
	double num2 = num1;
	System.out.println("num1 is " + num1 );
	System.out.println("num2 is " + num2 + "\n");

	//question 2
	byte b = 25;
	int a = b;
	System.out.println("b is " + b);
	System.out.println("a is " + a + "\n");
	
	//question 3
	short s = 3200;
	long l = s;
	System.out.println("s is " + s);
	System.out.println("l is " + l + "\n");
		
	//question 4
	int x = 15;
	int y = 4;
	double result = (x/y);
	System.out.println("result is " + result + "\n");
		
	//question 5
	float f = 12.5f;
	double d = f;
	System.out.println("f is " + f);
	System.out.println("d is " + d);

	}

}


/*Day 05 --- Typecasting --- PITP 
class Main{
	
	public static void main(String[] args){
	//Widening(Implicit casting)
	//question 1
	int num1 = 10;
	double num2 = (double)num1;
	System.out.println("num1 is " + num1);
	System.out.println("num2 is " + num2 + "\n");

	//question 2
	byte b = 25;
	int a = (int)b;
	System.out.println("b is " + b);
	System.out.println("a is " + a + "\n");
	
	//question 3
	short s = 3200;
	long l = (long)s;
	System.out.println("s is " + s);
	System.out.println("l is " + l + "\n");
		
	//question 4
	int x = 15;
	int y = 4;
	double result = (int)x/y;
	System.out.println("result is " + result + "\n");
		
	//question 5
	float f = 12.5f;
	double d = (double)f;
	System.out.println("f is " + f);
	System.out.println("d is " + d);
	}
}*/
