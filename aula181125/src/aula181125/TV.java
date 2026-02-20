package aula181125;

public class TV extends EquipamentoEletronico implements IControle{
	private String marca;
	private String modelo;
	private int volume;
	private int canal;
	
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public int getVolume() {
		return volume;
	}
	public void setVolume(int volume) {
		this.volume = volume;
	}
	public int getCanal() {
		return canal;
	}
	public void setCanal(int canal) {
		this.canal = canal;
	}
	
	@Override
	public boolean ligaDesliga() {
		if(this.getEstado()) {
			this.setEstado(false);
		}
		else {
			this.setEstado(true);
		}
		return true;
	}
	
	@Override
	public int alterarCanal(int canal) {
		this.setCanal(canal);
		return 0;
	}
	
	@Override
	public int canalMais() {
		int canal = this.getCanal();
		canal += 1;
		return canal;
	}
	
	@Override
	public int canalMenos() {
		int canal = this.getCanal();
		canal -= 1;
		return canal;
	}
	
	@Override
	public int volumeMais() {
		int volume = this.getVolume();
		volume += 1;
		return volume;
	}
	
	@Override
	public int volumeMenos() {
		int volume = this.getVolume();
		volume -= 1;
		return volume;
	}	

}
