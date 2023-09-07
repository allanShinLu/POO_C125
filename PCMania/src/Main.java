import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Computador computador1 = new Computador();
        Computador computador2 = new Computador();
        Computador computador3 = new Computador();

        Cliente cliente = new Cliente();

        Scanner entrada = new Scanner(System.in);

        int escolha;

        //Computador - promoção 1
        computador1.marca = "Positivo";
        computador1.preco = 2300;
        computador1.hardware.nome = "Pentium Core i3 (2200 Mhz)";
        computador1.hardware.capacidadeRam = 8;
        computador1.hardware.capacidade = 500;
        computador1.sistema.nome = "Linux Ubuntu";
        computador1.sistema.tipo = 32;
        computador1.memoria.nome = "Pen-drive";
        computador1.memoria.capacidade = 16;

        //Computador - promoção 2
        computador2.marca = "Acer";
        computador2.preco = 5800;
        computador2.hardware.nome = "Pentium Core i5 (3370 Mhz)";
        computador2.hardware.capacidadeRam = 16;
        computador2.hardware.capacidade = 1;
        computador2.sistema.nome = "Windows 8";
        computador2.sistema.tipo = 64;
        computador2.memoria.nome = "Pen-drive";
        computador2.memoria.capacidade = 32;

        //Computador - promoção 3
        computador3.marca = "Vaio";
        computador3.preco = 1800;
        computador3.hardware.nome = "Pentium Core i7 (4500 Mhz)";
        computador3.hardware.capacidadeRam = 32;
        computador3.hardware.capacidade = 2;
        computador3.sistema.nome = "Windows 10";
        computador3.sistema.tipo = 64;
        computador3.memoria.nome = "HD Externo";
        computador3.memoria.capacidade = 1;

        System.out.println("Olá antes de começar por favor informe os seguintes itens: ");
        System.out.print("nome: ");
        cliente.nome = entrada.nextLine();
        System.out.print("CPF (Apenas números): ");
        cliente.cpf = entrada.nextInt();

        System.out.println("Olá " + cliente.nome + " espero que esteja bem!!" + "\n" + "Temos promoções incríveis esperando por você, veja!!" + "\n");
        System.out.println("PROMOCAÇÃO 1:");
        computador1.mostrarPCConfigs();
        System.out.println("PROMOCAÇÃO 2:");
        computador2.mostrarPCConfigs();
        System.out.println("PROMOCAÇÃO 3:");
        computador3.mostrarPCConfigs();

        System.out.print("Digite o número da promoção ou digite 0 para Sair: ");
        escolha = entrada.nextInt();
        while(escolha != 0){
            switch (escolha){
                case 1:
                    cliente.calculaTotalCompra(computador1.preco);
                    break;
                case 2:
                    cliente.calculaTotalCompra(computador2.preco);
                    break;
                case 3:
                    cliente.calculaTotalCompra(computador3.preco);
                    break;
                default:
                    break;
            }
            System.out.println("Digite o númeor da promoção para adicionar ou 0 para sair");
            escolha = entrada.nextInt();
        }
        System.out.println("Compra finalizada!!!" + "\n" + "O valor total é de: R$ " + cliente.total);
        }
    }
