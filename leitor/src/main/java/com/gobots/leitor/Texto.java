package com.gobots.leitor;

/** Criação da classe texto que têm como parâmetro uma string.*/
public class Texto {

    String texto;
    

/** Método que recebe como parâmetro uma string, onde se é verificada a existencia de uma abreviação já deifinida na lista e caso exista a substitui pela palavra completa. E encerra definindo o parâmetro texto.*/
    public void setTexto(String texto){
        
        String termo;
        int i;
        String palavras[] = {"Vcs", "vc", "vcs", "obg","Obg","td","Td","bm","Bm"
        ,"qto","Qto","qdo","Qdo","q ","Q ","eh ","Eh ","Qt","qt","aq ","Aq ","aq?","Cst","cst"};
    

        int n = palavras.length;
        for (i=0; i<n; i++) {
            termo = palavras[i];
            if (termo == "vc" || termo == "Vc" || termo == "vcs"){
                texto = texto.replace(termo,"você");
            }
            if (termo == "obg" || termo == "Obg"){
                texto = texto.replace(termo,"obrigado");
            }
            if (termo == "td" || termo == "Td"){
                texto = texto.replace(termo,"tudo");
            }
            if (termo == "bm" || termo == "Bm"){
                texto = texto.replace(termo,"bem");
            }
            if (termo == "qto" || termo == "Qto"){
                texto = texto.replace(termo,"quanto");
            }
            if (termo == "qdo" || termo == "Qdo"){
                texto = texto.replace(termo,"quando");
            }
            if (termo == "q " || termo == "Q "){
                texto = texto.replace(termo,"que ");
            }
            if (termo == "eh " || termo == "Eh "){
                texto = texto.replace(termo,"é ");
            }
            if (termo == "qt" || termo == "Qt"){
                texto = texto.replace(termo,"quanto");
            }
            if (termo == "aq " || termo == "Aq "|| termo == "aq?"){
                texto = texto.replace(termo,"aqui ");
            }
            if (termo == "cst" || termo == "Cst"){
                texto = texto.replace(termo,"custa");
            }

        this.texto = texto;
        }
    }
/** Método que retorna o valor do parâmetro texto. */
    public String getTexto(){
        return this.texto;  
    }

}