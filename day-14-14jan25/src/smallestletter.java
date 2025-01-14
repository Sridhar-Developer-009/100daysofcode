/*
744. Find Smallest Letter Greater Than Target
Easy
        Topics
Companies
        Hint
You are given an array of characters letters that is sorted in non-decreasing order, and a character target. There are at least two different characters in letters.

Return the smallest character in letters that is lexicographically greater than target. If such a character does not exist, return the first character in letters.



        Example 1:

Input: letters = ["c","f","j"], target = "a"
Output: "c"
Explanation: The smallest character that is lexicographically greater than 'a' in letters is 'c'.
Example 2:

Input: letters = ["c","f","j"], target = "c"
Output: "f"
Explanation: The smallest character that is lexicographically greater than 'c' in letters is 'f'.
Example 3:

Input: letters = ["x","x","y","y"], target = "z"
Output: "x"
Explanation: There are no characters in letters that is lexicographically greater than 'z' so we return letters[0].


Constraints:

        2 <= letters.length <= 104
letters[i] is a lowercase English letter.
letters is sorted in non-decreasing order.
letters contains at least two different characters.
target is a lowercase English letter.
*/
public class smallestletter {
    public static void main(String[] args){
        char letter[]={'c','f','j'};
        char target='j';
         char ans=binarysearchh(letter,target);
        System.out.print(ans);

    }
    static char binarysearchh(char letter[],int target){
        int start=0;
        int end=letter.length-1;

        while(start<=end){
            int mid=start +(end-start)/2;

            if(target<letter[mid])end=mid-1;
            else{
                start=mid+1;
            }
        }
        return letter[start%(letter.length)];
    }
}