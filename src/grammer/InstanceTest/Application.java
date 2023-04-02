package grammer.InstanceTest;

public class Application {

    public static void main(String[] args) {
        Student student_01 = new Student("Song", 5000);
        Bus bus_100 = new Bus(100);
        student_01.takeBus(bus_100);
        student_01.student_info();
        bus_100.show_busInfo();
    }
}
