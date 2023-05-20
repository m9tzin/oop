 /* Aluno: Matheus Sousa Marinho 
*/
public class Principal {

	public static void main(String[] args) {
		
		Compositor Chris = new Compositor("Chris Martin", "EUA");
		
		String[] nomesDasMusicas = {"Lost!", "Viva La Vida"};
		
		
		Chris.definirMusicas(nomesDasMusicas);
		
		Chris.listarMusicas();
		
		
		

	}

}
