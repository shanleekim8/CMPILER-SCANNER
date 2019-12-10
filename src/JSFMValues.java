import java.util.ArrayList;
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
    private ArrayList<Integer> intArray;
    private ArrayList<Float> floatArray;
    private ArrayList<Boolean> boolArray;
    private ArrayList<Character> charArray;
    private ArrayList<String> strArray;
    private int arraySize;
    private JSFMFunction function;


    public JSFMValues(String type, JSFMFunction func){
        objectType = type;
        function = func;
    }

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

        String[] res = arrayValues.substring(1, values.length()-1).split(",");
        int i;
        switch(type){
            case "techies": intArray = new ArrayList<Integer>();
            for(i=0; i< res.length;i++){
                intArray.add(Integer.parseInt(res[i]));
            }
            break;
            case "coke": floatArray = new ArrayList<Float>();
            for(i=0; i<res.length;i++){
                floatArray.add(Float.parseFloat(res[i]));
            }
            break;
            case "thread": strArray = new ArrayList<String>();
            for(i=0; i<res.length; i++){
                strArray.add(res[i]);
            }
            break;
            case "kachow": charArray = new ArrayList<Character>();
            for(i=0; i<res.length; i++){
                charArray.add(res[i].charAt(1));
            }
            break;
            case "boolin": boolArray = new ArrayList<Boolean>();
            for(i=0; i<res.length; i++){
                boolArray.add(Boolean.parseBoolean(res[i]));
            }
            break;
        }
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

     public void add(String i){
        switch(objectType){
            case "techies":
                intArray.add(Integer.parseInt(i));
                break;
            case "float":
                floatArray.add(Float.parseFloat(i));
                break;
            case "thread":
                strArray.add(i);
                break;
            case "boolin":
                boolArray.add(Boolean.parseBoolean(i));
                break;
            case "kachow":
                charArray.add(i.charAt(1));
                break;
        }
     }

     public Object get(int i){
         switch(objectType){
             case "techies":
                 return intArray.get(i);
             case "float":
                 return floatArray.get(i);
             case "thread":
                 return strArray.get(i);
             case "boolin":
                 return boolArray.get(i);
             case "kachow":
                 return charArray.get(i);
         }
         return null;
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

    public JSFMFunction getFunction() {
        return function;
    }
}
