package test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    static int[] days = {17, 18};
    static String[] participants = {"A", "B", "C", "D", "E"};



    public static void main(String[] args) {

        for (int i=0; i<days.length; i++) {
            System.out.println(days[i] + "일 " + Arrays.toString(participants));
            System.out.println();
            for (int j=0; j<6; j++) {
                System.out.println();
            }
        }
    }
}
