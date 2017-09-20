package section10.cars;

public class sofer {
    public static void main(String[] args) {
        masina masina1 = new dacia();
        masina masina2 = new toyota();
        masina1.porneste();
        masina2.porneste();
        masina1.opreste();
        masina2.opreste();
    }
}
