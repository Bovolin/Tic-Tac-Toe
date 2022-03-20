import java.util.*;
public class TicTacToe{
	public static void main(String[] args){

		Random random = new Random();

		String escolha;
		int j1, j2, j3, j4, j5;
		int n_random;

		System.out.print("Escolha O ou X: ");
		escolha = System.console().readLine().toLowerCase();

		switch(escolha){
		case "o":
			System.out.println("Voce iniciara primeiro!");
			System.out.println("Escolha entre [1] [2] [3]");
			System.out.println("              [4] [5] [6]");
			System.out.println("              [7] [8] [9]\n");
			j1 = Integer.parseInt(System.console().readLine());
			switch(j1){
			case 1:
				System.out.println("");
				System.out.println(" O |   |   ");
				System.out.println("------------");
				System.out.println("   |   |   ");
				System.out.println("------------");
				System.out.println("   |   |   ");
				System.out.println("");
				n_random = random.nextInt((5 - 2) + 1) + 2;
				if(n_random == 2){
					System.out.println("");
					System.out.println(" O | X |   ");
					System.out.println("------------");
					System.out.println("   |   |   ");
					System.out.println("------------");
					System.out.println("   |   |   ");
					System.out.println("");
				}
				else if(n_random == 3){
					System.out.println("");
					System.out.println(" O |   | X ");
					System.out.println("------------");
					System.out.println("   |   |   ");
					System.out.println("------------");
					System.out.println("   |   |   ");
					System.out.println("");
				}
				else if(n_random == 4){
					System.out.println("");
					System.out.println(" O |   |   ");
					System.out.println("------------");
					System.out.println(" X |   |   ");
					System.out.println("------------");
					System.out.println("   |   |   ");
					System.out.println("");
				}
				else if(n_random == 5){
					System.out.println("");
					System.out.println(" O |   |   ");
					System.out.println("------------");
					System.out.println("   | X |   ");
					System.out.println("------------");
					System.out.println("   |   |   ");
					System.out.println("");
				}
				else if(n_random == 6){
					System.out.println("");
					System.out.println(" O |   |   ");
					System.out.println("------------");
					System.out.println("   |   | X ");
					System.out.println("------------");
					System.out.println("   |   |   ");
					System.out.println("");
				}
				else if(n_random == 7){
					System.out.println("");
					System.out.println(" O |   |   ");
					System.out.println("------------");
					System.out.println("   |   |   ");
					System.out.println("------------");
					System.out.println(" X |   |   ");
					System.out.println("");
				}
				else if(n_random == 8){
					System.out.println("");
					System.out.println(" O |   |   ");
					System.out.println("------------");
					System.out.println("   |   |   ");
					System.out.println("------------");
					System.out.println("   | X |   ");
					System.out.println("");
				}
				else if(n_random == 9){
					System.out.println("");
					System.out.println(" O |   |   ");
					System.out.println("------------");
					System.out.println("   |   |   ");
					System.out.println("------------");
					System.out.println("   |   | X ");
					System.out.println("");
				}
				break;
			case 2:
				System.out.println("");
				System.out.println("   | O |   ");
				System.out.println("------------");
				System.out.println("   |   |   ");
				System.out.println("------------");
				System.out.println("   |   |   ");
				break;
			case 3:
				System.out.println("");
				System.out.println("   |   | O ");
				System.out.println("------------");
				System.out.println("   |   |   ");
				System.out.println("------------");
				System.out.println("   |   |   ");
				break;
			case 4:
				System.out.println("");
				System.out.println("   |   |   ");
				System.out.println("------------");
				System.out.println(" O |   |   ");
				System.out.println("------------");
				System.out.println("   |   |   ");
				break;
			case 5:
				System.out.println("");
				System.out.println(" O |  |  ");
				System.out.println("----------");
				System.out.println("   |  |  ");
				System.out.println("----------");
				System.out.println("   |  |  ");
				break;
			case 6:
				System.out.println("");
				System.out.println(" O |  |  ");
				System.out.println("----------");
				System.out.println("   |  |  ");
				System.out.println("----------");
				System.out.println("   |  |  ");
				break;
			case 7:
				System.out.println("");
				System.out.println(" O |  |  ");
				System.out.println("----------");
				System.out.println("   |  |  ");
				System.out.println("----------");
				System.out.println("   |  |  ");
				break;
			case 8:
				System.out.println("");
				System.out.println("   |   |  ");
				System.out.println("-----------");
				System.out.println("   |   |  ");
				System.out.println("-----------");
				System.out.println("   | O |  ");
				break;
			case 9:
				System.out.println("");
				System.out.println("   |  |  ");
				System.out.println("----------");
				System.out.println("   |  |  ");
				System.out.println("----------");
				System.out.println("   |   | O");
				break;
			}
			break;
		case "x":
			System.out.print("O computador iniciara primeiro!");
			break;
		default:
			System.out.print("Opcao invalida! Encerrando...");
		}
	}
}