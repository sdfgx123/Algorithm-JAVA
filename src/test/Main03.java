package test;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Main03 {

    public static void main(String[] args) {
        Map<PhoneNumber, String> map = new HashMap<>();

        map.put(new PhoneNumber(001), "Song");
        System.out.println(map.get(new PhoneNumber(001)).hashCode());

    }
}

class PhoneNumber {

    int number;

    public PhoneNumber(int number) {
        this.number = number;
    }

//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        PhoneNumber that = (PhoneNumber) o;
//        return number == that.number;
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(number);
//    }
}
