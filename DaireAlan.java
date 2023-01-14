package deneme1;
import java.util.Scanner;
public class DaireAlan {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
	    int r;
	    double pi , a , alan ;
	    
	    pi = 3.14 ;
	    
	    System.out.print("Yarı Çap Giriniz :");
        r = input.nextInt();
        System.out.print("Merkez Açı Ölçüsü Giriniz :");
        a = input.nextDouble();
        
        alan = ( pi * ( r * r ) * a ) / 360 ;
        System.out.println("Daire Dilimi Alanı :" + alan );
        
	}

}
