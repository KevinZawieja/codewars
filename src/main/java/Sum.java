public class Sum
{
    public static int GetSum(int a, int b)
    {
        //Good luck!
        int ergebnis = 0;
        if (a == b) {
            return b;
        }
        while (a != b){
            if (a < b) {
                ergebnis += a;
                a++;
            } else {
                ergebnis += a;
                a--;
            }
        }
        return ergebnis+b;


    }

    public static void main(String[] args) {
        System.out.println(GetSum(-3, 5));
    }
}