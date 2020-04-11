/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg123180022_kuis;

/**
 *
 * @author WINDOWS
 */
public class OperasiNilai {
    public OperasiNilai(int nimy, String namay, String mk1y, String mk2y, double Nilai1y, double Nilai2y) {


        HitungRerata rataRata=new HitungRerata(); //memanggil operasi rata-rata di kelas HitungRerata       
        System.out.println("NIM             : " + nimy); //menampilkan NIM, Nama, Mata Kuliah 1, Mata Kuliah 2 sesuai inputan
        System.out.println("Nama            : " + namay);
        System.out.println("Mata Kuliah 1   : " + mk1y);
        System.out.println("Mata Kuliah 2   : " + mk2y);
        System.out.println("Rata - rata     : " + rataRata.Rerata( Nilai1y, Nilai2y));//menampilkan operasi rata-rata
        System.out.println("Nilai Huruf     : " + convertNilaiRataRataKeHuruf( Nilai1y, Nilai2y));//menampilkan operasi convert angka ke huruf
    }


    private String convertNilaiRataRataKeHuruf(double Nilai1y, double Nilai2y) { //akses hanya untuk operasi convert
        HitungRerata rataRata=new HitungRerata();//memanggil nilai rata-rata untuk dioperasi dari kelas HitungRerata
        if (rataRata.Rerata(Nilai1y,Nilai2y) >= 80 && rataRata.Rerata(Nilai1y,Nilai2y) <= 100) return "A";//ketentuan untuk convert
        else if (rataRata.Rerata(Nilai1y,Nilai2y) >= 75 && rataRata.Rerata(Nilai1y,Nilai2y) < 80) return "B+";
        else if (rataRata.Rerata(Nilai1y,Nilai2y) >= 65 && rataRata.Rerata(Nilai1y,Nilai2y) < 75) return "B";
        else if (rataRata.Rerata(Nilai1y,Nilai2y) >= 60 && rataRata.Rerata(Nilai1y,Nilai2y) < 65) return "C+";
        else if (rataRata.Rerata(Nilai1y,Nilai2y) >= 50 && rataRata.Rerata(Nilai1y,Nilai2y) < 60) return "C";
        else if (rataRata.Rerata(Nilai1y,Nilai2y) >= 20 && rataRata.Rerata(Nilai1y,Nilai2y) < 50) return "D";
        else if (rataRata.Rerata(Nilai1y,Nilai2y) >= 0 && rataRata.Rerata(Nilai1y,Nilai2y) < 20) return "E";
        else return "Error";

    }

}
