import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Bir sayı girin: ");
        int sayi = scanner.nextInt();


        int toplam = 0;
        int kalan;
        

        while (sayi != 0) {
            kalan = sayi % 10; // Sayının birler basamağı
            toplam += kalan; // Toplama ekle
            sayi /= 10; // Sayıyı bir basamak sağa kaydır
        }

        System.out.println("Basamakların toplamı: " + toplam);
    }
}