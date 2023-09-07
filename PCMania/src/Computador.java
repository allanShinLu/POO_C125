public class Computador {
    String marca;
    float preco;
    HardwareBasico hardware = new HardwareBasico();
    MemoriUSB memoria = new MemoriUSB();

    SistemaOperacional sistema = new SistemaOperacional();
    void mostrarPCConfigs() {
        System.out.println("Marca: " + marca);
        System.out.println("Preço: R$" + preco);
        System.out.println("Processador: " + hardware.nome);
        System.out.println(hardware.capacidadeRam + " Gb de Memória RAM");
        if (hardware.capacidade < 500)
            System.out.println(hardware.capacidade + "Tb de HD");
        else
            System.out.println(hardware.capacidade + "Gb de HD");
        System.out.println("Sistema operacional: " + sistema.nome + " (" + sistema.tipo + " bits" + ")");

        if (memoria.nome == "Pen-drive")
            System.out.println("Acompanha " + memoria.nome + " de " + memoria.capacidade + "Gb");
        else
            System.out.println("Acompanha " + memoria.nome + " de " + memoria.capacidade + "Tb");
        System.out.println();
    }
}
