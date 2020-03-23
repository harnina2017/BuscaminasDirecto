package model;

public class Casilla {
	//Comentario hecho en la rama modelo jose

	//Desde mi punto de vista la coordenada no pertenece a la casilla
	
	private boolean mina=false;
	private boolean velada=true;
	private boolean marcada=false;
	private int minasAlrededor=0;
	private boolean maquillado=true;
	
	public Casilla() {
		
	}
	public boolean isMina() {
		return mina;
	}
	public void setMina(boolean mina) {
		this.mina = mina;
	}
	public boolean isVelada() {
		return velada;
	}
	public void setVelada(boolean velada) {
		this.velada = velada;
	}
	public boolean isMarcada() {
		return marcada;
	}
	public void setMarcada(boolean marcada) {
		this.marcada = marcada;
	}
	public int getMinasAlrededor() {
		return minasAlrededor;
	}
	public void setMinasAlrededor(int minasAlrededor) {
		this.minasAlrededor = minasAlrededor;
	}
	@Override
	public String toString() {
		return String.valueOf(mina);
	}
	
	
	
}
