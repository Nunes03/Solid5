package solid5;

public class Carro{
	int velocidade = 0;
	boolean isLigado = false;
	
	public void acelerarCarro() {
		this.velocidade++;
	}
	
	public void freiarCarro() {
		if(velocidade > 1) {
			this.velocidade--;

		} else {
			this.velocidade = 0;
		}
	}
	
	public void ligarCarro() {
		this.isLigado = true;
	}
	
}
