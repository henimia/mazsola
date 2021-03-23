package com.codecool.whattoprint;

class Challenge {
    public static String decideAndSay(String[] words, int number) {
        String word = "";
        if (number % 3 == 0 && number % 7 == 0) {
            word = word.concat(words[0]) + word.concat(words[1]);
            return word;
        }
        if (number % 3 == 0) return words[0];
        if (number % 7 == 0) return words[1];
        return "";
    }
}