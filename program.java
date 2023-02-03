
// Дан Deque состоящий из последовательности цифр.
// Необходимо проверить, что последовательность цифр является палиндромом
import java.util.*;

public class program {
   public static void main(String[] args) {
      Deque<Integer> deque = new ArrayDeque<>(Arrays.asList(1, 2, 3, 4, 5, 6, 6, 5, 4, 3, 2, 1));
      System.out.println(deque);
      System.out.println(checkOn(deque));
   }

   public static boolean checkOn(Deque<Integer> deque) {
      for (int i = 0; i < deque.size() / 2; i++) {
         if (deque.getFirst() == deque.getLast()) {
            deque.removeFirst();
            deque.removeLast();
         } else {
            return false;
         }
      }
      return true;
   }
}