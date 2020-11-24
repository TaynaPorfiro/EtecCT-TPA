import java.util.Scanner;
public class MatrizMediaAluno {
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		double notasAlunos [][] = new double [2][4];
		double [] media = new double [2];
		
		notasAlunos [0][0] = 10;
		notasAlunos [0][1] = 5;
		notasAlunos [0][2] = 8;
		notasAlunos [0][3] = 10;
		
		notasAlunos [1][0] = 9;
		notasAlunos [1][1] = 4;
		notasAlunos [1][2] = 10;
		notasAlunos [0][3] = 8;
		
		for(int linha=0;linha<notasAlunos.length;linha++) {
			System.out.print("Notas Alunos" + (linha+1) + " = ");
			
			for(int coluna=0;coluna<notasAlunos.length;coluna++) {
				System.out.print(notasAlunos[linha][coluna]+ " ");
				media [linha] += notasAlunos[linha][coluna];
			}
			media [linha] = media[linha]/notasAlunos[0].length;
			
			System.out.println();
			System.out.println();
		}
		for (int linhaMedia = 0; linhaMedia<media.length; linhaMedia++) {
			System.out.println();
			System.out.println("A média do Aluno " + (linhaMedia+1)+ " é de " + media[linhaMedia]);
		}
	}
}

