package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.lambda.ExpressionExecutor;

public class StreamMain {
    public static void main(String[] args) {

        PoemBeautifier poemBeautifier = new PoemBeautifier();

        System.out.println("Add prefix and suffix 'ABC'.");
        poemBeautifier.beautify("Jezeli myslisz, ze nie mozesz nic zmienic, zmien myslenie.", (String)->"ABC "+String+" ABC");
        System.out.println(" ");
        System.out.println("Change text to CAPITAL letters.");
        poemBeautifier.beautify("Jezeli myslisz, ze nie mozesz nic zmienic, zmien myslenie.", (String)->String.toUpperCase());
        System.out.println(" ");
        System.out.println("Change small letter 'e' to capital letter 'E'.");
        poemBeautifier.beautify("Jezeli myslisz, ze nie mozesz nic zmienic, zmien myslenie.", (String)->String.replace("e", "E"));
        System.out.println(" ");
        System.out.println("Showing just selected text fragment.");
        poemBeautifier.beautify("Jezeli myslisz, ze nie mozesz nic zmienic, zmien myslenie.", (String)->String.substring(43, 57));
  }
}
