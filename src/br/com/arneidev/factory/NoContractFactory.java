package br.com.arneidev.factory;

public class NoContractFactory extends Factory{
    @Override
    Car retriverCar(String requestGrade) {
        if ("A".equals(requestGrade)){
            return new FuscaCar(50, "Full", "Yellow");
        } else {
            return new BrasiliaCar(35,"Full", "Green");
        }
    }
}
