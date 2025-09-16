package Exercise1;

public class Month {

    private String name;

    public Month (String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Month month)) return false;
        return name.equals(month.name);
    }

    @Override
    public int hashCode() {
        return name.hashCode();
    }

}
