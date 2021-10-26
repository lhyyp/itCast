package demo_024_tcp;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.charset.StandardCharsets;
import java.util.Random;

public class ServiceTcp {
    public static void main(String[] args) throws IOException {
        ServerSocket ss = new ServerSocket(8888);
        while (true) {
            Socket service = ss.accept();
            new Thread(() -> {
                InputStream is = null;
                try {
                    is = service.getInputStream();
                    String pathName = System.currentTimeMillis()+new Random(999999).nextInt()+".png";
                    File file = new File("D:\\work\\java_learn\\src\\demo_024_tcp\\upload\\"+pathName);
                    System.out.println(file);
                    FileOutputStream fos = new FileOutputStream(file);
                    int len = 0;
                    byte[] bytes = new byte[1024];
                    while ((len = is.read(bytes)) != -1) {
                        fos.write(bytes, 0, len);
                    }
                    fos.flush();
                    System.out.println(22222);
                    service.getOutputStream().write("上传成功".getBytes());
                    fos.close();
                    service.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }).start();
        }


    }
}
