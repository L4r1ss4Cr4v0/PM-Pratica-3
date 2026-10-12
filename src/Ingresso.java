abstract class Ingresso {

    private int codigo;
    private String nomeEvento;
    private String setor;
    private double valorBase;

    Ingresso(int codigo,
    String nomeEvento,
    String setor,
    double valorBase)
    {
        this.codigo = codigo;
        this.nomeEvento = nomeEvento;
        this.setor = setor;
        this.valorBase = valorBase;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getNomeEvento() {
        return nomeEvento;
    }

    public String getSetor() {
        return setor;
    }

    public double getValorBase() {
        return valorBase;
    }
    
    void exibirDados(){
        System.out.format("Código:  %d\nNome Evento: %s\nSetor: %s\nValor: R$ %.2f%n\n", getCodigo(), getNomeEvento(), getSetor(), calcularValorFinal());
    }

    abstract double calcularValorFinal(); 
    
    abstract String obterBeneficios();


}
