public class SquareDigit {

    public int squareDigits(int n) {
        // TODO Implement me
        String ergebnis = "";
        String zahlen = String.valueOf(n);
        for (int i = 0; i < zahlen.length(); i++) {
            ergebnis += String.valueOf((Integer.parseInt(String.valueOf(zahlen.charAt(i))))*(Integer.parseInt(String.valueOf(zahlen.charAt(i)))));
        }
        return Integer.parseInt(ergebnis);
    }

}