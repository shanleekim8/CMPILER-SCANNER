import java.util.List;

public class JSFMValues {
    private int intValue;
    private float floatValue;
    private String stringValue;
    private char charValue;
    private boolean boolValue;
    private String objectType;
    private String arrayValues;
    private boolean isArray = false;
    private boolean isEmpty;
    private boolean isFinal;
    private List<Object> arrayVal;
    private int arraySize;

    public JSFMValues(String type, int value, boolean f){
        objectType = type;
        intValue = value;
        isEmpty = false;
        isFinal = f;
    }

    public JSFMValues(String type, float value, boolean f){
        objectType = type;
        floatValue = value;
        isEmpty = false;
        isFinal = f;
    }


    public JSFMValues(String type, char value, boolean f){
        objectType = type;
        charValue = value;
        isEmpty = false;
        isFinal = f;
    }

    public JSFMValues(String type, boolean value, boolean f){
        objectType = type;
        boolValue = value;
        isEmpty = false;
        isFinal = f;
    }

    public JSFMValues(String type, String value, boolean f){
        objectType = type;
        stringValue = value;
        isEmpty = false;
        isFinal = f;
    }

    public JSFMValues(String type, boolean array, String values, boolean f){
        objectType = type;
        isArray = array;
        arrayValues = values;
        isEmpty = false;
        isFinal = f;
    }

    public JSFMValues(boolean array, String type, boolean f){
        objectType = type;
        isArray = array;
        isEmpty = true;
        isFinal = f;
    }

    public JSFMValues(String type, boolean f){
        objectType = type;
        isEmpty = true;
        isFinal = f;
    }


    public void setCharValue(char charValue) {
        this.charValue = charValue;
        isEmpty = false;
    }

    public void setIntValue(int intValue) {
        this.intValue = intValue;
        isEmpty = false;
    }

    public void setFloatValue(float floatValue) {
        this.floatValue = floatValue;
        isEmpty = false;
    }

    public void setStringValue(String stringValue) {
        this.stringValue = stringValue;
        isEmpty = false;
    }

    public void setBoolValue(boolean boolValue){
        this.boolValue = boolValue;
        isEmpty = false;
    }

    public void setNull(boolean isEmpty){
        this.isEmpty = isEmpty;
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

    public boolean isEmpty() {
        return isEmpty;
    }

    public boolean isFinal() {
        return isFinal;
    }

    public String getObjectType() {
        return objectType;
    }

}
