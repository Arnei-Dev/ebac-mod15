package br.com.arneidev.factory;

public abstract class Factory {
    public Car create(String requestGrade){
        Car car =  retriverCar(requestGrade);
        car = preparedCar(car);
        return car;
    }

    private Car preparedCar(Car car) {
        car.clean();
        car.mechanicCheck();
        car.fuelCar();
        return car;
    }

    abstract Car retriverCar(String requestGrade);
}
