import java.util.Scanner; // Импортируем класс для чтения с клавиатуры

public class Task4 {
    public static void main(String[] args) {
        // Создаем объект Scanner для чтения ввода пользователя
        Scanner scanner = new Scanner(System.in);

        // Спрашиваем размер массива
        System.out.print("Введите количество элементов в массиве: ");
        int size = scanner.nextInt();

        // Создаем массив указанного размера
        int[] numbers = new int[size];

        // Заполняем массив с клавиатуры с помощью цикла while
        System.out.println("Введите " + size + " элементов массива:");
        int i = 0;
        while (i < size) {
            numbers[i] = scanner.nextInt();
            i++;
        }

        // --- Расчеты с помощью цикла do-while ---
        // (Как вариант, можно было и while использовать, как выше)

        // Инициализируем переменные для подсчетов
        int sum = 0;

        // Важно: для поиска min/max нужно взять первый элемент массива за основу
        // Проверяем, что массив не пустой, чтобы избежать ошибки
        if (numbers.length > 0) {
            int min = numbers[0];
            int max = numbers[0];

            int j = 0;
            do {
                int currentNumber = numbers[j];

                // Сумма
                sum += currentNumber;

                // Поиск минимума
                if (currentNumber < min) {
                    min = currentNumber;
                }

                // Поиск максимума
                if (currentNumber > max) {
                    max = currentNumber;
                }
                j++;
            } while (j < numbers.length);

            // Выводим результат
            System.out.println("Сумма элементов: " + sum);
            System.out.println("Минимальный элемент: " + min);
            System.out.println("Максимальный элемент: " + max);
        } else {
            System.out.println("Массив пуст, вычисления невозможны.");
        }
    }
}