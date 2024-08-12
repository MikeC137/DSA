import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Runner {
    public static void main(String[] args) {
        List<Laptop> laps = new ArrayList<>();
        laps.add(new Laptop("Dell", 16, 800));
        laps.add(new Laptop("Apple", 8, 1200));
        laps.add(new Laptop("Acer", 12, 700));

        // We can instantiate the Comparator interface by creating an anonymous inner
        // class
        Comparator<Laptop> compareByPrice = new Comparator<Laptop>() {
            public int compare(Laptop l1, Laptop l2) {
                if (l1.getPrice() > l2.getPrice()) {
                    return 1;
                } else if (l1.getPrice() < l2.getPrice()) {
                    return -1;
                }
                return 0;
            }
        };

        Collections.sort(laps, compareByPrice);

        for (Laptop l : laps) {
            System.out.println(l);
        }
    }
}
