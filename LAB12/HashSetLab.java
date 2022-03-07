package LAB12;


import java.util.HashSet;
import java.util.Scanner;

class Student{
    private int studentId;
    private String studentName;
    private int num;

    Student(int studentId,String studentName, int num){
        setStudentId(studentId);
        setStudentName(studentName);
        setNum(num);
    }

    public void setNum(int num) {
        this.num = num;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    @Override
    public int hashCode(){
        int hashCode = 0;
        hashCode+=10;
        return hashCode;
    }

    @Override
    public boolean equals(Object obj){
        Student other = (Student)obj;
        if (studentId== other.studentId){
            System.out.println("Duplicate Entry is ");
            System.out.println("ID: "+other.studentId+" Name: "+other.studentName);
            System.out.println();
            return true;
        }else{
            return false;
        }
    }
}

public class HashSetLab {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        HashSet<Student> s = new HashSet<>();
        System.out.print("Enter number of records: ");
        int n = input.nextInt();
        Student[] arr =new Student[n];

        for (int i=0;i<n;i++){
            System.out.print("Enter Student ID: ");
            int id = input.nextInt();
            System.out.print("Enter Student Name: ");
            String name = input.next();
            System.out.print("Enter Subject Code: ");
            int code = input.nextInt();
            arr[i] = new Student(id,name,code);
            System.out.println();
        }
        for (int i=0;i<n;i++){
            s.add(arr[1]);
        }

    }
}
