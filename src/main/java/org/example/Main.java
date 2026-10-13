package org.example;

import java.util.*;
import java.util.stream.IntStream;

public class Main {
    static void main() {
        //ex 2.7.1
        System.out.println("ex 2.7.1");
        List<Integer> x = new ArrayList();
        List<Integer> y = new ArrayList();
        List<Integer> xPlusY = new ArrayList(); //a
        Set<Integer> zSet = new TreeSet(); //b
        List<Integer> xMinusY = new ArrayList();//c
        int p = 4;
        List<Integer> xPlusYLimitedByP = new ArrayList(); //d

        Random rand = new Random();
        IntStream.range(0,5).forEach(i -> x.add(rand.nextInt(10)));
        IntStream.range(0,7).forEach(i-> y.add(rand.nextInt(10)));

        Collections.sort(x);
        Collections.sort(y);

        System.out.println("lista x: " + x);
        System.out.println("lista y: "+ y);

        //a
        xPlusY.addAll(x);
        xPlusY.addAll(y);
        Collections.sort(xPlusY);
        System.out.println("lista xPlusY: "+ xPlusY);

        //b
        zSet.addAll(x);
        zSet.retainAll(y);
        System.out.println("lista zSet: "+ zSet);

        //c
        xMinusY.addAll(x);
        xMinusY.removeAll(y);
        System.out.println("lista xMinusY: " + xMinusY);

        //d
        xPlusYLimitedByP.addAll(x);
        xPlusYLimitedByP.addAll(y);

        Iterator<Integer> it = xPlusYLimitedByP.iterator();
        while (it.hasNext()) {
            Integer i = it.next();
            if ( i>p ) {
                it.remove();
            }
        }
        System.out.println("lista xPlusYLimitedByP: " + xPlusYLimitedByP);
        System.out.println();

        //ex 2.7.2

    }
}
