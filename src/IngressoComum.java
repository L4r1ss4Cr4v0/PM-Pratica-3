public class IngressoComum extends Ingresso{

    public IngressoComum(int codigo,
    String nomeEvento,
    String setor,
    double valorBase){
        super(codigo, nomeEvento, setor, valorBase);
    }

    @Override
    double calcularValorFinal() {
        return getValorBase();
    }

    @Override
    String obterBeneficios() {
        return "Não possui benefícios adicionais";
    }

    

}