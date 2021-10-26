package demo_023_fileAndIo.file;

import java.io.*;

public class Day_003_bufferedInputStream {
    public static void main(String[] args) {
        try {
            long S = System.currentTimeMillis();
            FileInputStream fp = new FileInputStream("D:\\work\\java_learn\\src\\demo_023_fileAndIo\\file\\a.txt");
            BufferedInputStream bf = new BufferedInputStream(fp);
            byte[] bytes = new byte[1024];
            int len = 0 ;
            while ((len = bf.read(bytes)) != -1){
                System.out.println(new String(bytes, 0, len));
            }
            bf.close();
            System.out.println(System.currentTimeMillis()-S);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
