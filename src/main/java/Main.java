import model.BiologyStudent;
import model.ComputerScienceStudent;

public class Main {
    public static void main(String[] args) {
        ComputerScienceStudent hannes = new ComputerScienceStudent("Hannes Hanson", 234, "Computer Science");
        System.out.println(hannes);
        System.out.println(hannes.getName());

        BiologyStudent anna = new BiologyStudent("Anna Muster", 345, false);
        System.out.println(anna);
    }
}
