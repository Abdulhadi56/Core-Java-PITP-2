//String Methods --- CORE JAVA --- PITP 2 --- Wednesday/08-10-2025

public class Main{
    
	public static void main(String[] args){
        
		String name = "Abdul Hadi";
        
		String firstName = "Riaz";
        
		String lastName = "Ahmed";
        
        
		//String Methods
        
		System.out.println("1. The variable's name length is " + name.length());
        
		System.out.println("2. The variable's name Character at index 2 is " + name.charAt(2));
        
		System.out.println("3. The variable's name in uppercase " + name.toUpperCase());
        
		System.out.println("4. The variable's name when concats with Khawaja " + name.concat(" Khawaja"));
        
		System.out.println("5. The variable's name equals to abdul hadi? " + "Abdul Hadi".equals("abdul hadi"));
        
		System.out.println("6. The variable's name ignore when equals to ABDUL HADI " + name.equalsIgnoreCase("ABDUL HADI"));
        
		System.out.println("7. The variable firstName comapre to lastName " + firstName.compareTo(lastName));
       
		System.out.println("8. The variable's firstName contains bd? " + firstName.contains("bd"));
        
		System.out.println("9. The variable's firstName startsWith Ri? " + firstName.startsWith("Ri"));
        
		System.out.println("10. The variable firstName endsWith az? " + firstName.endsWith("az"));
        
		System.out.println("11. The variable's firstName has index of letter 'a' " + firstName.indexOf("a"));
        
		System.out.println("12. The variable's firstName with substring " + firstName.substring(1, 3));
        
		System.out.println("13. The variable's firstName --> replace 'i' with 'a' ---> " + firstName.replace('i', 'a'));
        
		System.out.println("14. The variable's firstName split into " + firstName.split(","));
        
		System.out.println("15. The variable's firstName is empty? " + firstName.isEmpty());
        
		System.out.println("16. The variable's firstName converted into array " + "Abdul Hadi".toCharArray());
    

	}


}