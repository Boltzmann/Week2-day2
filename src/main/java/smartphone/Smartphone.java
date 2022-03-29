package smartphone;

import java.util.Arrays;

public class Smartphone implements Radio, GPS{
    String model = "H9";
    String manufacturer = "Huawei";
    Contact[] listOfAllContacts;

    public Smartphone(){}
    public Smartphone(String model, String manufacturer, Contact[] listOfAllContacts){
        this.model = model;
        this.manufacturer = manufacturer;
        this.listOfAllContacts = listOfAllContacts;
    }

    @Override
    public String toString() {
        return "Smartphone:\n" +
                "smartphone model='" + model + '\'' +
                ",smartphone manufacturer='" + manufacturer + '\'' +
                ", listOfAllContacts=" + Arrays.toString(listOfAllContacts);
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public Contact[] getListOfAllContacts() {
        return listOfAllContacts;
    }

    public void setListOfAllContacts(Contact[] listOfAllContacts) {
        this.listOfAllContacts = listOfAllContacts;
    }

    @Override
    public boolean startRadio() {
        System.out.println("Radio started");
        return true;
    }

    @Override
    public boolean stopRadio() {
        System.out.println("Radio stopped.");
        return false;
    }

    @Override
    public String getPosition() {
        return "Hamburg";
    }

    public static void main(String[] args) {
        // setter vom Array
        // toString
        Contact a = new Friend("Best Friend", "12345");
        Contact[] oneContacts = {
                a,
                new Friend("2nd Best Friend", "2345")
        };
        Smartphone one = new Smartphone("3", "Fairphone", oneContacts);
        System.out.println(one);
        one.setListOfAllContacts(new Contact[]{new Friend("One and only friend", "040 123456")});
        System.out.println(one);
    }
}
