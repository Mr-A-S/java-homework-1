public class Task3 {
    public static void main(String[] args) {
        // 1. Массив создается с помощью инициализации
        int[] numbers = {15, 8, 22, 10, 4};

        // 2. Считаем сумму элементов
        int sum = 0;
        // Используем цикл for для прохода по каждому элементу массива
        for (int i = 0; i < numbers.length; i++) {
            sum = sum + numbers[i]; // или sum += numbers[i];
        }

        // 3. Считаем среднее арифметическое
        double average = (double) sum / numbers.length;

        // 4. Выводим результат на экран
        System.out.println("Массив: " + java.util.Arrays.toString(numbers));
        System.out.println("Сумма элементов: " + sum);
        System.out.println("Среднее арифметическое: " + average);
    }
}