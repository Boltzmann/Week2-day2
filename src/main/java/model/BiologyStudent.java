package model;

public class BiologyStudent extends Student{

    boolean likesTrees;

    public BiologyStudent (String name, int id, boolean likesTrees ) {
        super(name, id);
        this.likesTrees = likesTrees;
    }

    @Override
    public String toString() {
        return "BiologyStudent{" +
                "likesTrees=" + likesTrees +
                ", name='" + name + '\'' +
                ", id=" + id +
                '}';
    }

    @Override
    public String getName() {
        return name + " is a Biology Student.";
    }
}
