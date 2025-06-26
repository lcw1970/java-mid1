package enumeration.ex3;

public class DiscountService {

    public int discount(Grade classGrade,int price){
        int discountPercent = 0;

        if (classGrade == Grade.BASIC){
            discountPercent = 10;
        }

        return discountPercent *price /100;
    }
}
