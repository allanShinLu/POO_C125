public class Cliente {
    String nome;
    long cpf;
    int total;
    Computador []computadores = new Computador[1000];




    void addPC(Computador computador){
        for (int i = 0; i< computadores.length; i++){
            if(computadores[i] == null) {
                computadores[i] = computador;
                break;
            }
        }
    }

    void Mostrar(){
        for (int i = 0; i < computadores.length; i++) {
            if (computadores[i] == null) {
                break;
            }
            System.out.println("Marca: " + computadores[i].marca);
            System.out.println("Preço: R$" + computadores[i].preco);

            for (int j = 0; j < computadores[i].hardwares.length; j++) {
                if (computadores[i].hardwares[j] == null) {
                    break;
                }

                if (j == 0) {
                    System.out.println("Processador " + computadores[i].hardwares[j].nome + " (" + computadores[i].hardwares[j].capacidade + ") ");
                }
                if (j == 1) {
                    System.out.println(computadores[i].hardwares[j].nome + " de " + computadores[i].hardwares[j].capacidade + "Gb");
                }
                if (j == 2) {
                    System.out.println(computadores[i].hardwares[j].nome + " de " + computadores[i].hardwares[j].capacidade + "Gb");
                }
            }




            System.out.println("Sistema operacional: " + computadores[i].sistema.nome + " (" + computadores[i].sistema.tipo + " bits" + ")");

            if (computadores[i].memoria.nome.equals("Pen-drive"))
                System.out.println("Acompanha " + computadores[i].memoria.nome + " de " + computadores[i].memoria.capacidade + "Gb");
            else
                System.out.println("Acompanha " + computadores[i].memoria.nome + " de " + computadores[i].memoria.capacidade + "Tb");
            System.out.println();
        }
    }
    void calculaTotalCompra(float calcular){
        total += calcular;
    }

}
