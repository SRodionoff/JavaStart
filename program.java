import java.util.*;
import java.util.Collections;
import java.util.Map.Entry;

public class program {
   public static void main(final String[] args) {
      List<String> pbRaw = new ArrayList<>(Arrays.asList("Иван Иванов 88001122333",
            "Иван Курицин 88001662333",
            "Иван Курицин 88001112333",
            "Иван Незлобин 88001122432",
            "Сергей Потапов 88001112453",
            "Сергей Потапов 8800163214",
            "Сергей Курицин 8800142421",
            "Михаил Незлобин 880012343"));
      System.out.println(pbRaw);
      HashMap<String, List<String>> pb = fillPhoneBook(pbRaw);
      countNames(pb);

   }

   public static HashMap<String, List<String>> fillPhoneBook(List<String> pbin) {
      HashMap<String, List<String>> pbtmp = new HashMap<>();
      for (String item : pbin) {
         String key = item.substring(0, item.lastIndexOf(" ")).trim();
         String value = item.substring(item.lastIndexOf(" "), item.length()).trim();
         List<String> tmp = pbtmp.getOrDefault(key, new ArrayList<>());
         tmp.add(value);
         pbtmp.put(key, tmp);
      }
      return pbtmp;
   }

   public static void countNames(HashMap<String, List<String>> hm) {
      HashMap<String, Integer> tmp = new HashMap<>();
      LinkedHashMap<String, Integer> sortedMap = new LinkedHashMap<>();

      for (String key : hm.keySet()) {
         String newKey = key.substring(0, key.indexOf(" ")).trim();
         tmp.put(newKey, tmp.getOrDefault(newKey, 0) + 1);
      }

      ArrayList<Integer> list = new ArrayList<>(tmp.values());

      Collections.sort(list, Collections.reverseOrder());

      for (int num : list) {
         for (Entry<String, Integer> entry : tmp.entrySet()) {
            if (entry.getValue().equals(num) && num > 1) {
               sortedMap.put(entry.getKey(), num);
            }
         }
      }

      for (String key : sortedMap.keySet()) {
         System.out.println(key + " - " + sortedMap.get(key));
      }
   }

}
