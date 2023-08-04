public class Student {
    private Integer numberOfStudent;
    private String firstName;
    private String secondName;
    private String lastName;

    public Student(Integer numberOfStudent, String firstName, String secondName, String lastName) {
        this.numberOfStudent = numberOfStudent;
        this.firstName = firstName;
        this.secondName = secondName;
        this.lastName = lastName;
    }

    public int getNumberOfStudent() {
        return numberOfStudent;
    }

    public void setNumberOfStudent(int number) {
        this.numberOfStudent = number;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String name) {
        this.firstName = name;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        Student student = (Student) o;
        return (this.firstName.equals(student.firstName) 
                && this.secondName.equals(student.secondName) 
                && this.lastName.equals(student.lastName));
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentNumber=" + numberOfStudent +
                ", firstName='" + firstName + '\'' +
                ", secondName='" + secondName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }

}
