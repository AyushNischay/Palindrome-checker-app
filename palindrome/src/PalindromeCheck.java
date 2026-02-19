import java.util.*;
public class PalindromeCheck {
    public static void main(String[] args) {
        String input = "noon";
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < input.length(); i++) {
            stack.push(input.charAt(i));
        }
        String reversed = "";
        while (!stack.isEmpty()) {
            reversed += stack.pop();
        }
        if (input.equals(reversed)) {
            System.out.println(input+" is a palindrome.");
        } else {
            System.out.println(input+" is not a palindrome.");
        }
        }
    }