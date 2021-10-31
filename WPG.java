import java.util.Scanner;
public class WPG{
    public static void main(String[] args) {
        String nMakan, kirim;
        int harga, bKirim, total;
        System.out.println("Menu Pesanan Online Warung Padang Gembira : ");
        System.out.println("Rendang\t\t\t\t : Rp10.000");
        System.out.println("Sate Padang\t\t\t : Rp15.000");
        System.out.println("Pepes Ikan\t\t\t : Rp20.000");
        Scanner sc = new Scanner(System.in);
        System.out.println("Masukkan nama makanan : ");
        nMakan = sc.nextLine();
        System.out.println("Apakah Anda ingin pengiriman ekspres? (0 = tidak, 1 = ya)");
        kirim = sc.nextLine();
        if(nMakan.equalsIgnoreCase ("Rendang")){
            harga = 10000;
            if(kirim.equalsIgnoreCase ("y")){
                if(harga < 100000){
                    bKirim = 45000;
                    total = harga + bKirim;
                }else if(harga >= 10000){
                    bKirim = 55000;
                    total = harga + bKirim;
                }else{
                    bKirim = 0;
                }
                System.out.println("STRUK PEMBELIAN");
                System.out.println(nMakan + "\t\t\tRp" + harga);
                System.out.println("Biaya Pengiriman\t\t" + bKirim);
                System.out.println("TOTAL\t\t\t" + total);
            }else{
                if(harga < 100000){
                    bKirim = 20000;
                    total = harga + bKirim;
                }else if(harga >= 10000){
                    bKirim = 30000;
                    total = harga + bKirim;
                }else{
                    bKirim = 0;
                }
            }
        }else if(nMakan.equalsIgnoreCase ("Sate Padang")){
            harga = 15000;
                if(kirim.equalsIgnoreCase ("y")){
                    if(harga < 100000){
                        bKirim = 45000;
                        total = harga + bKirim;
                    }else if(harga >= 10000){
                        bKirim = 55000;
                        total = harga + bKirim;
                    }else{
                        bKirim = 0;
                    }
                }else{
                    if(harga < 100000){
                        bKirim = 20000;
                        total = harga + bKirim;
                    }else if(harga >= 10000){
                        bKirim = 30000;
                        total = harga + bKirim;
                    }else{
                        bKirim = 0;
                    }
                }
        }else if(nMakan.equalsIgnoreCase ("Pepes Ikan")){
            harga = 20000;
                if(kirim.equalsIgnoreCase ("y")){
                    if(harga < 100000){
                        bKirim = 45000;
                        total = harga + bKirim;
                    }else if(harga >= 10000){
                        bKirim = 55000;
                        total = harga + bKirim;
                    }else{
                        bKirim = 0;
                    }
                }else{
                    if(harga < 100000){
                        bKirim = 20000;
                        total = harga + bKirim;
                    }else if(harga >= 10000){
                        bKirim = 30000;
                        total = harga + bKirim;
                    }else{
                        bKirim = 0;
                    }
                }
        }else{
            System.out.println("Makanan yang Anda Pesan Tidak Ada Di Dalam Menu");
        }
        }
        System.out.println("Terima Kasih Telah Berbelanja Di Warung Padang Gembira");
        sc.close();
    }
}