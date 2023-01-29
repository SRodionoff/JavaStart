import java.util.ArrayList;
import java.util.List;

public class program {
   public static void main(String[] args) {
      ArrayList<Integer> numbers = new ArrayList<Integer>();
      ArrayList<Integer> evenNumbers = new ArrayList<Integer>();
      numbers.add(19);
      numbers.add(32);
      numbers.add(11);
      numbers.add(15);
      numbers.add(52);
      numbers.add(68);
      numbers.add(7);
      numbers.add(8);
      numbers.add(9);
      numbers.add(111);
      System.out.println("Изначальный массив: " + numbers);
      System.out.println("Массив без четных чисел: " + removeEvenValue(numbers, evenNumbers));
      System.out.println("Минимальное число: " + minNum(numbers));
      System.out.println("Максимальное число: " + maxNum(numbers));
      System.out.println("Среднее арифметическое равно: " + getAverage(numbers));
   }

   // Нужно удалить из него четные числа
   public static List<Integer> removeEvenValue(ArrayList<Integer> numbers, ArrayList<Integer> evenNumbers) {
      for (int i = 0; i < numbers.size(); i++) {
         if (numbers.get(i) % 2 != 0) {
            evenNumbers.add(numbers.get(i));
         }
      }
      return new ArrayList<Integer>(evenNumbers);
   }

   // Найти минимальное значение
   public static Integer minNum(ArrayList<Integer> numbers) {
      int min = numbers.get(0);
      for (int i = 0; i < numbers.size(); i++) {
         if (numbers.get(i) < min) {
            min = numbers.get(i);
         }
      }
      return min;
   }

   // Найти максимальное значение
   public static Integer maxNum(ArrayList<Integer> numbers) {
      int max = numbers.get(0);
      for (int i = 0; i < numbers.size(); i++) {
         if (numbers.get(i) > max) {
            max = numbers.get(i);
         }
      }
      return max;
   }

   // Найти среднее значение
   public static Double getAverage(ArrayList<Integer> numbers) {
      double avg = 0;
      for (int i = 0; i < numbers.size(); i++) {
         avg += numbers.get(i);
      }
      avg /= numbers.size();
      return avg;
   }
}
