import java.util.*;
import java.io.*;
import java.lang.Math;
public class Main {
   public static void main(String args[]) {
       Main obj = new Main();
      Scanner scn = new Scanner(System.in);
      System.out.print("Enter a Roman Number in capital letters: ");
      String inputRoman= scn.nextLine();
     //romanToInt(inputRoman) ;
     System.out.println("The Integer value of given Roman number is:"+obj.romanToInt(inputRoman));
   }
      int NumValue(char rm){
      if (rm == 'I')
         return 1;
      if (rm == 'V')
         return 5;
      if (rm == 'X')
         return 10;
      if (rm == 'L')
         return 50;
      if (rm == 'C')
         return 100;
      if (rm == 'D')
         return 500;
      if (rm == 'M')
         return 1000;
      return -1;
   } 
   int romanToInt(String str) {
      int sum = 0;
      for (int i=0; i<str.length(); i++) {
         int s1 = NumValue(str.charAt(i));
         if (i+1 <str.length()) {
            int s2 = NumValue(str.charAt(i+1));
            if (s1 >= s2) {
                sum = sum + s1;
             }
             else {
                sum = sum - s1;
             } 
          }
          else {
             sum = sum + s1;
          } 
       }
       return sum;
    } 
 } 