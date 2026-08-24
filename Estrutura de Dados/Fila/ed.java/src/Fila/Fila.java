package Fila;

public class Fila {
    private No refNoEntradaFila;

    public Fila(){
        this.refNoEntradaFila=null;
    }

    public void enqueue(No novoNo){
        novoNo.setRefNo(refNoEntradaFila);
        refNoEntradaFila = novoNo;
    }

    public No first(){
        No primeiroNo = refNoEntradaFila;
        if (!isEmpty()) {
        
            while (true) {
                if (primeiroNo.getRefNo() != null) {
                    primeiroNo = primeiroNo.getRefNo();
                }else{
                    break;
                }
            }
        }
        return primeiroNo;
    }

    public No dequeue(){
        No primeiroNo = refNoEntradaFila;
        No noAuxilar = refNoEntradaFila;
        if (!isEmpty()) {
           
            
            while (true) {
                if (primeiroNo.getRefNo() != null) {
                    noAuxilar = primeiroNo;
                    primeiroNo = primeiroNo.getRefNo();
                }else{
                    noAuxilar.setRefNo(null);
                    break;
                }
            }
        }
        return primeiroNo;
    }

    public boolean isEmpty(){
        return refNoEntradaFila == null? true : false;
    }

    @Override
    public String toString() {
        String stringRetorno = " ";
        No noAuxilar = refNoEntradaFila;

        if (refNoEntradaFila!=null) {
            while (true) {
                stringRetorno += "{No{objeto=" + noAuxilar.getObject() + "}]--->";
                noAuxilar = noAuxilar.getRefNo();
                if (noAuxilar.getRefNo() != null) {
                    noAuxilar = noAuxilar.getRefNo();
                }else{
                    break;
                }
            }
        }else{
            stringRetorno = "null";
        }

        return stringRetorno;
    }
}
