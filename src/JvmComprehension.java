public class JvmComprehension {
    /*
    Подсистема загрузчиков классов (ClassLoader) подгружает класс JvmComprehension,
    информация о загруженном классе хранится в metaspace
    */

    public static void main(String[] args) {
        /*
        1 - В стэке (Stack Memory) создается фрейм main(),
        в фрейме main() создается переменная примитивного типа int - "i",
        переменной "i" присваивается значение "1"
        */
        int i = 1;
        /*
        2 - В куче (Heap) создается объект Object,
        в стэке создается ссылка "o" на объект в куче
        */
        Object o = new Object();
        /*
        3 - В куче (Heap) создается объект Integer со значением "2",
        в стэке в фрейме main() создается ссылка "ii" на объект в куче
        */
        Integer ii = 2;
        /*
        4 - В стэке (Stack Memory) создается фрейм printAll(),
        в него передается ссылка "o" на объект Object в куче,
        передается переменная "i", передается ссылка "ii" на объект Integer в куче (heap)
        */
        printAll(o, i, ii);
        /*
        7 - В стэке (Stack Memory) в фрейм println() передается ссылка на объект типа String со значением "finished",
        созданный в куче (Heap)
        */
        System.out.println("finished");
        // Отрабатывает сборщик мусора (Garbage Collector), в процессе выполнения программы.
    }
    private static void printAll(Object o, int i, Integer ii) {
        /*
        5 - В куче (Heap) создается объект Integer со значением "700",
        в стэке (Stack Memory) во фрейме printAll() создается ссылка "uselessVar" на объект в куче
        */
        Integer uselessVar = 700;
        /*
        6 - В стэке (Stack Memory) создается фрейм println(),
        в него передаются ссылки "o" на Object в куче (Heap),
        "i" на int во фрейме main() в стэке (Stack Memory),
        "ii" на Integer в куче (Heap),
        в стэке (Stack Memory) создается фрейм toString()
        */
        System.out.println(o.toString() + i + ii);
    }
}