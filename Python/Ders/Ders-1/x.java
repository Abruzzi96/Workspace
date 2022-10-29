public class x {
    public static void main(String[] args) {
        String aa = "GinaaaaaaaaaaaaaaaPPPPPProtttttijayi";
        char[] ca = aa.toCharArray();
        char lastchar = 0;
        int maxcount = 0;
        int count = 0;
        char longestContinuousCharacter = 0;
        for (char ch : ca) {
            if (ch == lastchar) {
                count++;
                if (count > maxcount) {
                    maxcount = count;
                    longestContinuousCharacter = ch;
                }
            } // if
            else {
                lastchar = ch;
                count = 1;
            } // else

        } // for
        System.out.println("longestContinuousCharacter => " + longestContinuousCharacter);
        System.out.println("maxcount => " + maxcount);

    }// main
}