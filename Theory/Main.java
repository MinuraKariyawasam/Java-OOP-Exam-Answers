class DemoOutput{
    
     public void sayHi(String msg){
         
        System.out.println("Start " + msg);
        // try{
        //   Thread.sleep(1000);
        // }
        // catch(InterruptedException e){
        //   e.printStackTrace();
        // }

        System.out.println("End " + msg);

    }

}


class accessClass extends Thread{
    
    private String name;
    private DemoOutput demoClass;

    accessClass(DemoOutput demoClass, String name){
        this.name = name;
        this.demoClass = demoClass;
        start();
    }

    public void run(){
        synchronized(demoClass){
            demoClass.sayHi(name);
        }
    }
}

public class Main{
    public static void main(String args[]){
        // using main thread
        DemoOutput demo = new DemoOutput();
        demo.sayHi("Minura");

        // using access class thread
        accessClass access1 = new accessClass(demo, "Banaka1");
        accessClass access2 = new accessClass(demo, "Adeepa0");
        accessClass access3 = new accessClass(demo, "Adeepa1");
        accessClass access4 = new accessClass(demo, "Adeepa2");
        accessClass access5 = new accessClass(demo, "Adeepa3");
        accessClass access6 = new accessClass(demo, "Adeepa4");

        //access1.start();
    }
}