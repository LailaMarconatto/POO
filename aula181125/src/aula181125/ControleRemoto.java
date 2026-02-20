package aula181125;

public class ControleRemoto extends EquipamentoEletronico implements IControle{
	private int cargaPilha;

	public int getCargaPilha() {
		return cargaPilha;
	}

	public void setCargaPilha(int cargaPilha) {
		this.cargaPilha = cargaPilha;
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
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int canalMais() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int canalMenos() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int volumeMais() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int volumeMenos() {
		// TODO Auto-generated method stub
		return 0;
	}
	
}
