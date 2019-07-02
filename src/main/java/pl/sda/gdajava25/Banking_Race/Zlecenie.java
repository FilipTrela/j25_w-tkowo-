package pl.sda.gdajava25.Banking_Race;

public class Zlecenie implements Runnable {
    private KontoBankowe kontoNaKtorePrzelacPieniedze;
    private double kwota;
    private Kierunek kierunek;

    public Zlecenie(KontoBankowe kontoNaKtorePrzelacPieniedze, double kwota, Kierunek kierunek) {
        this.kontoNaKtorePrzelacPieniedze = kontoNaKtorePrzelacPieniedze;
        this.kwota = kwota;
        this.kierunek = kierunek;
    }

    @Override
    public void run() {
        if(kierunek==Kierunek.PRZYCHODZACY){
            kontoNaKtorePrzelacPieniedze.przelewPrzychodzacy(kwota);
        }
        if(kierunek==Kierunek.WYCHODZACY){
            kontoNaKtorePrzelacPieniedze.przelewWychodzacy(kwota);
        }


    }
}
