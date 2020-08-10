public class printThread {
    public static class printThreadmethod implements Runnable{
        private Object pre;
        private Object self;
        private String name;
        public printThreadmethod(Object a,Object b,String c){
            pre = a;
            self = b;
            name = c;

        }
        @Override
        public void run() {
            int count = 10;
            while(count > 0) {
                synchronized (pre) {
                    synchronized (self) {
                        System.out.println(name);
                        self.notifyAll();
                        count--;
                    }
                    if (count != 0) {
                        try {
                            pre.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    } else {
                        pre.notifyAll();
                    }
                }
            }
        }
    }
    public static void main(String[] args) throws InterruptedException {
        Object a = new Object();
        Object b = new Object();
        Object c = new Object();
        printThreadmethod pA = new printThreadmethod(c,a,"A");
        printThreadmethod pB = new printThreadmethod(a,b,"B");
        printThreadmethod pC = new printThreadmethod(b,c,"C");
        new Thread(pA).start();
        Thread.sleep(10);
        new Thread(pB).start();
        Thread.sleep(10);
        new Thread(pC).start();
    }

}
