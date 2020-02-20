import java.util.*;

public class Level1 {
    public static StringBuilder res = new StringBuilder();

    public static String BalancedParentheses(int N) {
        if (N != 0) {
            res.append("(");
            BalancedParentheses(N - 1);
            res.append(")");
        }
        if (res.length() == (N * 2) && N != 1) {
            res.append(" ");
            for (int i = 0; i < N; i++) {
                res.append("()");
            }
        }
        return res.toString();
    }
}