package animal;

import java.util.ArrayList;
import java.util.List;

public interface Animal {
    List<String> becenevek = new ArrayList<>();

    void addBecenev(String becenev){
        this.becenevek.add(becenev);
    }
    void makeSound();
    void getAllBecenev();



}
