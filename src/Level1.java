import java.util.*;

public class Level1 {

    public static String BalancedParentheses(int N) {
        StringBuilder res = Parentheses(N);
        if (N > 1) {
            res.append(" ");
            for (int i = 0; i < N; i++) res.append("()");
        }
        return res.toString();
    }

    public static StringBuilder Parentheses(int N) {
        StringBuilder res = new StringBuilder();
        if (N != 0) {
            res.append("(");
            res.append(Parentheses(N - 1));
            res.append(")");
        }
        return res;
    }
}