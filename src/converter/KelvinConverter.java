package converter;

public class KelvinConverter implements ConvertDegrees{
    @Override
    public double getDegreesType(double value) {
        return value+273.15;
    }
}
