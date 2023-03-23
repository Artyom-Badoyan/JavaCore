package chepter15.multithreading.threadAnonymus;

public class MyThreads {
    public static void main(String[] args) {
        for (int i = 0; i <= 10; i++) {
            System.out.println("MyThreads: " + i);
        }
        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i <= 10; i++) {
                    System.out.println("MyThreadAnonymous: " + i);
                    Thread.currentThread().setName("MyThreadAnonymous: " + i);
                }
            }
        }).start();
        new Thread(() -> {
            for (int i = 10; i >= 0; i--) {
                System.out.println("MyThreadLambda: " + i);
                Thread.currentThread().setName("MyThreadLambda");
            }
        }).start();
    }
}
