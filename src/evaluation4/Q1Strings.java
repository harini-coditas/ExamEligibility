package evaluation4;

import java.util.*;
import java.util.StringTokenizer;
//class Menu{
//    Scanner sc = new Scanner(System.in);
//    int num = sc.nextInt();
//
//
//
//    }
//}
class CountTokens{


    public void countTokens(){
        int count = 0;

        StringTokenizer stringTokenizer = new StringTokenizer("hi, i am harini!","[, !]");

        while(stringTokenizer.hasMoreTokens()){
            System.out.println(stringTokenizer.nextToken());
            count++;

        }
        System.out.println("Count of tokens is :"+count);
    }
}
class CountVowels {
    public void countVowels() {
        System.out.println(("----------"));
        int count = 0;
        String string = "hi, i am harini!";
        String str = "";
        for (int i = 0; i < string.length(); i++) {
            char ch = string.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
               count++;
                str = str + ch;
            }
        }
            System.out.println("Number of vowels is :" + count);
            System.out.println("new string is :" + str);


    }
}

    class IfNotVowel {
        public void ifNotVowel() {
            System.out.println("------------");
            String string = "hi, i am harini!";
            String str = "";
            for (int i = 0; i < string.length(); i++) {
                char ch = string.charAt(i);

                if (ch != 'a' && ch != 'e' && ch != 'i' && ch != 'o' && ch != 'u' && ch != 'A' && ch != 'E' && ch != 'I' && ch != 'O' && ch != 'U') {
                    str = str + ch +1;
                } else {
                    str = str + ch;
                }
            }
            System.out.println("new string is :" + str);

        }
    }

    public class Q1Strings {
        public static void main(String[] args) {
            CountTokens testString1 = new CountTokens();
            testString1.countTokens();
            CountVowels testString2 = new CountVowels();
            testString2.countVowels();
            IfNotVowel testString3 = new IfNotVowel();
            testString3.ifNotVowel();

        }
    }
