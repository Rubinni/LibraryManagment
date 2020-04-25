public class Student {
    private String StudentName;
    private int StudentId;

    public Student(String studentName, int studentId) {
        StudentName = studentName;
        StudentId = studentId;
    }

    public String getStudentName() {
        return StudentName;
    }

    public void setStudentName(String studentName) {
        StudentName = studentName;
    }

    public int getStudentId() {
        return StudentId;
    }

    public void setStudentId(int studentId) {
        StudentId = studentId;
    }
}
