package pl.sda.gdajava25.Zadanie;

import lombok.Data;

import java.util.Random;

@Data
public class Biegacz implements Runnable {
    private String imie;
    private int dystansPrzebiegnięty;

    public Biegacz(String imie) {
        this.imie = imie;
    }

    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                break;
            }
            int przebiegniete = new Random().nextInt(10) + 1;
            dystansPrzebiegnięty += przebiegniete;
            System.out.println("Jestem " + imie + " i przebiegłem " + przebiegniete);
        }
    }
}