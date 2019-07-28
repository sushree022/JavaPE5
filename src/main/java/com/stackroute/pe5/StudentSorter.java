package com.stackroute.pe5;

import java.util.Comparator;

public class StudentSorter implements Comparator<Student>{
    @Override
    public int compare(Student stuDetails1, Student stuDetails2)
    {
        if(stuDetails1.getStudentAge()==stuDetails2.getStudentAge())
        {
            if(stuDetails1.getStudentName().compareTo(stuDetails2.getStudentName())==0) {
                return stuDetails1.getStudentID().compareTo(stuDetails2.getStudentID());
            }
            else return stuDetails1.getStudentName().compareTo(stuDetails2.getStudentName());
        }
        else if(stuDetails1.getStudentAge()>stuDetails2.getStudentAge())
        {
            return -1;
        }
        else return 1;
    }
}
