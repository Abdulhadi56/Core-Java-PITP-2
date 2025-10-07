import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		System.out.println("Result System");
		Scanner obj = new Scanner(System.in);
		System.out.print("Enter your Maths marks: ");
		double maths = obj.nextInt();
		System.out.print("Enter your English marks: ");
		double english = obj.nextInt();
		System.out.print("Enter your Science marks: ");
		double science = obj.nextInt();
		System.out.print("Enter your Urdu marks: ");
		double urdu = obj.nextInt();
		System.out.print("Enter your History marks: ");
		double history = obj.nextInt();
		
		double totalMarks = 500.0;
		double obtMarks = maths + english + science + urdu + history;
		double percentage = (obtMarks / totalMarks) * 100;
		
		if(percentage >= 80 && percentage <= 100){
		    System.out.println("Grade: A1");
		}else if(percentage >= 70 && percentage <= 79){
		    System.out.println("Grade: A");
		}else if(percentage >= 60 && percentage <= 69){
		    System.out.println("Grade: B");
		}else if(percentage >= 50 && percentage <= 59){
		    System.out.println("Grade: C");
		}else if(percentage >= 40 && percentage <= 49){
		    System.out.println("Grade: D");
		}else if(percentage >= 0 && percentage <= 39){
		    System.out.println("Grade: F");
		}else{
		    System.out.println("Insufficient Percentage");
		}
		
		//System.out.println("\n");
		System.out.println("Obtained Marks: " + obtMarks + "/500");
		System.out.println("Percentage: " + percentage);
		
	}
}