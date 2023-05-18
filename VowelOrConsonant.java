package com.bridgelabz.assignment;

public class VowelOrConsonant
{
    public static void main(String[] args) {
        char alphabet = 'a';
        alphabet = Character.toLowerCase(alphabet);

        if (alphabet == 'a' || alphabet == 'e' || alphabet == 'i' || alphabet == 'o' || alphabet == 'u') {
            System.out.println(alphabet + " is a vowel.");
        } else {
            System.out.println(alphabet + " is a consonant.");
        }
    }
}
