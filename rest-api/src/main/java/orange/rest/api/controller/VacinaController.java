package orange.rest.api.controller;

import orange.rest.api.model.VacinaModel;
import orange.rest.api.repository.VacinaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
public class VacinaController {

    @Autowired
    private VacinaRepository repository;

    @PostMapping(path = "/api/cadastro/vacina")
    @ResponseStatus(HttpStatus.CREATED)
    public VacinaModel salvarAplicacao (@RequestBody @Valid VacinaModel idusuario){
        return repository.save(idusuario);
    }

    @GetMapping(path = "/api/vacina/{idusuario}")
    public ResponseEntity consultarVacinado (@PathVariable("idusuario") Long idusuario) {
        return repository.findById(idusuario)
                .map(record -> ResponseEntity.ok().body(record))
                .orElse(ResponseEntity.notFound().build());
    }
}
