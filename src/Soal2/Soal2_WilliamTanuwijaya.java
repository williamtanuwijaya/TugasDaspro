package Soal2;

import java.io.*;

public class Soal2_WilliamTanuwijaya {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(
				new InputStreamReader(System.in));
		System.out.println("====================================================");
		System.out.println("");
		System.out.println("	      APLIKASI NILAI MAHASISWA			    ");
		System.out.println("");
		System.out.println("====================================================");
		System.out.println("Masukkan NPM = \t");
		String NPM = (br.readLine()); 	
		System.out.println("Masukkan Nama = \t");
		String Nama = (br.readLine()); 
		System.out.println("Masukkan Nilai Kuis = \t");
		int NilaiKuis = Integer.parseInt(br.readLine());
		System.out.println("Masukkan Nilai Tugas = \t");
		int NilaiTugas = Integer.parseInt(br.readLine());
		System.out.println("Masukkan Nilai UTS = \t");
		int NilaiUTS = Integer.parseInt(br.readLine()); 
		System.out.println("Masukkan Nilai UAS = \t");
		int NilaiUAS = Integer.parseInt(br.readLine()); 
		System.out.println("Masukkan Nilai SoftSkills = \t");
		int NilaiSoftSkills = Integer.parseInt(br.readLine());
		System.out.println("");
		
		int Kuis = NilaiKuis*10/100;	
		int UAS = NilaiUAS*30/100;
		int UTS = NilaiUTS*30/100;
		int SoftSkills = NilaiSoftSkills*10/100;
		int Tugas = NilaiTugas*20/100;
		
		int total = Kuis + UAS + UTS + SoftSkills + Tugas;
		String Grade = null;
		
		if(total >= 80 && total <= 100) {
			Grade = "A";
		} else if (total >= 76) {
			Grade = "A-";
		} else if (total >= 72) {
			Grade = "B+";
		} else if (total >= 68) {
			Grade = "B";
		} else if (total >= 64) {
			Grade = "B-";
		} else if (total >= 60) {
			Grade = "C+";
		} else if (total >= 56) {
			Grade = "C";
		} else if (total >= 46) {
			Grade = "D";
		} else if (total < 46 ) {
			Grade = "E";
		} 
		
		System.out.println("====================================================");
		System.out.println("");
		System.out.println("NPM         = \t" + NPM);
		System.out.println("Nama        = \t" + Nama);
		System.out.println("Total Nilai = \t" + total);
		System.out.println("Grade       = \t" + Grade);

	}

}
