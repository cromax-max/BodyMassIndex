public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double index = service.calculate(70, 180);
        System.out.println(index);
    }
}
