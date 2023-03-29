//larissa

package ProjetoJava;

public class Paciente {
	
	private String nome; 
	private String tipoSanguineo;
	private String genero; 
	private int idade; 
	private double peso; 
	private double altura;
	private double imc;
	
	public Paciente(String nome, String tipoSanguineo, String genero, int idade, double peso, double altura) {
		super();
		this.nome = nome;
		this.tipoSanguineo = tipoSanguineo;
		this.genero = genero;
		this.idade = idade;
		this.peso = peso;
		this.altura = altura;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getTipoSanguineo() {
		return tipoSanguineo;
	}
	public void setTipoSanguineo(String tipoSanguineo) {
		this.tipoSanguineo = tipoSanguineo;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	} 
	
	public void visualizar() {
		System.out.println("Nome: " + nome);
		System.out.println("Idade: " + idade);
		System.out.println("Genero: " + genero);
		System.out.println("Tipo sanguineo: " + tipoSanguineo);
		System.out.println("Altura: " + altura);
		System.out.println("Peso: " + peso);
		
	}
	public double calcular(int indice) {

        double imc = peso / (altura * altura);
        return imc;
   }
   public double getImc() {
       return imc;
   }
   public void setImc(double imc) {
       this.imc = imc;
		
	}
   }
	
	
	

