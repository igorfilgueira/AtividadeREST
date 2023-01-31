package com.ecommerce.igorfilgueira.controller;

import java.util.ArrayList;
import java.util.List;

import com.ecommerce.igorfilgueira.model.PessoaModel;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PessoaController {

    private List<PessoaModel> pessoas = new ArrayList<>();

    @PostMapping("/pessoas")
    public PessoaModel inserir(@RequestBody PessoaModel pessoaModel) {
        pessoas.add(pessoaModel);
        return pessoaModel;
    }

    @PutMapping("/pessoas/{id}")
    public PessoaModel atualizar(@PathVariable Long id, @RequestBody PessoaModel pessoaModel) {
        for (int i = 0; i < pessoas.size(); i++) {
            if (pessoas.get(i).getId().equals(id)) {
                pessoas.set(i, pessoaModel);
                break;
            }
        }
        return pessoaModel;
    }

    @DeleteMapping("/pessoas/{id}")
    public void deletar(@PathVariable Long id) {
        for (int i = 0; i < pessoas.size(); i++) {
            if (pessoas.get(i).getId().equals(id)) {
                pessoas.remove(i);
                break;
            }
        }
    }

    @GetMapping("/pessoas/{id}")
    public PessoaModel obterPorId(@PathVariable Long id) {
        for (PessoaModel pessoa : pessoas) {
            if (pessoa.getId().equals(id)) {
                return pessoa;
            }
        }
        return null;
    }

    @GetMapping("/pessoas")
    public List<PessoaModel> obterTodas() {
        return pessoas;
    }
}