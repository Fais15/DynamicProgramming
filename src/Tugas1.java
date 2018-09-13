public class Tugas1 {
    public static void main(String[] args) {
        // TODO code application logic here
        int uang = 19550;
        int pecahan[] = new int[]{5000,2000,1000,500};
        int jumlah;
        
        for (int i = 0; i < pecahan.length; i++){
            if(uang >= pecahan[i]){
                jumlah = uang / pecahan[i];
                uang = uang%pecahan[i];
                System.out.println("Pecahan " + pecahan[i]+" sebanyak "+jumlah+" keping ");
            }
        }
    }
    
}
