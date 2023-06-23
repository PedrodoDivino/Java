package Cursos;

public class AlunoVip extends Aluno {

    private Double descontoVip = 0.5;

    public AlunoVip() {
        super();
    }

    public Double getDescontoVip() {
        return descontoVip;
    }

    public void setDescontoVip(Double descontoVip) {
        this.descontoVip = descontoVip;
    }

    public AlunoVip(Double descontoVip) {
        super();
        this.descontoVip = descontoVip;
    }

    public Double getDesconto() {
        return descontoVip;
    }


    public void setDesconto(Double desconto) {
        this.descontoVip = desconto;
    }

    public double mensalidade() {
        double valorMensal = 99.00;
        double desconto = 0.5;
        double totalValor = valorMensal - desconto;
        return totalValor;
    }

}
