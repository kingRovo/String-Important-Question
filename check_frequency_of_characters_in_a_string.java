public class check_frequency_of_characters_in_a_string {
    public static void main(String[] args) {
        String str="Change the world by being yourself";
        int[] freq = new int[str.length()]; 
        int i, j; 
        char string[] = str.toCharArray(); 
        for(i = 0; i <str.length(); i++) { 
           freq[i] = 1; 
             for(j = i+1; j <str.length(); j++) { 
               if(string[i] == string[j]) { 
               freq[i]++; 
               string[j] = '0'; 
             } 
          } 
       } 
       System.out.println("------------Characters frequencies-----------"); 
       for(i = 0; i <freq.length; i++) { 
          if(string[i] != ' ' && string[i] != '0') 
             System.out.println(string[i] + " - " + freq[i]); 
          }}
}
