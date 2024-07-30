import java.util.ArrayList;
import java.util.Collections;

public static void uniquenumberandsort(ArrayList<Integer> numbers) {
        Collections.sort(numbers);
        System.out.println(numbers + " day so cu da duoc sap xep");

        ArrayList<Integer> newnumbers = new ArrayList<>();
        int i = 0;

        while (i < numbers.size()) {
            int number = numbers.get(i);
            newnumbers.add(number);
            while (i < numbers.size() && numbers.get(i) == number) {
                i++;
            }
        }

        System.out.println(newnumbers + " day so moi rut gon");
    }

def	numbers = [1, 5, 7, 5, 4, 3, 4, 4]
uniquenumberandsort(numbers)