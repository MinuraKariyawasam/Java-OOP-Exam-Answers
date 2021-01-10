
class Example{
    
    // private int count = 0; // instance var
    private static int count; // static var 

    public Example(){
        count++;
        
    }

    public int getCount(){
        return count;
    }

    public static void sayHi(){
        System.out.println("Hi");
    }



}


public class StaticDemo{

    static{System.out.println("static block is invoked");}  

    public static void main(String args[]){

    Example ex1 = new Example();
    
    Example ex2 = new Example();

    Example ex3 = new Example();

    Example ex4 = new Example();

    System.out.println("count " + ex1.getCount());

    // System.out.println("count " + ex2.getCount());
    
    // static method
    Example.sayHi();

    }
}
