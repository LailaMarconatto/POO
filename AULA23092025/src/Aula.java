
public class Aula {

	public static void main(String[] args) {
		/*Relacionamento de classes: 
		 * *coesão -> uma classe deve ter uma função específica, e realiza-lá da melhor forma
		 * **formas de coesão: coincidência, lógica, temporal, procendural, comunicacional, sequencial, funcional
		 * 
		 * *Acoplamento -> uma classe deve estar pouco dependente de outras classes, sendo facil de reutilizar
		 * **formas: Conteúdo, global,
		 * 
		 * **Diagramas estruturais, comportamentais
		 * *diagrama de classe: é o principal componente de qualquer solução orientada a objetos , 
		 *  nele é possivel visualizaar as classes que formam o sistema suas relações, atributos e métodos
		 * ** exemplo:
		 * -----------------------------------------------------------
		 * |					Funcionario							 |
		 * -----------------------------------------------------------
		 * |		atributos(visibilidade, nome, tipo e valor)		 |
		 * |														 |	
		 * |		+sobrenome: String = "Curvello" *publico		 |
		 * |		#grupo: int =1 *protegido						 |
		 * |		-id:int * privado								 |
		 * |														 |
		 * -----------------------------------------------------------
		 * |	métodos(visibilidade, nome, entradas, saida)		 |
		 * |														 |
		 * |		+salario(float,float):double					 |
		 * |		#teste():void									 |
		 * |		-idVerificador():int							 |
		 * |														 |
		 * -----------------------------------------------------------
		 * 
		 * 
		 * -- Generalização: herança, relacionamento geral ou genérico e um específico.
		 * exemplo:
		 *  -----------					-----------
		 * |  moto	   |			   |  veiculo  |
		 * |-----------| ------------> |-----------|
		 * |-----------|			   |-----------|
		 *  ----------- 				-----------
		 * seta não pontilhada, saindo do filho para o pai
		 * 
		 * -- Dependência
		 * -- Associação
		 *   - Agregação 
		 *   - Composição
		 *   
		 * exercicio: classe pessoa(nome), classe pessoa fisica(cpf), classe pessoa juridica(cnpj)
		 */

	}

}
