package deneme1;
import java.util.Scanner;
public class LeapYearCalculator {

	public static void main(String[] args) {
		
		int year ;
		Scanner inp = new Scanner(System.in);
		
		System.out.print("Yıl Giriniz : ");
		year = inp.nextInt();
		
	  if (year > 0) {
		  if (year % 400 == 0 || year % 4 == 0) {
	        System.out.print(year + " bir artık yıldır !");
		}else if (year % 400 > 0 || year % 4 > 0){
			System.out.println(year + " bir artık yıl değildir !");
		}
	  }
	  else {
		System.out.println("Hatalı Veri Girdiniz !");
	}
	}
}
