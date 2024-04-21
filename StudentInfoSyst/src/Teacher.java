public class Teacher {
    String name;
    String phone;
    String branch;

    Teacher(String name, String branch, String phone){
        this.name = name;
        this.branch = branch;
        this.phone = phone;
    }

    void print(){
        System.out.println("Name: "+this.name);
        System.out.println("Branch: "+this.branch);
        System.out.println("Phone: "+this.phone);
    }
}
