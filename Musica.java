
public class Musica {
	public String titulo;
	public Compositor compositor;
	
	
	Musica(String titulo, Compositor compositor){
		
		System.out.println("Objeto Musica de titulo: " + titulo + ", de Compositor " + compositor.nome);
		this.titulo = titulo;
		this.compositor = compositor;
		
	}
	
	void mostrarCompositor() {
		
		System.out.println("Compositor: " + compositor.nome);
		
	}
	
}
