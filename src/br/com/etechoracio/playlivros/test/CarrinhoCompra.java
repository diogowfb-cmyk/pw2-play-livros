package br.com.etechoracio.playlivros.test;

import br.com.etechoracio.playlivros.enums.VersaoEnum;
import br.com.etechoracio.playlivros.model.Livro;

import java.time.LocalTime;

public class CarrinhoCompra {
    static void main() {
        Livro primeiroLivro = new Livro();
        primeiroLivro.titulo = "O poder do Hábito";
        primeiroLivro.autor = "Charles Duhing";
        primeiroLivro.narrador = "Carlos Seidl";
        primeiroLivro.editora = "Objetiva";
        primeiroLivro.duracao = LocalTime.of (10, 45);
        primeiroLivro.versao = VersaoEnum.ESTENDIDA;
        primeiroLivro.preco = 29.90;
        primeiroLivro.resumo = "Esse livro fala sobre lobisomens.";
    }
}
