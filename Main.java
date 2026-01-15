import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Livro livro = new Livro();

        System.out.print("Digite o título do livro: ");
        livro.setTitulo(scanner.nextLine());

        System.out.print("Digite o nome do autor: ");
        livro.setAutor(scanner.nextLine());

        System.out.print("Digite o ISBN: ");
        livro.setIsbn(scanner.nextInt());

        Usuario usuario = new Usuario();
        usuario.setNome("Matheus");
        usuario.setId(1);

        Emprestimo emprestimo = new Emprestimo(livro, usuario);
        emprestimo.exibirDados();

        emprestimo.devolverLivro();
        emprestimo.exibirDados();

        scanner.close();
    }
}
