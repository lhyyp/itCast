package demo_023_fileAndIo.file;

import java.io.*;

public class Day_005_bufferedRead {
    public static void main(String[] args) throws IOException {
        FileReader fp = new FileReader("D:\\work\\java_learn\\src\\demo_023_fileAndIo\\file\\a.txt");
        BufferedReader br = new BufferedReader(fp);
        String len = null;
        while ((len = br.readLine())!= null){
            System.out.println(len);
        }
        br.close();
    }
}
