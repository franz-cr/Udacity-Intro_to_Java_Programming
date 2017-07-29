
public class InvertingAmplifier extends Amplifier {
    // TODO: supply the implementation of InvertingAmplifier as a subclass of Amplifier
    // R1 and R2 represent resistance. The gain (g) is calculated from the resistance as follows:
    // InvertingAmplifier:         g = R2 / R1
    // TODO: the getGain method needs to return the correct gain (g)
    public InvertingAmplifier (int R1, int R2) {
        //Constructor
        super(R1, R2);
    }
    
    public double getGain() {
        return ((double)getR2() / (double)getR1());
    }
}
