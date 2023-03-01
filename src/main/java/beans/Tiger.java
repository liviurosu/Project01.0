package beans;

public class Tiger {
    private String name;

    public Tiger(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Tiger" +
                " '" + name + '\'';
    }
}
