package com.stackroute.pe5;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class MainTestTest {
    MainTest mainTest;

    /* This methods runs, before running any one of the test case .
    It is used to initialize the required variables
 */
    @Before
    public void setup() {
//        arrange
        mainTest = new MainTest();
    }

    /* This method runs, after running all the test cases
       It is used to clear the initialized variables
    */
    @After
    public void teardown() {
        mainTest = null;
    }

    @Test
    public void givenStudentArrayListShouldReturnSortedArrayListAccordingToAge() {
//        act
        ArrayList<Student> studentDeatils = new ArrayList<Student>();
        Student student1 = new Student("5", "Dipti", 22);
        Student student2 = new Student("3", "Siddharth", 26);
        Student student3 = new Student("4", "Tapan", 25);
        Student student4 = new Student("1", "Geet", 23);
        Student student5 = new Student("2", "Pratham", 24);
        studentDeatils.add(student1);
        studentDeatils.add(student2);
        studentDeatils.add(student3);
        studentDeatils.add(student4);
        studentDeatils.add(student5);
        ArrayList<Student> actualResult = mainTest.sortingStudentDetails(studentDeatils);
        ArrayList<Student> expectedResult = new ArrayList<Student>();
        expectedResult.add(student2);
        expectedResult.add(student3);
        expectedResult.add(student5);
        expectedResult.add(student4);
        expectedResult.add(student1);
//        assert
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void givenStudentArrayListHavingSameAgeShouldReturnSortedArrayListAccordingToName() {
//        act
        ArrayList<Student> studentDeatils = new ArrayList<Student>();
        Student student1 = new Student("5", "Dipti", 22);
        Student student2 = new Student("3", "Siddharth", 26);
        Student student3 = new Student("4", "Tapan", 25);
        Student student4 = new Student("1", "Geet", 23);
        Student student5 = new Student("2", "Pratham", 22);
        studentDeatils.add(student1);
        studentDeatils.add(student2);
        studentDeatils.add(student3);
        studentDeatils.add(student4);
        studentDeatils.add(student5);
        ArrayList<Student> actualResult = mainTest.sortingStudentDetails(studentDeatils);
        ArrayList<Student> expectedResult = new ArrayList<Student>();
        expectedResult.add(student2);
        expectedResult.add(student3);
        expectedResult.add(student4);
        expectedResult.add(student1);
        expectedResult.add(student5);
//        assert
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void givenStudentArrayListHavingSameNameAndAgeShouldReturnSortedArrayListAccordingToID() {
//        act
        ArrayList<Student> studentDeatils = new ArrayList<Student>();
        Student student1 = new Student("5", "Dipti", 22);
        Student student2 = new Student("3", "Geet", 26);
        Student student3 = new Student("4", "Tapan", 25);
        Student student4 = new Student("1", "Geet", 26);
        Student student5 = new Student("2", "Pratham", 22);
        studentDeatils.add(student1);
        studentDeatils.add(student2);
        studentDeatils.add(student3);
        studentDeatils.add(student4);
        studentDeatils.add(student5);
        ArrayList<Student> actualResult = mainTest.sortingStudentDetails(studentDeatils);
        ArrayList<Student> expectedResult = new ArrayList<Student>();
        expectedResult.add(student4);
        expectedResult.add(student2);
        expectedResult.add(student3);
        expectedResult.add(student1);
        expectedResult.add(student5);
//        assert
        assertEquals(expectedResult, actualResult);
    }

}