package controller;

public class ValidacaoGastoCalorico {
    
    public boolean validarCampos(double peso, double altura, int idade) {
        if(peso > 0 && altura > 0 && idade > 0) {
            return true;
        }
        return false;
    }
}
