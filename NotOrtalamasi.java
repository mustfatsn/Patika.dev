package deneme1;
import java.util.Scanner;
public class NotOrtalamasi {

	public static void main(String[] args) {
		int mat , turkce , kimya , fizik , muzik ;
		
		Scanner inp = new Scanner(System.in);
		
		System.out.print("Matematik Notunuz :");
		mat = inp.nextInt();
		
		System.out.print("Türkçe Notunuz :");
		turkce = inp.nextInt();
		
		System.out.print("Kimya Notunuz :");
		kimya = inp.nextInt();
		
		System.out.print("Fizik Notunuz :");
		fizik = inp.nextInt();
		
		System.out.print("Müzik Notunuz :");
		muzik = inp.nextInt();
		
		double avarage = (mat + turkce + kimya+ fizik + muzik) / 5 ;
		
		if ( (mat <=0 && mat <=100 ) && (turkce <=0 && turkce <=100) && (kimya <=0 && kimya <=100) 
				&& (fizik <=0 && fizik <=100) && (muzik <=0 && muzik <=100) ) {
			if (avarage >= 55) {
				System.out.println("Tebrikler Sınıfı Geçtiniz");
				System.out.println("Ortalamanız :" + avarage );
			}
			else {
				System.out.println("Sınıfta Kaldınız, Seneye Görüşmek Üzere.");
			}
		}
		else {
			System.out.println("Notları 0-100 Arasında Giriniz.");
		}
	}
}
