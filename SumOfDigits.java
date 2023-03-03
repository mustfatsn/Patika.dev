package deneme1;
import java.util.Scanner;
public class SumOfDigits {

	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		System.out.print("Sayı Giriniz :");
		int number = inp.nextInt();
		int sumNumber = 0;
		int tempNumber = number ;
		int sumValue;
		int sumPow = 0;
	
		while (tempNumber != 0) {
			tempNumber /= 10;
			sumNumber++;
		}
		tempNumber = number;
		
			for (int i = 1; i < sumNumber; i++) {
				sumValue = tempNumber % 10 ;
				sumPow += sumValue;
				tempNumber /= 10;
			}
		
		System.out.println("Basamak Sayısı :" + sumNumber);
		System.out.println("Basamak Sayılarının Toplamı :" + sumPow);
	}
}
