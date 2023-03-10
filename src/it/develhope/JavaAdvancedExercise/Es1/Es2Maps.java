package it.develhope.JavaAdvancedExercise.Es1;

import java.util.HashMap;
import java.util.Map;

public class Es2Maps {public static void main(String[] args) {
    exercise1();
    exercise2();
    exercise3();
}

    /**
     * 1: Follow the steps below
     */
    private static void exercise1() {
        // 1a. Create a map of integers to strings
        Map<Integer, String> myFirstMap = new HashMap<>();

        // 1b. Add 3 elements to the map .put
        myFirstMap.put( 21,"Gianpaolo");
        myFirstMap.put( 24 , "Francesca");
        myFirstMap.put( 32, "Federico");
        // 1c. Print the map
        System.out.println(myFirstMap);
        // 1d. Access an element in the map with .get
        System.out.println(myFirstMap.get(21));

        // 1e. Remove an element from the map .remove
        myFirstMap.remove( 21, "Gianpaolo");
        // 1f. Print the map again to confirm the element was removed
        System.out.println(myFirstMap);
    }

    /**
     *  2: Follow the instructions in the code
     */
    private static void exercise2() {
        Map<String, Double> menuCostsInEuro = new HashMap<>();

        menuCostsInEuro.put("Fries", 3.50);
        menuCostsInEuro.put("Pizza", 11.80);
        menuCostsInEuro.put("Burger", 8.50);

        String mostExpensiveMenuItemName = null;
        double mostExpensiveCost = 0;

        // 2a. Loop over the map entries with menuCostsInEuro.entrySet()
        //     and set out the most expensive items name
        //     use for(Map.Entry<String, Double> entry : menuCostsInEuro.entrySet()) and entry.getKey and entry.getValue
        //     to do so

        // Your code

        for(Map.Entry<String, Double> entry : menuCostsInEuro.entrySet()){
            if (entry.getValue()> mostExpensiveCost){
                mostExpensiveCost = entry.getValue();
                mostExpensiveMenuItemName = entry.getKey();
            }
        }


        if (mostExpensiveMenuItemName.equals("Pizza")) {
            System.out.println("2a. Correct!");
        } else {
            System.out.println("2a. Incorrect!");
        }


        /*for(Map.Entry<String, Double> entry : menuCostsInEuro.entrySet()){
            entry.getKey();
            entry.getValue();
            for (Double maxNum : menuCostsInEuro.values()) {
                mostExpensiveCost = Math.max(mostExpensiveCost , maxNum);

            }
            mostExpensiveMenuItemName = entry.getKey();
            break;
        }*/

    }

    /**
     * 3: Follow the instructions in the code
     */
    private static void exercise3() {
        Map<String, Integer> fruitWeights = new HashMap<>();

        fruitWeights.put("Apple", 5);
        fruitWeights.put("Banana", 3);
        fruitWeights.put("Orange", 8);
        fruitWeights.put("Kiwi", 1);
        fruitWeights.put("Mango", 4);
        fruitWeights.put("Grapes", 8);
        fruitWeights.put("Peach", 5);
        fruitWeights.put("Pineapple", 1);

        int totalWeight = 0;
        // 3a. Use a for loop with fruitWeights.values() and sum up the total weight

        for (Map.Entry<String, Integer> entry : fruitWeights.entrySet()) {
            totalWeight += entry.getValue();

        }

        // Your code

        if (totalWeight == fruitWeights.values().stream().mapToInt(Integer::intValue).sum()) {
            System.out.println("3. Correct!");
        } else {
            System.out.println("3. Incorrect!");
        }
    }
}
