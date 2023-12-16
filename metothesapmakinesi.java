package calisma1;

import java.util.Scanner;

public class metothesapmakinesi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		double s1, s2;
        String islem;

        yaz("1. Sayıyı Giriniz: ");
        s1 = okuDouble();
        yaz("2. Sayıyı Giriniz: ");
        s2 = okuDouble();
        yaz("İşlemi Seçiniz (+, -, *, /): ");
        islem = oku();

        double sonuc = 0;

        switch (islem) {
            case "+":
                sonuc = topla(s1, s2);
                break;
            case "-":
                sonuc = cikar(s1, s2);
                break;
            case "*":
                sonuc = carp(s1, s2);
                break;
            case "/":
                sonuc = bol(s1, s2);
                break;
            default:
                yaz("Geçersiz işlem.");
                return;
        }

        yaz("Sonuç: " + sonuc);
    }

    
	public static double topla(double s1, double s2) {
        return  s1 + s2;
    }

    public static double cikar(double s1, double s2) {
        return s1 - s2;
    }

    public static double carp(double s1, double s2) {
        return s1 * s2;
    }

    public static double bol(double s1, double s2) {
        if (s2 != 0) {
            return s1 / s2;
        } else {
            yaz("Bir sayıyı 0'a bölemezsiniz.");
            return 0; // Sıfıra bölmeye çalıştığımızda 0 döndürüyoruz.
        }
    }
public static double okuDouble() {
    Scanner klavye = new Scanner(System.in);
    return klavye.nextDouble();
}

public static String oku() {
    Scanner klavye = new Scanner(System.in);
    return klavye.next();
}

public static void yaz(String gelen) {
    System.out.println(gelen);
}
}


