package grammer;

public class Test {

    public static void main(String[] args) {

        String a = "test";
        String b = "test";

        System.out.println("a hash code : " + System.identityHashCode(a)); // a hash code : 796684896
        System.out.println("b hash code : " + System.identityHashCode(b)); // b hash code : 796684896

        String c = "test";
        String d = new String("test");
        String e = new String("test");
        System.out.println("c hash code : " + System.identityHashCode(c)); // a hash code : 796684896
        System.out.println("d hash code : " + System.identityHashCode(d)); // a hash code : 1449621165
        System.out.println("e hash code : " + System.identityHashCode(e)); // a hash code : 1627960023

    }
}
