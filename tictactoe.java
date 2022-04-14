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
				n_random = random.nextInt((9 - 2) + 1) + 2;
				if(n_random == 2){
					System.out.println("");
					System.out.println(" O | X |   ");
					System.out.println("------------");
					System.out.println("   |   |   ");
					System.out.println("------------");
					System.out.println("   |   |   ");
					System.out.println("");
					System.out.println("Escolha entre [O] [X] [3]");
					System.out.println("              [4] [5] [6]");
					System.out.println("              [7] [8] [9]\n");
					j2 = Integer.parseInt(System.console().readLine());
					switch(j2){
						case 3:
							System.out.println("");
							System.out.println(" O | X | O ");
							System.out.println("------------");
							System.out.println("   |   |   ");
							System.out.println("------------");
							System.out.println("   |   |   ");
							System.out.println("");
							n_random = random.nextInt((9 - 4) + 1) + 4;
							//Concluído
							if(n_random == 4){
								System.out.println("");
								System.out.println(" O | X | O ");
								System.out.println("------------");
								System.out.println(" X |   |   ");
								System.out.println("------------");
								System.out.println("   |   |   ");
								System.out.println("");
								System.out.println("Escolha entre [O] [X] [O]");
								System.out.println("              [X] [5] [6]");
								System.out.println("              [7] [8] [9]\n");
								j3 = Integer.parseInt(System.console().readLine());
								switch(j3){
									case 5:
										System.out.println("");
										System.out.println(" O | X | O ");
										System.out.println("------------");
										System.out.println(" X | O |   ");
										System.out.println("------------");
										System.out.println("   |   |   ");
										System.out.println("");
										n_random = random.nextInt((9 - 6) + 1) + 6;
										//Concluído
										if(n_random == 6){
											System.out.println("");
											System.out.println(" O | X | O ");
											System.out.println("------------");
											System.out.println(" X | O | X ");
											System.out.println("------------");
											System.out.println("   |   |   ");
											System.out.println("");
											System.out.println("Escolha entre [O] [X] [O]");
											System.out.println("              [X] [O] [X]");
											System.out.println("              [7] [8] [9]\n");
											j4 = Integer.parseInt(System.console().readLine());
											switch(j4){
												//Concluído
												case 7:
													System.out.println("");
													System.out.println(" O | X | O ");
													System.out.println("------------");
													System.out.println(" X | O | X ");
													System.out.println("------------");
													System.out.println(" O |   |   ");
													System.out.println("");
													System.out.println("Voce venceu!");
													break;
												case 8:
													System.out.println("");
													System.out.println(" O | X | O ");
													System.out.println("------------");
													System.out.println(" X | O | X ");
													System.out.println("------------");
													System.out.println("   | O |   ");
													System.out.println("");
													n_random = random.nextInt((9 - 7) + 1) + 7;
													do{
														if(n_random == 7){
															System.out.println("");
															System.out.println(" O | X | O ");
															System.out.println("------------");
															System.out.println(" X | O | X ");
															System.out.println("------------");
															System.out.println(" X | O |   ");
															System.out.println("");
															System.out.println("Escolha entre [O] [X] [O]");
															System.out.println("              [X] [O] [X]");
															System.out.println("              [X] [O] [9]\n");
															j5 = Integer.parseInt(System.console().readLine());
															switch(j5){
																case 9:
																	System.out.println("");
																	System.out.println(" O | X | O ");
																	System.out.println("------------");
																	System.out.println(" X | O | X ");
																	System.out.println("------------");
																	System.out.println(" X | O | O ");
																	System.out.println("");
																	System.out.println("Empate!");
																	break;
															}
														}
														else if(n_random == 9){
															System.out.println("");
															System.out.println(" O | X | O ");
															System.out.println("------------");
															System.out.println(" X | O | X ");
															System.out.println("------------");
															System.out.println("   | O | X ");
															System.out.println("");
															System.out.println("Escolha entre [O] [X] [O]");
															System.out.println("              [X] [O] [X]");
															System.out.println("              [7] [O] [X]\n");
															j5 = Integer.parseInt(System.console().readLine());
															switch(j5){
																case 7:
																	System.out.println("");
																	System.out.println(" O | X | O ");
																	System.out.println("------------");
																	System.out.println(" X | O | X ");
																	System.out.println("------------");
																	System.out.println(" O | O | X ");
																	System.out.println("");
																	System.out.println("Voce venceu!");
																	break;
															}
														}
													}
													while(n_random != 8);
													break;
												case 9:
													System.out.println("");
													System.out.println(" O | X | O ");
													System.out.println("------------");
													System.out.println(" X | O | X ");
													System.out.println("------------");
													System.out.println("   |   | O ");
													System.out.println("");
													System.out.println("Voce venceu!");
													break;
											}
										}
										//Concluído
										else if(n_random == 7){
											System.out.println("");
											System.out.println(" O | X | O ");
											System.out.println("------------");
											System.out.println(" X | O |   ");
											System.out.println("------------");
											System.out.println(" X |   |   ");
											System.out.println("");
											System.out.println("Escolha entre [O] [X] [O]");
											System.out.println("              [X] [O] [6]");
											System.out.println("              [X] [8] [9]\n");
											j4 = Integer.parseInt(System.console().readLine());
											switch(j4){
												//Concluído
												case 6:
													System.out.println("");
													System.out.println(" O | X | O ");
													System.out.println("------------");
													System.out.println(" X | O | O ");
													System.out.println("------------");
													System.out.println(" X |   |   ");
													System.out.println("");
													n_random = random.nextInt((9 - 8) + 1) + 8;
													//Concluído
													if(n_random == 8){
														System.out.println("");
														System.out.println(" O | X | O ");
														System.out.println("------------");
														System.out.println(" X | O | O ");
														System.out.println("------------");
														System.out.println(" X | X |   ");
														System.out.println("");
														System.out.println("Escolha entre [O] [X] [O]");
														System.out.println("              [X] [O] [O]");
														System.out.println("              [X] [X] [9]\n");
														j5 = Integer.parseInt(System.console().readLine());
														switch(j5){
															//Concluído
															case 9:
																System.out.println("");
																System.out.println(" O | X | O ");
																System.out.println("------------");
																System.out.println(" X | O | O ");
																System.out.println("------------");
																System.out.println(" X | X | O ");
																System.out.println("");
																System.out.println("Voce venceu!");
																break;
														}
													}
													//Concluído
													else if(n_random == 9){
														System.out.println("");
														System.out.println(" O | X | O ");
														System.out.println("------------");
														System.out.println(" X | O | O ");
														System.out.println("------------");
														System.out.println(" X |   | X ");
														System.out.println("");
														System.out.println("Escolha entre [O] [X] [O]");
														System.out.println("              [X] [O] [O]");
														System.out.println("              [X] [8] [X]\n");
														j5 = Integer.parseInt(System.console().readLine());
														switch(j5){
															case 8:
																System.out.println("");
																System.out.println(" O | X | O ");
																System.out.println("------------");
																System.out.println(" X | O | O ");
																System.out.println("------------");
																System.out.println(" X | O | X ");
																System.out.println("");
																System.out.println("Empate");
																break;
														}
													}
													break;
												//Concluído
												case 8:
													System.out.println("");
													System.out.println(" O | X | O ");
													System.out.println("------------");
													System.out.println(" X | O |   ");
													System.out.println("------------");
													System.out.println(" X | O |   ");
													System.out.println("");
													n_random = random.nextInt((9 - 6) + 1) + 6;
													if(n_random == 6){
														System.out.println("");
														System.out.println(" O | X | O ");
														System.out.println("------------");
														System.out.println(" X | O | X ");
														System.out.println("------------");
														System.out.println(" X | O |   ");
														System.out.println("");
														System.out.println("Escolha entre [O] [X] [O]");
														System.out.println("              [X] [O] [X]");
														System.out.println("              [X] [O] [9]\n");
														j5 = Integer.parseInt(System.console().readLine());
														switch(j5){
															case 9:
																System.out.println("");
																System.out.println(" O | X | O ");
																System.out.println("------------");
																System.out.println(" X | O | X ");
																System.out.println("------------");
																System.out.println(" X | O | O ");
																System.out.println("");
																System.out.println("Voce venceu!");
																break;
														}
													}
													else if(n_random == 9){
														System.out.println("");
														System.out.println(" O | X | O ");
														System.out.println("------------");
														System.out.println(" X | O |   ");
														System.out.println("------------");
														System.out.println(" X | O | X ");
														System.out.println("");
														System.out.println("Escolha entre [O] [X] [O]");
														System.out.println("              [X] [O] [6]");
														System.out.println("              [X] [O] [X]\n");
														j5 = Integer.parseInt(System.console().readLine());
														switch(j5){
															case 6:
																System.out.println("");
																System.out.println(" O | X | O ");
																System.out.println("------------");
																System.out.println(" X | O | O ");
																System.out.println("------------");
																System.out.println(" X | O | X ");
																System.out.println("");
																System.out.println("Empate!");
																break;
														}
													}
													break;
												//Concluído
												case 9:
													System.out.println("");
													System.out.println(" O | X | O ");
													System.out.println("------------");
													System.out.println(" X | O |   ");
													System.out.println("------------");
													System.out.println(" X |   | O ");
													System.out.println("");
													System.out.println("Voce venceu!");
													break;
											}
										}
										//Concluído
										else if(n_random == 8){
											System.out.println("");
											System.out.println(" O | X | O ");
											System.out.println("------------");
											System.out.println(" X | O |   ");
											System.out.println("------------");
											System.out.println("   | X |   ");
											System.out.println("");
											System.out.println("Escolha entre [O] [X] [O]");
											System.out.println("              [X] [O] [6]");
											System.out.println("              [7] [X] [9]\n");
											j4 = Integer.parseInt(System.console().readLine());
											do{
												switch(j4){
													case 6:
														System.out.println("");
														System.out.println(" O | X | O ");
														System.out.println("------------");
														System.out.println(" X | O | O ");
														System.out.println("------------");
														System.out.println("   | X |   ");
														System.out.println("");
														n_random = random.nextInt((9 - 7) + 1) + 7;
														do{
															if(n_random == 7){
																System.out.println("");
																System.out.println(" O | X | O ");
																System.out.println("------------");
																System.out.println(" X | O | O ");
																System.out.println("------------");
																System.out.println(" X | X |   ");
																System.out.println("");
																System.out.println("Escolha entre [O] [X] [O]");
																System.out.println("              [X] [O] [O]");
																System.out.println("              [X] [X] [9]\n");
																j5 = Integer.parseInt(System.console().readLine());
																switch(j5){
																	case 9:
																		System.out.println("");
																		System.out.println(" O | X | O ");
																		System.out.println("------------");
																		System.out.println(" X | O | O ");
																		System.out.println("------------");
																		System.out.println(" X | X | O ");
																		System.out.println("");
																		System.out.println("Voce venceu!");
																		break;
																}
															}
															else if(n_random == 9){
																System.out.println("");
																System.out.println(" O | X | O ");
																System.out.println("------------");
																System.out.println(" X | O | O ");
																System.out.println("------------");
																System.out.println("   | X | X ");
																System.out.println("");
																System.out.println("Escolha entre [O] [X] [O]");
																System.out.println("              [X] [O] [O]");
																System.out.println("              [7] [X] [X]\n");
																j5 = Integer.parseInt(System.console().readLine());
																switch(j5){
																	case 7:
																		System.out.println("");
																		System.out.println(" O | X | O ");
																		System.out.println("------------");
																		System.out.println(" X | O | O ");
																		System.out.println("------------");
																		System.out.println(" O | X | X ");
																		System.out.println("");
																		System.out.println("Voce venceu!");
																		break;
																}
															}
														}
														while(n_random != 7 && n_random != 9);
														break;
													case 7:
														System.out.println("");
														System.out.println(" O | X | O ");
														System.out.println("------------");
														System.out.println(" X | O |   ");
														System.out.println("------------");
														System.out.println(" O | X |   ");
														System.out.println("");
														System.out.println("Voce venceu!");
														break;
													case 9:
														System.out.println("");
														System.out.println(" O | X | O ");
														System.out.println("------------");
														System.out.println(" X | O |   ");
														System.out.println("------------");
														System.out.println("   | X | O ");
														System.out.println("");
														System.out.println("Voce venceu!");
														break;
												}
											}
											while(j4 != 8);
										}
										//Concluído
										else if(n_random == 9){
											System.out.println("");
											System.out.println(" O | X | O ");
											System.out.println("------------");
											System.out.println(" X | O |   ");
											System.out.println("------------");
											System.out.println("   |   | X ");
											System.out.println("");
											System.out.println("Escolha entre [O] [X] [O]");
											System.out.println("              [X] [O] [6]");
											System.out.println("              [7] [8] [X]\n");
											j4 = Integer.parseInt(System.console().readLine());
											switch(j4){
												//Concluído
												case 6:
													System.out.println("");
													System.out.println(" O | X | O ");
													System.out.println("------------");
													System.out.println(" X | O | O ");
													System.out.println("------------");
													System.out.println("   |   | X ");
													System.out.println("");
													n_random = random.nextInt((8 - 7) + 1) + 7;
													if(n_random == 7){
														System.out.println("");
														System.out.println(" O | X | O ");
														System.out.println("------------");
														System.out.println(" X | O | O ");
														System.out.println("------------");
														System.out.println(" X |   | X ");
														System.out.println("");
														System.out.println("Escolha entre [O] [X] [O]");
														System.out.println("              [X] [O] [O]");
														System.out.println("              [7] [8] [X]\n");
														j5 = Integer.parseInt(System.console().readLine());
														switch(j5){
															case 8:
																System.out.println("");
																System.out.println(" O | X | O ");
																System.out.println("------------");
																System.out.println(" X | O | O ");
																System.out.println("------------");
																System.out.println(" X | O | X ");
																System.out.println("");
																System.out.println("Voce venceu!");
																break;
														}
													}
													else if(n_random == 8){
														System.out.println("");
														System.out.println(" O | X | O ");
														System.out.println("------------");
														System.out.println(" X | O | O ");
														System.out.println("------------");
														System.out.println("   | X | X ");
														System.out.println("");
														System.out.println("Escolha entre [O] [X] [O]");
														System.out.println("              [X] [O] [O]");
														System.out.println("              [7] [X] [X]\n");
														j5 = Integer.parseInt(System.console().readLine());
														switch(j5){
															case 7:
																System.out.println("");
																System.out.println(" O | X | O ");
																System.out.println("------------");
																System.out.println(" X | O | O ");
																System.out.println("------------");
																System.out.println(" O | X | X ");
																System.out.println("");
																System.out.println("Voce venceu!");
																break;
														}
													}
													break;
												//Concluído
												case 7:
													System.out.println("");
													System.out.println(" O | X | O ");
													System.out.println("------------");
													System.out.println(" X | O |   ");
													System.out.println("------------");
													System.out.println(" O |   | X ");
													System.out.println("");
													System.out.println("Voce venceu!");
													break;
												case 8:
													System.out.println("");
													System.out.println(" O | X | O ");
													System.out.println("------------");
													System.out.println(" X | O |   ");
													System.out.println("------------");
													System.out.println("   | O | X ");
													System.out.println("");
													n_random = random.nextInt((7 - 6) + 1) + 6;
													if(n_random == 6){
														System.out.println("");
														System.out.println(" O | X | O ");
														System.out.println("------------");
														System.out.println(" X | O | X ");
														System.out.println("------------");
														System.out.println("   | O | X ");
														System.out.println("");
														System.out.println("Escolha entre [O] [X] [O]");
														System.out.println("              [X] [O] [X]");
														System.out.println("              [7] [O] [X]\n");
														j5 = Integer.parseInt(System.console().readLine());
														do{
															switch(j5){
																case 7:
																	System.out.println("");
																	System.out.println(" O | X | O ");
																	System.out.println("------------");
																	System.out.println(" X | O | X ");
																	System.out.println("------------");
																	System.out.println(" O | O | X ");
																	System.out.println("");
																	System.out.println("Voce venceu!");
																	break;
															}
														}
														while(j5 != 7);	
													}
													else if(n_random == 7){
														System.out.println("");
														System.out.println(" O | X | O ");
														System.out.println("------------");
														System.out.println(" X | O |   ");
														System.out.println("------------");
														System.out.println(" X | O | X ");
														System.out.println("");
														System.out.println("Escolha entre [O] [X] [O]");
														System.out.println("              [X] [O] [6]");
														System.out.println("              [X] [O] [X]\n");
														j5 = Integer.parseInt(System.console().readLine());
														do{
															switch(j5){
																case 6:
																	System.out.println("");
																	System.out.println(" O | X | O ");
																	System.out.println("------------");
																	System.out.println(" X | O | O ");
																	System.out.println("------------");
																	System.out.println(" X | O | X ");
																	System.out.println("");
																	System.out.println("Voce venceu");
																	break;
															}
														}
														while(j5 != 6);
													}
													break;
											}
										}
									break;
								}
							}
							else if(n_random == 5){
								System.out.println("");
								System.out.println(" O | X | O ");
								System.out.println("------------");
								System.out.println("   | X |   ");
								System.out.println("------------");
								System.out.println("   |   |   ");
								System.out.println("");
							}
							else if(n_random == 6){
								System.out.println("");
								System.out.println(" O | X | O ");
								System.out.println("------------");
								System.out.println("   |   | X ");
								System.out.println("------------");
								System.out.println("   |   |   ");
								System.out.println("");
							}
							else if(n_random == 7){
								System.out.println("");
								System.out.println(" O | X | O ");
								System.out.println("------------");
								System.out.println("   |   |   ");
								System.out.println("------------");
								System.out.println(" X |   |   ");
								System.out.println("");
							}
							else if(n_random == 8){
								System.out.println("");
								System.out.println(" O | X | O ");
								System.out.println("------------");
								System.out.println("   |   |   ");
								System.out.println("------------");
								System.out.println("   | X |   ");
								System.out.println("");
							}
							else if(n_random == 9){
								System.out.println("");
								System.out.println(" O | X | O ");
								System.out.println("------------");
								System.out.println("   |   |   ");
								System.out.println("------------");
								System.out.println("   |   | X ");
								System.out.println("");
							}
							break;
					}
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