public class BmiService {
    public double calculate(double weight, double growth) {
        double index = weight / Math.pow(growth / 100, 2);
        return (int) index;
    }
}
