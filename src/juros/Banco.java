package juros;

/**
 *
 * @author aline, hugo, izadora, betania e larissa
 * @since 24/11/2017
 */
public class Banco {
   
    private double n1;
    private double des = 0.3;
    
    private double saldoA = 500;
    private double n2;
    
    private double n3;
    private double juros = 0.4;

  /** Metodo para calcular dados do banco */
    
    public void desconto(){
	System.out.println(n1 * des);		

	}

    public void saldo(){
        System.out.println(n2+saldoA);
    }
    
    public void juros(){
        System.out.println(n3*juros);
    }
    
    public double getSaldoA() {
        return saldoA;
    }

    public void setSaldoA (double saldoA) {
        this.saldoA = saldoA;
    }

    public double getN2() {
        return n2;
    }

    public void setN2(double n2) {
        this.n2 = n2;
    }
    
    
    
    
    public double getN1() {
        return n1;
    }

    public void setN1(double n1) {
        this.n1 = n1;
    }

    public double getDes() {
        return des;
    }

    public void setDes(double des) {
        this.des = des;
    }
    
      public double getN3() {
        return n3;
    }

    public void setN3(double n3) {
        this.n3 = n3;
    }

    public double getJuros() {
        return juros;
    }

    public void setJuros(double juros) {
        this.juros = juros;
    }
    
    
}
