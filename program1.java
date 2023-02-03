import java.util.*;

public class program1 {
   // Даны два Deque представляющие два неотрицательных целых числа. Цифры хранятся
   // в обратном порядке,
   // и каждый из их узлов содержит одну цифру.
   // Сложите два числа и верните сумму в виде связанного списка.
   public static void main(String[] args) {
      Deque<Integer> d1 = new ArrayDeque<>(Arrays.asList(1, 2, 3));
      Deque<Integer> d2 = new ArrayDeque<>(Arrays.asList(5, 4, 7));
      // Deque<Integer> dFinal = new ArrayDeque<>();
      // dFinalult [6,6,0,1]
      System.out.println("1-ый исходный массив: " + d1);
      System.out.println("2-ой исходный массив: " + d2);
      System.out.println("Итоговый массив: " + sum(d1, d2));
   }

   public static Deque<Integer> sum(Deque<Integer> d1, Deque<Integer> d2) {
      Deque<Integer> dFinal = new ArrayDeque<>();
      int sumEl = 0;
      int left = 0;
      int size = d1.size();
      for (int i = 0; i < size; i++) {
         sumEl = d1.removeFirst() + d2.removeFirst();
         if (sumEl > 9) {
            dFinal.addLast(sumEl % 10 + left);
            left = sumEl / 10;
         } else {
            dFinal.addLast(sumEl + left);
            left = 0;
         }
      }
      if (left > 0) {
         dFinal.addLast(left);
      }
      return dFinal;
   }
}
