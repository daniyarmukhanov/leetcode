package june2020;

public class IsSubsequence {
    public boolean isSubsequence(String s, String t) {
        int index;
        for (char sChar : s.toCharArray()) {
            index = t.indexOf(sChar);
            if (index < 0) {
                return false;
            }
            t = t.substring(index + 1);
        }
        return true;
    }
}
