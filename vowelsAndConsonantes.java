class Main {
    public static void main(String[] args) {

        String initial_word = "Papa";
        String word = initial_word.toLowerCase();
        char[] letters = word.toCharArray();
        
        if (letters.length > 4) {
            System.out.println("Digite uma palavra menor!");
        } else {
            int count_vowels = 0;
            int count_consonants = 0;
        
            for (int i = 0; i < letters.length; i++) {
                if (letters[i] == 'a' || letters[i] == 'e' || letters[i] == 'i' || letters[i] == 'o' || letters[i] == 'u') {
                    count_vowels += 1;
                } else {
                    count_consonants += 1;
                }
            }
            System.out.println("São " + count_vowels + " vogais e " + count_consonants + " consoantes.");
        }
    }
}
