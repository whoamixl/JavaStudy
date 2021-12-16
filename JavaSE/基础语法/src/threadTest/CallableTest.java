package threadTest;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.concurrent.*;

public class CallableTest implements Callable {
    private String url;
    private String name;

    public CallableTest(String url, String name) {
        this.url = url;
        this.name = name;
    }


    public static void main(String[] args) {

        CallableTest callableTest = new CallableTest("https://pics3.baidu.com/feed/d4628535e5dde7115d6e16998777f2129c166146.jpeg?token=8c7bdd18957ac57e94356e63797c0801", "a.jpg");
        CallableTest callableTest1 = new CallableTest("https://pics0.baidu.com/feed/77094b36acaf2edd084f1408a5883de038019332.jpeg?token=c1515ee1bf8f925589cef583268c130e", "b.jpg");
        CallableTest callableTest2 = new CallableTest("https://pics6.baidu.com/feed/0b55b319ebc4b7451f1cc1a6ed64221e8b821512.jpeg?token=97c4d27800919bee08f534be3f0838b8", "c.jpg");

        ExecutorService ser = Executors.newFixedThreadPool(3);

        Future< Boolean > future1 = ser.submit(callableTest);
        Future< Boolean > future2 = ser.submit(callableTest1);
        Future< Boolean > future3 = ser.submit(callableTest2);
        ser.shutdown();
    }


    @Override
    public Object call() {
        Download1 download1 = new Download1();
        download1.downloader(url,name);
        return true;
    }
}

class Download1{
    public void downloader(String url,String name) {
        try {
            FileUtils.copyURLToFile(new URL(url),new File(name));
            System.out.println("你下载了图片"+name);
        } catch (IOException e) {
            System.out.println("下载失败"+e);
            e.printStackTrace();
        }

    }
}
