package org.example;


import org.example.string.RemoveConsecutiveCharactersStrategy;
import org.example.string.ReplaceConsecutiveCharactersStrategy;
import org.example.string.StringProcessor;

public class Main {
    public static void main(String[] args) {
        String input1 = "aabcccbbad";
        String input2 = "abcccbad";

        System.out.println("Input: " + input1);
        System.out.println("Output:");
        StringProcessor processor1 = new StringProcessor(new RemoveConsecutiveCharactersStrategy());
        String result1 = processor1.process(input1);
        System.out.println("-> " + result1);
        System.out.println();

        System.out.println("Input: " + input2);
        System.out.println("Output:");
        StringProcessor processor2 = new StringProcessor(new ReplaceConsecutiveCharactersStrategy());
        String result2 = processor2.process(input1);
        System.out.println("-> " + result2);
    }
}