package br.com.arneidev.factory;

public class Demo {
    public static void main(String[] args){
        Customer cliente = new Customer("A", false);
        Factory factory = getFactory(cliente);
        factory.create(cliente.getGradeRequest());
    }

    private static Factory getFactory(Customer cliente) {
        if (cliente.hasCompanyContract()){
            return new ContractFactory();
        }else {
            return new NoContractFactory();
        }
    }
}
