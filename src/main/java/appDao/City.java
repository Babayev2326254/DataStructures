package appDao;

import java.util.Objects;

public class City {
    private String name;
    private int row;
    private int code;

    public City(String name, int row, int code) {
        this.name = name;
        this.row = row;
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    @Override
    public final boolean equals(Object o) {
        if (!(o instanceof City city)) return false;

        return row == city.row && code == city.code && Objects.equals(name, city.name);
    }

    @Override
    public int hashCode() {
        int result = Objects.hashCode(name);
        result = 31 * result + row;
        result = 31 * result + code;
        return result;
    }

    @Override
    public String toString() {
        return "City{" + "name='" + name + '\'' + ", row=" + row + ", code=" + code + '}';
    }
}
