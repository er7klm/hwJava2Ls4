import static java.lang.Thread.sleep;

public class MyThread implements Runnable {
    @Override
    public void run() {
        System.out.println("Начало эстафеты!");
        for (int i = 1; i <= 5; i++) {
            System.out.println(Thread.currentThread().getName() + " " + i + " берет палочку.");
            if (i == 5) {
                System.out.println(Thread.currentThread().getName() + " " + i + " бежит к финишу.");
                break;
            }
            System.out.println(Thread.currentThread().getName() + " " + i + " бежит к "
                    + Thread.currentThread().getName() + " " + (i + 1) + ".");

            try {
                sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }

        for (int i = 5; i > 0; --i) {
            if (i == 1) {
                break;
            }
            System.out.println(Thread.currentThread().getName() + " " + i + " бежит к "
                    + Thread.currentThread().getName() + " " + (i - 1) + ".");
            System.out.println(Thread.currentThread().getName() + " " + (i - 1) + " берет палочку.");
            try {
                sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
        System.out.println("Конец эстафеты!");
    }
}
