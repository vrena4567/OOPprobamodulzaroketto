package text;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Text {
    public static void main(String[] args) {
        List<String> szovegek = new ArrayList<>(Arrays.asList(
                "Ez egy rövid szöveg.",
                "Ez egy hosszú szöveg, aminek a hossza több mint 25 karakter.",
                "Ez is egy rövid szöveg.",
                "Ez szintén egy hosszú szöveg, mert több, mint 25 karakter."
        ));

        stringShortening(szovegek);
    }
    public static void stringShortening(List<String> stringList){
        for (int i = 0; i < stringList.size(); i++) {
            if(stringList.get(i).length() >= 25) {
                System.out.println((stringList.get(i).substring(0,20) + "..."));
            } else {
                System.out.println(stringList.get(i));
            }
        }
    }
}
