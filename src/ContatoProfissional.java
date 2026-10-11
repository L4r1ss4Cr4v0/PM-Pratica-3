public class ContatoProfissional extends Contato {
    private String empresa;
    private String cargo;

    public ContatoProfissional(String nome, String email, String telefone, String empresa, String cargo){
        super(nome, email, telefone);
        this.empresa = empresa;
        this.cargo = cargo;
    }

    @Override
    public void exibirDados() {
        super.exibirDados();
        System.out.println("Empresa: " + empresa);
        System.out.println("Cargo: " + cargo);
    }

}
