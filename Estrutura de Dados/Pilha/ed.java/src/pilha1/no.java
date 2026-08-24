package pilha1;

public class no {
    private int dado;
    private no reNo = null;

    public no(){

    }

    public no(int dado){
        this.dado = dado;
    }

    public int getDado() {
        return dado;
    }

    public void setDado(int dado) {
        this.dado = dado;
    }

    public no getReNo() {
        return reNo;
    }

    public void setReNo(no reNo) {
        this.reNo = reNo;
    }

    @Override
    public String toString(){
        return "No{"+"dado="+dado+'}';
    }
}