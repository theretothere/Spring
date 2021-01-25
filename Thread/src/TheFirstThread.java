public class TheFirstThread {
    public static void main(String[] args) {
        Thread thread = new Thread();
        thread.start();//让新建的子线程的状态编程就绪态
    }
}
