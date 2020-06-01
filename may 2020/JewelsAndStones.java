import java.util.HashSet;

public class JewelsAndStones {
    public int numJewelsInStones(String J, String S) {
        HashSet<Character> jewels = new HashSet<>();
        for (int i = 0; i < J.length(); i++) {
            jewels.add(J.charAt(i));
        }
        int sum = 0;
        for (int i = 0; i < S.length(); i++) {
            if (jewels.contains(S.charAt(i)))
                sum++;
        }
        return sum;
    }
}

