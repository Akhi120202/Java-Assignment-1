public class StringCharacters {
        public static void main(String[] args) {
            String text = "To be or not to be, that is the question;"
                + "Whether `tis nobler in the mind to suffer"
                + " the slings and arrows of outrageous fortune,"
                + " or to take arms against a sea of troubles,"
                + " and by opposing end them?";
            
            int spaces = 0,
                vowels = 0,
                consonants = 0;
    
            // check each character in the text
            for (char c : text.toCharArray()) {
                // Convert the character to lowercase for case-insensitive vowel checks
                char lowerCaseChar = Character.toLowerCase(c);
                
                // Check if the character is a letter
                if (Character.isLetter(c)) {
                    if (isVowel(lowerCaseChar)) {
                        vowels++;
                    } else {
                        consonants++;
                    }
                } else if (Character.isWhitespace(c)) {
                    spaces++;
                }
            }
    
            System.out.println("The text contained vowels: " + vowels + "\n"
                + "consonants: " + consonants + "\n"
                + "spaces: " + spaces);
        }
    
        // check if a character is a vowel
        private static boolean isVowel(char c) {
            return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
        }

    
    
}
