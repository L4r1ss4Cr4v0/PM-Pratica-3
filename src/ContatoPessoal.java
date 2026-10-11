public class ContatoPessoal extends Contato{
    private String parentesco;
    private String dataAniversario;

    public ContatoPessoal(String nome, String email, String telefone, String dataAniversario, String parentesco){
        super(nome, email, telefone);
        this.dataAniversario = dataAniversario;
        this.parentesco = parentesco;
    }

    public String getParentesco() {
        return parentesco;
    }

    public void setParentesco(String parentesco) {
        this.parentesco = parentesco;
    }

    public String getDataAniversario() {
        return dataAniversario;
    }

    public void setDataAniversario(String dataAniversario) {
        this.dataAniversario = dataAniversario;
    }

    @Override
    void exibirDados() {
        super.exibirDados();
        System.out.println("Data de Aniversário: " + getDataAniversario());
        System.out.println("Parentesco: " + getParentesco());
    }

}