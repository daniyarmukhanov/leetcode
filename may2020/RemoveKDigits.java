import java.math.BigInteger;

public class RemoveKDigits {
    public String removeKdigits(String num, int k) {
        if (num.length() == k)
            return "0";
        int i = 0;
        boolean removed;
        while (i < k) {
            removed = false;
            for (int j = 0; j < num.length() - 1; j++) {
                if (num.charAt(j) > num.charAt(j + 1)) {
                    num = removeChar(num, j);
                    removed = true;
                    break;
                }
            }
            if (!removed)
                num = removeChar(num, num.length() - 1);
            i++;
        }
        return new BigInteger(num).toString();
    }

    public String removeChar(String str, int i) {
        return str.substring(0, i) + str.substring(i + 1);
    }
}
