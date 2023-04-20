public class Main {
    public static void main(String[] args) {
        Thread threadOne =  new Thread(new Thread1());
        Thread threadTwo =  new Thread(new Thread2());
        ThreadPoolSingleton instance = ThreadPoolSingleton.getInstance();
        instance.execute(threadOne);
        instance.execute(threadTwo);
    }

    static class Thread1 implements Runnable {
        @Override
        public void run() {
            System.out.println("This is Thread1");
        }
    }
    static class Thread2 implements Runnable {
        @Override
        public void run() {
            System.out.println("This is Thread2");

        }
    }
}