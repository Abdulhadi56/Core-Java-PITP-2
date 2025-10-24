/*
//CORE JAVA TASKS --- PITP 2 --- POLYMORPHISM Example code



class Animal{
   
 public void sound(){
       
 System.out.println("Animal making a sound..");
    }    
}

class dog extends Animal{
    public void sound(){
        System.out.println("Dog making a sound..");
    } 
}

class cat extends Animal{
    public void sound(){
        System.out.println("Cat making a sound");
    }    
}

public class Main{
    
	public static void main(String[] args) {
	    //Animal Class 
	    /*Animal obj = new Animal();
	    obj.sound();
	    
	    //Dog class
		dog obj1 = new dog();
		obj1.sound();

        //cat class		
		cat obj2 = new cat();
		obj2.sound();*/
		
		//referencing with distinct objects
		/*Animal obj = new Animal();
		Animal catObj = new dog();
		Animal dogObj = new cat();
		
		obj.sound();
		catObj.sound();
		dogObj.sound();*/
		
		//giving reference to other classes from parent class with same object
		/*Animal a = new Animal();
		a = new cat();
		a = new dog();
		
		a.sound();
		
		
	}
}
*/