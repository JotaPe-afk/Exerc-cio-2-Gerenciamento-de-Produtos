package com.jp.demo.models;
import jakarta.persistence.*;
import java.math.BigDecimal;

@Entity(name = "Produto")
@Table(name = "tb_produto")
public class ProdutoModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    @Column(name = "NomeProd")
    String nome;

    BigDecimal preco;

    @Column(name = "Quantidade")
    Integer estoque;

    public ProdutoModel() {}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public BigDecimal getPreco() {
        return preco;
    }

    public void setPreco(BigDecimal preco) {
        this.preco = preco;
    }

    public Integer getEstoque() {
        return estoque;
    }

    public void setEstoque(Integer estoque) {
        this.estoque = estoque;
    }
}
