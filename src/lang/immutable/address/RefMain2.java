package lang.immutable.address;

public class RefMain2 {
    public static void main(String[] args) {
        // 참조형 변수는 하나의 인스턴스를 공유할 수 있다.
        ImmutableAddress a = new ImmutableAddress("서울");
        ImmutableAddress b = a;

        System.out.println("A = "+a);
        System.out.println("B = "+b);

        b = new ImmutableAddress("부산");
        System.out.println("부산 -> b");
        System.out.println("A = "+a);
        System.out.println("B = "+b);
    }
}
