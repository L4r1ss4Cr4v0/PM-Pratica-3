class ContatoEmergencia extends Contato {
    private int grauPrioridade;
    private String observacao;

    ContatoEmergencia(String nome, String email, String telefone, int grauPrioridade, String observacao){
        super(nome, email, telefone);

        if (isGrauPrioridadeValid(grauPrioridade)) {
            this.grauPrioridade = grauPrioridade;
        }
        else{
            if (grauPrioridade > 5) {
                this.grauPrioridade = 5;
            }
            else{
                this.grauPrioridade = 1;
            }
        }

        this.observacao = observacao;
    }

    public int getGrauPrioridade() {
        return grauPrioridade;
    }

    public void setGrauPrioridade(int grauPrioridade) {
        this.grauPrioridade = grauPrioridade;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }


    private boolean isGrauPrioridadeValid(int grau){
        if (grau < 1 || grau > 5) {
            return false;
        }
        return true;
    }

    @Override
    void exibirDados() {
        super.exibirDados();
        System.out.println("Grau de Prioridade: " + getGrauPrioridade());
        System.out.println("Observações: " + getObservacao());
    }

}
