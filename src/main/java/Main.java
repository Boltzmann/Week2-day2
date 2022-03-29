import model.ComputerScienceStudent;

public class Main {
    public static void main(String[] args) {
    newStudent();
    }
    public static void newStudent(){
        ComputerScienceStudent hannes = new ComputerScienceStudent("Hannes Hanson", 234, "Computer Science");
        System.out.println(hannes);
    }
}
