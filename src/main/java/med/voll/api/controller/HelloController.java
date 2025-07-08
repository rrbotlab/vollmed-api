package med.voll.api.controller;

import med.voll.api.infra.message.DadosMensagem;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloController {

    @GetMapping
    public ResponseEntity olaMundo(){
        return ResponseEntity.ok(new DadosMensagem("hello api from spring"));
    }
}
