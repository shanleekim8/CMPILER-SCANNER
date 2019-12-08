public class JSFMIfElse {
    private boolean result;
    private boolean elsePresent;
    private int ifNum;
    private int elseNum;

    public JSFMIfElse(boolean val){
        result = val;
    }

    public boolean isElsePresent() {
        return elsePresent;
    }

    public boolean getResult() {
        return result;
    }

    public int getElseNum() {
        return elseNum;
    }

    public int getIfNum() {
        return ifNum;
    }

    public void setElseNum(int elseNum) {
        this.elseNum = elseNum;
    }

    public void setElsePresent(boolean elsePresent) {
        this.elsePresent = elsePresent;
    }

    public void setIfNum(int ifNum) {
        this.ifNum = ifNum;
    }
}
