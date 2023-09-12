public class Computador {
    String marca;
    float preco;
    HardwareBasico[] hardwares = new HardwareBasico[10];
    MemoriUSB memoria = new MemoriUSB();
    Cliente cliente = new Cliente();
    SistemaOperacional sistema = new SistemaOperacional();

    void addNovoHardware(HardwareBasico novo){
        for (int i = 0; i < hardwares.length; i++) {
            if (hardwares[i] == null){
                hardwares[i] = novo;
                break;
            }
        }
    }
    void mostrarPCConfigs() {
        System.out.println("Marca: " + marca);
        System.out.println("Preço: R$" + preco);
        for (int i = 0; i < hardwares.length; i++) {
            if(hardwares[i] == null) {
                break;
            }
            if (i == 0) {
                System.out.println("Processador " + hardwares[i].nome + " (" + hardwares[i].capacidade + " Mhz) ");
            }
            if (i == 1) {
                System.out.println(hardwares[i].nome + " de " + hardwares[i].capacidade + "Gb");
            }
            if (i == 2) {
                System.out.println(hardwares[i].nome + " de " + hardwares[i].capacidade + "Gb");
            }
        }

        System.out.println("Sistema operacional: " + sistema.nome + " (" + sistema.tipo + " bits" + ")");

        if (memoria.nome == "Pen-drive")
            System.out.println("Acompanha " + memoria.nome + " de " + memoria.capacidade + "Gb");
        else
            System.out.println("Acompanha " + memoria.nome + " de " + memoria.capacidade + "Tb");
        System.out.println();
        }
    }

