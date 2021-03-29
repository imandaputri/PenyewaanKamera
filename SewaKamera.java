
/**
 * Write a description of class SewaKamera here.
 *
 * @author (Hijaiyah, Mega, Safratul)
 * @version (30 Maret 2021)
 */
public class SewaKamera
{
   private Sewa kamera;
   
   public SewaKamera() {
       kamera = null; 
    }
    
    public void Konfirmasi(Sewa jenisKamera) {
        kamera = jenisKamera;
    }
    
   public void Transaksi() {
       if(kamera != null) {
        kamera.ProsesData();
        }
        else {
        System.out.println("Harap memilih kameranya");
        }
    }
     
}
