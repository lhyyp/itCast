package demo_031_JavaWeb.demo_001_xml.Jsoup;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import java.io.File;
import java.io.IOException;

public class Day_001 {
    public static void main(String[] args) throws IOException {
        //获取 Document 对象
        ClassLoader cl = Day_001.class.getClassLoader();
        // 获取 student.xml path
        String path = cl.getResource("demo_031_JavaWeb/demo_001_xml/dtd/student.xml").getPath();
        // 解析xml 文档，加载进内存， 获取Dom 树 -> Document
        Document parse = Jsoup.parse(new File(path), "UTF-8");
        // 获取元素
        Elements name = parse.getElementsByTag("student");
        System.out.println(name.size());
        Elements name1 = parse.getElementsByTag("name");
        // 获取第一个 name 的 Element 对象
        System.out.println(name1.get(0).text());
        Elements select = name.select("#com");
        System.out.println(select.text());

        System.out.println("------------------");
    }
}
