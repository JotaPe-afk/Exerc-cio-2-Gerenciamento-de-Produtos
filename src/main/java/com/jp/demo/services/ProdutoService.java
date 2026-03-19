package com.jp.demo.services;

import com.jp.demo.models.ProdutoModel;
import com.jp.demo.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Service
public class ProdutoService {

    @Autowired
    private ProdutoRepository produtoRepository;

    public ProdutoModel cadastrar(ProdutoModel produtoModel) {
        return produtoRepository.save(produtoModel);
    }

    public List<ProdutoModel> findAll() {
        return produtoRepository.findAll();
    }

    public void delete(Long id) {
        produtoRepository.deleteById(id);
    }

    public ProdutoModel atualizar(Long id, ProdutoModel produtoModel) {
        ProdutoModel produto = produtoRepository.findById(id).get();

        produto.setNome(produtoModel.getNome());
        produto.setPreco(produtoModel.getPreco());
        produto.setEstoque(produtoModel.getEstoque());

        return produtoRepository.save(produto);
    }
}
