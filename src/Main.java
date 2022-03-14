import java.text.DecimalFormat;

public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        float weight = 120;
        float growth = 182;
        float bodyMassIndex = service.calculate(weight, growth);
        DecimalFormat df = new DecimalFormat("###.##");
        System.out.println(df.format(bodyMassIndex) + "  кг/м2  Индекс массы тела");
    }
}