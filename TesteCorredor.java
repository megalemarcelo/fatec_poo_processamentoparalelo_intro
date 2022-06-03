public class TesteCorredor {
    public static void main(String[] args) {
        Thread t = Thread.currentThread();
        Thread thread1 = new Thread(new Corredor(t), "Corredor A");
        Thread thread2 = new Thread(new Corredor(t), "Corredor B");
        Thread thread3 = new Thread(new Corredor(t), "Corredor C");
        Thread thread4 = new Thread(new Corredor(t), "Corredor D");
        Thread thread5 = new Thread(new Corredor(t), "Corredor E");

        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
        thread5.start();

        System.out.println("Começou!");

        

        System.out.println("Acabou...");        
    }
}
