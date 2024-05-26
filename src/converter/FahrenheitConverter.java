package converter;

public class FahrenheitConverter implements ConvertDegrees{
    @Override
    public double getDegreesType(double value) {
        return 1.8*value+32;
    }
}
