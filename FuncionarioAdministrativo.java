
public class FuncionarioAdministrativo extends Funcionario {
	private String departamento;

	public FuncionarioAdministrativo(String nome, String email, double salarioBase, String cargo, String departamento) {
		super(nome, email, salarioBase, cargo);
		this.departamento = departamento;
	}

	public String getDepartamento() {
		return departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}

	public void mostrarSalarioAdmin() {
		this.getSalarioBase();
	
	}

	@Override
	public String toString() {
		return "FuncionarioAdministrativo [Departamento:" + getDepartamento() + ", Nome:" + getNome()
				+ ", Email:" + getEmail() + ", Salario:" + getSalarioBase() + ", Cargo:" + getCargo()
				+ "]";
	}
	
	
	
}
