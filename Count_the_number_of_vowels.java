public class Count_the_number_of_vowels {
    public static void main(String[] args) {
        String str="KingRovo";
        int cnt=0;
        int cns=0;
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u'||str.charAt(i)=='A'||str.charAt(i)=='E'||str.charAt(i)=='I'||str.charAt(i)=='O'||str.charAt(i)=='U')
                cnt++;
            cns++;
        }
        System.out.println("Vowels = "+cnt);
    }
    
    
}
