public class Ganho {
  private String ganhos;
  private String tipo;
  private int ano;
  private int mes;
  private int dia;
  private String data;
  private double valor;
    
    // construtor da classe
  public Ganho (String ganhos, String tipo, int ano, int mes, int dia, double valor) {
        this.ganhos = ganhos;
        this.tipo = tipo;
        this.ano = ano;
        this.mes = mes;
        this.dia = dia;
        this.data = Integer.toString(dia)+"/"+Integer.toString(mes)+"/"+Integer.toString(ano);
        this.valor = valor;
    }
    
    // métodos getters e setters para cada atributo
  public String getGanhos() {
        return ganhos;
    }
    
  public void setGanhos(String ganhos) {
        this.ganhos = ganhos;
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

  public int getAno() {
        return ano;
    }

  public int getMes() {
        return mes;
    }

  public int getDia() {
        return dia;
    }
    
  public double getValor() {
        return valor;
    }
    
  public void setValor(double valor) {
        this.valor = valor;
    }

  @Override
  public String toString(){
    return ("Ganho{ganho="+getGanhos()+" tipo= "+getTipo()+" valor = "+getValor()+" hdata= "+getData()+" }");
  }
  //metodo de planilhagem
  public String planilha(){
    return(getGanhos()+"    "+getTipo()+"    "+getValor()+ "    "+getData()); 
  }
}
