package multileveluniversitycoursemanagementsystem;

public class UniversityManagementMain {
    public static void main(String[] args) {
        ExamCourse examCourse1 = new ExamCourse("Mathematics 2");
        ExamCourse examCourse2 = new ExamCourse("English");
        ExamCourse examCourse3 = new ExamCourse("Data Structure");

        ResearchCourse researchCourse1 = new ResearchCourse("Psychology");
        ResearchCourse researchCourse2 = new ResearchCourse("Astrology");

        AssignmentCourse assignmentCourse1 = new AssignmentCourse("Mathemarics 2");
        AssignmentCourse assignmentCourse2 = new AssignmentCourse("Data Structure");
        AssignmentCourse assignmentCourse3 = new AssignmentCourse("English");

        Course<ExamCourse> examCourseList = new Course<>();
        Course<AssignmentCourse> assignmentCourseList = new Course<>();
        Course<ResearchCourse> researchCourseList = new Course<>();

        examCourseList.addItem(examCourse1);
        examCourseList.addItem(examCourse2);
        examCourseList.addItem(examCourse3);

        assignmentCourseList.addItem(assignmentCourse1);
        assignmentCourseList.addItem(assignmentCourse2);
        assignmentCourseList.addItem(assignmentCourse3);

        researchCourseList.addItem(researchCourse1);
        researchCourseList.addItem(researchCourse2);

        System.out.println(examCourseList.getList());
        System.out.println(assignmentCourseList.getList());
        System.out.println(researchCourseList.getList());
    }
}
