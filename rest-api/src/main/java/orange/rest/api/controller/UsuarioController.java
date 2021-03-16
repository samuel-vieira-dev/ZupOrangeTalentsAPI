package orange.rest.api.controller;

import orange.rest.api.model.UsuarioModel;
import orange.rest.api.repository.UsuarioRepository;
import org.hibernate.validator.cdi.HibernateValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
public class UsuarioController {

    @Autowired
    private UsuarioRepository repository;


    @PostMapping(path = "/api/cadastro/usuario")
    @ResponseStatus(HttpStatus.CREATED)
    public UsuarioModel salvarUsuario (@RequestBody @HibernateValidator UsuarioModel idusuario){
        return repository.save(idusuario);
    }

    @GetMapping(path = "/api/usuario/{idusuario}")
    public ResponseEntity consultar(@PathVariable("idusuario") Long idusuario) {
        return repository.findById(idusuario)
                .map(record -> ResponseEntity.ok().body(record))
                .orElse(ResponseEntity.notFound().build());
    }
}
