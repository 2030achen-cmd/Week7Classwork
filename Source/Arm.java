package Source;
// GUIDED IN CLASS: Use this starter to demonstrate extends, super, and @Override.
public class Arm extends Mechanism {
    public Arm() {
        super("Arm");
    }

    // TODO (together): Override setPosition(double position).
    // Arm angles must stay between 0 and 180 degrees.
    // For valid positions, call super.setPosition(position).
    // For invalid positions, print an error and leave position unchanged.
}
