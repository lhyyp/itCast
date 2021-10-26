package demo_008_abstract.redPage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Boss extends User{
    public Boss(String name, int num) {
        super(num, name);
    }

    public ArrayList<Integer> send(int total, int count) {
        System.out.println("发红包");
        ArrayList<Integer> redList = new ArrayList<>();
        int leftMoney = super.getNum();
        if(leftMoney < total){
            System.out.println("余额不足");
            return redList;
        }
        super.setNum(leftMoney - total);
        int sent = 0;
        for (int i = 0; i < 9; i++) {
            int num = new Random().nextInt(total - 10 + i - sent ) + 1;
            redList.add(num);
            sent += num;
        }
        redList.add(total- sent);
        System.out.println(redList);


        return redList;

    }
}
