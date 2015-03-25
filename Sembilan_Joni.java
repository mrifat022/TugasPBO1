public class Sembilan_Joni {
    public static void main(String[] args) {
        System.out.println("Menampilkan BOOOM Di Baris Ke Lima");
        System.out.println("----------------------------------");

        int start=1;
        int end=110;

        for (start=1;start<=110;start++){
            if(start%5==0){
                System.out.print("~BOOOM~");
            }else {
                System.out.print(start + " ");
            }
            if(start%11==0){
                System.out.print("\n");
            }
        }
    }
}