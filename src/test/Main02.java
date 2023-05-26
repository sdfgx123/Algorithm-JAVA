package test;

import java.util.Arrays;
import java.util.List;

public class Main02 {

    static class Schedule {
        String time;
        List<String> participants;

        public Schedule(String time, List<String> participants) {
            this.time = time;
            this.participants = participants;
        }
    }

    static int[] days = {17, 18};
    static List<Schedule> schedules = Arrays.asList(
            new Schedule("7:00", Arrays.asList("A", "B", "C")),
            new Schedule("7:20", Arrays.asList("A", "B", "C")),
            new Schedule("7:40", Arrays.asList("A", "B", "C")),
            new Schedule("8:00", Arrays.asList("10분 휴식")),
            new Schedule("8:10", Arrays.asList("A", "B", "C")),
            new Schedule("8:30", Arrays.asList("A", "B", "C")));

    public static void main(String[] args) {
        for (int i=0; i< days.length; i++) {

        }
    }

}
