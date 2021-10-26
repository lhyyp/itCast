package demo_023_fileAndIo.file;

import java.io.*;
import java.util.HashMap;
import java.util.Set;

public class Day_006_demo {
    public static void main(String[] args) throws IOException {
        HashMap<String, String> map = new HashMap<>();
        BufferedReader br = new BufferedReader(new FileReader("D:\\work\\java_learn\\src\\demo_023_fileAndIo\\file\\1.txt"));
        BufferedWriter bw = new BufferedWriter(new FileWriter("D:\\work\\java_learn\\src\\demo_023_fileAndIo\\file\\2.txt"));
        String line;
        while ((line = br.readLine()) != null) {
            String[] arr = line.split("\\.");
            map.put(arr[0], arr[1]);
        }
        System.out.println(map);
        Set<String> set = map.keySet();
        for (String s : set) {
            System.out.println(s);
            bw.write(s+'.'+map.get(s));
            bw.newLine();
        }
        bw.close();
        br.close();
    }


}
