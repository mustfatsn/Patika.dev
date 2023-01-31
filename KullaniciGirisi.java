package deneme1;
 import java.util.Scanner;

 public class KullaniciGirisi {

	public static void main(String[] args) {
		
		String userName , password , yeniSifre ;
		int secim ;
		
		Scanner inp = new Scanner(System.in);
		
		System.out.print("Kullanıcı Adınızı Giriniz :");
		userName = inp.nextLine();
		System.out.print("Şifrenizi Giriniz :");
		password = inp.nextLine();
		
		if (userName.equals("patika") && password.equals("java123") ) {
			System.out.println("Giriş Yaptınız.");
		  }
		else if (userName.equals("patika") && !password.equals("java123") ) {
				System.out.println("Yanlış Şifre Girişi Yaptınız!");
				System.out.println("Şifrenizi Sıfırlamak İster Misiniz ?\n1-Evet\n2-Hayır");
				secim = inp.nextInt();
		   if (secim == 1) {
			   System.out.println("Yeni Şifre Giriniz :");
			   yeniSifre = inp.nextLine();
			   if (yeniSifre.equals("java123")) {
					System.out.println("Aynı Şifreyi Girdiniz.Lütfen Yeni Şifre Giriniz."); 
					}
					else if (!yeniSifre.equals("java123")) {
						System.out.println("Şifrenizi Değiştirdiniz.");
					}
					else if (secim == 2) {
						System.out.println("Program Bitti.");
					}
					else {
						System.out.print("Hatalı Tuşlama Yaptınız.");
					}
		   }
		}
		else {
			System.out.print("Giriş Yapılamadı.");
		}
	}
 }
 
  


