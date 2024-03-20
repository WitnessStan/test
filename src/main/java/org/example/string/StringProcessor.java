package org.example.string;

public class StringProcessor {
    private StringStrategy stringStrategy;

    public StringProcessor(StringStrategy stringStrategy) {
        this.stringStrategy = stringStrategy;
    }

    public String process(String input) {
        return stringStrategy.handle(input);
    }
}
