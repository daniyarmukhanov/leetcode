import java.util.*;

public class SortCharactersByFrequency {
    public String frequencySort(String s) {
        Map<Character, Integer> charMap = new HashMap<>();
        int freq = 0;
        for (char c : s.toCharArray()) {
            if (charMap.containsKey(c)) {
                freq = charMap.get(c);
                charMap.put(c, freq + 1);
            } else {
                charMap.put(c, 1);
            }
        }
        List<Map.Entry<Character, Integer>> list = new LinkedList<>(charMap.entrySet());
        list.sort((o1, o2) -> o2.getValue().compareTo(o1.getValue()));
        String result = "";
        for (Map.Entry<Character, Integer> entry : list) {
            for (int i = 0; i < entry.getValue(); i++) {
                result += entry.getKey();
            }
        }
        return result;
    }

}
