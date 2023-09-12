/**
 * author @tathiany marquesani
 * modulo 13
 */


package abstratas;

public class Programa {
    public static void main(String[] args){
        PessoaFisica pessoa = new PessoaFisica();
        pessoa.setNome("Bruno Souza");
        pessoa.setEndereco("Rua dos Trilhos, 111");
        pessoa.setCpf(11122233344L);
        System.out.println("Pessoa Física: " + pessoa.getNome() + " | Endereço: " + pessoa.getEndereco() + " | CPF: " + pessoa.getCpf());

        PessoaJuridica pessoa2 = new PessoaJuridica();
        pessoa2.setNome("Teste LTDA");
        pessoa2.setEndereco("Avenida da cidade, 222");
        pessoa2.setCnpj(112220001000L);
        System.out.println("Pessoa Física: " + pessoa2.getNome() + " | Endereço: " + pessoa2.getEndereco() + " | CNPJ: " + pessoa2.getCnpj());

    }
}
