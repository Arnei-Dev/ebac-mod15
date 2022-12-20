package br.com.arneidev.factory;

public class ContractFactory extends Factory{
    @Override
    Car retriverCar(String requestGrade) {
        if ("A".equals(requestGrade)){
            return new CorollaCar(100,"Full", "Azul");
        }else{
            return new VolkswagenCar(80, "Half", "Black");
        }
    }
}
