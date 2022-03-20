import java.util.List;
import java.util.stream.Collectors;

public class CadastralHelper {

    public static List<LandPlot> getRecommendedPrice(List<LandPlot> listLandPlot, double price) {
        return listLandPlot.stream()
                .filter(s -> s.costPerSquareMeter() < price)
                .collect(Collectors.toList());
    }
}
