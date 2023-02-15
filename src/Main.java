public class Main {

    public static void main(String[] args) {

        BmiService service = new BmiService();

        double hei = 1.87 ; //рост в м
        int wei = 98; // вес в кг
        int bmi = service.calculate(hei, wei);
        System.out.println(bmi);

    }
}