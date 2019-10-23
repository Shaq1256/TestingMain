package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.lambda.ExpressionExecutor;

public class StreamMain {
    public static void main(String[] args) {

        PoemBeautifier poemBeautifier = new PoemBeautifier();

        poemBeautifier.beautify("Jezeli myslisz, ze nie mozesz nic zmienic, zmien myslenie.", (String)->"ABC "+String+" ABC");
        poemBeautifier.beautify("Jezeli myslisz, ze nie mozesz nic zmienic, zmien myslenie.", (String)->String.toUpperCase());
        poemBeautifier.beautify("Jezeli myslisz, ze nie mozesz nic zmienic, zmien myslenie.", (String)->String.replace("e", "E"));
        poemBeautifier.beautify("Jezeli myslisz, ze nie mozesz nic zmienic, zmien myslenie.", (String)->String.substring(43, 57));
  }
}
