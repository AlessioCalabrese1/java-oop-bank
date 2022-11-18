package jana60.bank;

public class Main {
    public static void main(String[] args) {
        Conto user = new Conto(123, "Alessio");
        System.out.println(user);
        System.out.println(user.addMoney(150));
        System.out.println(user.getMoney(30));
        System.out.println(user.getMoney(150));
    }
}