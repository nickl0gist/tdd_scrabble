import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Scrabble{
    private static final Map <Character, Integer> TABLE = new HashMap<>();
    private int result;
    static{
        TABLE.put('A', 1);
        TABLE.put('E', 1);
        TABLE.put('I', 1);
        TABLE.put('O', 1);
        TABLE.put('U', 1);
        TABLE.put('L', 1);
        TABLE.put('N', 1);
        TABLE.put('R', 1);
        TABLE.put('S', 1);
        TABLE.put('T', 1);

        TABLE.put('D', 2);
        TABLE.put('G', 2);

        TABLE.put('B', 3);
        TABLE.put('C', 3);
        TABLE.put('M', 3);
        TABLE.put('P', 3);

        TABLE.put('F', 4);
        TABLE.put('H', 4);
        TABLE.put('V', 4);
        TABLE.put('W', 4);
        TABLE.put('Y', 4);

        TABLE.put('K', 5);

        TABLE.put('J', 8);
        TABLE.put('X', 8);

        TABLE.put('Q', 10);
        TABLE.put('Z', 10);

    }

    public Scrabble(String phrase) {
        phrase = phrase.toUpperCase();
        for (int i = 0; i < phrase.length(); i++) {
            result += TABLE.get(phrase.charAt(i));
        }
    }

    public int getScore() {
        return result;
    }
}