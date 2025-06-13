package lang.immutable.test;

public class ImmutableMyDate {
    private final int year;
    private final int month;
    private final int day;

    public ImmutableMyDate(int year,int month,int day){
        this.year = year;
        this.month = month;
        this.day =day;
    }
    public ImmutableMyDate withYear(int newyear) {
        return new ImmutableMyDate(newyear,this.month,this.day);
    }
    public ImmutableMyDate withMonth(int newmonth) {
        return new ImmutableMyDate(year,newmonth,day);
    }
    public ImmutableMyDate withDay(int newDay) {
        return new ImmutableMyDate(year, month, newDay);
    }
    @Override
    public String toString() {
        return year + "-" + month + "-" + day;

    }

}
