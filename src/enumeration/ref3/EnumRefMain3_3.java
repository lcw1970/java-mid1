package enumeration.ref3;


public class EnumRefMain3_3 {
    public static void main(String[] args) {
        int price = 10000;
        DiscountService discountService = new DiscountService();
        int basic = Grade.BASIC.discount(price);
        int gold = discountService.discount(Grade.GOLD,price);
        int diamond = discountService.discount(Grade.DIAMOND,price);

       printGrade(Grade.BASIC,basic);
    }
    public static void printGrade(Grade grade,int member){
        System.out.println(grade +" 등급의 할인금액: "+member);
    }
}
