
public class Enam_JumlahDeretAngka {
    public static void main(String[] args) {
        System.out.println("Menjumlahkan Deretan Angka");
        System.out.println("-------------------------");

        int batas=10;
        int jumlah=0;
        int awal=1;
        System.out.print("Jumlah Total Dari "+awal+" sampai "+batas+" Adalah ");
        for (;awal<=batas;awal++){
            jumlah = jumlah + awal;
        }
        System.out.println(jumlah);
    }
}
