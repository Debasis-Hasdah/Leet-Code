import java.util.*;

public class TextJustification {

    public static List<String> fullJustify(String[] words, int maxWidth) {
        List<String> result = new ArrayList<>();
        int i = 0;

        while (i < words.length) {
            int j = i;
            int lineLength = 0;

            // Find words that fit in the line
            while (j < words.length &&
                   lineLength + words[j].length() + (j - i) <= maxWidth) {
                lineLength += words[j].length();
                j++;
            }

            int gaps = j - i - 1;
            StringBuilder line = new StringBuilder();

            // Last line OR single word → left justify
            if (j == words.length || gaps == 0) {
                for (int k = i; k < j; k++) {
                    line.append(words[k]);
                    if (k < j - 1) line.append(" ");
                }
                while (line.length() < maxWidth) line.append(" ");
            } else {
                int totalSpaces = maxWidth - lineLength;
                int spaceEach = totalSpaces / gaps;
                int extra = totalSpaces % gaps;

                for (int k = i; k < j; k++) {
                    line.append(words[k]);
                    if (k < j - 1) {
                        int spaces = spaceEach + (k - i < extra ? 1 : 0);
                        for (int s = 0; s < spaces; s++) line.append(" ");
                    }
                }
            }

            result.add(line.toString());
            i = j;
        }

        return result;
    }

    public static void main(String[] args) {
        String[] words = {
            "This","is","an","example","of","text","justification."
        };
        int maxWidth = 16;

        List<String> res = fullJustify(words, maxWidth);
        for (String line : res) {
            System.out.println("\"" + line + "\"");
        }
    }
}
