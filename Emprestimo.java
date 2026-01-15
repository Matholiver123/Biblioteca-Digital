public class Emprestimo {

    private Livro livro;
    private Usuario usuario;
    private boolean ativo;

    public Emprestimo(Livro livro, Usuario usuario) {
        this.livro = livro;
        this.usuario = usuario;

        if (livro.isDisponivel()) {
            livro.setDisponivel(false);
            this.ativo = true;
            System.out.println("Empréstimo realizado com sucesso!");
        } else {
            this.ativo = false;
            System.out.println("Livro indisponível para empréstimo.");
        }
    }

    public void devolverLivro() {
        if (ativo) {
            livro.setDisponivel(true);
            ativo = false;
            System.out.println("Livro devolvido com sucesso!");
        } else {
            System.out.println("Este empréstimo já foi finalizado.");
        }
    }

    public void exibirDados() {
        System.out.println("Usuário: " + usuario.getNome());
        System.out.println("Livro: " + livro.getTitulo());
        System.out.println("Empréstimo ativo: " + ativo);
    }
}
