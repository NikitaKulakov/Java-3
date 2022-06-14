/*Создать программу на языке Java для определения класса в некоторой предметной области. Описать свойства, конструктор,
методы геттеры/сеттеры, перекрыть метод toString() для вывода полной информации об объекте в отформатированном виде.
Вариант 10: Литература*/

public class prakt3 {
    public static void main(String[] attr) {
        list Dead_Souls = new list(1, "novel", "Dead_Souls", 1842, "none");
        Dead_Souls.setAuthor("Nikolai Gogol");
        Dead_Souls.setNumberOfPages(385);
        System.out.println(Dead_Souls);
        System.out.println(Dead_Souls.getType());
    }
}