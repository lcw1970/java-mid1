package nested.inner;

public class InnerOuter {
    private static int outClassValue =3;
    private int outInstanceValue =2;

    class Inner {
        private int innerInstanceValue =1;

        public void print() {
            // 자기 자신한테 접근
            System.out.println(innerInstanceValue);

            System.out.println(outInstanceValue);

            System.out.println(outClassValue);
        }
    }
}
