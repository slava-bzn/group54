package mypractice.task4;

import java.util.*;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class Main {
    public static TaxiCar findFirstAvailableCar(TaxiCar[] cars) {
        for (TaxiCar car : cars) {
            if (car.isAvailable()) {
                return car;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        TaxiCar taxi1 = new TaxiCar("Toyota", "Camry", 2017,
                48362.89, true);
        TaxiCar taxi2 = new TaxiCar("Mercedes-Benz", "S600", 2025,
                3000.54, false);
        TaxiCar taxi3 = new TaxiCar("Lada", "ВАЗ 2115", 2012,
                999999.99, true);

        System.out.println(taxi1);
        System.out.println(taxi2);
        System.out.println(taxi3 + "\n");

        taxi1.setMileageKm(73654.70);
        taxi1.setAvailable(false);
        taxi2.setMileageKm(7830.32);
        taxi2.setAvailable(true);
        taxi3.setMileageKm(50000.8);
        taxi3.setAvailable(false);

        System.out.println(taxi1.getMileageKm());
        System.out.println(taxi1.isAvailable());

        System.out.println(taxi2.getMileageKm());
        System.out.println(taxi2.isAvailable());

        System.out.println(taxi3.getMileageKm());
        System.out.println(taxi3.isAvailable());

        System.out.println("\nСоздание массива и вывод в консоль.");
        TaxiCar[] cars = new TaxiCar[]{taxi1, taxi2, taxi3};
        for (TaxiCar car : cars) {
            System.out.println(car);
        }
        System.out.println("\nВывод в консоль автомобили, которые доступны.");
        for (TaxiCar car : cars) {
            if (!car.isAvailable()) {
                continue;
            } else {
                System.out.println(car);
            }
        }

        System.out.println("\nВывод на консоль первого автомобиля, у которого пробег меньше 100_000.");
        for (TaxiCar car : cars) {
            if (car.getMileageKm() < 100_000) {
                System.out.println(car);
                break;
            }
        }

        System.out.println("\nВывод метода по доступности автомобиля.");
        System.out.println(findFirstAvailableCar(cars));

        PremiumTaxiCar taxi4 = new PremiumTaxiCar("Ока", "ВАЗ 1111", 1987,
                666.66, true, true);
        System.out.println(taxi4);
        TaxiCar[] carsWithPremium = new TaxiCar[]{taxi1, taxi2, taxi3, taxi4};

        System.out.println("\nВывод на консоль подсчета стоимости поездки относительно пробега.");
        System.out.println(taxi1.calculateRideCost(10.0));
        System.out.println(taxi2.calculateRideCost(100.56));
        System.out.println(taxi3.calculateRideCost(78.9));
        System.out.println(taxi4.calculateRideCost(10.0));

        RideCostCalculator calculator1 = taxi1;
        System.out.println(calculator1.calculateRideCost(10.0));
        RideCostCalculator calculator2 = taxi4;
        System.out.println(calculator2.calculateRideCost(10.0));

        List<TaxiCar> list = new ArrayList<>();
        list.add(taxi1);
        list.add(taxi2);
        list.add(taxi3);
        list.add(taxi4);

        System.out.println("\nВывод всех автомобилей из списка через цикл.");
        for (TaxiCar taxiCar : list) {
            System.out.println(taxiCar);
        }
        list.remove(1);

        System.out.println("\nВывод всех автомобилей из списка через цикл после удаления.");
        for (TaxiCar taxiCar : list) {
            System.out.println(taxiCar);
        }

        Set<String> set = new HashSet<>();
        set.add(taxi1.getBrand());
        set.add(taxi2.getBrand());
        set.add(taxi3.getBrand());
        set.add(taxi4.getBrand());

        System.out.println("\nВывод в консоль всех марок автомобилей из сета.");
        set.forEach(System.out::println);

        System.out.println("\nСоздадим копию автомобиля, добавим в лист и выведем все в консоль.");
        TaxiCar taxi5 = new TaxiCar("Mercedes-Benz", "S600", 2025,
                3000.54, false);

        list.add(taxi5);
        for (TaxiCar taxiCar : list) {
            System.out.println(taxiCar);
        }
        System.out.println("\nДобавим в сет и выведем все в консоль.");
        set.add(taxi5.getBrand());
        for (String s : set) {
            System.out.println(s);
        }

        System.out.println("\nЕстественная сортировка.");
        Collections.sort(list);
        for (TaxiCar taxiCar : list) {
            System.out.println(taxiCar);
        }

        System.out.println("\nСортировка по пробегу.");
        Comparator<TaxiCar> mileageComparator = new Comparator<TaxiCar>() {
            @Override
            public int compare(TaxiCar o1, TaxiCar o2) {
                return Double.compare(o1.getMileageKm(), o2.getMileageKm());
            }
        };
        Collections.sort(list, mileageComparator);
        list.forEach(System.out::println);

        System.out.println("\nСортировка по марке по алфавиту.");
        Comparator<TaxiCar> brandComparator = new Comparator<TaxiCar>() {
            @Override
            public int compare(TaxiCar o1, TaxiCar o2) {
                return o1.getBrand().compareTo(o2.getBrand());
            }
        };
        Collections.sort(list, brandComparator);
        list.forEach(System.out::println);

        System.out.println("\nСоздание мап, добавление ключей и значений и вывод на консоль.");
        Map<String, TaxiCar> map = new HashMap<>();
        map.put("Ivan", taxi1);
        map.put("Divan", taxi2);
        map.put("Niva", taxi3);
        map.put("Slava", taxi4);

        for (Map.Entry<String, TaxiCar> entry : map.entrySet()) {
            String driverName = entry.getKey();
            TaxiCar driverCar = entry.getValue();
            System.out.println("Водитель " + driverName + " едет на автомобиле - " + driverCar);
        }

        System.out.println("\nВывод машины водителя Slava.");
        System.out.println(map.get("Slava"));

        System.out.println("\nПроверка на наличие водителя Anton.");
        if (map.containsKey("Anton")) {
            System.out.println(map.get("Anton"));
        } else {
            System.out.println("Такого водителя нет.");
        }

        System.out.println("\nУдаление водителя и вывод на консоль.");
        map.remove("Divan");
        for (Map.Entry<String, TaxiCar> entry : map.entrySet()) {
            String driverName = entry.getKey();
            TaxiCar driverCar = entry.getValue();
            System.out.println("Водитель " + driverName + " едет на автомобиле - " + driverCar);
        }

        System.out.println("\nРабота с обертками. Вывод в консоль количество машин.");
        Integer totalCars = list.size();
        System.out.println("Общее количество машин составляет - " + totalCars + ".");

        System.out.println("\nРабота с обертками. Вывод в консоль количество общего пробега.");
        Double totalMileage = 0.0;
        for (TaxiCar taxiCar : list) {
            totalMileage += taxiCar.getMileageKm();
        }
        System.out.println("Общий пробег составляет - " + totalMileage + ".");

        System.out.println("\nРабота с обертками. Вывод в консоль первую свободную машину.");
        Boolean hasAvailableCar = false;
        for (TaxiCar taxiCar : list) {
            if (taxiCar.isAvailable()) {
                hasAvailableCar = true;
                break;
            }
        }
        System.out.println(hasAvailableCar);

        System.out.println("\nВывод на консоль всех свободных машин.");
        Predicate<TaxiCar> carPredicate = taxiCar -> taxiCar.isAvailable();
        for (TaxiCar taxiCar : list) {
            if (carPredicate.test(taxiCar)) {
                System.out.println(taxiCar);
            }
        }
        System.out.println("\nВывод на консоль всех машин с маленьким пробегом.");
        Predicate<TaxiCar> carPredicate2 = taxiCar -> taxiCar.getMileageKm() < 100_000;
        for (TaxiCar taxiCar : list) {
            if (carPredicate2.test(taxiCar)) {
                System.out.println(taxiCar);
            }
        }
        System.out.println("\nВывод на консоль машин для красивого вывода.");
        Consumer<TaxiCar> carConsumer = taxiCar -> System.out.println("Машина таксопарка: " + taxiCar);
        carConsumer.accept(taxi1);
        carConsumer.accept(taxi2);
        carConsumer.accept(taxi3);
        carConsumer.accept(taxi4);
        carConsumer.accept(taxi5);
    }
}
