package Patika;
import java.util.Scanner;
public class AtmProject {
    public static void main(String[] args) {
        String userName, password;
        Scanner inp = new Scanner(System.in);
        int right = 3;
        int balance = 1500;
        int select;
        while (right > 0) {
        System.out.print("Kullanıcı Adınız :");
        userName = inp.nextLine();
        System.out.print("Parolanız :");
        password = inp.nextLine();
            if (userName.equals("patika") && password.equals("dev123")) {
                System.out.println("Merhaba, Kodluyoruz Bankasına Hoşgeliniz!");
                do {
                    System.out.println("1-Para Yatırma\n" +
                            "2-Para Çekme\n" +
                            "3-Bakiye Sorgulama\n" +
                            "4-Çıkış");
                    System.out.print("Lütfen Yapmak İstediğiniz İşlemi Seçiniz :");
                    select = inp.nextInt();
                    switch (select) {
                        case 1:
                            System.out.print("Para Miktarı :");
                            int price = inp.nextInt();
                            balance += price;
                            break;
                        case 2:
                            System.out.print("Para Miktarı :");
                            int price2 = inp.nextInt();
                            if (price2 > balance) {
                                System.out.println("Bakiye Yetersiz");
                            } else {
                                balance -= price2;
                            }
                        case 3:
                            System.out.println("Bakiyeniz :" + balance);
                    }
                } while (select != 4);
                System.out.println("Tekrar Görüşmek Üzere.");
                break;
            } else {
                right--;
                System.out.println("Hatalı Kullanıcı Adı veya Şifre.Tekrar Deneyiniz.");
                if (right == 0) {
                    System.out.println("Hesabınız Bloke Olmuştur.Lütfen Banka ile İletişime Geçiniz.");
                } else {
                    System.out.println("Kalan Hakkınız :" + right);
                }
            }
        }
    }
}
