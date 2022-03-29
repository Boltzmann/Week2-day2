package model;

public class ComputerScienceStudent extends Student implements Citizen{
    String specialization;

    public ComputerScienceStudent(String name, int id, String specialization) {
        super(name, id);
       this.specialization = specialization;
    }

    @Override
    public String toString() {
        return "ComputerScienceStudent{" +
                "specialization='" + specialization + '\'' +
                ", name='" + name + '\'' +
                ", id=" + id +
                '}';
    }

    @Override
    public String getName() {
        return this.name + " is a Computer Science Student.";
    }

    @Override
    public String getAdress() {
        return "Köln";
    }

    @Override
    public int getIdentityCardNumber() {
        return 0;
    }
}
