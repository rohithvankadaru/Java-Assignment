package org.JavaAssignment;


import java.util.HashSet;

public class PangramCheck {
    public static void main(String[] args) {
        System.out.println(checkIfPangram("AbcdefghIjklmnopqrstuvwxyz"));
    }

    //3. Check if the input is pangram or not
    private static boolean checkIfPangram(String str){
        HashSet<Character> hs = new HashSet<>();
        for (int i = 0; i < 26; i++) {
            hs.add((char)(i+97));          //adding all characters from a to z
        }

        for (int i = 0; i < str.length(); i++) {                //itterating through out string
            char c = str.charAt(i);
            if(Character.isUpperCase(c)) c = Character.toLowerCase(c);    //in case of upper case letters, converting to lower case
                                                                         // as iam only checking for lower case

            hs.remove(c);   //removing character from set, if character from given string exists
        }
        return hs.isEmpty();       //returning if set is empty to true
    }
}
