/**************************************************************
 * UFSCar - Universidade Federal de Sao Carlos. Campus Sorocaba
 **************************************************************
 *
 * Disciplina: Compiladores
 * Docente: Dra Tiemi Christine Sakata
 *
 * Alunos: 
 * 408611 Igor Felipe Ferreira Ceridorio
 * 438340 Daniel Ramos Miola
 *
 * Trabalho de implementacao: Projeto - Fase 1
 *************************************************************/

package AST;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Body extends Prog{
	
	private Dclpart dclpart = null;
	private Compstmt compstmt = null;

	public Body(Dclpart dclpart, Compstmt compstmt){
		this.dclpart  = dclpart;
		this.compstmt = compstmt;
	}

	public Body(Compstmt compstmt){
		this.compstmt = compstmt;
	}

	public void genC(FileWriter arc, PrintWriter saveArc) throws IOException{
		if(dclpart != null)
			dclpart.genC(arc, saveArc);
		compstmt.genC(arc, saveArc);
	}

}