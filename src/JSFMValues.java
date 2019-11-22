public class JSFMValues {
    private int intValue;
    private float floatValue;
    private double doubleValue;
    private String stringValue;
    private char charValue;
    private String objectType;

    public JSFMValues(String type, int value){
        objectType = type;
        intValue = value;
    }

    public JSFMValues(String type, float value){
        objectType = type;
        floatValue = value;
    }

    public JSFMValues(String type, double value){
        objectType = type;
        doubleValue = value;
    }

    public JSFMValues(String type, char value){
        objectType = type;
        charValue = value;
    }

    public JSFMValues(String type, String value){
        objectType = type;
        stringValue = value;
    }

    public void setCharValue(char charValue) {
        this.charValue = charValue;
    }

    public void setIntValue(int intValue) {
        this.intValue = intValue;
    }

    public void setFloatValue(float floatValue) {
        this.floatValue = floatValue;
    }

    public void setDoubleValue(double doubleValue) {
        this.doubleValue = doubleValue;
    }

    public void setStringValue(String stringValue) {
        this.stringValue = stringValue;
    }

    public void setObjectType(String objectType) {
        this.objectType = objectType;
    }

    public char getCharValue() {
        return charValue;
    }

    public double getDoubleValue() {
        return doubleValue;
    }

    public float getFloatValue() {
        return floatValue;
    }

    public int getIntValue() {
        return intValue;
    }

    public String getStringValue() {
        return stringValue;
    }

    public String getObjectType() {
        return objectType;
    }
}
