package threadTest;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.net.URL;

public class MyThread extends Thread{
    private String url;
    private String name;

    public MyThread(String url, String name) {
        this.url = url;
        this.name = name;
    }

    @Override
    public void run() {
        Download download = new Download();
        download.downloader(url,name);
    }

    public static void main(String[] args) {
        new MyThread("https://pics3.baidu.com/feed/d4628535e5dde7115d6e16998777f2129c166146.jpeg?token=8c7bdd18957ac57e94356e63797c0801","a.jpg").start();
        new MyThread("https://pics0.baidu.com/feed/77094b36acaf2edd084f1408a5883de038019332.jpeg?token=c1515ee1bf8f925589cef583268c130e","b.jpg").start();
        new MyThread("https://pics6.baidu.com/feed/0b55b319ebc4b7451f1cc1a6ed64221e8b821512.jpeg?token=97c4d27800919bee08f534be3f0838b8","c.jpg").start();
    }


}

class Download{
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
