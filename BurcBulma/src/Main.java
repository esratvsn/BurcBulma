import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*Koç Burcu : 21 Mart - 20 Nisan
        Boğa Burcu : 21 Nisan - 21 Mayıs
        İkizler Burcu : 22 Mayıs - 22 Haziran
        Yengeç Burcu : 23 Haziran - 22 Temmuz
        Aslan Burcu : 23 Temmuz - 22 Ağustos
        Başak Burcu : 23 Ağustos - 22 Eylül
        Terazi Burcu : 23 Eylül - 22 Ekim
        Akrep Burcu : 23 Ekim - 21 Kasım
        Yay Burcu : 22 Kasım - 21 Aralık
        Oğlak Burcu : 22 Aralık - 21 Ocak
        Kova Burcu : 22 Ocak - 19 Şubat
        Balık Burcu : 20 Şubat - 20 Mart */

        int month, day;
        String burc = "";
        Scanner input = new Scanner(System.in);

        System.out.print("Doğum gününüzü giriniz (1-31): ");
        day = input.nextInt();

        System.out.print("Doğum ayınızı giriniz (1-12): ");
        month = input.nextInt();

        if (1 <= day && day <= 31 && 1 <= month && month <= 12) {
            if ((month == 3 && day >= 21) || (month == 4 && day <= 20)) {
                burc = "Koç";
            } else if ((month == 4 && day >= 21) || (month == 5 && day <= 21)) {
                burc = "Boğa";
            } else if ((month == 5 && day >= 22) || (month == 6 && day <= 22)) {
                burc = "İkizler";
            } else if ((month == 6 && day >= 23) || (month == 7 && day <= 22)) {
                burc = "Yengeç";
            } else if ((month == 7 && day >= 23) || (month == 8 && day <= 22)) {
                burc = "Aslan";
            } else if ((month == 8 && day >= 23) || (month == 9 && day <= 22)) {
                burc = "Başak";
            } else if ((month == 9 && day >= 23) || (month == 10 && day <= 22)) {
                burc = "Terazi";
            } else if ((month == 10 && day >= 23) || (month == 11 && day <= 21)) {
                burc = "Akrep";
            } else if ((month == 11 && day >= 22) || (month == 12 && day <= 21)) {
                burc = "Yay";
            } else if ((month == 12 && day >= 22) || (month == 1 && day <= 21)) {
                burc = "Oğlak";
            } else if ((month == 1 && day >= 22) || (month == 2 && day <= 19)) {
                burc = "Kova";
            } else if ((month == 2 && day >= 20) || (month == 3 && day <= 20)) {
                burc = "Balık";
            }
            System.out.println("Burcunuz: " + burc);
        } else {
            System.out.println("Geçersiz tarih girdiniz.");
            return; // Programı sonlandır
        }

    }
}