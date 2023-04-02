package grammer;

public class Main {

    public static void main(String[] args) {

        LambdaInterface li1 = (String s1, String s2) -> {
            System.out.println(s1 + " " + s2);
        };
        li1.method("Hello", "World");

        // 파라미터 1개, 데이터 타입이 같을 때
        LambdaInterface2 li2 = (s1) -> {System.out.println(s1); };
        li2.method("test");

        // 실행문이 1개일 때 {} 생략 가능
        LambdaInterface2 li3 = (s1) -> System.out.println(s1);
        li3.method("test");

        // 파라미터가 없을 때 ()만 작성
        LambdaInterface3 li4 = () -> System.out.println("there's no parameter");
        li4.method();

        // 반환값이 있는 메서드일 경우
        LambdaInterface4 li5 = (x, y) -> {
            int res = x + y;
            return res;
        };
        System.out.println(li5.method(2, 3));
    }
}
