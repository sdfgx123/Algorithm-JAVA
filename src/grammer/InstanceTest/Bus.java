package grammer.InstanceTest;

public class Bus {

    int number;
    int passengerCnt;
    int money;

    public Bus(int number) {
        this.number = number;
    }

    public void take(int money) {
        money += money;
        passengerCnt++;
    }

    public void show_busInfo() {
        System.out.println("bus number : " + number + ", passengerCnt : " + passengerCnt);
    }
}
