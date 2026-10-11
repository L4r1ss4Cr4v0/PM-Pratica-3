import java.util.Scanner;

public class App {
    
    public static void menu() {
        System.out.println("(a) Adicionar contato");
        System.out.println("(b) Remover contato");
        System.out.println("(c) Buscar contato por nome");
        System.out.println("(d) Buscar contato por email");
        System.out.println("(e) Buscar contato por telefone");
        System.out.println("(f) Consultar tamanho da Agenda");
        System.out.println("(g) Finalizar");
    }
    
    public static void main(String[] args) throws Exception {
        
        Scanner input = new Scanner(System.in);
        String op = "";

        Agenda agenda = new Agenda();

        do {
            menu();
            op = input.nextLine();
            
            switch (op) {
                case "a":

                    System.out.print("Nome: ");
                    String nome = input.nextLine();
                    System.out.print("Email: ");
                    String email = input.nextLine();
                    System.out.print("Telefone: ");
                    String telefone = input.nextLine();
                    
                    System.out.println("Qual tipo de contato você deseja criar? ");
                    System.out.println("a - Pessoal");
                    System.out.println("b - Profissional");
                    System.out.println("c - Emergência");
                    String tipo = input.nextLine(); 
                    
                    switch (tipo) {
                        case "a":
                            System.out.print("Dt. Niver: ");
                            String dta = input.nextLine();
                            System.out.print("Parentesco: ");
                            String parentesco = input.nextLine();
                            
                            ContatoPessoal cp = new ContatoPessoal(nome, email, telefone, dta, parentesco);

                            agenda.adicionaContato(cp);

                            
                            break;
                        case "b":
                            System.out.print("Empresa: ");
                            String empresa = input.nextLine();
                            System.out.print("Cargo: ");
                            String cargo = input.nextLine();
                            
                            ContatoProfissional cpr = new ContatoProfissional(nome, email, telefone, empresa, cargo);

                            agenda.adicionaContato(cpr);
                            
                            break;
                        case "c":
                            System.out.print("Grau de Prioridade: ");
                            int grau = input.nextInt();
                            System.out.print("Observações: ");
                            String obs = input.nextLine();
                            
                            ContatoEmergencia ce = new ContatoEmergencia(nome, email, telefone, grau, obs);

                            agenda.adicionaContato(ce);
                            
                            break;
                            
                            default:
                                System.out.print("Opção Inválida!");
                            break;
                    }                  
                    break;
                case "b":
                    System.out.println("Nome: ");
                    String nm = input.nextLine();
                    Contato contato = agenda.buscaPorNome(nm);

                    if(contato != null){
                        agenda.removeContato(contato);
                    }
                    else{
                        System.out.print("Contato não encontrado");
                    }


                    break;
                case "c":
                    System.out.println("Nome: ");
                    String n = input.nextLine();
                    Contato contatoNomeAchado = agenda.buscaPorNome(n);

                    contatoNomeAchado.exibirDados();
                    break;
                case "d":
                    System.out.println("Email: ");
                    String e = input.nextLine();
                    Contato contatoEmailAchado = agenda.buscaPorEmail(e);
                    
                    contatoEmailAchado.exibirDados();
                    break;
                case "e":
                    System.out.println("Telefone: ");
                    String t = input.nextLine();
                    Contato contatoTelefoneAchado = agenda.buscaPorTelefone(t);
                    
                    contatoTelefoneAchado.exibirDados();
                    break;
                        
                case "f":
                    System.out.println("Número de contatos: " + agenda.getQuantidadeContatos());
                    break;
            
                default:
                    break;
            }
        } while (!op.equals("g"));
    }
}
