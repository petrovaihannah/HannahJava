package lesson9;

public class backyard {
    public static void main(String[] args) {
        dog jack = new dog("jack",7,"black");
        jack.eat();
        jack.sleep();
        jack.makenoise();
        jack.present();

        dog max = new dog("Max", 3, "pink");
        max.present();
        max.eat();
        max.sleep();
        max.makenoise();

        cat ming = new cat("ming", 4, "green");
        ming.present();
        ming.eat();
        ming.sleep();
        ming.makenoise();
    }
}
