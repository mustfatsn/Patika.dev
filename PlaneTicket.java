package deneme1;
import java.util.Scanner;

public class PlaneTicket {

	public static void main(String[] args) {
		int mesafe , yas , yolculukTipi ;
		double mesafeBasiUcret , toplamTutar , normalTutar = 0 , indirimliTutar ,
				yasİndirimi , biletİndirimi ;
		mesafeBasiUcret = 0.10;
        Scanner inp = new Scanner(System.in);
        
        System.out.print("Mesafeyi km türünden giriniz :");
        mesafe = inp.nextInt();
        System.out.print("Yaşınızı Giriniz :");
        yas = inp.nextInt();
        System.out.print("Yolculuk Tipini Giriniz ( 1 => Tek Yön , 2 => Gidiş Dönüş ):");
        yolculukTipi = inp.nextInt();
        
        if (mesafe >= 1 && yas >= 1) {
        	if (yolculukTipi == 1) {
        	normalTutar = mesafe * mesafeBasiUcret ;
   			 System.out.println("Normal Tutar =" + normalTutar + " TL");
				 if (yas < 12) {
					yasİndirimi = normalTutar * 0.50 ;
					System.out.println("Yaş İndirimi =" + yasİndirimi + " TL");
					toplamTutar = normalTutar - yasİndirimi ;
					System.out.println("Toplam Tutar = " + toplamTutar + " TL");
				}else if (yas >= 12 && yas <= 24) {
					yasİndirimi = normalTutar * 0.10 ;
					System.out.println("Yaş İndirimi = " + yasİndirimi + " TL");
					toplamTutar = normalTutar - yasİndirimi ;
					System.out.println("Toplam Tutar = " + toplamTutar + " TL");
				}else if (yas > 65) {
					yasİndirimi = normalTutar * 0.30 ;
					System.out.println("Yaş İndirimi = " + yasİndirimi + " TL");
					toplamTutar = normalTutar - yasİndirimi ;
					System.out.println("Toplam Tutar = " + toplamTutar + " TL");
				}
        	}
        	else if (yolculukTipi == 2) {
        	 normalTutar = mesafe * mesafeBasiUcret ;
   			 System.out.println("Normal Tutar =" + normalTutar + " TL");
   			if (yas < 12) {
				yasİndirimi = normalTutar * 0.50 ;
				System.out.println("Yaş İndirimi =" + yasİndirimi + " TL");
				indirimliTutar = normalTutar - yasİndirimi ;
				System.out.println("İndirimli Tutar =" + indirimliTutar + " TL");
				biletİndirimi = indirimliTutar * 0.20 ;
				System.out.println("Gidiş Dönüş Bilet İndirimi =" + biletİndirimi + " TL");
				toplamTutar = ( indirimliTutar - biletİndirimi ) * 2;
				System.out.println("Toplam Tutar = " + toplamTutar + " TL");
			}else if (yas >= 12 && yas <= 24) {
				yasİndirimi = normalTutar * 0.10 ;
				System.out.println("Yaş İndirimi = " + yasİndirimi + " TL");
				indirimliTutar = normalTutar - yasİndirimi ;
				System.out.println("İndirimli Tutar =" + indirimliTutar + " TL");
				biletİndirimi = indirimliTutar * 0.20 ;
				System.out.println("Gidiş Dönüş Bilet İndirimi =" + biletİndirimi + " TL");
				toplamTutar = ( indirimliTutar - biletİndirimi ) * 2;
				System.out.println("Toplam Tutar = " + toplamTutar + " TL");
			}else if (yas > 65) {
				yasİndirimi = normalTutar * 0.30 ;
				System.out.println("Yaş İndirimi = " + yasİndirimi + " TL");
				indirimliTutar = normalTutar - yasİndirimi ;
				System.out.println("İndirimli Tutar =" + indirimliTutar + " TL");
				biletİndirimi = indirimliTutar * 0.20 ;
				System.out.println("Gidiş Dönüş Bilet İndirimi =" + biletİndirimi + " TL");
				toplamTutar = ( indirimliTutar - biletİndirimi ) * 2;
				System.out.println("Toplam Tutar = " + toplamTutar + " TL");
			   }
		     }
         }else {
        	 System.out.println("Hatalı Veri Girdiniz !");
		}
      }
  }

