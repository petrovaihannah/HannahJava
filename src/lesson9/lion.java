package lesson9;

public class lion {
    int age;
    String name;
    String color;

    public lion(String nameC, int year, String skin) {
        age = year;
        name = nameC;
        color = skin;
    }

    public void eat() {
        System.out.println("eating ...");
    }

    public void sleep() {
        System.out.println("Sleep's ....");
    }

    public void makenoise() {
        System.out.println("roar roar roar!!!");
    }

    public void present() {
        System.out.println("My lion's name " + name);
        System.out.println(name + " is " + age + " ani ");
        System.out.println("she is color " + color);
    }
}
