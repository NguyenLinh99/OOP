package tuan2;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentManagement {
//    private ArrayList<Student> arrStudent = new ArrayList<Student>();
    private Student arrStudent[] = new Student[100];
    private int arrSize = 0;

    private void listStudent(Student sv){
        arrStudent[arrSize] = sv;
        arrSize++;
    }

    //  public static StudentManagement sv = new StudentManagement();
    private void inputStudent() {
        Student sv1 = new Student();

        Student sv2 = new Student("17056812", "Thanh", "mt@gmal.com");

        Student sv3 = new Student("17020658", "Phuong", "vnu@gmail.com");

        Student sv4 = new Student(sv1);

        listStudent(sv1);
        listStudent(sv2);
        listStudent(sv3);
        listStudent(sv4);

//        arrStudent.add(sv1);
//        arrStudent.add(sv2);
//        arrStudent.add(sv3);
//        arrStudent.add(sv4);
    }

    private boolean sameGroup(Student st1, Student st2) {
        if (st1.getGroup().equals(st2.getGroup()))
            return true;
        else return false;
    }

    public void studentsByGroup() {
        StudentManagement sv = new StudentManagement();
        int[] arr = new int[]{0, 0, 0, 0};
        for (int i = 0; i < arrSize; i++) {
            if (arr[i] == 0) {
                System.out.println("Cac sinh vien thuoc lop " + arrStudent[i].getGroup());
                for (int j = i + 1; j < arrSize; j++) {
                    if (sv.sameGroup(arrStudent[i], arrStudent[j])) {
                      //  arrStudent.get(i).getInf();
                        System.out.println(arrStudent[i].getName());
                        System.out.println(arrStudent[j].getName());
                      //  arrStudent.get(j).getInf();
                        arr[j] = 1;
                    }
                }
            }
        }
    }

    public void removeStudent(String id) {
        int i = 0;
        while (i < arrSize && arrStudent[i].getId().equals(id)!= true) {
            i++;
        }
//        arrStudent.remove(i);
        if(i == arrSize){
            System.out.println("Khong co sinh vien can xoa");
        }
        else {
            for (int j = i; j < arrSize; j++) {
                arrStudent[j] = arrStudent[j + 1];

            }

            arrSize--;

            System.out.println("Danh sach sinh vien sau khi xoa: ");
            for (int j = 0; j < arrSize; j++) {
                System.out.println(arrStudent[j].getInf());
                System.out.println();
            }
        }


    }

    public static void main(String[] args) {

//        Scanner sc = new Scanner(System.in);
//
//        sv.studentsByGroup();
//
//        String id;
//
//        id = sc.nextLine();
//
//        sv.removeStudent(id);

        StudentManagement sv = new StudentManagement();
        sv.inputStudent();
        System.out.println("Danh sach sinh vien: ");
        for (int i = 0; i < sv.arrSize; i++) {
            System.out.println(sv.arrStudent[i].getInf());
            System.out.println();
        }

        System.out.println("Danh sach sinh vien theo lop: ");

        sv.studentsByGroup();

        sv.removeStudent("000");

    }
}

