package demo_023_fileAndIo.file;

import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;

public class Day_004BufferedWrite {
    public static void main(String[] args) {
        try {
            FileWriter fp = new FileWriter("D:\\work\\java_learn\\src\\demo_023_fileAndIo\\file\\a.txt");
            BufferedWriter bw = new BufferedWriter(fp);
            bw.write("lhyyp");
            bw.newLine();
            bw.write("lhyyp");
            bw.close();

        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
