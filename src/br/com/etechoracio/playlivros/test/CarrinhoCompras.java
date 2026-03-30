package br.com.etechoracio.playlivros.test;

import br.com.etechoracio.playlivros.enums.VersaoEnum;
import br.com.etechoracio.playlivros.model.Livro;

import java.time.LocalTime;


public class CarrinhoCompras {
    static void main() {
        Livro primeiroLivro = new Livro();
        primeiroLivro.titulo = "O Poder do Hábito";
        primeiroLivro.autor = "Charles Duhigg";
        primeiroLivro.narrador = "Carlos Seidl";
        primeiroLivro.editora = "Objetiva";
        primeiroLivro.duracao = LocalTime.of(10, 45);
        primeiroLivro.versao = VersaoEnum.INTEGRAL;
        primeiroLivro.preco = 29.90;
        primeiroLivro.resumo = "Explora como os hábitos funcionam e como podem ser transformados.";

        Livro segundoLivro = new Livro();
        segundoLivro.titulo = "Mindset";
        segundoLivro.autor = "Carol S. Dweck";
        segundoLivro.narrador = "Ana Paula Cadamuro";
        segundoLivro.editora = "Objetiva";
        segundoLivro.duracao = LocalTime.of(8, 30);
        segundoLivro.versao = VersaoEnum.RESUMIDA;
        segundoLivro.preco = 24.90;
        segundoLivro.resumo = "Mostra como a mentalidade de crescimento pode impactar o sucesso.";

        // Terceiro livro
        Livro terceiroLivro = new Livro();
        terceiroLivro.titulo = "Pai Rico, Pai Pobre";
        terceiroLivro.autor = "Robert Kiyosaki";
        terceiroLivro.narrador = "Marcelo Sanches";
        terceiroLivro.editora = "Alta Books";
        terceiroLivro.duracao = LocalTime.of(6, 15);
        terceiroLivro.versao = VersaoEnum.ESTENDIDA;
        terceiroLivro.preco = 19.90;
        terceiroLivro.resumo = "Ensina conceitos fundamentais sobre educação financeira.";


    }
}
