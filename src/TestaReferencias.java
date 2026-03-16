public class TestaReferencias {

    static void main() {
        int idade = 16;
        Livro livroA = new Livro();
        livroA.titulo = "Meu livro A";
        System.out.println(livroA.titulo);

        Livro livroB = livroA;
        livroB.titulo = "Meu livro B";
        System.out.println(livroB.titulo);

        System.out.println(livroA.titulo);

    }
}
