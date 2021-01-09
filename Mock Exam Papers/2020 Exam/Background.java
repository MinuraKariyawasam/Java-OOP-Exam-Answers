public class Background extends Thread {
    
    public static void main(String argv[]) {
    
        Background b = new Background();
        b.run();

    }
    public void start() {
        
        for (int i = 0; i < 10; i++) {
            System.out.println("Value of i = " + i);
        }
    }
}