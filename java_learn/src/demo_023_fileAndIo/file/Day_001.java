package demo_023_fileAndIo.file;

import java.io.File;
import java.io.IOException;

public class Day_001 {
    public static void main(String[] args) throws IOException {
        // 路径分隔符 windows ;, linux :
        String p1 = File.pathSeparator;
        System.out.println(p1);
        // 文件名分隔符 windows \, linux /
        String p2 = File.separator;
        System.out.println(p2);

        File file = new File("D:\\work\\java_learn\\src\\demo_023_fileAndIo\\file\\helloword.txt");
        System.out.println(file);
        System.out.println(file.getAbsoluteFile());
        System.out.println(file.toString());
        System.out.println(file.getPath());
        System.out.println(file.getName());
        System.out.println(file.length());
        //判断文件是否真实存在
        System.out.println(file.exists());
//        是否是文件
        System.out.println(file.isFile());
//        是否是文件
        System.out.println(file.isDirectory());
        System.out.println("-----------------------------");
        File f1 = new File("b.txt");
        System.out.println(f1.getAbsoluteFile());
        System.out.println(f1.toString());
        System.out.println(f1.getPath());
        System.out.println(f1.getName());
        //判断文件是否真实存在
        System.out.println(f1.exists());
        boolean newFile1 = f1.createNewFile();
        File f2 = new File("D:\\work\\java_learn\\src\\demo_023_fileAndIo\\file\\a.txt");
        boolean newFile = false;
        try {
            newFile = f2.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(newFile);

        File f3 = new File("D:\\work\\java_learn\\src\\demo_023_fileAndIo\\fileDemo\\11\\222");
        boolean mkdir = f3.mkdir();
        System.out.println(mkdir);
        boolean mkdirs = f3.mkdirs();
        System.out.println(mkdirs);
        boolean delete = f3.delete();

    }
}
