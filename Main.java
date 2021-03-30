
/**
 * Write a description of class Main here.
 *
 * @author (Hijaiyah, Mega, Safratul)
 * @version (30 Maret 2021)
 */
public class Main
{
     public static void main (String args[]){
         DSLR kameraDSLR = new DSLR();
         MirrorLens kameraMirrorLens = new MirrorLens();
         
         SewaKamera kamera1 = new SewaKamera();
         SewaKamera kamera2 = new SewaKamera();
         
         kamera1.Konfirmasi(kameraDSLR);
         kamera2.Konfirmasi(kameraMirrorLens);
         
         kamera1.Transaksi();
         kamera2.Transaksi();
         
        }
}
