package Source;
// IN CLASS: Start with this ordinary parent class.
// Later, we will discuss whether Mechanism should be abstract.
public class Mechanism {
    private String name;
    private double position;

    public Mechanism(String name) {
        this.name = name;
        this.position = 0;
    }

    public String getName() { return name; }
    public double getPosition() { return position; }

    // Child classes can reuse this method using super.setPosition(...).
    public void setPosition(double position) {
        this.position = position;
    }
}
