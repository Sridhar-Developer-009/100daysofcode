import java.util.*;

public class stringsmastery {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        //normal printing of string input
        System.out.println("Reversed just printing what is given as string :" + name);
        /*------------------------------------------------------------------------------------------------------------------------------------------------*/
        /*  reversing a string input*/
        System.out.print("Reversed by using simple for loop : ");
        for (int i = name.length() - 1; i >= 0; i--) {
            System.out.print(name.charAt(i));
        }
        System.out.println();
        /*-----------------------------------------------------------------------------------------------------------------------------------------------*/
        //ANOTHER way using two pointers;
        /* let me declare two variable like start and end*/
        char[] chararray = name.toCharArray();
        int left = 0;
        int right = name.length() - 1;
        while (left < right) {
            char temp = name.charAt(left);
            chararray[left] = chararray[right];
            chararray[right] = temp;

            left++;
            right--;
        }
        String newone = new String(chararray);
        System.out.println("using two pointer appraoch : " + newone);
        /*-----------------------------------------------------------------------------------------------------------------------------------------------*/
        //problem:
        //To check vowel or consonant
        String name2 = name.toLowerCase().trim().replace(" ", "");
        int vowelcount = 0;
        for (int i = 0; i < name2.length(); i++) {
            if ("aeiou".indexOf(name2.charAt(i)) != -1) {
                vowelcount++;
            }
        }
        System.out.println("Vowels : " + vowelcount);
        System.out.println("consonants : " + (name2.length() - vowelcount));
        /*-----------------------------------------------------------------------------------------------------------------------------------------------*/
        //converting sstring to int
        String str = "123";

        // Method 1: Using parseInt()
        float num1 = Float.parseFloat(str);
        System.out.println("Using parseInt: " + num1);  // Output: 123

        // Method 2: Using valueOf()
        int num2 = Integer.valueOf(str);
        System.out.println("Using valueOf: " + num2);  // Output: 123
        /*-----------------------------------------------------------------------------------------------------------------------------------------------*/
        //string manipulation
        //concatenation
        String bird="Eagle";
        System.out.println(bird.concat("hey"));
        /*-----------------------------------------------------------------------------------------------------------------------------------------------*/

    }

}
