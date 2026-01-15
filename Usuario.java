public class Usuario {
   private String nome;
   private int id; 

   public String getNome() {
    return nome;
}

public void setNome(String nome) {
    this.nome = nome;
}

public int getId() {
    return id;
}

public void setId(int id) {
    this.id = id;
}
public void exibirDados() {
    System.out.println("Nome: " + nome);
    System.out.println("ID: " + id);
}

}
