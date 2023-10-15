
import java.util.Scanner;


public class Main {
    
public static void main(String[] args) throws InterruptedException {
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.println("------------------------------------------------------");
            System.out.print("ne kadar harc yatirdiniz?  :  ");
            int cevap1 = input.nextInt();
            System.out.print("vizeniz var mi?  :  ");
            String cevap2 = input.next();
            System.out.print("sabika kaybiniz var mi?  :  ");
            String cevap3 = input.next();
            System.out.print("adli sicil kaydiniz var mi?  :  ");
            String cevap4 = input.next();

            YolcuKontrol obj = new YolcuKontrol(cevap1, cevap2, cevap3, cevap3);

            System.out.println("harciniz kontrol ediliyor...");
            Thread.sleep(2000);
            if (!obj.harc_kontrol()) {
                System.out.println("yeterli harc yetirmadan yurt disina cikamazsiniz.");
                continue;
            }

            System.out.println("vizeniz kontrol ediliyor...");
            Thread.sleep(2000);
            if (!obj.vize_kontrol()) {
                System.out.println("vizeniz yok. Yurt disina cikamazsiniz.");
                continue;
            }

            System.out.println("sabika kaydiniz kontrol ediliyor...");
            Thread.sleep(2000);
            if (obj.sabika_kontrol()) {
                System.out.println("sabika kaydiniz var. Yurt disina cikamazsiniz.");
                continue;
            }

            System.out.println("adli siciliniz kontrol ediliyor...");
            Thread.sleep(2000);
            if (obj.adliSicil_kontrol()) {
                System.out.println("Sicil kaydiniz var. Yurt disina cikamazsiniz.");
                continue;
            }

            System.out.println("yurt disina cikmanizda hicbir problem yoktur.");
            System.out.println("iyi yolculuklar");
            break;

        }

    }
}
