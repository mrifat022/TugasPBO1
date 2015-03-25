public class Tujuh_RataDeretAngka {
    public static void main(String[] args) {
        System.out.println("Menghitung Jumlah Dan Rata-rata Dari Sebuah Deretan Angka");
        System.out.println("----------------------------------------------------------");
        
        int limit=10;
        float total=0;
        int start=1;
              System.out.print("Jumlah Dan Rata-rata Angka Dari "+start+" Sampai "+limit+" Adalah ");
                  for (;start<=limit;start++){
                  total = total + start;
        }
        total = total/(start-1);
        System.out.println(total);
    }
}