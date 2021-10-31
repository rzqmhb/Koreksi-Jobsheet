import java.util.Scanner;
public class Fibonacci{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int i, jumlah, jumlah2, batas;
        i = 1;
        jumlah = 0;
        System.out.println("Masukkan batas deret bilangan Fibonacci");
        batas = sc.nextInt();
        for( ; true; ){
            jumlah2=jumlah+i;
            if(jumlah2>=batas) break;
            System.out.println("Jumlah dari : "+jumlah+" + "+i+" = "+jumlah2);
            jumlah=i;
            i=jumlah2;
            //if(jumlah2>=batas) break;
        }
    }
}