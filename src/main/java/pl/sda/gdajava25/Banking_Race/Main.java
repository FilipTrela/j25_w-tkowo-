package pl.sda.gdajava25.Banking_Race;

public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank();
        for (int i = 0; i < 5000; i++) {
            if (i % 2 == 0) {
                bank.dodajZleceniePrzelewu(500, Kierunek.PRZYCHODZACY);
            } else {
                bank.dodajZleceniePrzelewu(500, Kierunek.WYCHODZACY);
            }
        }
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        bank.wypiszStanKonta();
    }
}
