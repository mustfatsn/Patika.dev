package deneme1;
import java.util.Scanner;

public class HarmonicNumbers {

	public static void main(String[] args) {
		
		int number ;
		double result = 0.0;
		Scanner inp = new Scanner(System.in);
		System.out.print("N Sayısını Giriniz :");
		number = inp.nextInt();
		
		for (int i = 1; i <= number; i++) {
			result += (1.0 / i);
		}
		System.out.println(result);
	}
}
