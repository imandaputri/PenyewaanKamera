import java.util.Scanner;
/**
 * Write a description of class Main here.
 *
 * @author (Hijaiyah, Mega, Safratul)
 * @version (30 Maret 2021)
 */
public class Main
{
    public static void main (String args[]){
        System.out.println(
           "---------------SELAMAT DATANG----------------\nSilahkan Pilih Kamera yang ingin Anda sewakan! \n1.DSRL \n2.Mirror Lens\n");
        
           DSLR kameraDSLR = new DSLR();
        MirrorLens kameraMirrorLens = new MirrorLens();
         
        SewaKamera kamera1 = new SewaKamera();
        SewaKamera kamera2 = new SewaKamera();

        Scanner input = new Scanner(System.in);
        int pilihan = input.nextInt();

         switch (pilihan) {
             case 1:
             kamera1.Konfirmasi(kameraDSLR);
             kamera1.Transaksi();
                  break;
         
             case 2:
             kamera2.Konfirmasi(kameraMirrorLens);
             kamera2.Transaksi();
                 break;
         }
         
    }
}
