package com.example.clinicaOdontologica.controller;

import com.example.clinicaOdontologica.model.Dentista;
import com.example.clinicaOdontologica.service.impl.DentistaServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/dentista")
public class DentistaController {

    @Autowired
    private DentistaServiceImpl dentistaService;

    @GetMapping
    public Dentista salvar(
            @RequestParam(value = "id") Integer id,
            @RequestParam(value = "nome") String nome,
            @RequestParam(value = "email") String email,
            @RequestParam(value = "numMatrícula") Integer numMatrícula,
            @RequestParam(value = "atendeConvenio") String atendeConvenio){

        return dentistaService.salvar(new Dentista(id, nome, email, numMatrícula, atendeConvenio));
    }

    @GetMapping("/buscar")
    public List<Dentista> buscarTodos(){
        return dentistaService.buscarTodos();
    }

    @GetMapping("/{id}")
    public String excluir(@PathVariable Integer id){
        return dentistaService.excluir(id);
    }

}
