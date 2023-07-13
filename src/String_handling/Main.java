package String_handling;

public class Main {
    public static void main(String[] args){
        String string1 = "Hello";
        String string2 = "How are you?";

        String firstTwoCharactersToString1 = string1.substring(0, 2);

        System.out.println(string2.length()); //12
        String lastTwoCharactersToString2 = string2.substring(10, 12);

        String chars = firstTwoCharactersToString1 + lastTwoCharactersToString2;

        char[] charArray = chars.toCharArray();
        System.out.println(charArray);
    }
}
