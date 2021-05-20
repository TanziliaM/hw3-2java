public class Main {
    public static void main(String[] args) {
        int putMoney = 1000;
        int balance;
        int bonus;
        balance = 1100;
        if (balance > putMoney) {
            bonus = balance / 100;
        } else {
            bonus = 0;
        }
        System.out.println(bonus);
    }
}