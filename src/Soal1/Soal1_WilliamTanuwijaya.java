package Soal1;

import java.io.*;

public class Soal1_WilliamTanuwijaya {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(
				new InputStreamReader(System.in));
		
		System.out.println("===========================");
		System.out.println("Luas bangun ruang");
		System.out.println("1. Persegi Panjang");
		System.out.println("2. Segitiga");
		System.out.println("3. Lingkaran");
		System.out.println("===========================");
		
		System.out.println("Masukkan pilihan <1/2/3>= \t");
		int Pilihan = Integer.parseInt(br.readLine()); 	
		double luas = 0;
		String bentuk = null;
		final double π = 3.14;
		
		if(Pilihan == 1) {
			bentuk = "Persegi Panjang";
			System.out.println("Masukkan panjang = ");
			int Long = Integer.parseInt(br.readLine());	
			System.out.println("Masukkan lebar = ");
			int Wide = Integer.parseInt(br.readLine());			
			luas = Long * Wide;
			System.out.println("Luas Persegi Panjang = " + luas + "cm2");
		} else if (Pilihan == 2) {
			bentuk = "Segitiga";			
			System.out.println("Masukkan Alas = ");
			int base = Integer.parseInt(br.readLine());			
			System.out.println("Masukkan Tinggi = ");
			int high = Integer.parseInt(br.readLine());			
			luas = (base*high) / 2;
			
			System.out.println("Luas Segetiga = " + luas + "cm2");
		} else if (Pilihan == 3) {
			bentuk = "Lingkaran";
			System.out.println("Masukkan Jari-jari = ");
			int R = Integer.parseInt(br.readLine());						
			luas =  π * (R * R);	
			
			System.out.println("Luas Lingkaran = " + luas + "cm2");
		} else {
			System.out.println("Input yang anda masukin tidak ada");
		}	
	}
}
