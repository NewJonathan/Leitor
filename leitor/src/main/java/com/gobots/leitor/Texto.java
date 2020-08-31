package com.gobots.leitor;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Texto {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    String texto;
    


    public void setId(Integer id){
        this.id = id;
    }

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

    public String getTexto(){
        return this.texto;  
    }

    public Integer getId(){
        return this.id;
    }

}