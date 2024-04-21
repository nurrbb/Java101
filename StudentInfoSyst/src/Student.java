public class Student {

    Course course1;
    Course course2;
    Course course3;
    String name;
    String studentNum;
    String grade;
    double GPA;


    Student(String name, String studentNum, String grade, Course course1, Course course2, Course course3) {
        this.name = name;
        this.studentNum = studentNum;
        this.grade = grade;
        this.course1 = course1;
        this.course2 = course2;
        this.course3 = course3;
        this.GPA = 0.0;

    }

    void addBulkExamNote(int score1, int score2, int score3) {
        if (score1 >= 0 && score1 <= 100) {
            course1.score = score1;
        }
        if (score2 >= 0 && score2 <= 100) {
            course2.score = score2;
        }
        if (score3 >= 0 && score3 <= 100) {
            course3.score = score3;
        }
    }

    void addBulkPractiseScore(int practise1, int practise2, int practise3) {
        if (practise1 >= 0 && practise1 <= 100) {
            course1.practise = practise1;
        }
        if (practise2 >= 0 && practise2 <= 100) {
            course2.practise = practise2;
        }
        if (practise3 >= 0 && practise3 <= 100) {
            course3.practise = practise3;
        }
    }

    //    void calcGPA(){
//
//    }
    void printGrade() {

        this.GPA = (((this.course1.practise * (this.course1.practisePercent / 100.0)) + (this.course1.score * (this.course1.scorePercent / 100.0)) +
                (this.course2.practise * (this.course2.practisePercent / 100.0)) + (this.course2.score * (this.course2.scorePercent) / 100.0) +
                (this.course3.practise * (this.course3.practisePercent / 100.0)) + (this.course3.score * (this.course3.scorePercent) / 100.0))/3)/25;


        System.out.println(course1.name + "Score :" + course1.score + "/100  " + "Practise: " + course1.practise + "/100");
        System.out.println(course2.name + "Score :" + course2.score + "/100  " + "Practise: " + course2.practise + "/100");
        System.out.println(course3.name + "Score :" + course3.score + "/100  " + "Practise: " + course3.practise + "/100");
        System.out.println("GPA: " + this.GPA + "/4");
    }

//    void  isPass(){
//        this.GPA = (this.course1.score + this.course2.score+this.course3.score)/3.0;
//        if(this.GPA>55){
//            System.out.println("Passed.");
//
//        }
//        else {
//            System.out.println("Failed.");
//
//        }
//        printGrade();
//    }
}
