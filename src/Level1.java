import java.util.*;

public class Level1 {

    public static void addParen(ArrayList<String> list, int leftRem, int rightRem, char[] str, int count) {
        if (leftRem < 0 || rightRem < leftRem) return; // некорректное состояние
        if (leftRem == 0 && rightRem == 0) { /* нет больше левых скобок */
            String s = String.copyValueOf(str);
            list.add(s);
        } else {
            /* Добавляем левую скобку, если остались любые левые скобки */
            if (leftRem > 0) {
                str[count] = '(';
                addParen(list, leftRem - 1, rightRem, str, count + 1);
            }
            /* Добавляем правую скобку, если выражение верно */
            if (rightRem > leftRem) {
                str[count] = ')';
                addParen(list, leftRem, rightRem - 1, str, count + 1);
            }
        }
    }

    public static String BalancedParentheses(int N) {
        char[] str = new char[N * 2];
        ArrayList<String> list = new ArrayList<String>();
        addParen(list, N, N, str, 0);
        return String.join(" ", list);
    }
}