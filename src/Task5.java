public class Task5 {

    // Все "входные" слова при запуске попадают в этот массив String[] args
    public static void main(String[] args) {

        System.out.println("Были переданы следующие аргументы командной строки:");

        // Проверяем, есть ли вообще аргументы
        if (args.length == 0) {
            System.out.println("Аргументы не были переданы.");
        } else {
            // Используем классический цикл for для вывода каждого аргумента
            for (int i = 0; i < args.length; i++) {
                // Выводим номер аргумента (i + 1) и сам аргумент (args[i])
                System.out.println("Аргумент №" + (i + 1) + ": " + args[i]);
            }
        }
    }
}