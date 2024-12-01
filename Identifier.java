public class Identifier {

    double weight_1_1, weight_2_1;
    double weight_1_2, weight_2_2;

    double bias_1, bias_2;

    public Identifier(double weight_1_1, double weight_1_2, double weight_2_1, double weight_2_2, double bias_1,
            double bias_2) {
        this.weight_1_1 = weight_1_1;
        this.weight_2_1 = weight_2_1;
        this.weight_1_2 = weight_1_2;
        this.weight_2_2 = weight_2_2;
        this.bias_1 = bias_1;
        this.bias_2 = bias_2;
    }

    public int Classify(double input_1, double input_2) {
        double output_1 = input_1 * weight_1_1 + input_2 * weight_2_1 + bias_1;

        double output_2 = input_2 * weight_1_2 + input_2 * weight_2_2 + bias_2;

        return (output_1 > output_2) ? 0 : 1;
    }
}
