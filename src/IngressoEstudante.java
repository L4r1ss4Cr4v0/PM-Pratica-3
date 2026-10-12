public class IngressoEstudante extends Ingresso {
    private String instituicaoEnsino;

    public IngressoEstudante(int codigo,
    String nomeEvento,
    String setor,
    double valorBase, String instituicaoEnsino){
        super(codigo, nomeEvento, setor, valorBase);
        this.instituicaoEnsino = instituicaoEnsino;
    }

    public String getInstituicaoEnsino() {
        return instituicaoEnsino;
    }

    public void setInstituicaoEnsino(String instituicaoEnsino) {
        this.instituicaoEnsino = instituicaoEnsino;
    }

    @Override
    public void exibirDados() {
        super.exibirDados();
        System.out.println("Instituição Ensino: " + getInstituicaoEnsino());
    }

    @Override
    double calcularValorFinal() {
        return getValorBase() * 0.5;
    }

    @Override
    String obterBeneficios() {
        return "Direito à meia-entrada";
    }

}
