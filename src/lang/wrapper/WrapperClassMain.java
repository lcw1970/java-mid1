package lang.wrapper;

public class WrapperClassMain {
    public static void main(String[] args) {
        Integer newInteger = new Integer(10);
        Integer integerObj = Integer.valueOf(10);
        System.out.println("newInteger = "+newInteger);
        System.out.println("integerObj = "+integerObj);
    }
}
