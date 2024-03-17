package Exercicio5.controllers;

import Exercicio5.models.ModelPerson;
import Exercicio5.repositories.RepositoryPerson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/pessoa")
public class ControllerPerson {

    @Autowired
    private RepositoryPerson repositoryPerson;

    @GetMapping
    public ResponseEntity<List<String>> lista() {
        List<String> listarPessoas = repositoryPerson.findAll().stream()
                .map(person -> person.toString())
                .collect(Collectors.toList());
        return new ResponseEntity<>(listarPessoas, HttpStatus.OK);
    }


    @PostMapping
    public ResponseEntity<List<ModelPerson>> adicionar(@RequestBody List<ModelPerson> pessoas) {
        List<ModelPerson> pessoasAdicionadas = repositoryPerson.saveAll(pessoas);
        return new ResponseEntity<>(pessoasAdicionadas, HttpStatus.CREATED);
    }

}
