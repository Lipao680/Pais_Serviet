package model;

public class PaisTO {
	
	private String nome;
	private double area;
	private long populacao;
	private int id;
	
	
	
	public PaisTO(String nome, double area, long populacao, int id) {
		super();
		this.nome = nome;
		this.area = area;
		this.populacao = populacao;
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getArea() {
		return area;
	}
	public void setArea(double area) {
		this.area = area;
	}
	public long getPopulacao() {
		return populacao;
	}
	public void setPopulacao(long populacao) {
		this.populacao = populacao;
	}
	
	public void setId(int id) {
		this.id = id;
	}

	public int getId() {
		return id;
	}
	
	
}
