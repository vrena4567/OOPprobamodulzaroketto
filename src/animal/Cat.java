package animal;

import java.util.ArrayList;
import java.util.List;

public class Cat implements Animal{

    List<String> becenevek = new ArrayList<>();

    @Override
    public void addBecenev(String becenev) {
        this.becenevek.add(becenev);
    }

    @Override
    public void addBecenev() {

    }

    @Override
    public void makeSound() {

    }

    @Override
    public void getAllBecenev() {

    }
}
