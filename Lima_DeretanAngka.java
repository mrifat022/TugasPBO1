public class Lima_DeretanAngka {
    public static void main(String[] args) {
        System.out.println("Membuat Deretan Angka");
        System.out.println("---------------------");

        int limit = 10;
        for (int i = 1; i <= 10; i++) {
            System.out.print(+i);
            if (i < 10) {
                System.out.print(",");
            }
        }
    }
}
