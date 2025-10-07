/*//Test-PITP --- Muhammad Abdul Hadi --- First 5 Questions --- 30/09/2025 --- Tuesday


import java.util.Scanner;
class Main {
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);
        
        //Example 1
        System.out.print("Enter Your firstName: ");
        String fName = obj.nextLine();
        System.out.print("Enter Your age: ");
        int age = obj.nextInt();
        System.out.print("Enter Your secret code: ");
        String secretCode = obj.next();
        //obj.nextLine();
        System.out.println("[" + fName + "]_[" + age + "]_[" + secretCode + "]");
        System.out.println("\n");
        
        //Example 2
        System.out.print("Enter Your secret Code 1: ");
        String secretCode1 = obj.next();
        System.out.print("Enter day: ");
        int day = obj.nextInt();
        obj.nextLine();
        System.out.print("Enter Your secret code 2: ");
        String secretCode2 = obj.next();
        System.out.println("[" + secretCode1 + "]_||_[" + day + "]_||_[" + secretCode2 + "]");
        System.out.println("\n");
        
        //Example 3
        System.out.print("Enter Your secret Code 3: ");
        String secret3 = obj.next();
        System.out.print("Enter day: ");
        int day2 = obj.nextInt();
        System.out.print("Enter Your secret code 4: ");
        String secret4 = obj.next();
        System.out.print("Enter age: ");
        int age1 = obj.nextInt();
        obj.nextLine();
        System.out.println("[" + secret3 + "]_|[" + day2 + "]");
        System.out.println("[" + secret4 + "]|_[" + age1 + "]_|[" + day2 + "]");
        System.out.println("[" + secret3 + "]|_[" + secret4 + "]");
        System.out.println("\n");
        
        //Example 4
        System.out.print("Enter Your secret Code 5: ");
        String secret5 = obj.next();
        System.out.print("Enter Your secret Code 6: ");
        String secret6 = obj.next();
        System.out.println("[[" + secret5 + "|_|_|" + secret6 + "]]/");
        System.out.println("\n");
        
        //Example 5
        System.out.print("Enter your secret Code 7: ");
        String secret7 = obj.next();
        System.out.print("Enter your secret code 8: ");
        String secret8 = obj.next();
        System.out.print("Enter Your secret code 9: ");
        String secret9 = obj.next();
        obj.nextLine();
        System.out.println("[" + secret5 + "?|[" + secret6 + "?[" + secret7 + "]]");
    }
}*/




//Test-PITP --- Muhammad Abdul Hadi --- Last 10 Questions --- 30/09/2025 --- Tuesday

import java.util.Scanner;
class Main {
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);
        
        //Example 1
        System.out.print("Enter s1: ");
        String s1 = obj.next();
        System.out.print("Enter s2: ");
        String s2 = obj.next();
        System.out.print("Enter s3: ");
        String s3 = obj.next();
        System.out.println("[" + s1 + "|" + s2 + ")|" + s3 + "]");
        System.out.println("\n");
        
        //Example 2
        System.out.println("[(" + s1 + "," + s2 + "|" + s2 + "/" + s1 + ")" + "||" + s3 + "||]");
        System.out.println("\n");
        
        //Example 3
        System.out.println("Enter s4: ");
        String s4 = obj.next();
        System.out.println("[" + s1 + "]/\\[" + s2 + "]/\\[" + s3 + "]/\\[" + s4 + "]");
        System.out.println("\n");
        
        //Example 4
        System.out.println("|" + s1 + "|-->" + s2 + "<--|" + s3 + "|-->" + s4);
        System.out.println("\n");
        
        //Example 5 
        System.out.println("|" + s1 + "|/-\\|->" + s2 + "<-|/-\\|" + s3 + "|/-\\|->" + s4);
        System.out.println("\n");
        
        //Example 6
        System.out.println("Enter s5: ");
        String s5 = obj.next();
        System.out.println(s1 + "|?|" + s5 + "-~>" + s3 + "$#>_[" + s2 + "|" + s4 + "]]");
        System.out.println("\n");
        
        //Example 7
        System.out.println(s1 + s2 + s3 + s4 + s5 + s2 + s3 + s1 + s4 + s1 + s2 + s4 + s5);
        System.out.println("\n");
        //Example 8 
        System.out.println("[" + s1 + "/|\\(|" + s2 + "|(|" + s3 + "|)/|\\" + s4 + "|)||" + s5 + "]");
        System.out.println("\n");
        //Example 9 
        System.out.println("(|" + s1 + "-><-" + s2 + "|]<>><<>[[[" + s3 + "]]]");
        System.out.println("\n");
        //Example 10
        System.out.println("(((" + s1 + s3 + "||/-?||" + s2 + "," + s1 + "||?-\\/||" + s3 + s2 + "]]]");
        System.out.println("\n");
    }        
}    