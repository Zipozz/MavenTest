public class Main {
    public static void main(String[] args) {
        BonusService service = new BonusService();

        // Данные
        long amount = 1000_60;
        boolean registered = true;
        long expected = 30;

        // Метод
        long actual = service.calculate(amount, registered);

        // Проверка
        // если true - то PASS
        // если false - то FAIL
        boolean passed = expected == actual;

        //  Вывод результата
        System.out.println(passed);
    }
}
