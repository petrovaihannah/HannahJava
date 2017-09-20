package section10.cars;

public class dacia implements masina {
    @Override
    public void porneste(){
        System.out.println("Dacia porneste incet si greu dupa 3 incercari");
    }
    @Override
    public void opreste(){
        System.out.println("Dacia opreste brusc.");
    }
    @Override
    public void acelereaza(){
    }
    @Override
    public void franeaza(){
    }
    @Override
    public void schimbaDirectia(){
    }
}
