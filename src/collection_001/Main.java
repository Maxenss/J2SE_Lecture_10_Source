package collection_001;

import java.util.ArrayList;

class Main {
    public static void main(String[]args){
        ArrayList<Integer> arrayListInteger =
                new ArrayList<>();

        arrayListInteger.add(10);
        arrayListInteger.add(20);
        arrayListInteger.add(30);

        System.out.println("Коллекция :");

        for (Integer element : arrayListInteger) {
            System.out.println(element);
        }
    }
}
