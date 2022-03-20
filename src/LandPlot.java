public class LandPlot {

    private final double width;
    private final double height;
    private final int cost;

    public LandPlot(double width, double height, int cost) {
        this.width = width;
        this.height = height;
        this.cost = cost;
    }

    public double costPerSquareMeter() {
        return cost / (width * height);
    }

    @Override
    public String toString() {
        return "width: " + width + ", height: " + height + ", cost: " + cost + ", costPerSquareMeter: " + costPerSquareMeter();
    }

}
