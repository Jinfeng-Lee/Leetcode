    import com.sun.scenario.effect.Merge;
    import sun.applet.AppletResourceLoader;

    import javax.annotation.processing.SupportedSourceVersion;
    import javax.management.remote.rmi._RMIConnection_Stub;
    import java.util.*;

    /**
     * @author Leo
     */

        class Solution {
            public static int Random5() {
                int index = 0;
                do{
                    int row = (int)(Math.random() * 3) + 1;
                    int column = (int)(Math.random() * 3) + 1;
                    index = (row-1) * 3 + column;
                }while(index > 5);
                return 1 + (index - 1) % 5;
            }
            public static void main(String[] args) throws InterruptedException {
//                Scanner in = new Scanner(System.in);
//                while(in.hasNext()){
//                    System.out.println(makeGood(in.next()));
//                }
                int index = 0;
                int[] cur = new int[5];
                while(index < 1000000){
                    switch(Random5()){
                        case 1:
                            cur[0]++;
                            break;
                        case 2:
                            cur[1]++;
                            break;
                        case 3:
                            cur[2]++;
                            break;
                        case 4:
                            cur[3]++;
                            break;
                        case 5:
                            cur[4]++;
                            break;
                    }
                    index++;
                }
                for(int i = 0;i<cur.length;i++){
                    System.out.println(i+1 +"的概率是: "+ (double)cur[i]/1000000);
                }



        }
        }


