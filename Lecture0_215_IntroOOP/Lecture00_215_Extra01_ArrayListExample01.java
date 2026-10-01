package Lecture0_215_IntroOOP;
import java.util.ArrayList ;
import java.util.Collections ; // for sorting

public class Lecture00_215_Extra01_ArrayListExample01 {
    public static void main(String[] args) {
        // define vacant ArrayList
        ArrayList<String> carModels = new ArrayList<>(); // String

        // Add elements
        carModels.add("BMW");
        carModels.add("Formula");
        carModels.add("Nissan");
        carModels.add(0, "Ford Mustang"); // add element at index 0
        System.out.println("List of Cars : " + carModels);

        // indexing element using get(pos)
        String getMustang = carModels.get(0);
        System.out.println("Getting Element : " + getMustang);

        // change value using set(pos , new_value)
        carModels.set(1, "Toyota"); // change index 1 to Toyota
        System.out.println("Car Models afted change index 1 : " + carModels);

        // check if element exist in ArrayList using .contains(find_element)
        System.out.println("Mustang appear in carModels : " + carModels.contains("Ford Mustang")) ;
        // remove element using size()
        System.out.println("Size of car Models : " + carModels.size());

        // clear element using clear()

        // looping in ArrayList
        for (int pos = 0; pos < carModels.size(); pos++) {
            System.out.println(carModels.get(pos) + " ");
        }
        for (String eachCar : carModels) {
            System.out.print(eachCar + "-");
        }

        // sorting ArrayList using sort()
        Collections.sort(carModels);
        System.out.println("Sorted ArrayList : " + carModels) ; // sort alphabetically

    }
}
