package org.example.string;

public class RemoveConsecutiveCharactersStrategy implements StringStrategy {
    @Override
    public String handle(String input) {
        StringBuilder sb = new StringBuilder(input);
        boolean found = true;
        while (found) {
            int count = 1;
            found = false;
            for (int i = 1; i < sb.length(); i++) {
                if (sb.charAt(i) == sb.charAt(i - 1)) {
                    count++;
                    if (count == 3) {
                        sb.delete(i - count + 1, i + 1);
                        found = true;
                        break;
                    }
                }else {
                    count = 1;
                }
            }
        }
        return sb.toString();
    }
}
