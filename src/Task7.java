public class Task7 {

    // Этот метод принимает на вход одно целое число (n)
    // и возвращает (return) результат типа long (т.к. факториал быстро растет)
    public static long calculateFactorial(int n) {
        // Проверка на случай, если передали отрицательное число
        if (n < 0) {
            System.out.println("Факториал для отрицательных чисел не определен.");
            return 0; // Возвращаем 0 как признак ошибки
        }

        long result = 1; // Начинаем с 1, а не с 0, т.к. это произведение

        // Используем цикл для умножения всех чисел от 1 до n
        for (int i = 1; i <= n; i++) {
            result = result * i;
        }

        // Возвращаем посчитанный результат
        return result;
    }


    // --- ОСНОВНОЙ МЕТОД ДЛЯ ЗАПУСКА И ПРОВЕРКИ ---
    public static void main(String[] args) {
        System.out.println("Проверяем работу метода для вычисления факториала.");

        // Число, для которого мы хотим посчитать факториал
        int numberToTest = 5;

        // Вызываем наш метод calculateFactorial и передаем ему наше число
        long factorialResult = calculateFactorial(numberToTest);

        // Выводим результат
        System.out.println("Факториал числа " + numberToTest + "! равен: " + factorialResult);

        // Проверим еще одно число для надежности
        int numberToTest2 = 7;
        System.out.println("Факториал числа " + numberToTest2 + "! равен: " + calculateFactorial(numberToTest2));
    }
}