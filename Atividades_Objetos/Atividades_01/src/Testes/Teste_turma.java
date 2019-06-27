package Testes;

import Orientacao_Objetos.Turma;

public class Teste_turma {

	public static void main(String[] args) {
		
		Turma turma_1 =  new Turma();
		Turma turma_2 =  new Turma();
		
		turma_1.periodo = "matutino";
		turma_1.serie = "3º";
		turma_1.sigla = "bla";
		turma_1.Tipo_ensino = "Medio";
		

		turma_2.periodo = "vespertino";
		turma_2.serie = "1º";
		turma_2.sigla = "chp";
		turma_2.Tipo_ensino = "Medio";
		
		
		System.out.println(turma_1.periodo+" "+turma_1.serie+" "+turma_1.sigla+" "+turma_1.Tipo_ensino );
		System.out.println(turma_2.periodo+" "+turma_2.serie+" "+turma_2.sigla+" "+turma_2.Tipo_ensino );

		
		
		

	}

}
