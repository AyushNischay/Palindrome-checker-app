import java.util.ArrayDeque;
import java.util.Deque;

public class PalindromeCheck {
    public static void main(String[] args) {
        String input = "refer";
        String clean = input.toLowerCase();
        Deque<Character> deque = new ArrayDeque<>();
       for (char c : clean.toCharArray()) {
            deque.addLast(c);
        }
        boolean isPalindrome = true;
        while (deque.size() > 1 && isPalindrome) {
            char first = deque.removeFirst();
            char last = deque.removeLast();
            if (first != last) {
                isPalindrome = false;
            }
        }
        System.out.println("\"" + input + "\" is " +
                (isPalindrome ? "a palindrome" : "not a palindrome"));
    }
}
