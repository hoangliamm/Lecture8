package lecture8;
class Student {
    int ID;
    String name;
    public Student(int ID, String name) {
        this.ID = ID;
        this.name = name;
    }
    void displayInformation() {
        System.out.println("ID: " + ID + ", Name: " + name);
    }
}
public class Lecture8 {
    public static void main(String[] args) {
        Student student1 = new Student(1, "Nam");
        Student student2 = new Student(2, "Lan");
        student1.displayInformation();  
        student2.displayInformation();
    }
}
