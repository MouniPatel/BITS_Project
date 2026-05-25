public class CountVCDS {

    public static void solution(String s) {

        s = s.toLowerCase();

        String vowels = "aeiou";
        String decimals = "0123456789";
        String specialChars = "!@#$%^&*()";

        int vowelsCount = 0;
        int decimalCount = 0;
        int consonentsCount = 0;
        int specialCharsCount = 0;

        for (int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);

            if (vowels.contains(Character.toString(ch))) {
                vowelsCount++;

            } else if (decimals.contains(Character.toString(ch))) {
                decimalCount++;

            } else if (specialChars.contains(Character.toString(ch))) {
                specialCharsCount++;

            } else {
                consonentsCount++;
            }
        }

        System.out.println("Count Of Vowels: " + vowelsCount);
        System.out.println("Count Of Digits: " + decimalCount);
        System.out.println("Count Of Special Characters: " + specialCharsCount);
        System.out.println("Count Of Consonants: " + consonentsCount);
    }

    public static void main(String[] args) {

        String s = "aeioustrng1236#";
        solution(s);
    }
}