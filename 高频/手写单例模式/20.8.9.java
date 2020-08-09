import com.sun.scenario.effect.Merge;
import sun.applet.AppletResourceLoader;

import javax.annotation.processing.SupportedSourceVersion;
import javax.management.remote.rmi._RMIConnection_Stub;
import java.util.*;

/**
 * @author Leo
 */
public class SingleTon{
    private volatile static SingleTon uniqueSingleTon;
    private SingleTon(){

    }
    public SingleTon getInstance(){
        if(uniqueSingleTon == null){
            synchronized (SingleTon.class){
                if(null == uniqueSingleTon){
                    uniqueSingleTon = new SingleTon();
                }
            }
        }
        return uniqueSingleTon;
    }

}



