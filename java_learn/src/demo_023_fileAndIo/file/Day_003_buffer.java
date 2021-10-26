package demo_023_fileAndIo.file;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Day_003_buffer {
    public static void main(String[] args) {
        try {
            FileOutputStream fp = new FileOutputStream("D:\\work\\java_learn\\src\\demo_023_fileAndIo\\file\\a.txt");
            BufferedOutputStream bf = new BufferedOutputStream(fp);
            bf.write("hello word".getBytes());
            bf.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
