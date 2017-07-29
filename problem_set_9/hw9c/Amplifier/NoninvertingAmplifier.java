
public class NoninvertingAmplifier extends Amplifier {

    // TODO: supply the implementation of NoninvertingAmplifier as a subclass of Amplifier
    // R1 and R2 represent resistance. The gain (g) is calculated from the resistance as follows:
    // NoninvertingAmplifier:      g = 1 + (R2 / R1)
    // TODO: the getGain method needs to return the correct gain (g)

    public NoninvertingAmplifier (int R1, int R2) {
        //Constructor
        super(R1, R2);
    }
    
    public double getGain() {
        return (1 + ((double)getR2() / (double)getR1()));
    }
}