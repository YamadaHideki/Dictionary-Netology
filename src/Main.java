import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        List<LandPlot> landPlotList = new ArrayList<>();

        for (int i = 0; i < 10000; i++) {
            landPlotList.add(new LandPlot(Math.random() * 500 + 50, Math.random() * 500 + 50, (int) (Math.random() * 999999999 + 500000)));
        }

        while (true) {
            System.out.println("Введите цену за кв. м. | \"end\" для выхода");
            String response = scanner.nextLine();

            if(response.equals("end")) break;

            double price = 0;
            try {
                price = Double.parseDouble(response);
            } catch (NumberFormatException e) {
                e.getStackTrace();
            }

            List<LandPlot> result = CadastralHelper.getRecommendedPrice(landPlotList, price);
            System.out.println("Найдено результатов: " + result.size());
        }
    }
}
