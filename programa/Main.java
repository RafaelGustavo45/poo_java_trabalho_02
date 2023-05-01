import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

class Main {
  public static void main(String[] args) {
    //adicionando os leitores
    Scanner leitor = new Scanner(System.in);
    Scanner leitor2 = new Scanner(System.in);
    Scanner leitor3 = new Scanner(System.in);
    Scanner leitor4 = new Scanner(System.in);
    Scanner leitor5 = new Scanner(System.in);
    Scanner leitor6 = new Scanner(System.in);
    Scanner leitor7 = new Scanner(System.in);
    //tempo de slepp
    //lista onde objetos irão ficar
    List<Despezas> listaDespezas = new ArrayList<>();
    List<Ganho> listaGanho = new ArrayList<>();
    //começo da interação
    System.out.println("inserindo despezas e ganhos alinhadamente");
      int a = 0;
      while (a < 3){
        System.out.println("adicionando despezas");
        //adicionando os valores dos atributos de gasto
        System.out.println("-----------------------------");
        System.out.println("qual foi o gasto?");
        String gasto = leitor2.nextLine();
  
        System.out.println("-----------------------------");
        System.out.println("qual foi o tipo?");
        String tipo = leitor2.nextLine();
 
        System.out.println("-----------------------------");
        System.out.println("data: ano?");
        int ano = leitor2.nextInt();

        System.out.println("-----------------------------");
        System.out.println("data: mes?");
        int mes = leitor2.nextInt();
     
        System.out.println("-----------------------------");
        System.out.println("data: dia?");
        int dia = leitor2.nextInt();
       
        System.out.println("-----------------------------");
        System.out.println("qual foi o valor?");
        double valor = leitor2.nextDouble();
       
        System.out.println("-----------------------------");
        System.out.println("qual foi a forma de pagamento?");
        String formaPagamento = leitor3.nextLine();
     
        System.out.println("-----------------------------");
        //mostrando as variaveis para confirmar
        System.out.println("ano: "+ ano +" mes: "+ mes + " dia: " + dia + " valor: "+ valor + " forma pagamento: "+ formaPagamento + "tipo: "+ tipo + " gasto: "+ gasto);
        //colocando os atributos
        Despezas despeza_temporario = new Despezas(gasto, tipo, ano, mes, dia, valor, formaPagamento);
        System.out.println("testando metodo toString");
        System.out.println(despeza_temporario.toString());
        //adicionando na lista
        listaDespezas.add(despeza_temporario);
      
        System.out.println("--------------------------");
        System.out.println("adicionando ganhos");
        System.out.println("--------------------------");
        System.out.println("qual foi o ganho?");
        String ganho2 = leitor2.nextLine();
       
        System.out.println("-------------------------");
        System.out.println("qual foi o tipo?");
        String tipo2 = leitor2.nextLine();
        
        System.out.println("-------------------------");
        System.out.println("data: ano?");
        int ano2 = leitor2.nextInt();
      
        System.out.println("-------------------------");
        System.out.println("data: mes?");
        int mes2 = leitor2.nextInt();
        
        System.out.println("-------------------------");
        System.out.println("data: dia?");
        int dia2 = leitor2.nextInt();
       
        System.out.println("-------------------------");
        System.out.println("qual foi o valor?");
        double valor2 = leitor3.nextDouble();
     
        System.out.println("-------------------------");
        //mostrando as variaveis para confirmar
        System.out.println("ano: "+ ano2 +" mes: "+ mes2 + " dia: " + dia2 + " valor: "+ valor2 + " tipo: "+ tipo2 + " ganho: "+ ganho2);
        //criando o objeto aqui
        Ganho ganho_temporario = new Ganho(ganho2, tipo2, ano2, mes2, dia2, valor2);
        System.out.println("testando metodo toString");
        System.out.println(ganho_temporario.toString());
        //colocando na lista
        listaGanho.add(ganho_temporario);
        //ver se adiciona mais
        System.out.println("-----------------------------");
        System.out.println("quer adicionar mais? (1= não/0 = sim)");
        int confirmar = leitor4.nextInt();
        
        if (confirmar == 0){
          System.out.println("continuando...");
         
        } else {
          a = 10;
          
          System.out.println("aqui está o relatorio");
          //depois fazer aparecer os gastos, os ganhos
          //em forma de planilha e o relatorio mensal
          System.out.println("---------------------");
          System.out.println("relatório de despezas");
          System.out.println("---------------------");
          System.out.println("gasto ;  tipo  ;  valor  ;  forma pagamento  ;  data");
          for(Despezas verificar : listaDespezas){
            System.out.println(verificar.planilha());
          }
          System.out.println("---------------------");
          System.out.println("relatório de ganhos");
          System.out.println("---------------------");
          System.out.println("ganho ;  tipo  ;  valor ; data");
          for(Ganho verificar2 : listaGanho){
            System.out.println(verificar2.planilha());
          }
          System.out.println("---------------------");
          System.out.println("agora faremos o relatorio mensal");
          System.out.println("selecione o ano:");
          int ano3 = leitor6.nextInt();
          System.out.println("-----------------");
          System.out.println("selecione o mes:");
          int mes3 = leitor7.nextInt();
          //com as variaveis de ano e mes faremos a busca em cada lista
          System.out.println("-----------------");
          //variaveis de soma
          double soma_despezas = 0;
          double soma_ganhos = 0;
          //verificando dentro da lista de ganhos
          for(Ganho verificar3 : listaGanho){
            if (verificar3.getAno() == ano3 && verificar3.getMes() == mes3){
              soma_ganhos = soma_ganhos + verificar3.getValor();
            } else {
              soma_ganhos = soma_ganhos;
            }
          }
          //verificando dentro da lista de despezas
          for(Despezas verificar4 : listaDespezas){
            if (verificar4.getAno() == ano3 && verificar4.getMes() == mes3){
              soma_despezas = soma_despezas + verificar4.getValor();
            } else {
              soma_despezas = soma_despezas;
            }
          }
          System.out.println("Relatorio mensal");
          System.out.println("despezas: "+ soma_despezas );
          System.out.println("ganhos: "+ soma_ganhos );
          
        }

        }

  }

}
