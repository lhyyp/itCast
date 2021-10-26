package demo_001;

public class Phone {
    String brand ;
    double price;
    String color;
    private String a;
    public  Phone() {
        System.out.println("pk");
    }
    public void call(String who) {
        System.out.println(who);
    }
    public void sendMessage(){
        System.out.println("群发短信");
    }
}
