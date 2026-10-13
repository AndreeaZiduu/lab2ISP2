package org.example;

import java.util.Comparator;

public class ByNameAndGroupComparator implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        int cmpGrupa = o1.getGrupa().compareTo(o2.getGrupa());
        if (cmpGrupa != 0){
            return cmpGrupa;
        }
        int cmpNume = o1.getNume().compareTo(o2.getNume());
        if (cmpNume != 0){
            return cmpNume;
        }
        return o1.getPrenume().compareTo(o2.getPrenume());
    }
}
