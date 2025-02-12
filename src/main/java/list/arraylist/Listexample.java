package list.arraylist;

import java.util.Objects;

public class Listexample {
    private int id;
    private String name;
    private String position;

    public Listexample() {

    }

    public Listexample(int id, String name, String position) {
        this.id = id;
        this.name = name;
        this.position = position;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }


    public void  addPerson(int id, String name, String position){

    }





    @Override
    public final boolean equals(Object o) {
        if (!(o instanceof Listexample that)) return false;

        return id == that.id && Objects.equals(name, that.name) && Objects.equals(position, that.position);
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + Objects.hashCode(name);
        result = 31 * result + Objects.hashCode(position);
        return result;
    }

    @Override
    public String toString() {
        return "Listexample{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", position='" + position + '\'' +
                '}';
    }

}
