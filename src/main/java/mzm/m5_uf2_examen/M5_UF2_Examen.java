package mzm.m5_uf2_examen;

public class M5_UF2_Examen {

    private int num1;
    private int num2;
    
    public int sumar(int num1, int num2) {
        return num1 + num2;
    }
    

    int sumarValorAbsolut(int num1, int num2){
        int vAbsoluto = Math.abs(num1) +  Math.abs(num2);
        return vAbsoluto;
    }

}
