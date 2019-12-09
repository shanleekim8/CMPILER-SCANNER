public class JSFMFunction {
    private String name;
    private String returnType;
    private JSFMParser.FormalParametersContext parameters;
    private JSFMParser.BlockContext actions;

    public JSFMFunction(String n, String r,JSFMParser.FormalParametersContext p, JSFMParser.BlockContext a){
        name = n;
        returnType = r;
        parameters = p;
        actions = a;
    }

    public String getName() {
        return name;
    }

    public String getReturnType() {
        return returnType;
    }

    public JSFMParser.BlockContext getActions() {
        return actions;
    }

    public JSFMParser.FormalParametersContext getParameters() {
        return parameters;
    }
}
