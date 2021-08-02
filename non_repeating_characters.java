public class non_repeating_characters {
    
        public static void main(String[] args) {
            String str="KingRovo";
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
           
           for(i = 0; i <freq.length; i++) { 
              if(string[i] != ' ' && string[i] != '0'&&freq[i]==1) 
                 System.out.print(string[i]); 
              }}
}
