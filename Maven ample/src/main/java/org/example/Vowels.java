package org.example;

public class Vowels {
    public static void main(String args[]){
        int count = 0;
        String str = "I have done my Master's in US";
        String sentence =str.toLowerCase();

        for (int i=0 ; i<sentence.length(); i++){
            char ch = sentence.charAt(i);
            if(ch == 'a'|| ch == 'e'|| ch == 'i' ||ch == 'o' ||ch == 'u'){
                count ++;
            }
        }
        System.out.println("Number of vowels in the given sentence is "+count);
    }
}