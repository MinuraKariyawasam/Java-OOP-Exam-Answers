class Thread1 extends Thread {
    public void run() {
    while (true) {
    System.out.println("Hey I am thread: " + getName());
    try {
    Thread.sleep(1000); // sleep 1 sec
    }
    catch (InterruptedException ex) {
    System.out.println("Thread 1 was interrupted");
    }
    }
    }
    }
    class Thread2 extends Thread {
    public void run() {
    while (true) {
    System.out.println("Hey I am thread: " + getName());
    try {
    Thread.sleep(1000); // sleep 1 sec
    }
    catch (InterruptedException ex) {
    System.out.println("Thread 2 was interrupted");
    }
    }
    }
    }
    class ProblematicThreads {
    public static void main(String[] args) {
    Thread1 t1 = new Thread1();
    Thread2 t2 = new Thread2();
    t1.run();
    t2.run();
    }
    }