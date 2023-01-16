package deneme1;

import java.util.Scanner;
public class index {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int boy;
		double kilo , indeks ;
		
		System.out.print("Lütfen Boyunuzu (metre cinsinden) Giriniz :");
		boy = input.nextInt();
		
		System.out.print("Lütfen Kilonuzu Giriniz :");
		kilo = input.nextDouble();
		
		indeks = kilo / ( boy * boy);
		System.out.print("Vücut Kitle İndeksiniz :" + indeks );

	}

}
