public class Satu_Percabangan {
    public static void main(String[] args) {
        System.out.println("Pengecekan Tinggi Badan");
        System.out.println("-------------------------------");
        System.out.println("Unuk Memenuhi Syarat Tinggi Badan Harus Lebih Atau Sama Dengan 100 cm");

        int tb = 80;
        System.out.println("Tinngi Badan Sekarang = " + tb);

        if(tb<100){
                    System.out.println("Maaf! Anda Tidak Memenuhi Syarat");
                }
                else
                {
                    System.out.println("Selamat! Anda Memenuhi Syarat");
                }
    }
}
