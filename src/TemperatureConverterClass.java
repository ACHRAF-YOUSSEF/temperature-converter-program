public class TemperatureConverterClass {
    private final String fromTo;
    private final double ratio;

    TemperatureConverterClass(String fromTo, double ratio) {
        this.fromTo = fromTo;
        this.ratio = ratio;
    }

    public String getFromTo() {
        return fromTo;
    }

    public double convertFromTo(double temp) {
        return temp * ratio;
    }

    @Override
    public String toString() {
        return fromTo;
    }
}
