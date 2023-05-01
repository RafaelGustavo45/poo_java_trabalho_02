public class Despezas {
  private String gasto;
  private String tipo;
  private int ano;
  private int mes;
  private int dia;
  private String data;
  private double valor;
  private String formaPagamento;

    // Construtor da classe
  public Despezas(String gasto, String tipo, int ano, int mes, int dia ,double valor, String formaPagamento) {
        this.gasto = gasto;
        this.tipo = tipo;
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
        this.data = Integer.toString(dia)+"/"+Integer.toString(mes)+"/"+Integer.toString(ano);
        this.valor = valor;
        this.formaPagamento = formaPagamento;
    }

    // Métodos getters e setters para cada atributo
  public String getGasto() {
        return gasto;
    }

  public void setGasto(String gasto) {
        this.gasto = gasto;
    }

  public String getTipo() {
        return tipo;
    }

  public void setTipo(String tipo) {
        this.tipo = tipo;
    }

  public String getData() {
        return data;
    }

  public void setData(int ano, int mes, int dia) {
        this.ano = ano;
        this.mes = mes;
        this.dia = dia;
        this.data = Integer.toString(dia)+"/"+Integer.toString(mes)+"/"+Integer.toString(ano);
    }

    public double getValor() {
        return valor;
    }

    public int getAno() {
        return ano;
    }

    public int getMes() {
        return mes;
    }

    public int getDia() {
        return dia;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getFormaPagamento() {
        return formaPagamento;
    }

    public void setFormaPagamento(String formaPagamento) {
        this.formaPagamento = formaPagamento;
    }

  @Override
  public String toString(){
    return ("Despezas{gasto ="+ getGasto() + " tipo= " +getTipo() + " valor= " + getValor() + "forma de pagamento = " + getFormaPagamento() + " data = " + getData() + "}");
  }
  
  //metodo de planilhagem

  public String planilha(){
    return (getGasto()+"    "+getTipo()+"    "+getValor()+ "    "+ getFormaPagamento()+"    "+getData()); 
  }
}
