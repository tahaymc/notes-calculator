import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        int mat,fiz,kim,tr,trh,mzk;

        Scanner inp = new Scanner(System.in);

        System.out.println("Matematik notunuzu giriniz: ");
        mat =inp.nextInt();
        System.out.println(mat);

        System.out.println("Fizik notunuzu giriniz: ");
        fiz =inp.nextInt();
        System.out.println(fiz);

        System.out.println("Kimya notunuzu giriniz: ");
        kim =inp.nextInt();
        System.out.println(kim);

        System.out.println("Türkçe notunuzu giriniz: ");
        tr =inp.nextInt();
        System.out.println(tr);

        System.out.println("Tarih notunuzu giriniz: ");
        trh =inp.nextInt();
        System.out.println(trh);

        System.out.println("Müzik notunuzu giriniz: ");
        mzk =inp.nextInt();
        System.out.println(mzk);

        int toplam = (mat+fiz+kim+tr+trh+mzk);
        double ort = toplam/6;

        System.out.println( "Ortalama: " + ort);

        System.out.println( ort > 60 ? "Geçtiniz" : "Kaldınız");




    }
}