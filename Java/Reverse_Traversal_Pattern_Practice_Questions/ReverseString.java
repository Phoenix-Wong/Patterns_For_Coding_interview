/*
Question : Given a sentence, reverse the words of the sentence. For example, "i live in a house" becomes "house a in live i".
*/

package Reverse_Traversal_Pattern_Practice_Questions;

class ReverseString {
    public static void main(String args[]) {
        //region TestCases

        String input = "i live in a house";

        //endregion

        String result = ReverseString.reverse(input);

        System.out.println(result);
    }

    public static String reverse(String input) {
        StringBuilder sb = new StringBuilder();
        int curr_Word_End = input.length();
        for (int i = input.length() - 1; i >= 0; i--) {
            if (input.charAt(i) == ' ') {
                if (sb.length() > 0) {
                    sb.append(' ');
                }
                sb.append(input.substring(i + 1, curr_Word_End));
                curr_Word_End = i;
            }
        }
        return sb.toString();
    }
}
