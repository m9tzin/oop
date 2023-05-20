
public class Compositor {
	public String nome;
	public String pais;
	public Musica[] musicas;
	

	Compositor(String nome, String pais){
		
		System.out.println("Objeto Compositor de nome: " + nome + ", e pais: " + pais);
	
		this.nome = nome;
		this.pais = pais;
		
	}
	
	public void listarMusicas() {
		for(Musica musica: musicas) {
			System.out.println("Musica: "+musica.titulo+ ", de "+musica.compositor.nome);
		}
	}
	
	void definirMusicas(String[] nomesDasMusicas) {
		
		System.out.println("O compositor " +nome+ " vai criar objetos Musica baseada numa lista de " +nomesDasMusicas.length+ " titulos de musicas");
		
		musicas = new Musica[nomesDasMusicas.length];
		
		for(int i=0;i<nomesDasMusicas.length;i++) {
			
			musicas[i]= new Musica(nomesDasMusicas[i], this);
		}
	}
	
}
