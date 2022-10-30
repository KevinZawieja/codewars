public class CountingDuplicates {

    public static int duplicateCount(String text) {
        int counter = 0;
        text = text.toLowerCase();
        for (int i = 0; i < text.length(); i++) {
            for (int j = 0; j < text.length(); j++) {
                if (text.charAt(j) == text.charAt(i) && i != j && text.charAt(j) != ' ') {
                    text = text.replaceAll(String.valueOf(text.charAt(i)), " ");
                    counter++;
                    break;
                }
            }
            //abcdeaBReturnsTwo
            // " bcde BReturnsTwo
        }
        return counter;
    }
}