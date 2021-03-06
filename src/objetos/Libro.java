package objetos;


public class Libro {
	/**
	 * Esta clase se utiliza para la creacion y gestion de datos de Objetos Libro 
	 * @param titulo Titulo del Libro que se le pasa al metodo como parametro
	 * @param editorial Editorial del Libro que se le pasa al metodo como parametro
	 * @param paginas Numero de paginas del Libro que se le pasa al metodo como parametro
	 * @param altura Altura del Libro en milimetros que se le pasa al metodo como parametro
	 * @param notas Notas sobre el Libro que se le pasa al metodo como parametro
	 * @param isbn Numero ISBN del Libro que se le pasa al metodo como parametro
	 * @param materias Materias sobre las que trata el Libro que se le pasa al metodo como parametro
	 * @author Asier, Jonatan 
	 */

	private String titulo;
	private String editorial;
	private int paginas;
	private float altura;
	private String notas;
	private String isbn;
	private String materias;
	

	public Libro(String titulo, String editorial, int paginas, float altura, String notas, String isbn,
			String materias) {

		this.titulo = titulo;
		this.editorial = editorial;
		this.paginas = paginas;
		this.altura = altura;
		this.notas = notas;
		this.isbn = isbn;
		this.materias = materias;

	}

	public Libro() {
		// TODO Auto-generated constructor stub
	}

	public String getTitulo() {
		return titulo;
	}

	public String getEditorial() {
		return editorial;
	}

	public int getPaginas() {
		return paginas;
	}

	public float getAltura() {
		return altura;
	}

	public String getNotas() {
		return notas;
	}

	public String getIsbn() {
		return isbn;
	}

	public String getMaterias() {
		return materias;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public void setEditorial(String editorial) {
		this.editorial = editorial;
	}

	public void setPaginas(int paginas) {
		this.paginas = paginas;
	}

	public void setAltura(float altura) {
		this.altura = altura;
	}

	public void setNotas(String notas) {
		this.notas = notas;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public void setMaterias(String materias) {
		this.materias = materias;
	}

}