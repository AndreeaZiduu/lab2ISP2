package org.example;

import java.util.Comparator;

public class ByRestanteComparator implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        if(o1.nrRestante() == o2.nrRestante()) {
            return 0;
        }
        return o1.nrRestante() > o2.nrRestante() ? 1 : -1; //crescator
    }
}
