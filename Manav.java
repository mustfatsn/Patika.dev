package deneme1;
import java.util.Scanner;
public class Manav {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		double armut , elma , domates , muz , patlican, 
		armutkilo, elmakilo, domateskilo, muzkilo, patlicankilo, tutar;
		
		armut = 2.14;
		elma = 3.67;
		domates = 1.11;
		muz = 0.95;
		patlican = 5.00;
		
		System.out.print("Armut Kaç Kilo ? :");
		armutkilo = input.nextDouble();
		System.out.print("Elma Kaç Kilo ? :");
		elmakilo = input.nextDouble();
		System.out.print("Domates Kaç Kilo ? :");
		domateskilo = input.nextDouble();
		System.out.print("Muz Kaç Kilo ? :");
		muzkilo = input.nextDouble();
		System.out.print("Patlican Kaç Kilo ? :");
		patlicankilo = input.nextDouble();
		
		tutar = ( (armut*armutkilo)+(elma*elmakilo)+(domates*domateskilo)+(muz*muzkilo)+(patlican*patlicankilo) );
		System.out.println("Toplam Tutar ? :" + tutar );

	}

}
