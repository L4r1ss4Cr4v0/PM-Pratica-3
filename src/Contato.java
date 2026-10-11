abstract class Contato {
    private String nome;
    private String email;
    private String telefone;

    Contato(String nome,String email,String telefone){
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }
    
    public String getTelefone() {
        return telefone;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }


    void exibirDados(){
        System.out.format("Nome:  %s\nEmail: %s\nTelefone: %s\n", nome, email, telefone);
    }
}
