public class Main {

    public static void main(String[] args) {

        MyThread myth = new MyThread();
        Thread thread = new Thread(myth);

        thread.setName("Runner");
        thread.start();
    }
}