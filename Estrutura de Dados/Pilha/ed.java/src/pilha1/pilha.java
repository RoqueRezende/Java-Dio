package pilha1;

public class pilha {
    private no refNoEntradaPilha;
    
    public pilha(){
        this.refNoEntradaPilha=null;
    }

    public void push(no novoNo){
        no refAuxiliar = refNoEntradaPilha;
        refNoEntradaPilha = novoNo;
        refNoEntradaPilha.setReNo(refAuxiliar);
    }

    public no pop(){
        if (!this.isEmpty()) {
            no noPoped = refNoEntradaPilha;
            refNoEntradaPilha = refNoEntradaPilha.getReNo();
            return noPoped;
        }
        return null;
    }

    public no top(){
        return refNoEntradaPilha;
    }
    
    public boolean isEmpty(){
        
        if (refNoEntradaPilha == null) {
            return true;
        }
        return false;
    }

    @Override 
    public String toString(){
        String stringRetorno = "-------------\n";
        stringRetorno += "    Pilha\n";
        stringRetorno += "---------------\n";

        no noAuxilar = refNoEntradaPilha;

        while (true) {
            if (noAuxilar != null) {
                stringRetorno += "[No{dado=" + noAuxilar.getDado() +"}]\n";
                noAuxilar = noAuxilar.getReNo();
            }else{
                break;
            }
        }
        stringRetorno += "-------------\n";
        return stringRetorno;
    }

}
