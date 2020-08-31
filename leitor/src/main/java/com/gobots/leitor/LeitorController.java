package com.gobots.leitor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class LeitorController {
    
    @Autowired
    private TextoRepository textoRepository;
      




    @GetMapping("/leitor")
    public String leitor(){
      return "leitor";
    }
    
    @PostMapping(path="/resultado") // Map ONLY POST Requests
    public @ResponseBody String addNewTexto (
         @RequestParam String texto
        ) {

            Texto u = new Texto();

            u.setTexto(texto);

            textoRepository.save(u);
            
            return  
            "<head>"+
            "<meta charset=\"UTF-8\">"+
            "<link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css\" integrity=\"sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO\" crossorigin=\"anonymous\">"+

            "<title>Olá, mundo!</title>"+
            "</head>"+
            "<body>" +
            "<h1>Olá, mundo!</h1>"+
        
        
            "<div class=\"row\">"+
            
              "<div class=\"col-sm\">"+
              "</div>"+

              "<div class=\"col-sm-3\">"+
                u.getTexto()+
                "<a href=\"/leitor\">Inicio</a>"+
              "</div>"+
              
              "<div class=\"col-sm\">"+
              "</div>"+
            
            "</div>"+
          
            
          
            "<script type=\"text/javascript\">" +
          
              "var msg = new SpeechSynthesisUtterance(\"" + u.getTexto() + "\");" +
              "window.speechSynthesis.speak(msg);" +
            "</script>"+
            "<script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js\" integrity=\"sha384-ChfqqxuZUCnJSK3+MXmPNIyE6ZbWh2IMqE241rYiqJxyMiZ6OW/JmZQ5stwEULTy\" crossorigin=\"anonymous\"></script>"+
            "</body>"
            ;
    }
}
