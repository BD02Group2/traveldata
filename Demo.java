import org.apache.zookeeper.KeeperException;
import org.apache.zookeeper.ZooKeeper;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Demo {
    public static void main(String[] args) {
        String port = "192.168.56.104:2181";
        String path = "/";

        List<String> childNodes = new ArrayList<String>();

        try {
            ZooKeeper zk = new ZooKeeper(port,2000,null);

            if(zk!=null){
                childNodes = zk.getChildren(path,false);
                System.out.println("Znodes:");

                for(String c : childNodes){
                    System.out.println(c+" ");
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (KeeperException e) {
            e.printStackTrace();
        }
    }
}
