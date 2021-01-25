public class ZhiXing {
    static class MyThread extends Thread{
        @Override
        public void run() {
            while(true){
                System.out.println("我是子线程");
            }
        }
    }

    public static void main(String[] args) {
        Thread thread = new Thread();
        thread.start();
        while(true){
            System.out.println("我是父线程");
        }
    }
}
