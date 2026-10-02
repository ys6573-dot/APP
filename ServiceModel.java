public class ServiceModel {
    public static int calculate(boolean general, boolean oil, boolean brake, boolean battery) {
        int cost = 0;
        if (general) cost += 1000;
        if (oil) cost += 800;
        if (brake) cost += 1200;
        if (battery) cost += 500;
        return cost;
    }
}
