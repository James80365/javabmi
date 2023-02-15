public class BmiService {
    public int calculate(double hei, int wei) {
        int bmi;
        bmi = (int) (wei / (hei * hei));
        return bmi;
    }
}