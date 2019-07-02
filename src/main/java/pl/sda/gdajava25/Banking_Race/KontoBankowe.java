package pl.sda.gdajava25.Banking_Race;

import lombok.Synchronized;

public class KontoBankowe {
    private double stan;
    private final Object lock = new Object();


    public double getStan() {
        return stan;
    }

    public void setStan(double stan) {
        this.stan = stan;
    }

    public void przelewPrzychodzacy(double kwota) {
        synchronized (lock) {
            stan += kwota;
        }
    }

    public void przelewWychodzacy(double kwota) {
        synchronized (lock) {
            stan -= kwota;
        }
    }
}