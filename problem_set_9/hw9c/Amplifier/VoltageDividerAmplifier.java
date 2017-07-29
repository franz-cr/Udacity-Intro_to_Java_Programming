public class VoltageDividerAmplifier extends Amplifier {
     // TODO: supply the implementation of VoltageDividerAmplifier as a subclass of Amplifier
     // R1 and R2 represent resistance. The gain (g) is calculated from the resistance as follows:
     // VoltageDividerAmplifier:    g = R2 / (R1 + R2)
     // TODO: the getGain method needs to return the correct gain (g)
     
    public VoltageDividerAmplifier (int R1, int R2) {
        //Constructor
        super(R1, R2);
    }
    
    public double getGain() {
        return ((double)getR2() / ((double)getR1() + (double)getR2()));
    }
}
