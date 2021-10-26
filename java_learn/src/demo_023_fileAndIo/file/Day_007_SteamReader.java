package demo_023_fileAndIo.file;

import java.io.*;

public class Day_007_SteamReader {
    public static void main(String[] args) throws IOException {
        InputStreamReader isr = new InputStreamReader(new FileInputStream("D:\\work\\java_learn\\src\\demo_023_fileAndIo\\file\\GBK.txt"), "GBK");
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("D:\\work\\java_learn\\src\\demo_023_fileAndIo\\file\\utf.txt"));
        byte[] bytes = new byte[1024];
        int line = 0;
        while ((line = isr.read()) != -1){
            System.out.println((char) line);
            osw.write(line);
        }
        osw.close();
        isr.close();
    }

}
