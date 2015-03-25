public class Empat_HurufAngka_Switch {
    public static void main(String[] args) {
        System.out.println("Menulis Huruf Dan Angka");
        System.out.println("-----------------------");
        int angka = 7;
         System.out.println("Nilai Yang Di Masukkan = " +angka);
            switch (angka) {
                case 1:
                    System.out.println("Satu");
                    break;
                case 2:
                    System.out.println("Dua");
                    break;
                case 3:
                    System.out.println("Tiga");
                    break;
                case 4:
                    System.out.println("Empat");
                    break;
                case 5:
                    System.out.println("Lima");
                    break;
                case 6:
                    System.out.println("Enam");
                    break;
                case 7:
                    System.out.println("Tujuh");
                    break;
                case 8:
                    System.out.println("Delapan");
                    break;
                case 9:
                    System.out.println("Sembilan");
                    break;
                default:
                    System.out.println("Hanya Sampai 9");
                    break;
            }
    }
}
