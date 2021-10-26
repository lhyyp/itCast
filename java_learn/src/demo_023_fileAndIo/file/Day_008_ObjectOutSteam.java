package demo_023_fileAndIo.file;

import java.io.*;

public class Day_008_ObjectOutSteam {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Person lhyyp = new Person("lhyyp", 20);
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("D:\\work\\java_learn\\src\\demo_023_fileAndIo\\file\\person.txt"));
        oos.writeObject(lhyyp);
        oos.close();
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("D:\\work\\java_learn\\src\\demo_023_fileAndIo\\file\\person.txt"));
        Person len = (Person) ois.readObject() ;
        System.out.println(len.getName()+":"+len.getAge());
        ois.close();
    }
}
