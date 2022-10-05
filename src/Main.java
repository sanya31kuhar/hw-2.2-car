public class Main {

    public static void main(String[] args) {
        Car granta = new Car("Lada", "Granta", 1.7, "Желтый", 2015, "Россия");
        System.out.println("Марка автомобиля " + granta.brand + ", модель " + granta.model + ", год выпуска " + granta.productionYear + ", страна производства " + granta.productionCountry + ", цвет " + granta.color + ", объем двигателя " + granta.engineVolume);

        Car audi = new Car("Audi", "A8 50 L TDI quattro", 3.0, "Черный", 2020, "Германия");
        System.out.println("Марка автомобиля " + audi.brand + ", модель " + audi.model + ", год выпуска " + audi.productionYear + ", страна производства " + audi.productionCountry + ", цвет " + audi.color + ", объем двигателя " + audi.engineVolume);

        Car bmw = new Car("BMW", "Z8", 3.0, "Черный", 2021, "Германия");
        System.out.println("Марка автомобиля " + bmw.brand + ", модель " + bmw.model + ", год выпуска " + bmw.productionYear + ", страна производства " + bmw.productionCountry + ", цвет " + bmw.color + ", объем двигателя " + bmw.engineVolume);

        Car kia = new Car("Kia", "Sportage 4 поколение", 2.4, "Красный", 2016, "Южная Корея");
        System.out.println("Марка автомобиля " + kia.brand + ", модель " + kia.model + ", год выпуска " + kia.productionYear + ", страна производства " + kia.productionCountry + ", цвет " + kia.color + ", объем двигателя " + kia.engineVolume);

        Car hyundai = new Car("Hyundai", "Avante", 1.6, "Оранжевый", 2016, "Южная Корея");
        System.out.println("Марка автомобиля " + hyundai.brand + ", модель " + hyundai.model + ", год выпуска " + hyundai.productionYear + ", страна производства " + hyundai.productionCountry + ", цвет " + hyundai.color + ", объем двигателя " + hyundai.engineVolume);
    }
}
