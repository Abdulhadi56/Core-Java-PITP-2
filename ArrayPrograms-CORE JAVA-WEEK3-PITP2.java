//Core Java (PITP-2) --- Arrays Program


class EvenArraySum {
    
	public static void main(String[] args) {
        
	int[] evenNums = new int[25];
        
	int sum = 0;
        
	int index = 0;

        

	for (int i = 2; i <= 50; i += 2) {
            
		evenNums[index++] = i;
            
		sum += i;
        
	}

 
       
	System.out.print("Even numbers from 2 to 50: ");
        
	for (int num : evenNums) {
            
		System.out.print(num + " ");
        
	}

        
	System.out.println("\nSum = " + sum);
    
	}

}



//Core Java (PITP-2) --- Arrays Program
class FindEvens {
    public static void main(String[] args) {
        int[] numbers = new int[100];

        for (int i = 0; i < 100; i++) {
            numbers[i] = i + 1;
        }

        System.out.println("Even numbers from 1 to 100:");
        for (int num : numbers) {
            if (num % 2 == 0) {
                System.out.print(num + " ");
            }
        }
    }
}



//Core Java (PITP-2) --- Arrays Program
class DivisibleByThree {
    public static void main(String[] args) {
        int[] numbers = new int[100];

        for (int i = 0; i < 100; i++) {
            numbers[i] = i + 1;
        }

        System.out.println("Numbers divisible by 3 from 1 to 100:");
        for (int num : numbers) {
            if (num % 3 == 0) {
                System.out.print(num + " ");
            }
        }
    }
}




//Core Java (PITP-2) --- Arrays Program
class StudentList {
    public static void main(String[] args) {
        String[] students = new String[10];

        students[0] = "Alice";
        students[1] = "Bob";
        students[2] = "Charlie";
        students[3] = "Diana";
        students[4] = "Edward";
        students[5] = "Fiona";
        students[6] = "George";
        students[7] = "Hannah";
        students[8] = "Ian";
        students[9] = "Julia";

        System.out.println("List of 10 students:");
        for (int i = 0; i < students.length; i++) {
            System.out.println((i + 1) + ". " + students[i]);
        }
    }
}