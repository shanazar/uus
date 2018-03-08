package Failitöötlus;

import java.util.Comparator;

import static java.util.Collections.reverse;

public class NimeVõrdleja implements Comparator<String> {

    @Override
    public int compare(String o1, String o2) {
        return o2.compareToIgnoreCase(o1);

    }

}
