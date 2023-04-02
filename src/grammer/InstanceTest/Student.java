package grammer.InstanceTest;

public class Student {

    String name;
    int money;

    public Student() {

    }

    public Student(String name, int money) {
        this.name = name;
        this.money = money;
    }

    public void takeBus(Bus bus) {
        bus.take(1000);
        this.money -= 1000;
    }

    public void student_info() {
        System.out.println("name : " + name + ", money : " + money);
    }
}
