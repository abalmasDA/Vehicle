/**
 * Використовуючи IntelliJ IDEA, створіть проект. Потрібно: Створити клас Vehicle. У тілі класу створіть поля: координати та параметри суден (ціна, швидкість, рік випуску).
 * Створіть 3 похідних класи Plane, Саг та Ship. Для класу Plane має бути визначена висота та кількість пасажирів. Для класу Ship – кількість пасажирів та порт приписки.
 * Написати програму, яка виводить на екран інформацію про кожен засіб пересування.
 */


public class Main {

    public static void main(String[] args) {
        Plane boing747 = new Plane("Boing747", 74534.4522, 589234.84187, 800, 15000000, 2010, 10000, 234);
        Ship titanic = new Ship("Titanic", 414357.0, 495648.8, 42, 7500000, 1912, "Southampton", 2240);
        Car mercedesBenzG3a = new Car("MercedesBenzG3a", 4165165.4564, 4564.4578, 270, 120000, 2020);

        System.out.println(boing747);
        System.out.println(titanic);
        System.out.println(mercedesBenzG3a);


    }
}
