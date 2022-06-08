package maquinaDeLavar;
import java.util.Scanner;
import java.lang.Thread;
public class MaquinaDeLavar {
	@SuppressWarnings("unused")
	public static void main(String[] args) throws InterruptedException {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		sc.useDelimiter(System.lineSeparator());
		String model = "";
		String name = "";
		String voltage = "";
		int kilo = 0, stageOne = 0;
		int stageTwo = 0;
		int stageThree = 0;
		int stageFour = 0;
		int stageFive = 0;
		int menuChoice = 0;
		int stageChoice = 0;
		do {
			System.out.println("=======================================");
			System.out.println("MENU DE SIMULA��O");
			System.out.println("=======================================");
			System.out.println("1 - Configurar a m�quina de lavar");
			System.out.println("2 - Simular a m�quina de lavar");
			System.out.println("0 - Sair");
			System.out.println("Digite o c�digo:");
			menuChoice = sc.nextInt();
			switch (menuChoice) {
			case 1:
				System.out.println("=======================================");
				System.out.println("CONFIGURA��O DA M�QUINA DE LAVAR");
				System.out.println("=======================================");
				System.out.print("Modelo:");
				model = sc.next();
				System.out.print("Nome:");
				name = sc.next();
				System.out.print("Voltagem: (220v ou 110v ou 220/110v:)");
				voltage = sc.next();
				System.out.print("Quantos kg?");
				kilo = sc.nextInt();
				System.out.print("Dura��o do est�gio 1 - lavagem Pesada:");
				stageOne = sc.nextInt();
				System.out.print("Dura��o do est�gio 2 - lavagem Normal:");
				stageTwo = sc.nextInt();
				System.out.print("Dura��o do est�gio 3 - lavagem R�pida:");
				stageThree = sc.nextInt();
				System.out.print("Dura��o do est�gio 4 - Enxague:");
				stageFour = sc.nextInt();
				System.out.print("Dura��o do est�gio 5 - Centrifuga:");
				stageFive = sc.nextInt();
				break;
			case 2:
				if(model == "") {
					System.out.println("M�quina n�o configurada!");
					break;
				}
					
				System.out.println("=======================================");
				System.out.println("SIMULA��O DA M�QUINA DE LAVAR");
				System.out.println("=======================================");
				System.out.println("");
				System.out.println("Simulando o modelo " + model + " - " + name + " - " + kilo + "kg - " + " Voltagem: " + voltage);
				System.out.println("=======================================");
				System.out.println("QUAL EST�GIO DESEJA COME�AR?");
				System.out.println("=======================================");
				System.out.println("1 - Lava��o Pesada");
				System.out.println("2 - Lava��o Normal");
				System.out.println("3 - Lava��o Leve");
				System.out.println("4 - Enxague");
				System.out.println("5 - Centrifugar");
				System.out.print(" Selecione o est�gio inicial:");
				System.out.println("");
				stageChoice = sc.nextInt();
				switch (stageChoice) {
				case 1:
					System.out.println("Est�gio 1 - Em Lava��o Pesada 20.00%");
					Thread.sleep((stageOne * 1000)/5);
					System.out.println("Est�gio 1 - Em Lava��o Pesada 40.00%");
					Thread.sleep((stageOne * 1000)/5);
					System.out.println("Est�gio 1 - Em Lava��o Pesada 60.00%");
					Thread.sleep((stageOne * 1000)/5);
					System.out.println("Est�gio 1 - Em Lava��o Pesada 80.00%");
					Thread.sleep((stageOne * 1000)/5);
					System.out.println("Est�gio 1 - Em Lava��o Pesada 100.00%");
					Thread.sleep((stageOne * 1000)/5);
					System.out.println("");
					Thread.sleep(500);
				case 2:
					System.out.println("Est�gio 2 - Em Lava��o Normal 20.00%");
					Thread.sleep((stageTwo * 1000)/5);
					System.out.println("Est�gio 2 - Em Lava��o Normal 40.00%");
					Thread.sleep((stageTwo * 1000)/5);
					System.out.println("Est�gio 2 - Em Lava��o Normal 60.00%");
					Thread.sleep((stageTwo * 1000)/5);
					System.out.println("Est�gio 2 - Em Lava��o Normal 80.00%");
					Thread.sleep((stageTwo * 1000)/5);
					System.out.println("Est�gio 2 - Em Lava��o Normal 100.00%");
					Thread.sleep((stageTwo * 1000)/5);
					System.out.println("");
					Thread.sleep(500);
				case 3:
					System.out.println("Est�gio 3 - Em Lava��o Leve 20.00%");
					Thread.sleep((stageThree * 1000)/5);
					System.out.println("Est�gio 3 - Em Lava��o Leve 40.00%");
					Thread.sleep((stageThree * 1000)/5);
					System.out.println("Est�gio 3 - Em Lava��o Leve 60.00%");
					Thread.sleep((stageThree * 1000)/5);
					System.out.println("Est�gio 3 - Em Lava��o Leve 80.00%");
					Thread.sleep((stageThree * 1000)/5);
					System.out.println("Est�gio 3 - Em Lava��o Leve 100.00%");
					Thread.sleep((stageThree * 1000)/5);
					System.out.println("");
					Thread.sleep(500);
				case 4:
					System.out.println("Est�gio 4 - Em Enxague 20.00%");
					Thread.sleep((stageFour * 1000)/5);
					System.out.println("Est�gio 4 - Em Enxague 40.00%");
					Thread.sleep((stageFour * 1000)/5);
					System.out.println("Est�gio 4 - Em Enxague 60.00%");
					Thread.sleep((stageFour * 1000)/5);
					System.out.println("Est�gio 4 - Em Enxague 80.00%");
					Thread.sleep((stageFour * 1000)/5);
					System.out.println("Est�gio 4 - Em Enxague 100.00%");
					Thread.sleep((stageFour * 1000)/5);
					System.out.println("");
					Thread.sleep(500);
				case 5:
					System.out.println("Est�gio 5 - Em Centrifuga 20.00%");
					Thread.sleep((stageFive * 1000)/5);
					System.out.println("Est�gio 5 - Em Centrifuga 40.00%");
					Thread.sleep((stageFive * 1000)/5);
					System.out.println("Est�gio 5 - Em Centrifuga 60.00%");
					Thread.sleep((stageFive * 1000)/5);
					System.out.println("Est�gio 5 - Em Centrifuga 80.00%");
					Thread.sleep((stageFive * 1000)/5);
					System.out.println("Est�gio 5 - Em Centrifuga 100.00%");
					Thread.sleep((stageFive * 1000)/5);
					System.out.println("");
					Thread.sleep(500);
					System.out.println("Simula��o Finalizada");
					break;
				default:
					System.out.println("Op��o Inv�lida!");
					;
					break;
				}
			case 0:
				System.out.println("Saindo!");
				return;
			default:
				System.out.println("Op��o Inv�lida!");
				;
				break;
			}
		} while (true);
	}
}
