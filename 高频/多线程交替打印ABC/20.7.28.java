    import com.sun.scenario.effect.Merge;
    import sun.applet.AppletResourceLoader;

    import javax.management.remote.rmi._RMIConnection_Stub;
    import java.util.*;

    /**
     * @author Leo
     */
    public class Solution {
        public static class printThread implements Runnable{
            Object pre;
            Object self;
            String name;
            printThread(Object pre,Object self,String name){
                this.pre = pre;
                this.self =self;
                this.name = name;
            }
            @Override
            public void run() {
                int count = 10;
                while(count > 0){
                    synchronized (pre){
                        synchronized (self){
                            System.out.print(name);
                            self.notifyAll();
                            count--;
                        }

                            try {
                                if(count!=0){
                                    pre.wait();
                                }else {
                                    pre.notifyAll();
                                }

                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                        }
                    }
                }
        }
        public static void main(String[] args) throws InterruptedException {
            Object a = new Object();
            Object b = new Object();
            Object c = new Object();
            printThread pa = new printThread(c,a,"A");
            printThread pb = new printThread(a,b,"B");
            printThread pc = new printThread(b,c,"C");
            new Thread(pa).start();
            Thread.sleep(10);
            new Thread(pb).start();
            Thread.sleep(10);
            new Thread(pc).start();
            Thread.sleep(10);



        }

    }
