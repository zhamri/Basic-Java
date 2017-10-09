package ArrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class TestStudentArrayList {

    private Student[] arrayStudent;
    private int numStudents;
    private List studentList;

    public void myMain() {

        studentList = new ArrayList();
        System.out.println("Size of ArrayList at creation: " + studentList.size());

        //Add some elements to it
        addStudent("1111", "Rahman", 1.0);
        addStudent("2222", "Razak", 2.0);
        addStudent("3333", "Hussein", 3.0);
        addStudent("4444", "Mahathir", 4.0);
        addStudent("5555", "Abdullah", 5.0);

        System.out.println("Size of ArrayList after adding elements: " + studentList.size());
        displayAll();
        studentList.remove(1);
        System.out.println("\nSize of ArrayList after deleting element: " + studentList.size());
        displayAll();
    }

    public void addStudent(String matrix, String name, double cgpa) {
        Student student = new Student();
        student.setMatrix(matrix);
        student.setName(name);
        student.setCgpa(cgpa);
        studentList.add(student);
    }

    public void displayAll() {
        System.out.println("");
        numStudents = studentList.size();
        arrayStudent = new Student[numStudents];
        Iterator studentListIterator = studentList.iterator();
        for (int i = 0; i < arrayStudent.length; i++) {
            arrayStudent[i] = (Student) studentListIterator.next();
            System.out.println(arrayStudent[i].getMatrix() + " "
                    + arrayStudent[i].getName() + "\t "
                    + arrayStudent[i].getCgpa());
        }
    }

    public static void main(String[] args) {
        TestStudentArrayList test = new TestStudentArrayList();
        test.myMain();
    }
}
