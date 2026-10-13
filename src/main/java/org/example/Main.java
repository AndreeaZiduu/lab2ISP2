package org.example;

import java.util.*;
import java.util.stream.IntStream;

public class Main {
    static void main() {
        //ex 2.7.1
        System.out.println("ex 2.7.1");
        System.out.println();

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
        List<Student> studenti = new ArrayList<>();
        studenti.add(new Student("Popescu", "Marian", "225_3"));
        studenti.add(new Student("Popescu", "Maria", "225_3"));
        studenti.add(new Student("Popa", "Marian", "225_3"));
        studenti.add(new Student("Bica", "Irina", "225_3"));
        studenti.add(new Student("Badea", "Ion", "225_1"));
        studenti.add(new Student("Cacoveanu", "Andreea", "225_1"));
        studenti.add(new Student("Onofrei", "Mircea", "225_1"));

        //a
        Random rands = new Random();
        for (Student s : studenti){
            for (int i=0; i<5; i++){
                s.adaugaNota(4+rands.nextInt(7));
            }
        }

        //b1
        Collections.sort(studenti, new ByNameAndGroupComparator());
        System.out.println("Ordonare alfabetica dupa grupe si nume: ");
        for (Object obj : studenti){
            System.out.println(obj);
        }

        List <Student> integralisti = new ArrayList<>();
        List <Student> restantieri = new ArrayList<>();

        for (Student s : studenti){
            if(s.esteIntegralist()){
                integralisti.add(s);
            } else {
                restantieri.add(s);
            }
        }

        //b2
        Collections.sort(integralisti, new ByGradesComparator());
        System.out.println("Integralisti ordonati desc dupa medie: ");
        for (Object obj : integralisti){
            System.out.println(obj);
        }

        //b3
        Collections.sort(restantieri, new ByRestanteComparator());
        System.out.println("Restantieri ordonati cresc dupa nr de restante: ");
        for (Object obj : restantieri){
            System.out.println(obj);
        }
    }
}
