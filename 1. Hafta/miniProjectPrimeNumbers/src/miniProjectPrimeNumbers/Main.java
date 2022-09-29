package miniProjectPrimeNumbers;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		
		ArrayList<Integer> numbers = new ArrayList<Integer>();
	
		int[] list = new int[100];
		int[] primeNumbers = new int[50];
 		
		int number = 1;
		boolean isPrime = true;
		
		if(number == 1) {
			System.out.println("Girilen " + number + " sayısı asal değildir.");
			return;
		}
		if(number < 1) {
			System.out.println("Geçersiz sayı girdiniz.");
		}
		
		for(int i = 2; i < number; i++) {
			
			if(number % i == 0) {
				isPrime = false;
				
			}
		}
		
		if(isPrime) {
			System.out.println("Girilmiş olan " + number + " sayısı asaldır.");
		} else {
			System.out.println("Girilmiş olan " + number + " sayısı asal değildir.");
		}
		/*
		for(int number =0; number < 100; number++) {
			//numbers.add(number);
			list[number] = number;
			
		}
		for(int i=0;i<list.length;i++) {
			//System.out.println(numbers[i]);
			System.out.println(list[i]);
		}
		
		int n = 0;
		for(int i = 0;i <= 100; i++) {
			for(int j = 0; j <= 100; j++) {
				if(list[i] != j && j != 0 && j != 1) {
					if(list[i] % j != 0) {
						primeNumbers[n] = list[i];
						n++;
					} 
				}
			}
		}
		
		*/
		
		/*
		System.out.println("Burası da asal sayıların bulunduğu liste");
		for(int i = 0; i < primeNumbers.length-1; i++) {
			System.out.println(primeNumbers[i]);
		}
		
		*/

	}

}
