public class Cliente {
    String nome;
    long cpf;
    int total = 0;
    void calculaTotalCompra(float calcular){
        total += calcular;
    }
}
