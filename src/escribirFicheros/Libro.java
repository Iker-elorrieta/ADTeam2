package escribirFicheros;

public class Libro {
	private String titulo;
	private String editorial;
	private int paginas;
	private double altura;
	private int notas;
	private String isbn;
	private String materias;

	public Libro(String titulo, String editorial, int paginas, double altura, int notas, String isbn, String materias) {

		this.titulo = titulo;
		this.editorial = editorial;
		this.paginas = paginas;
		this.altura = altura;
		this.notas = notas;
		this.isbn = isbn;
		this.materias = materias;
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

	public double getAltura() {
		return altura;
	}

	public int getNotas() {
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

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public void setNotas(int notas) {
		this.notas = notas;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public void setMaterias(String materias) {
		this.materias = materias;
	}

}
