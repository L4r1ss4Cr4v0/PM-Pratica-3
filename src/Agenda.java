import java.util.ArrayList;

public class Agenda {
    private int quantidadeContatos;
    private ArrayList<Contato> contatos;

    Agenda(){
        this.quantidadeContatos = 0;
        this.contatos = new ArrayList<Contato>();
    }

    public int getQuantidadeContatos() {
        return quantidadeContatos;
    }

    public void setQuantidadeContatos(int quantidadeContatos) {
        this.quantidadeContatos = quantidadeContatos;
    }

    public ArrayList<Contato> getContatos() {
        return contatos;
    }

    public void setContatos(ArrayList<Contato> contatos) {
        this.contatos = contatos;
    }

    public void adicionaContato(Contato c){
        setQuantidadeContatos(getQuantidadeContatos() + 1);
        getContatos().add(c);
    }

    public void removeContato(Contato c){
        setQuantidadeContatos(getQuantidadeContatos() - 1);
        if (getContatos().contains(c)){
            this.contatos.remove(c);
            System.out.println("Contato encontrado e removido com sucesso!");
            return;
        }
        System.out.println("Contato não encontrado");
    }

    public Contato buscaPorNome(String nome){
        for (Contato contato : getContatos()) {

            if (contato.getNome().equals(nome)){
                return contato;
            }
        }

        return null;
    }

    public Contato buscaPorEmail(String email){
        for (Contato contato : getContatos()) {
            if (contato.getEmail().equals(email)){
                return contato;
            }
        }

        return null;
    }

    public Contato buscaPorTelefone(String telefone){
        for (Contato contato : getContatos()) {
            if (contato.getTelefone().equals(telefone)){
                return contato;
            }
        }

        return null;
    }

}