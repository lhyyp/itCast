package demo_023_fileAndIo.file;

import java.io.File;
import java.io.FileFilter;
import java.io.FilenameFilter;
import java.util.Locale;

public class Day_002 {
    public static void main(String[] args) {
        File f3 = new File("D:\\work\\java_learn\\src\\demo_023_fileAndIo");
//        String[] list = f3.list();
//        for (String s : list) {
//            System.out.println(s);
//        }
//        File[] files = f3.listFiles();
//        for (File file : files) {
//            System.out.println(file);
//        }
        System.out.println("-----555555555---------");
        getAllFile(f3);
        System.out.println("---------wwwwwwwwwwwwww-----");
        getAllFiles(f3);
    }

    private static void getAllFile(File dir) {
        File[] files = dir.listFiles((File pathname) ->  pathname.isDirectory() || pathname.getName().toLowerCase().endsWith(".java"));
        for (File file : files) {
            if (file.isDirectory()) {
                getAllFile(file);
            }else {
                System.out.println(file);
            }
        }
    }
    private static void getAllFiles(File dir) {
        File[] f1 = dir.listFiles((File d, String name) ->  new File(d, name).isDirectory() || name.toLowerCase().endsWith(".txt"));
        for (File file : f1) {
            if (file.isDirectory()) {
                getAllFile(file);
            }else {
                System.out.println(file);
            }
        }
    }

}
