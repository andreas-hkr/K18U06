import java.util.HashMap;
import java.util.Scanner;

public class Main {
    static HashMap<Character, String> getAlphaToMorse() {
        String[] morse = {
                ".-",    "-...",  "-.-.", "-..",  ".",    "..-.",
                "--.",   "....",  "..",   ".---", "-.-",  ".-..",
                "--",    "-.",    "---",  ".--.", "--.-", ".-.",
                "...",   "-",    "..-",  "...-", ".--",  "-..-",
                "-.--",  "--..",  ".--.-",".-.-", "---."
        };
        String letters = "abcdefghijklmnopqrstuvwxyzåäö";

        HashMap<Character, String> alphaToMorse = new HashMap<>();
        for (int i=0; i < letters.length(); i++) {
            alphaToMorse.put(letters.charAt(i), morse[i]);
        }
        return alphaToMorse;
    }
    static HashMap<String, Character> getMorseToAplha() {
        String[] morse = {
                ".-",    "-...",  "-.-.", "-..",  ".",    "..-.",
                "--.",   "....",  "..",   ".---", "-.-",  ".-..",
                "--",    "-.",    "---",  ".--.", "--.-", ".-.",
                "...",   "-",    "..-",  "...-", ".--",  "-..-",
                "-.--",  "--..",  ".--.-",".-.-", "---."
        };
        String letters = "abcdefghijklmnopqrstuvwxyzåäö";

        HashMap<String, Character> alphaToMorse = new HashMap<>();
        for (int i=0; i < letters.length(); i++) {
            alphaToMorse.put(morse[i], letters.charAt(i));
        }
        return alphaToMorse;
    }

    public static void main(String[] args) {
        // Skriv två program som kan översätta till/från morsealfabetet
        // Använd en HashMap (avbildningstabell) för översättningen

//        var map = getAlphaToMorse();
//        Scanner input = new Scanner(System.in);
//        System.out.print("Ange en text: ");
//        String text = input.nextLine();
//
//        for (int i=0; i < text.length(); i++) {
//            char c = text.charAt(i);
//            if (c == ' ') {
//                System.out.print(' ');
//            } else {
//                System.out.print(map.get(c));
//            }
//        }

        var map = getMorseToAplha();
        Scanner input = new Scanner(System.in);
        System.out.print("Ange morse: ");
        String text = input.nextLine();

        String[] morse = text.split(" ");
        for(String s : morse) {
            System.out.print(map.get(s));
        }
    }
}