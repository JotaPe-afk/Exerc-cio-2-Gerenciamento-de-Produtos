package com.jp.demo.controllers;

import com.jp.demo.models.ProdutoModel;
import com.jp.demo.services.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/produto")
public class ProdutoController {

    @Autowired
    private ProdutoService produtoService;

    @PostMapping
    public ProdutoModel cadastrar(ProdutoModel produtoModel) {
        return produtoService.cadastrar(produtoModel);
    }

    @GetMapping
    public List<ProdutoModel> findAll() {
        return produtoService.findAll();
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        produtoService.delete(id);
    }

    @PutMapping("/{id}")
    public ProdutoModel atualizar(@PathVariable Long id, @RequestBody ProdutoModel produtoModel) {
        return produtoService.atualizar(id, produtoModel);
    }
}
