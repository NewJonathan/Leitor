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
                "<link rel=\"stylesheet\" href=\"/css/leitor.css\">"+
                "<link href=\"https://fonts.googleapis.com/css2?family=Orbitron:wght@700&display=swap\" rel=\"stylesheet\">"+
                "<title>Leitor</title>"+
                "<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">"+
            "</head>"+

            "<body style=\"background-color:white;\">"+


            "<div class=\"row menu\">"+
                "<div class=\"col-sm \">"+
                    "<p style=\"margin-top: 7.5px;text-align: right;margin-right: 7.5px;\"><a style=\"color: white;\" href=\"https://gobots.ai/\">GoBots</a></p>"+
                "</div>"+
            "</div>"+


            "<div class=\"row\">"+

                "<div class=\"col-sm img\">"+
                    "<img src=\"/img/gobots.png\">"+
                "</div>"+
                
                "<div class=\"col-sm formulario\">"+
                    "<p style=\"color: #1f2124; font-size: x-large; padding-top: 8px;\">Texto Convertido</p>"+
                    u.getTexto()+
                    "<div>"+
                    "<br>"+
                    "<br>"+
                    "<a style=\"background-color: #6EC1E4;"+
                    "color: white;"+
                    "border: 2px solid; \"href=\"/leitor\">Voltar ao Conversor</a>"+
                    "</div>"+
                "</div>"+

            "</div>"+

            "<script type=\"text/javascript\">"+
                "var msg = new SpeechSynthesisUtterance(\"" + u.getTexto() + "\");"+
                "window.speechSynthesis.speak(msg);"+

            "</script>"+
            "<script src=\"https://code.jquery.com/jquery-3.3.1.slim.min.js\" integrity=\"sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo\" crossorigin=\"anonymous\"></script>"+
            "<script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js\" integrity=\"sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49\" crossorigin=\"anonymous\"></script>"+
            "<script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js\" integrity=\"sha384-ChfqqxuZUCnJSK3+MXmPNIyE6ZbWh2IMqE241rYiqJxyMiZ6OW/JmZQ5stwEULTy\" crossorigin=\"anonymous\"></script>"+
            "</body>"

            ;
    }
}
