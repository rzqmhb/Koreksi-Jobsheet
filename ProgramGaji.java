import java.util.Scanner;
public class ProgramGaji{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int hasilJual, gajiPokok;
        double gajiAkhir;
        System.out.print("Masukan hasil penjualan ");
        hasilJual = sc.nextInt();
        System.out.print("Masukan gaji pokok ");
        gajiPokok = sc.nextInt();
        gajiAkhir = hasilJual * 15/100 + gajiPokok;
        System.out.println("Total gaji yang diterima adalah: " + gajiAkhir);
        sc.close();
    }
}