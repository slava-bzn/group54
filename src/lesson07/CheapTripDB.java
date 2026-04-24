package lesson07;

public class CheapTripDB {
    private Tour[] tours = new Tour[100];

    public CheapTripDB() {
        addTour("Турция", "Стамбул", "Самолет", 100_000, 5, 3, "завтрак");
        addTour("Турция", "Анталья", "Самолет", 150_000, 7, 5, "завтрак");
        addTour("Италия", "Рим", "Автобус", 150_000, 10, 4, "все включено");
        addTour("Турция", "Самсун", "Паром", 70000, 5, 2, "завтрак + обед");
        addTour("Германия", "Берлин", "Автобус", 135_000, 9, 4, "все включено");
        addTour("Россия", "Алтай", "Поезд", 78000, 4, 5, "завтрак");
        addTour("Иран", "Шираз", "Самолет", 80000, 5, 4, "завтрак");
        addTour("Шри-ланка", "Коломбо", "Самолет", 200_000, 10, 5, "все включено");
    }

    /**
     * Поиск туров по стране
     *
     * @param country страна
     */
    public void searchByCountry(String country) {
        for (Tour tour : tours) {
            if (tour == null) {
                break;
            }

            if (tour.getCountry().equalsIgnoreCase(country)) {
                System.out.println(tour);
            }
        }
    }

    /**
     * Поиск туров по цене
     *
     * @param price цена
     */
    public void searchByPrice(int price) {
        for (Tour tour : tours) {
            if (tour == null) {
                return;
            }

            if (tour.getPrice() <= price) {
                System.out.println(tour);
            }
        }
    }

    public void viewAllTours() {
        for (Tour tour : tours) {
            if (tour == null) {
                break;
            }
            System.out.println(tour);
        }
    }

    public void viewToursByCity (String city) {
        for (Tour tour : tours) {
            if (tour == null) {
                break;
            }
            if (tour.getCity().equalsIgnoreCase(city)) {
                System.out.println(tour);
            }
        }
    }
    public void viewToursByPriceAndStars (int price, int stars) {
        for (Tour tour : tours) {
            if (tour == null) {
                return;
            }
            if ((tour.getPrice() <= price) && (tour.getStars() >= stars)) {
                System.out.println(tour);
            }
        }
}
    /**
     * Добавление тура в базу данных
     *
     * @param country   страна
     * @param city      город
     * @param transport транспорт
     * @param price     цена
     * @param days      дни
     * @param stars     звезды
     * @param food      питание
     */
    private void addTour(String country, String city, String transport, int price, int days, int stars, String food) {
        for (int index = 0; index < tours.length; index++) {
            if (tours[index] == null) {
                Tour tour = new Tour(country, city, transport, price, days, stars, food);
                tours[index] = tour;
                return;
            }
        }
    }
}
