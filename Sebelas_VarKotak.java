public class Sebelas_VarKotak {
    public static void main(String[] args) {
        System.out.println("Menghasilkan Gambar Kotak Menggunakan Karakter (Variasi) #");
        System.out.println("----------------------------------------------------------");
        int p=7;

        for (int a=1;a<=p;a++){
            if (a%2==0){
                System.out.print(" ");
            }
            for (int b=1;b<=p;b++){
                System.out.print("#");
            }
            System.out.print("\n");
        }
    }
}
