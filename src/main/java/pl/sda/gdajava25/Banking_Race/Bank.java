package pl.sda.gdajava25.Banking_Race;


import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Bank {
    private KontoBankowe konto = new KontoBankowe();
    private ExecutorService serwer = Executors.newCachedThreadPool();

    public void dodajZleceniePrzelewu(double kwota, Kierunek kierunek) {
        serwer.submit(new Zlecenie(konto, kwota, kierunek));
    }

    public void wypiszStanKonta() {
        System.out.println("Stan konta wynosi = " + konto.getStan() + " zł.");
    }
}
