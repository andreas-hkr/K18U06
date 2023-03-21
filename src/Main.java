import java.util.HashMap;

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

        var map = getAlphaToMorse();
    }
}