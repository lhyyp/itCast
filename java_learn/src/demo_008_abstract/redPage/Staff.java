package demo_008_abstract.redPage;

import java.util.ArrayList;
import java.util.Random;

public class Staff extends User{
    public Staff(int num, String name) {
        super(num, name);
    }
    public void grab(int num) {
        super.setNum(super.getNum() + num);
    }
}
