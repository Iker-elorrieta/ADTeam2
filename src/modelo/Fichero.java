package modelo;

public class Fichero {

	
	private String Titulo;
	private String editorial;
	private int paginas;
	private float altura;
	private double notas;
	private int isbn;
	private String materias;
	
	public Fichero(String titulo, String editorial, int paginas, float altura, double notas, int isbn,
			String materias) {
		super();
		Titulo = titulo;
		this.editorial = editorial;
		this.paginas = paginas;
		this.altura = altura;
		this.notas = notas;
		this.isbn = isbn;
		this.materias = materias;
	}

	public String getTitulo() {
		return Titulo;
	}

	public void setTitulo(String titulo) {
		Titulo = titulo;
	}

	public String getEditorial() {
		return editorial;
	}

	public void setEditorial(String editorial) {
		this.editorial = editorial;
	}

	public int getPaginas() {
		return paginas;
	}

	public void setPaginas(int paginas) {
		this.paginas = paginas;
	}

	public float getAltura() {
		return altura;
	}

	public void setAltura(float altura) {
		this.altura = altura;
	}

	public double getNotas() {
		return notas;
	}

	public void setNotas(double notas) {
		this.notas = notas;
	}

	public int getIsbn() {
		return isbn;
	}

	public void setIsbn(int isbn) {
		this.isbn = isbn;
	}

	public String getMaterias() {
		return materias;
	}

	public void setMaterias(String materias) {
		this.materias = materias;
	}

	
	
	
	
	
}
