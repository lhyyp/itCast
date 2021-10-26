package demo_024_tcp;

import java.io.*;
import java.net.Socket;

public class ClientTcp {
    public static void main(String[] args) throws IOException {
        FileInputStream fp = new FileInputStream("D:\\work\\java_learn\\src\\demo_024_tcp\\1.png");
        Socket socket = new Socket("127.0.0.1", 8888);
        OutputStream os = socket.getOutputStream();
        int len = 0;
        byte[] bytes = new byte[1024];
        while ((len = fp.read(bytes))!=-1){
            os.write(bytes,0 ,len);
        }
        os.flush();
        socket.shutdownOutput();
        System.out.println(444);
        InputStream is = socket.getInputStream();
        while ((len = is.read(bytes))!=-1){
            System.out.println(new String(bytes,0 ,len));
        }
        System.out.println(55);
        is.close();
        socket.close();
    }
}
