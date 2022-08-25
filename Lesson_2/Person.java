public class Person {

    String gender = "Мужской";
    String name = "Данила";
    float height = 184.6f;
    float weight = 70.5f;
    int age = 25;

    void go() {
        System.out.println("Идёт");
    }

    void sit() {
        System.out.println("Сидит");
    }

    void run() {
        System.out.println("Бежит");
    }

    String talk() {
        return "Привет";
    }

    boolean learnJava() {
        return true;
    }
}