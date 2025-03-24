package ex2;

import java.util.Arrays;
import java.util.List;

interface DistinctionDecider {

    List<String> science = Arrays.asList("Comp.Sc.", "Physics");
    List<String> arts = Arrays.asList("History", "English");

     void evaluateDistinction(Student student);
}
