import java.util.Scanner;
public class HitungIP17{
    public static void main(String[] args){
    Scanner input17 = new Scanner (System.in);
    
    String nama, matkul, indeksNilai,nilai;
    int sks, dataAng, mataKuliahPerbaikan=0, jumlahMataKuliah=0;
    double totalIP, totalSKS;
    char ulang;
    
    System.out.println("Program Hitung IP");
    System.out.println("masukkan nama");
    nama = input17.nextLine();
    System.out.println("masukkan sks");
    sks = input17.nextInt();

    for (int i = 1; i <= jumlahMataKuliah; i++) {
        input17.nextLine();  
        System.out.print("Masukkan nama mata kuliah ke-" + i + ": ");
        String namaMataKuliah = input17.nextLine();

        System.out.print("Masukkan indeks nilai (A/B+/B/C+/C/D/E) mata kuliah ke-" + i + ": ");
        indeksNilai = input17.nextLine();

        System.out.print("Masukkan jumlah SKS mata kuliah ke-" + i + ": ");
        sks = input17.nextInt();

        if (indeksNilai.equals("A")) {
            totalIP = 4.0 * sks;
        } else if (indeksNilai.equals("B+")) {
            totalIP = 3.5 * sks;
        } else if (indeksNilai.equals("B")) {
            totalIP = 3.0 * sks;
        } else if (indeksNilai.equals("C+")) {
            totalIP = 2.5 * sks;
        } else if (indeksNilai.equals("C")) {
            totalIP = 2.0 * sks;
        } else if (indeksNilai.equals("D") || indeksNilai.equals("E")) {
            mataKuliahPerbaikan++;
        }
        totalSKS += sks;
    }

    double ip = totalIP / totalSKS;

    System.out.println("Nama Mahasiswa: " + nama);
    System.out.println("Indeks Prestasi (IP): " + ip);
    System.out.println("Total Mata Kuliah: " + jumlahMataKuliah);
    System.out.println("Total SKS: " + totalSKS);
    System.out.println("Jumlah Mata Kuliah Perbaikan/Remidi: " + mataKuliahPerbaikan);

 }
    }
     




