public class FirstUniqueCharacter {
    public int firstUniqChar(String s) {
        int index = Integer.MAX_VALUE;
        int tempIndex;
        for (char c = 'a'; c <= 'z'; c++) {
            tempIndex = s.indexOf(c);
            if (tempIndex != -1 && tempIndex == s.lastIndexOf(c))
                index = Math.min(index, tempIndex);
        }
        if (index == Integer.MAX_VALUE) index = -1;
        return index;
    }
}
