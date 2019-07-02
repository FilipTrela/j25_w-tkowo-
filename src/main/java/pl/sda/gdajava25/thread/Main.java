package pl.sda.gdajava25.thread;

public class Main {
    public static void main(String[] args) {
        Thread[] tablicaThreadow = new Thread[5];
        for (int i = 0; i <tablicaThreadow.length ; i++) {
            tablicaThreadow[i] = new Thread(new Zadanie("Marian"+i));
        }
        for (Thread thread : tablicaThreadow){
            thread.start();
        }

        System.out.println("Koniec");
    }
}
