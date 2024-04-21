public class Course {

    Teacher teacher;
    String name;
    String code;
    String prefix;
    int score;
    int practise;
    int practisePercent;
    int scorePercent;

    Course(String name,String code,String prefix,int practisePercent,Teacher teacher){
        this.name =name;
        this.code =code;
        this.prefix=prefix;
        this.practisePercent=practisePercent;
        this.scorePercent=100-practisePercent;
        this.teacher = teacher;
        int score = 0;
        int practise =0;
    }
    void  addTeacher(Teacher teacher){
        if (teacher.branch.equalsIgnoreCase(this.prefix)){
            this.teacher=teacher;
        }
        else {
            System.out.println("Teacher and course infos don't matches");
        }
        this.teacher=teacher;
    }
    void printTeacher(){
        this.teacher.print();
    }

}
