public class Delapan_BarisAngka {
    public static void main(String[] args) {
        System.out.println("Menampilkan Angka Berjumlah Sebelas Angka per Baris");
        System.out.println("---------------------------------------------------");
        
        int end=110;
        	for (int a=1;a<=end;a++){
            	       System.out.print(a);
            	       System.out.print(" ");
            		if(a%11==0){
               		       System.out.println("\n");
            		}

  	      }
    }
}
