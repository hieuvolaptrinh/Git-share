public class dem_solanxhTU {
//tần xuất xuất hiện các từ cơ bản.
    public static void main(String[] args) {
        String s = "28tech28te";
        int[] cnt = new int[256];
        for( char x: s.toCharArray()){
            cnt[x]++;
        }
        for(int i=1;i<256;i++){
            if(cnt[i]!=0){
                System.out.println((char)i+" "+cnt[i] );
            }
        }
    }
}
