public class Minhaclasse1 {
    public static void main (String[]aStrings){
        String primeiroNome = "Roque";
        String segundoNome = "Rezende";
        
        String nomeCompleto=nomeCompleto(primeiroNome, segundoNome);
        System.out.printf(nomeCompleto);
    }
    public static String nomeCompleto (String primeiroNome, String segundoNome){
        return primeiroNome.concat("").concat(segundoNome);
    }
}