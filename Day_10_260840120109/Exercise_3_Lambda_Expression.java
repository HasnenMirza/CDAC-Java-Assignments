import java.time.LocalDate;
import java.util.Arrays;
import java.util.Random;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.IntStream;

public class Exercise_3_Lambda_Expression {
    public static void main(String[] args) {
        
        // 1. Consumer<T> - Accepts a String array and sorts it in place (returns void)
        Consumer<String[]> sortArray = arr -> Arrays.sort(arr);
        
        String[] fruits = {"Banana", "Apple", "Mango", "Cherry"};
        sortArray.accept(fruits);
        System.out.println("1. Sorted Array (Consumer): " + Arrays.toString(fruits));


        // 2. Function<T, R> - Takes int[] array and returns Integer max value
        Function<int[], Integer> findMax = arr -> Arrays.stream(arr).max().orElseThrow(null);
        
        int[] numbers = {15, 42, 7, 89, 23};
        System.out.println("2. Largest Number (Function): " + findMax.apply(numbers));


        // 3. Function<T, R> - Takes int[] array and returns Integer min value
        Function<int[], Integer> findMin = arr -> Arrays.stream(arr).min().orElseThrow(null);
        
        System.out.println("3. Smallest Number (Function): " + findMin.apply(numbers));


        // 4. Supplier<T> - Takes no inputs and supplies a 3-digit Integer (100-999)
        Supplier<Integer> generate3Digit = () -> 100 + new Random().nextInt(900);
        
        System.out.println("4. Random 3-Digit Number (Supplier): " + generate3Digit.get());


        // 5. Function<T, R> - Takes int[] array and returns the reversed int[] array
        Function<int[], int[]> reverseArray = arr -> 
            IntStream.range(0, arr.length)
                     .map(i -> arr[arr.length - 1 - i])
                     .toArray();
                     
        System.out.println("5. Reversed Array (Function): " + Arrays.toString(reverseArray.apply(numbers)));


        // 6. Consumer<T> - Consumes a LocalDate object and prints it
        Consumer<LocalDate> printCurrentDate = date -> System.out.println("6. Current Date (Consumer): " + date);
        
        printCurrentDate.accept(LocalDate.now());


        // 7. Predicate<T> - Takes Integer and evaluates to boolean (true/false)
        Predicate<Integer> isPrime = n -> n != null && n > 1 && IntStream.rangeClosed(2, (int) Math.sqrt(n))
                                                                         .noneMatch(i -> n % i == 0);
                                                     
        int testNumber = 29;
        System.out.println("7. Is " + testNumber + " Prime? (Predicate): " + isPrime.test(testNumber));


        // 8. BiFunction<T, U, R> - Takes 2 String inputs and returns concatenated String result
        BiFunction<String, String, String> concatenate = (s1, s2) -> s1 + s2;
        
        System.out.println("8. Concatenated Result (BiFunction): " + concatenate.apply("Hello, ", "World!"));
    }
}
