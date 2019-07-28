package com.stackroute.pe5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class MainTest {
    public  ArrayList<Student> sortingStudentDetails(ArrayList<Student> studentDetails)
    {
        Comparator<Student> studentDetailsComparator= new StudentSorter();
        Collections.sort(studentDetails,studentDetailsComparator);
        return studentDetails;
    }
}
