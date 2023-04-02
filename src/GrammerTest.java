public class GrammerTest {

    public static void main(String[] args) {

        String str = "abcde";
        char[] arr = str.toCharArray();
        System.out.println(arr);
        for (char x : arr) {
            System.out.println("x : " + x);
        }
    }
}
