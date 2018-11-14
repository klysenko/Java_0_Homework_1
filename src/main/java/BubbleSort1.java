public class BubbleSort1 {
    public static void main(String[] args) {
        int[] numbers = {10, 5, 67, 100, 8, 9, 5, 0,-200};


        for (int j = 0; (j < numbers.length); j++) {
            for (int i = 0; i < (numbers.length - 1); i++) {
                int min = numbers[i];
                int max = numbers[i + 1];
                if (min > max) {
                    numbers[i] = max;
                    numbers[i + 1] = min;
                }
            }

        }
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }

    }
}
