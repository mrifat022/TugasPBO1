public class DuaBelas_VarPPanjang {
    public static void main(String[] args) {
        System.out.println("Menghasilkan Gambar Persegi Panjang Menggunakan Karakter # (Variasi)");
        System.out.println("-------------------------------------------------------------------");
        
        int panjang=3;
        int lebar=7;
        for (int i=1;i<=lebar;i++){
            if (i%2==0){
                System.out.print(" ");
            }
            for (int j=1;j<=panjang;j++){
                System.out.print("#");
            }
            System.out.print("\n");
        }
    }
}
