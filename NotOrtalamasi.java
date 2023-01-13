package patika.dev;
import java.util.Scanner;

public class NotOrtalamasi {

	public static void main(String[] args) {
		// Değişkenleri oluştur
		int mat, fizik, kimya, turkce, tarih, muzik;
		
		//Scanner sınıfını tanımladık
		Scanner inp = new Scanner(System.in);
		
		// Kullanıcıdan değerleri al
		System.out.print("Matematik Notunuz : ");
		mat = inp.nextInt();
		
		System.out.print("Fizik Notunuz : ");
		fizik = inp.nextInt();
		
		System.out.print("Kimya Notunuz : ");
		kimya = inp.nextInt();
		
		System.out.print("Türkçe Notunuz : ");
		turkce = inp.nextInt();
		
		System.out.print("Müzik Notunuz : ");
		muzik = inp.nextInt();
		
		System.out.print("Tarih Notunuz : ");
	    tarih = inp.nextInt();
		
		int toplam = ( mat + fizik + kimya + turkce + tarih + muzik );
		double sonuc = toplam / 6.0 ;
		System.out.println(sonuc);
		
		System.out.print(sonuc>60? "Ortalama= "+sonuc+" Sınıfı Geçti": "Ortalama= "+sonuc+" Sınıfta Kaldı" );
	}

}
