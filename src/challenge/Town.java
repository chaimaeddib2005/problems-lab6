package challenge;

public class Town {
    String name;
    double distance;
    public Town(String name, double distance) {
        this.name = name;
        this.distance = distance;
    }
    public String toString() {
        return "Town{" + "name=" + name + ", distance=" + distance + '}';
    }
}
