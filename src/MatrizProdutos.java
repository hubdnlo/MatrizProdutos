import java.util.Scanner;

public class MatrizProdutos {

	public static void main(String[] args) {
		int id=2;
		String [] produto = new String[id];
		String [] marca = new String[id];
		int [] quantidade = new int[id];
		int i;
		do {
			Scanner teclado = new Scanner(System.in);
			System.out.println("Entre com a opção desejada:");
			System.out.println("1 - Cadastrar");
			System.out.println("2 - Consultar");
			System.out.println("3 - Sair");
			i=teclado.nextInt();
			switch (i)
			{
			case 1:
				System.out.println("Cadastro");
			
				for (int contador=0; contador<2; contador ++) {
					System.out.println("Informe o Produto");
					produto[contador] =teclado.next();
					System.out.println("Informe a Marca");
					marca[contador] =teclado.next();
					System.out.println("Informe a Quantidade");
					quantidade[contador] =teclado.nextInt();

				
			}
				break;
			case 2:
				System.out.println("Consultar");
				
				for (int contador=0; contador<2; contador ++) {
					System.out.println(contador+" - "+produto[contador]);
					System.out.println(contador+" - "+marca[contador]);
					System.out.println(contador+" - "+quantidade[contador]);
				}
				break;
			case 3:
				break;
			}
			
		}
		while (i==1 || i==2); 
		System.out.println("Acaboooooo");
	}
}

