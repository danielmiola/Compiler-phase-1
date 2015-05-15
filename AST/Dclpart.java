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
import java.util.ArrayList;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Dclpart extends Prog{

	private ArrayList<Dcl> dcls;

	public Dclpart(ArrayList<Dcl> dcls){
		this.dcls = dcls;
	}

	public void genC(FileWriter arc, PrintWriter saveArc) throws IOException{
		for(Dcl d: dcls)
			d.genC(arc, saveArc);
	}

}