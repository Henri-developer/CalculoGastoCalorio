package controller;

public class ValidacaoIMC {
    
    public boolean validacaoCampos(double altura, double peso) {
        if(altura > 0 && peso > 0) {
            return true;
        } else {
            return false;
        }
    }
}
