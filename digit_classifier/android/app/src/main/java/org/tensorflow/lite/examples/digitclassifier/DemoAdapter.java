package org.tensorflow.lite.examples.digitclassifier;

import java.util.ArrayList;

public class DemoAdapter {

    private ArrayList<String> myArray = new ArrayList<>();

    public static void main(String[] args) {



    }

    /**
     * This method clears {@link #myArray} this <code>ArrayList</code>
     * <ul>
     *     <li>Sourav</li>
     *     <li>Avinaba</li>
     * </ul>
     * <hr>
     * @param a input a random integer
     * @return whether the array was cleared
     */
    boolean clearArray(int a) {
        myArray.add("Hey boy");
        return false;
    }
}
