package deneme1;
import java.util.Scanner;
public class Test {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
	
	      double ücret,kdv,kdvTutar,toplamTutar;
	      kdv = 0.18;
	      
	      System.out.print("Fiyatını Giriniz :");
	      ücret = input.nextDouble();
	      
	      kdv = ücret <= 1000 ?  0.18 : 0.08 ;
	      kdvTutar = ücret * kdv;
	      toplamTutar = ücret + kdvTutar;
	      
	      System.out.println("Ürünün Ücreti :" + ücret );
	      System.out.println("Ürünün KDV Oranı :" + kdv );
	      System.out.println("KDV Tutarı :" + kdvTutar );
	      System.out.println("Toplam Tutarı :" + toplamTutar );
	      
	      
	}

}
