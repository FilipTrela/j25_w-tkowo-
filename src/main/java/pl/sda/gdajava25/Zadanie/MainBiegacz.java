package pl.sda.gdajava25.Zadanie;

public class MainBiegacz {
    public static void main(String[] args) {
        Biegacz[] biegaczs = new Biegacz[]{new Biegacz("Marian"), new Biegacz("Jan"), new Biegacz("Paweł"), new Biegacz("Filip"), new Biegacz("Andrzej")};
        Thread[] threads = new Thread[5];
        for (int i = 0; i < threads.length; i++) {
            threads[i] = new Thread(biegaczs[i]);
        }
        for (Thread thread : threads) {
            thread.start();

        }
        boolean czyKtosSkonczyl = false;
        while (!czyKtosSkonczyl) {
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.print("Biegacze przebiegli");
            for (int i = 0; i < threads.length; i++) {
                System.out.print(biegaczs[i].getDystansPrzebiegnięty() + " ");
                if (biegaczs[i].getDystansPrzebiegnięty() >= 100) {
                    czyKtosSkonczyl = true;
                }
            }
            System.out.println();
        }
        for (int i = 0; i <threads.length ; i++) {
            threads[i].interrupt();
        }
        for (int i = 0; i <threads.length ; i++) {
            try {
                threads[i].join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Koniec");

    }
}