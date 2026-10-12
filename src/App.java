import java.util.Scanner;

public class App {
    
    public static void menu() {
        System.out.println("(a) Cadastrar ingresso");
        System.out.println("(b) Remover ingresso");
        System.out.println("(c) Buscar ingresso por código");
        System.out.println("(d) Listar todos os ingressos");
        System.out.println("(e) Calcular arrecadação total");
        System.out.println("(f) Listar benefícios dos ingressos");
        System.out.println("(g) Finalizar");
    }
    
    public static void main(String[] args) throws Exception {
        
        Scanner input = new Scanner(System.in);
        String op = "";

        Bilheteria bilheteria = new Bilheteria();

        do {
            menu();
            op = input.nextLine();
            
            switch (op) {
                case "a":
                    
                    System.out.print("Codigo: ");
                    int codigo = input.nextInt();
                    input.nextLine(); 
                    System.out.println("Nome Evento: ");
                    String nomeEvento = input.nextLine();

                    System.out.println("Setor: ");
                    String setor = input.nextLine();

                    System.out.println("Valor Base: ");
                    Double valorBase = input.nextDouble();
                    input.nextLine();

                    System.out.println("Nome " + nomeEvento);
                    
                    System.out.println("Qual tipo de contato você deseja criar? ");
                    System.out.println("a - Comum");
                    System.out.println("b - Estudante");
                    System.out.println("c - VIP");
                    
                    
                    String tipo = input.nextLine(); 
                    
                    switch (tipo) {
                        case "a":                           
                        System.out.println(nomeEvento);    
                        IngressoComum ic = new IngressoComum(codigo, nomeEvento, setor, valorBase);
                        bilheteria.adicionarIngresso(ic);
                        break;
                        
                        case "b":
                            System.out.print("Instituição Ensino: ");
                            String instituicaoEnsino = input.nextLine();
                            
                            IngressoEstudante ie = new IngressoEstudante(codigo, nomeEvento, setor, valorBase, instituicaoEnsino);
                            
                            bilheteria.adicionarIngresso(ie);
                            
                            break;
                            case "c":
                                boolean acessoBackstage = false;
                                
                                System.out.print("Acesso ao Backstage: ");
                                System.out.print("(a) - Sim");
                                System.out.print("(b) - Não");
                                String opcaoBack = input.nextLine();
                                
                                if (opcaoBack.equals("a")) {
                                    acessoBackstage = true;
                                }
                                else if (!opcaoBack.equals("b")){
                                    System.out.println("Opção Inválida! Acesso ao Backstage colocado como falso");
                                }

                                System.out.print("Número Lounge: ");
                            int numeroLounge = input.nextInt();
                            
                            IngressoVIP iv = new IngressoVIP(codigo, nomeEvento, setor, valorBase, acessoBackstage, numeroLounge);
                            
                            bilheteria.adicionarIngresso(iv);
                            
                        }    
                        
                        break;
                        case "b":
                            System.out.println("Código: ");
                            int cod = input.nextInt();
                            
                            bilheteria.removeIngresso(cod);
                            
                            break;
                        case "c":
                            System.out.println("Código: ");
                            int codi = input.nextInt();
                            
                            Ingresso i = bilheteria.buscaIngresso(codi);
                            
                            if (i == null){
                                System.out.println("Ingresso não encontrado");
                            } else {
                                i.exibirDados();
                            }
                            
                            break;
                        case "d":
                            bilheteria.listarIngressos();
                            
                            break;
                        case "e":
                            double total = bilheteria.calcularArrecadacaoTotal();
                            
                            System.out.println("Total arrecadado: R$ " + total + "\n");
                            
                            break;
                        case "f":
                            bilheteria.listarBeneficios();
                            break;
                                
                        default:
                            break;    
                        }

                    } while (!op.equals("g"));
                                
    }
}