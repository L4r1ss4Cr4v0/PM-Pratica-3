import java.util.ArrayList;

public class Bilheteria {
    private ArrayList<Ingresso> ingressos;

    Bilheteria(){
        this.ingressos = new ArrayList<Ingresso>();
    }

    public ArrayList<Ingresso> getIngressos() {
        return ingressos;
    }

    public void setIngressos(ArrayList<Ingresso> ingressos) {
        this.ingressos = ingressos;
    }

    public void adicionarIngresso(Ingresso i){
        getIngressos().add(i);
    }

    public void removeIngresso(int codigo){

        Ingresso i = buscaIngresso(codigo);

        if ( i != null) {
            
            this.ingressos.remove(i);
            System.out.println("Ingresso encontrado e removido com sucesso!");
            return;
        }
        
        System.out.println("Ingresso não encontrado");
    }

    public Ingresso buscaIngresso(int codigo){
        for (Ingresso ingresso : getIngressos()) {

            if (ingresso.getCodigo() == codigo){
                return ingresso;
            }
        }

        return null;
    }

    public void listarIngressos(){
        for (Ingresso ingresso : ingressos) {
            ingresso.exibirDados();
            System.out.println("\n");
        }
    }

    public double calcularArrecadacaoTotal(){
        double total = 0;
        for (Ingresso ingresso : ingressos) {
            total += ingresso.calcularValorFinal();
        }
        return total;
    }

    public void listarBeneficios(){
        for (Ingresso ingresso : ingressos) {
            System.out.format("Ingresso código %d\n Benefícios: %s\n", ingresso.getCodigo(), ingresso.obterBeneficios());
        }
    }
}