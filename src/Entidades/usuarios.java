package Entidades;

/** 
     * Pasta Entidades que contem usuarios, que contém todos os atributos do bd, C1_ codigo e C2_descrição
 */

public class usuarios {

    private int c1_codigo;
    private String c2_descricao;

    /** 
     * Encapsulando os usuarios, get e set
 */

    public int getC1_codigo() {
        return c1_codigo;
    }

    public void setC1_codigo(int c1_codigo){
         this.c1_codigo = c1_codigo;
    }

    public String getc2_descricao() {
        return c2_descricao;
    }

    public void setc2_descricao(String c2_descricao){
         this.c2_descricao = c2_descricao;
    }
    
}
