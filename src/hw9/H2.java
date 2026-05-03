package hw9;

public class H2 {
    public static void main(String[] args) {
        Account acc = new Account();

        Thread mom = new Thread(new Mom(acc));
        Thread son = new Thread(new Son(acc));

        mom.start();
        son.start();
    }
}