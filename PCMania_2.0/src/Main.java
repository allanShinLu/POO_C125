import java.util.Scanner;
import  java.util.Random;
public class Main {
    public static void main(String[] args) {
        Computador computador1 = new Computador();
        Computador computador2 = new Computador();
        Computador computador3 = new Computador();
        Cliente cliente = new Cliente();
        Scanner entrada = new Scanner(System.in);
        Random random = new Random();
        int escolha;
        long numero;

        //Computador - promoção 1
        HardwareBasico[] hb1 = new HardwareBasico[5];
        HardwareBasico hb = new HardwareBasico();
        HardwareBasico hbx1 = new HardwareBasico();
        HardwareBasico hby1 = new HardwareBasico();

        //Agregando valores ao vetor de HdwBasico para computador 1
        hb.nome = "Pentium Core i3";
        hb.capacidade = 2200;
        hb1[0] = hb;

        hbx1.nome = "Memória RAM";
        hbx1.capacidade = 8;
        hb1[1] = hbx1;

        hby1.nome = "HD";
        hby1.capacidade = 500;
        hb1[2] = hby1;

        //Agregando o vetor ao hardware do computador
        computador1.hardwares = hb1;

        computador1.marca = "Positivo";
        computador1.preco = 2300;
        computador1.sistema.nome = "Linux Ubuntu";
        computador1.sistema.tipo = 32;
        computador1.memoria.nome = "Pen-drive";
        computador1.memoria.capacidade = 16;

        //Computador - promoção 2
        HardwareBasico[] hb2 = new HardwareBasico[5];

        HardwareBasico hb22 = new HardwareBasico();
        HardwareBasico hbx2 = new HardwareBasico();
        HardwareBasico hby2 = new HardwareBasico();

        //Agregando valores ao vetor de HdwBasico para computador 2
        hb22.nome = "Pentium Core i5";
        hb22.capacidade = 3370;
        hb2[0] = hb22;

        hbx2.nome = "Memória RAM";
        hbx2.capacidade = 16;
        hb2[1] = hbx2;

        hby2.nome = "HD";
        hby2.capacidade = 1000;
        hb2[2] = hby2;

        //Agregando o vetor ao hardware do computador
        computador2.hardwares = hb2;

        computador2.marca = "Acer";
        computador2.preco = 5800;
        computador2.sistema.nome = "Windows 8";
        computador2.sistema.tipo = 64;
        computador2.memoria.nome = "Pen-drive";
        computador2.memoria.capacidade = 32;

        //Computador - promoção 3
        HardwareBasico[] hb3 = new HardwareBasico[5];
        HardwareBasico hb33 = new HardwareBasico();
        HardwareBasico hbx3 = new HardwareBasico();
        HardwareBasico hby3 = new HardwareBasico();

        //Agregando valores ao vetor de HdwBasico para computador 3
        hb33.nome = "Pentium Core i7";
        hb33.capacidade = 4500;
        hb3[0] = hb33;

        hbx3.nome = "Memória RAM";
        hbx3.capacidade = 32;
        hb3[1] = hbx3;

        hby3.nome = "HD";
        hby3.capacidade = 2000;
        hb3[2] = hby3;

        //Agregando o vetor ao hardware do computador
        computador3.hardwares = hb3;

        computador3.marca = "Vaio";
        computador3.preco = 1800;
        computador3.sistema.nome = "Windows 10";
        computador3.sistema.tipo = 64;
        computador3.memoria.nome = "HD Externo";
        computador3.memoria.capacidade = 1;



        System.out.println("Olá antes de começar por favor informe os seguintes itens: ");
        System.out.print("nome: ");
        cliente.nome = entrada.nextLine();
        System.out.print("CPF (Apenas números): ");
        cliente.cpf = entrada.nextLong();

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
                    cliente.addPC(computador1);
                    cliente.calculaTotalCompra(computador1.preco);
                    break;
                case 2:
                    cliente.addPC(computador2);
                    cliente.calculaTotalCompra(computador2.preco);
                    break;
                case 3:
                    cliente.calculaTotalCompra(computador3.preco);
                    cliente.addPC(computador3);
                    break;
                default:
                    break;
            }
            System.out.print("Digite o número da promoção para adicionar outro computador ou 0 para sair: ");
            escolha = entrada.nextInt();
        }
        System.out.println("\n" + "COMPRA FINALIZADA!!!" + "\n" + "Seu carrrinho foi adicionado os seguintes itens: ");
        cliente.Mostrar();
        System.out.println("O valor total é de: R$ " + cliente.total);
        System.out.println("Qual a forma de pagamento? " + "\n" + "1 - Crédito " + "\n" + "2 - Débito" + "\n" + "3 - Boleto");
        escolha = entrada.nextInt();
        if (escolha >= 1 && escolha <= 2) {
            System.out.println("Digite o numero do cartão: ");
            numero = entrada.nextLong();
            System.out.println("Digite do verso do cartão: ");
            numero = entrada.nextInt();
        }
        else{
            System.out.println("Aqui está o código do boleto para pagamento: ");
            long origin = 100000000;
            long bound = 900000000 - origin + 1;
            long aleatorio = random.nextLong(bound) + origin;
            System.out.println(aleatorio);
        }
        System.out.println("Aguardando pagamento");
        System.out.println(".");
        System.out.println(".");
        System.out.println(".");
        System.out.println(".");
        System.out.println(".");
        System.out.println(".");
        System.out.println(".");
        System.out.println("""
                Pagamento recebido!!
                Obrigado pela preferencia, você receberá seu pedido dentro de 3 dias!
                Até Logo!!""");

    }
}
