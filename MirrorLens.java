import java.util.Scanner;
/**
 * Write a description of class MirrorLens here.
 *
 * @author (Hijaiyah, Mega, Safratul)
 * @version (30 Maret 2021)
 */
public class MirrorLens implements Sewa
{
    public void JumlahHari() {
        Scanner input = new Scanner(System.in);
        System.out.println("\nMau sewa berapa hari? : ");
        int hari = input.nextInt();
        System.out.println("Kamera jenis MirrorLens akan disewakan selama " + hari + " hari");
        System.out.println("Terimakasih telah menggunakan iLens");
    }

    public void Jaminan() {
        System.out.println("\nJangan lupa membawa KTP sebagai jaminan pada saat mengambil kamera");
    }

    public void ProsesData() {
        JumlahHari();
        Jaminan();
        }

}
