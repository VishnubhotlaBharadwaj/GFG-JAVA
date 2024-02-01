public class Main{
    public static void main(String args[]) {
        Thread t1 = new Thread1();
        t1.start();

        for(int i =1; i<=5; i++) {
            System.out.println(Thread.currentThread().getName() + ", i = " + i);
        }
    }
}