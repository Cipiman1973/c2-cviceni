package main.java.cz.educanet.praha;

public class StringWithMostOccurrencesOfLetter {

    public static String findStringWithMostOccurrencesOfLetter(String[] strings, char letter) {
        
   int count = 0;
   int bum = 1;
   int at = 0;

   for (int i =0; strings.length >i ;i++){
       for (int x = 0; strings[i].length() > x;x++) {
           if (letter == strings[i].charAt(x)){
               count++;
           }

           if (count > bum){
               bum = count;
               at = i;
           }
       }
       count = 0;
   }

   return(strings[at]);
    }
}
