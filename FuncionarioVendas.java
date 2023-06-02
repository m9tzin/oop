
public class FuncionarioVendas extends Funcionario {
	private double valorTotalVendas=0;

	public FuncionarioVendas(String nome, String email, double salarioBase, String cargo, double valorTotalVendas) {
		super(nome, email, salarioBase, cargo);
	}

	public double getValorTotalVendas() {
		return valorTotalVendas;
	}
	public void setValorTotalVendas(double valorTotalVendas) {
		this.valorTotalVendas = valorTotalVendas;
	}
	
	public void efetuarVenda(double valorVenda) {
		this.valorTotalVendas += this.valorTotalVendas+valorVenda;
	}
	
	public void mostrarSalarioVendas() {
		this.setSalarioBase(this.getSalarioBase()+this.getValorTotalVendas()*5/100);
		System.out.println("Salário do Vendedor " + this.getNome()+ ": R$"+ this.getSalarioBase());
	}

	@Override
	public String toString() {
		return "FuncionarioVendas [Valor Total Vendas:" + getValorTotalVendas() + ", Nome:" + getNome()
				+ ", Email:" + getEmail() + ", Salario:" + getSalarioBase() + ", Cargo:" + getCargo()
				+ "]";
	}
	

}
