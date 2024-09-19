package student_exercisever1;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Student extends Person {

    private float gpa;
    private String major;

    @Override
    public void displayInfo() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        String formatDate = sdf.format(dateOfBirth);
        System.out.println("ID: " + id
                + " Full Name: " + fullName
                + " Date Of Birth: " + formatDate
                + " GPA: " + gpa
                + " Major: " + major);
    }

    public Student() {
    }

    public Student(String id, String fullName, Date dateOfBirth, String major, float gpa) {
        super(id, fullName, dateOfBirth);
        this.major = major;
        this.gpa = gpa;
    }

    public float getGpa() {
        return gpa;
    }

    public void setGpa(float gpa) {
        this.gpa = gpa;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public void addStudent(String id, String fullName, Date dateOfBirth, float gpa, String major) {
        this.id = id;
        this.fullName = fullName;
        this.dateOfBirth = dateOfBirth;
        this.gpa = gpa;
        this.major = major;
    }
}
