
public class Funcionario {
	
	private String nome;
	private String email;
	private double salarioBase;
	private String cargo;
	
	
	public Funcionario(String nome, String email, double salarioBase, String cargo) {
		
		this.nome = nome;
		this.email = email;
		this.cargo = cargo;
		this.salarioBase = salarioBase;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public double getSalarioBase() {
		return salarioBase;
	}


	public void setSalarioBase(double salarioBase) {
		this.salarioBase = salarioBase;
	}


	public String getCargo() {
		return cargo;
	}


	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	
	
	
	
	
	
	
	
	
}
