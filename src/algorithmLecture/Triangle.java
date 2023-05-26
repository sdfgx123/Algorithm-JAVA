package algorithmLecture;

import java.util.ArrayList;
import java.util.List;

public class Triangle {
    public static List<Integer> pascalTriangle(int n) {
        List<Integer> row = new ArrayList<>();
        if (n == 1) {
            row.add(1);
            return row;
        } else {
            row.add(1);
            List<Integer> previousRow = row;
            for (int i = 0; i < previousRow.size() - 1; i++) {
                row.add(previousRow.get(i - 1) + previousRow.get(i));
            }
            row.add(1);
        }
        return row;
    }

    public static void main(String[] args) {
        System.out.println(pascalTriangle(8));
    }

}

