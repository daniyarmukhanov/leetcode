public class RansomNote {
    public boolean canConstruct(String ransomNote, String magazine) {
        if (magazine.length() < ransomNote.length()) return false;
        int[] lettersCount = new int[26];
        for (char c : magazine.toCharArray()) {
            lettersCount[c - 97]++;
        }
        for (char c : ransomNote.toCharArray()) {
            lettersCount[c - 97]--;
            if (lettersCount[c - 97] < 0)
                return false;
        }
        return true;
    }
}
