package student_exercisever1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Formatter;
import java.util.Scanner;

public class Process {

    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        StudentList studentList = new StudentList();
        boolean exit = false;
        while (!exit) {
            System.out.println("1.Add a new student");
            System.out.println("2.Update a student by id");
            System.out.println("3.Delete a student by id");
            System.out.println("4.Display all student");
            System.out.println("5.Find the student with the highest GPA");
            System.out.println("6.Exit");
            System.out.print("Choose an option: ");
            int choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1:
                    System.out.print("Enter ID:");
                    String id = sc.nextLine();
                    System.out.print("Enter Full Name: ");
                    String fullName = sc.nextLine();
                    System.out.print("Enter Date Of Birth(dd/MM/yyyy): ");
                    String dob = sc.nextLine();
                    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyy");
                    Date dateOfBirth = sdf.parse(dob);
                    System.out.print("Enter GPA: ");
                    float gpa = sc.nextFloat();
                    sc.nextLine();
                    System.out.print("Enter major: ");
                    String major = sc.nextLine();
                    studentList.addStudent(new Student(id, fullName, dateOfBirth, major, gpa));
                    System.out.println("--------------");
                    break;
                case 2:
                    System.out.print("Enter ID : ");
                    String ID = sc.nextLine();
                    Student studentToUpdate = studentList.findStudentByID(ID);
                    if (studentToUpdate != null) {
                        System.out.print("Enter new name: ");
                        String newFullName = sc.nextLine();
                        studentToUpdate.setFullName(newFullName);
                        System.out.println("Enter new DateOfBirth: ");
                        String newDate = sc.nextLine();
                        SimpleDateFormat sd = new SimpleDateFormat("dd/MM/yyyy");
                        Date newDateOfBirth = sd.parse(newDate);
                        studentToUpdate.setDateOfBirth(newDateOfBirth);
                        System.out.print("Enter new major: ");
                        String newMajor = sc.nextLine();
                        System.out.print("Enter new GPA: ");
                        float newGpa = sc.nextFloat();
                        sc.nextLine();
                        studentToUpdate.setGpa(newGpa);

                        System.out.println("Student updated successfully.");
                        System.out.println("-----------");
                    } else {
                        System.out.println("Student not found");
                        System.out.println("-----------");
                    }
                    break;
                case 3:
                    System.out.print("Enter ID of the student to delete: ");
                    String deleteID = sc.nextLine();
                    studentList.deleteStudentById(deleteID);
                    System.out.println("Student deleted successfuly.");
                    System.out.println("-----------");
                    break;
                case 4:
                    studentList.displayAllStudents();
                    break;
                case 5:
                    Student topStudent = studentList.findTopStudent();
                    if (topStudent != null) {
                        System.out.println("Student with the highest GPA: ");
                        topStudent.displayInfo();
                    } else {
                        System.out.println("No student in the list");
                        System.out.println("-------------");
                    }
                    break;
                case 6:
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid choice. Please choose again.");
                    System.out.println("-----------");
                    break;
            }
        }
        sc.close();
    }
}
