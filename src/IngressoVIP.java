public class IngressoVIP extends Ingresso {
    private boolean acessoBackstage;
    private int numeroLounge;

    public IngressoVIP(int codigo,
    String nomeEvento,
    String setor,
    double valorBase, boolean acessoBackstage, int numeroLounge){
        super(codigo, nomeEvento, setor, valorBase);
        this.acessoBackstage = acessoBackstage;
        this.numeroLounge = numeroLounge;
    }

    public int getNumeroLounge() {
        return this.numeroLounge;
    }

    public void setNumeroLounge(int numeroLounge) {
        this.numeroLounge = numeroLounge;
    }

    public boolean getAcessoBackstage() {
        return this.acessoBackstage;
    }

    public void setAcessoBackstage(boolean acessoBackstage) {
        this.acessoBackstage = acessoBackstage;
    }
    

    @Override
    public void exibirDados() {
        super.exibirDados();
        System.out.println("Acesso Backstage: " + getAcessoBackstage());
        System.out.println("Número Lounge: " + getNumeroLounge());
    }

    @Override
    double calcularValorFinal() {
        return getValorBase() * 1.8;
    }

    @Override
    String obterBeneficios() {
        if(acessoBackstage){
            return "Acesso privilegiado ao evento\nAcesso ao backstage";
        }
        return "Acesso privilegiado ao evento";
    }

}
