import java.util.Scanner;
public class Toko17{
    public static void main(String[] args){
    Scanner input17 = new Scanner (System.in);

    boolean isContinue = true;
    double hargaSatuan, diskon, totalDiskon, totalHarga = 0;
    int kuantitas, totalItem = 0;
    String produk;

    System.out.print("Masukkan nama Anda : ");
    String nama = input17.nextLine();
    System.out.print("Apakah pelanggan member? (y/t): ");
    String member = input17.nextLine();

    do {
        System.out.print("Masukkan produk yang anda beli : ");
        produk = input17.nextLine();
        System.out.print("Banyaknya : ");
        kuantitas = input17.nextInt();
        System.out.print("Masukkan harga satuan: ");
        hargaSatuan = input17.nextDouble();
        System.out.print("Masukkan diskon : ");
        diskon = input17.nextDouble();

    double hargaProduk = hargaSatuan * kuantitas * (1 - diskon / 100);
      
        totalHarga += hargaProduk;
        totalDiskon = hargaProduk * diskon / 100;
        totalItem += kuantitas;
    
        System.out.print("Apakah anda mau menambahkan produk? (y/t): ");
        isContinue = input17.nextLine().equals("y");
 }
      while (isContinue); { 
      double diskonMember = 0;
      if (member.equals("y") && totalHarga >= 200000) {
        diskonMember = 0.1;
      } else if (member.equals("y")) {
        diskonMember = 0.05;
      }
  
      double totalDiskonMember = totalHarga * diskonMember / 100;
      double totalAkhir = totalHarga - totalDiskon - totalDiskonMember;
  
    System.out.println("Nama pelanggan: " + nama);
    System.out.println("Tipe: " + (member.equals("y") ? "Member" : "Non-member"));
    System.out.println("Total item barang yang dibeli2: " + totalItem);
    System.out.println("Total harga sebelum diskon: " + totalHarga);
    System.out.println("Total diskon: " + totalDiskon);
    System.out.println("Total diskon member: " + totalDiskonMember);
    System.out.println("Total akhir yang harus dibayar: " + totalAkhir);

    }
}
 }
 