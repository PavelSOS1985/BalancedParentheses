public class Test {
    public static void main(String[] args) {
        Test1();
        Test2();
        Test3();
        Test4();
    }
    static void Test1() {
        System.out.println(Level1.BalancedParentheses(1));
        if (!Level1.BalancedParentheses(1).equals("()")) {
            System.out.println("Test1 Fail");
        } else {
            System.out.println("Test1 Success");
        }
    }
    static void Test2() {
        System.out.println(Level1.BalancedParentheses(2));
        if (!Level1.BalancedParentheses(2).equals("(()) ()()")) {
            System.out.println("Test2 Fail");
        } else {
            System.out.println("Test2 Success");
        }
    }
    static void Test3() {
        System.out.println(Level1.BalancedParentheses(3));
        if (!Level1.BalancedParentheses(3).equals("((())) (()()) (())() ()(()) ()()()")) {
            System.out.println("Test3 Fail");
        } else {
            System.out.println("Test3 Success");
        }
    }
    static void Test4() {
        System.out.println(Level1.BalancedParentheses(4));
        if (!Level1.BalancedParentheses(4).equals("(((()))) ((()())) ((())()) ((()))() (()(())) (()()()) (()())() (())(()) (())()() ()((())) ()(()()) ()(())() ()()(()) ()()()()")) {
            System.out.println("Test4 Fail");
        } else {
            System.out.println("Test4 Success");
        }
    }
}
