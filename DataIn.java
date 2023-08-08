

public class DataIn {
    private String dataString;

    public DataIn(String dataString){
        this.dataString=dataString;
    }

    public String getDataString() {
        return dataString;
    }

    public void setDataString(String dataString) {
        this.dataString = dataString;
    }

    @Override
    public String toString() {
        return String.format("%s", dataString);
    }

}
