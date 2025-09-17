package exercise1;

public class Month {

    private String name;

    public Month (String name) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Month name must not be null or empty");
        }
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
