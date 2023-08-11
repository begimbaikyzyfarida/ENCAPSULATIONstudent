public class Student {
    private String studentName;
    private int studentAge;
    private int idStudent;

    public Student(String studentName, int studentAge, int idStudent) {
        this.studentName = studentName;
        this.studentAge = studentAge;
        this.idStudent = idStudent;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int getStudentAge() {
        return studentAge;
    }

    public void setStudentAge(int studentAge) {
        this.studentAge = studentAge;
    }

    public int getIdStudent() {
        return idStudent;
    }

    public void setIdStudent(int idStudent) {
        this.idStudent = idStudent;
    }

    @Override
    public String toString() {
        return "Student boyuncha maalymat: \n" +
                "studentName - " + studentName + "\n" +
                "studentAge - " + studentAge + "\n" +
                "idStudent - " + idStudent + "\n";
    }
}
