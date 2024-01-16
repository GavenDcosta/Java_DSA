package Basics;

import java.util.ArrayList;
import java.util.*;

public class DynamicArrays {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(5);
        list.add(3);
        list.add(69);
        list.add(23);

        System.out.println(list.size());

        System.out.println();

        System.out.println(list.contains(3));

        System.out.println();

        Iterator<Integer> iter = list.iterator();

        while(iter.hasNext()){
            System.out.print(iter.next() + " ");
        }
    }
}
