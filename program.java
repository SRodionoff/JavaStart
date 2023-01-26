// Задача 1

// public class program {
// public static void main(String[] args) {
// int[] arr = new int[20];
// int max = 0;
// int min = 300;
// for (int i = 0; i < arr.length; i++) {
// arr[i] = ((int) (Math.random() * 300));
// System.out.println(arr[i]);
// max = Math.max(max, arr[i]);
// min = Math.min(min, arr[i]);
// }
// System.out.println("Это максимум: " + max + ", а это минимум: " + min);
// }
// }

// Задача 2

// import java.util.Arrays;
// public class program {
// public static void main(String[] args) {
// int[] arr = { 65, 17, 25, 41, 31 };
// boolean isSorted = false;
// int buf;
// while (!isSorted) {
// isSorted = true;
// for (int i = 0; i < arr.length - 1; i++) {
// if (arr[i] > arr[i + 1]) {
// isSorted = false;
// buf = arr[i];
// arr[i] = arr[i + 1];
// arr[i + 1] = buf;
// }
// }
// }
// System.out.println(Arrays.toString(arr));
// }
// }

// Задача 3

// public class program {
// public static void main(String[] args) {
// System.out.println("Простые числа в промежутке [-17, 219]: ");
// for (int i = 2; i <= 100; i++) {
// if (isPrime(i)) {
// System.out.print(i + " ");
// }
// }
// }

// public static boolean isPrime(int x) {
// if (x < 2)
// return false;
// int temp;
// for (int i = 2; i <= x / 2; i++) {
// temp = x % i;
// if (temp == 0) {
// return false;
// }
// }
// return true;
// }
// }