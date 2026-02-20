package aula1410;

public class HomeTheaterMain {

	public static void main(String[] args) {
		
		/*EquipamentoEletronico ee = new EquipamentoEletronico();
		ee.setConsumo(220);
		ee.setTensao(220);
		System.out.println(ee);
		
		SistemaDeSom ss = new SistemaDeSom();
		ss.setMarca("IFC");
		ss.setModelo("BCC");
		ss.setPotencia(1);
		ss.setConsumo(220);
		ss.setTensao(220);
		System.out.println(ss);
		
		SistemaDeVideo sv = new SistemaDeVideo();
		sv.setMarca("IFC");
		sv.setModelo("BCC");
		sv.setTipo("LED");
		sv.setResolucao("2200 x 1300");
		sv.setConsumo(220);
		sv.setTensao(220);
		System.out.println(sv);*/
		
		HomeTheater ht = new HomeTheater();
		ht.som.setMarca("IFC");
		ht.video.setMarca("LG");
		System.out.println(ht);
		
	}
	
}
