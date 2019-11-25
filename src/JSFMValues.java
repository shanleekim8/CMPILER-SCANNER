public class JSFMValues {
    private int intValue;
    private float floatValue;
    private String stringValue;
    private char charValue;
    private boolean boolValue;
    private String objectType;
    private String arrayValues;
    private boolean isArray = false;
    private boolean isNull;
    private boolean isFinal;

    public JSFMValues(String type, int value, boolean f){
        objectType = type;
        intValue = value;
        isNull = false;
        isFinal = f;
    }

    public JSFMValues(String type, float value, boolean f){
        objectType = type;
        floatValue = value;
        isNull = false;
        isFinal = f;
    }


    public JSFMValues(String type, char value, boolean f){
        objectType = type;
        charValue = value;
        isNull = false;
        isFinal = f;
    }

    public JSFMValues(String type, boolean value, boolean f){
        objectType = type;
        boolValue = value;
        isNull = false;
        isFinal = f;
    }

    public JSFMValues(String type, String value, boolean f){
        objectType = type;
        stringValue = value;
        isNull = false;
        isFinal = f;
    }

    public JSFMValues(String type, boolean array, String values, boolean f){
        objectType = type;
        isArray = array;
        arrayValues = values;
        isNull = false;
        isFinal = f;
    }

    public JSFMValues(boolean array, String type, boolean f){
        objectType = type;
        isArray = array;
        isNull = true;
        isFinal = f;
    }

    public JSFMValues(String type, boolean f){
        objectType = type;
        isNull = true;
        isFinal = f;
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


    public void setStringValue(String stringValue) {
        this.stringValue = stringValue;
    }

    public void setBoolValue(boolean boolValue){
        this.boolValue = boolValue;
    }

    public void setNull(boolean isNull){
        this.isNull = isNull;
    }

    public void setIsArray(boolean array) {
        isArray = array;
    }

    public void setObjectType(String objectType) {
        this.objectType = objectType;
    }

    public char getCharValue() {
        return charValue;
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

    public boolean getBoolValue() {
        return boolValue;
    }

    public String getArrayValues() {
        return arrayValues;
    }

    public boolean isArray() {
        return isArray;
    }

    public boolean isNull() {
        return isNull;
    }

    public boolean isFinal() {
        return isFinal;
    }

    public String getObjectType() {
        return objectType;
    }


}
