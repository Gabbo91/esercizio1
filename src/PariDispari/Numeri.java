package PariDispari;

import java.util.Scanner;

public class Numeri {
	public static void main(String[] args){


		Scanner input=new Scanner (System.in);
		int a=0;
		System.out.println("inserisci un numero");

		a=input.nextInt();

		if(a%2==0) {
			System.out.println("numero pari");
		}

		else {
			System.out.println("numero nuemri dispari");

		}



	}
}