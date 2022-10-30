import org.yaml.snakeyaml.util.ArrayUtils;

import java.util.*;

import static java.util.Comparator.comparingInt;


public class DRoot {

    public static String longest(String s1, String s2) {
        String ergebnis;
        ergebnis = s1 + s2;
        char[] chars = ergebnis.toCharArray();
        Set<Character> mySet = new HashSet<>();
        for (int i = 0; i < chars.length; i++) {
            mySet.add(chars[i]);
        }
        Object[] stre = mySet.toArray();
        Arrays.sort(stre);
        ergebnis = Arrays.toString(stre);
        System.out.println(ergebnis);
        ergebnis = (((ergebnis.replaceAll(",", "").replaceAll("\\[", "").replaceAll("]", "")))).replaceAll(" ", "");
        System.out.println(ergebnis);
        return ergebnis;
    }

    public class RgbToHex {

        public static String rgb(int r, int g, int b) {
            r = r < 0 ? 0 : r;
            r = r > 255 ? 255 : r;
            g = g < 0 ? 0 : g;
            g = g > 255 ? 255 : g;
            b = b < 0 ? 0 : b;
            b = b > 255 ? 255 : b;
            String ergebnis = Integer.toHexString(r).length() < 2 ? "0" + Integer.toHexString(r) : Integer.toHexString(r);
            ergebnis += Integer.toHexString(g).length() < 2 ? "0" + Integer.toHexString(g) : Integer.toHexString(g);
            ergebnis += Integer.toHexString(b).length() < 2 ? "0" + Integer.toHexString(b) : Integer.toHexString(b);
            return ergebnis;
        }
    }

    public class AreSame {

        public static boolean comp(int[] a, int[] b) {
            int[] destructiveArrayA = a.clone();
            int[] destructiveArrayB = b.clone();
            while (Arrays.stream(destructiveArrayA).allMatch(zahl -> zahl != 0) && destructiveArrayA.length != 0 ) {
                for (int j = 0; j < destructiveArrayA.length; j++) {
                    for (int i = 0; i < destructiveArrayB.length; i++) {
                        if ((destructiveArrayA[j] * destructiveArrayA[j]) == destructiveArrayB[i]) {
                            destructiveArrayA[j] = 0;
                            System.out.println(Arrays.toString(destructiveArrayA));
                            destructiveArrayB[i] = 0;
                            System.out.println(Arrays.toString(destructiveArrayB));
                        }
                    }
                    if (destructiveArrayA[j] != 0 || destructiveArrayA.length == 0 || destructiveArrayB.length == 0) return false;

                }
            }
            return true;
           //return a != null && b != null && a.length == b.length && Arrays.equals(Arrays.stream(a).map(i -> i * i).sorted().toArray(), Arrays.stream(b).sorted().toArray());
        }
        }

    public class Scramblies2 {

        public class Scramblies {

            public static boolean scramble(String str1, String str2) {
                if (str2.length() > str1.length()) return false;
                for (int i = 0; i < str2.length(); i++) {
                    if (!(str1.contains(str2.charAt(i)+""))) {return false;}
                    else str1 = str1.replaceFirst(str2.charAt(i)+"","");
                }
                return true;
            }
        }
    }



    //schlechtere Performance
    public class Scramblies3 {

        public static boolean scramble(String str1, String str2) {
            char[] tempArray1 = str1.toCharArray();
            char[] tempArray2 = str2.toCharArray();
            Arrays.sort(tempArray1);
            Arrays.sort(tempArray2);
            String copy_str1 = new String(tempArray1);
            String copy_str2 = new String(tempArray2);
            // 77 -> M ; 76 -> L

            for (int i = 0; i < str2.length(); i++) {
                if(Integer.valueOf(str2.charAt(i)) > 66) {
                    for (int j = 0; j < str1.length(); j++) {
                        if (str1.charAt(j) == str2.charAt(i)) {
                            str1 = str1.replaceFirst(str2.charAt(i) + "", "");
                            str2 = str2.replaceFirst(String.valueOf(str2.charAt(i)), " ");
                            break;
                        }
                    }
                } else {
                    for (int j = str1.length(); j < 0; j--) {
                        if (str1.charAt(j) == str2.charAt(i)) {
                            str1 = str1.replaceFirst(str2.charAt(i) + "", "");
                            str2 = str2.replaceFirst(String.valueOf(str2.charAt(i)), " ");
                            break;
                        }
                    }
                }
                if (str2.charAt(i) != ' ' || i == str2.length()) {
                    System.out.println(false);return false; }
            }
            System.out.println(true);
            return true;
        }
    }

    //Hash-code

        public class Scramblies {

            public static boolean scramble(String str1, String str2) {
                Map<Character, Integer> anzahl_chars = new HashMap<Character,Integer>();
                for (int i = 0; i < str1.length(); i++) {
                    if (!anzahl_chars.containsKey(str1.charAt(i))) anzahl_chars.put(str1.charAt(i),0);
                    anzahl_chars.put(str1.charAt(i),anzahl_chars.get(str1.charAt(i))+1);
                }
                for (Map.Entry<Character, Integer> paar: anzahl_chars.entrySet() ) {
                    System.out.println(paar.getKey()+ ":" + paar.getValue());
                }

                for (int i = 0; i < str2.length(); i++) {
                    if (anzahl_chars.get(str2.charAt(i)) != 0 && anzahl_chars.containsKey(str2.charAt(i))) anzahl_chars.put(str2.charAt(i),anzahl_chars.get(str2.charAt(i))-1);
                    else {
                        System.out.println(false)
                        ;return false;
                    }
                }

                System.out.println(true);
                return true;

            }
        }



    public static void main(String[] args) {
        //your code here
        // longest("aretheyhere", "yestheyarehere");
        //RgbToHex.rgb(-20, 275, 125);
//        int[] a = new int[]{121, 144, 19, 161, 19, 144, 19, 11};
//        int[] b = new int[]{121, 14641, 20736, 361, 25921, 361, 20736, 361};
//        AreSame.comp(a, b);
       // System.out.println(Math.abs(-1%2));
       // Scramblies.scramble("abcdefghijklmnopqrstuvwxyz".repeat(10_000),"zyxcba".repeat(9_000));
       //System.out.println("abcdefghijklmnopqrstuvwxyz".repeat(10_000));
       // "abcdefghijklmnopqrstuvwxyz" -> "zyxcbadefghijklmnopqrstuvw"
        //"zyxcba"
        //Arrays.sort("abcdefghijklmnopqrstuvwxyz".repeat(10_000000).toCharArray(), (a,b) -> a < b );
        //Arrays.sort("abcdefghijklmnopqrstuvwxyz".repeat(10_000000).toCharArray(), (a, b) -> a.equals('x'));
        Scramblies.scramble("scriptjavx","javasciprt");
        //hi

    }

}

