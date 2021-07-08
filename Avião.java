package OrientacaoObjetos;

public class Avião {
		
	private String modelo;
	private String companhiaAerea;
	private int capacidadeMaxP = 0;
	private String cor;
	
	public void  voar() {
		System.out.println("O avião está em pleno voo");
	  
	}
	
	public void aterrissar() {
		System.out.println("O avião esta aterrissando no aeroporto");
			
	}
	public String getModelo() {
		return modelo;
	  
	}
	
	public void  setmodelo(String modelo) {
		this.modelo = modelo;
	  
	}
	public String getcompanhiaAerea() {
		return companhiaAerea;
	  
	}
	
	public void  setcompanhiaAerea(String companhiaAerea) {
		this.companhiaAerea = companhiaAerea;
	  
	}
	public int getcapacidadeMaxP() {
		return capacidadeMaxP;
	  
	}
	
	public void  setcapacidadeMaxP(int capacidadeMaxP) {
		this.capacidadeMaxP = capacidadeMaxP;
		
	}
	public String getcor() {
		return cor;
	  
	}
	
	public void  setcor(String cor) {
		this.cor = cor;
		
	}
}
