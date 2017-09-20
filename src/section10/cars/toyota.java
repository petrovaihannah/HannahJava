package section10.cars;

public class toyota implements masina {
    @Override
    public void porneste(){
        System.out.println("Toyota porneste usor din prima incarcare");
    }
    @Override
    public void opreste(){
        System.out.println("Toyota opreste la timp.");
    }
    @Override
    public void acelereaza(){
    }
    @Override
    public void franeaza(){
    }
    @Override
    public void schimbaDirectia() {
    }
}
