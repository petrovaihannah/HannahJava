package lesson9;

public class dog extends animal{
    private int age;
    private String name;
    private String color;



    public dog (String nameC, int year, String skin){
        age = year;
        name = nameC;
        color = skin;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int returnAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String returnName() {
        return name;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String returnColor() {
        return color;
    }

    public void eat() {
        System.out.println("eating ...");
    }

    public void sleep() {
        System.out.println("Sleep's ....");
    }

    public void makenoise() {
        System.out.println("Ham Ham Ham!!!");
    }

    public void present() {
        System.out.println("My dog's name " + name);
        System.out.println(name + " is " + age + " ani ");
        System.out.println("he is color " + color);
    }
}
