package pay;

public interface Payment {
    void pay(int amount);
    void depositAmount(int amount);
    int withdrawAmount(int amount);

}
