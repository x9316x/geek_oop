public class StudentController {
    
    public static void main(String[] args) {
    
        Student student1 = new Student(1, "Иванов", "Иван", "Иванович");
        Student student2 = new Student(2, "Петров", "Петр", "Петрович");
        Student student3 = new Student(3, "Сидоров", "Иван", "Иванович");
        Student student4 = new Student(4, "Васильев", "Петр", "Петрович");

        StudentsGroup studentsGroup = new StudentsGroup();
        studentsGroup.addStudent(student1);
        studentsGroup.addStudent(student2);
        studentsGroup.addStudent(student3);
        studentsGroup.addStudent(student4);

        StudentGroupService studentsGroupService = new StudentGroupService(); 
        studentsGroupService.setStudentsGroup(studentsGroup);

        System.out.println(studentsGroup);

        studentsGroupService.removeStudent("Васильев", "Петр", "Петрович");
    
        System.out.println(studentsGroup);

    }

}
