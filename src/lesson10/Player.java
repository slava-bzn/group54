package lesson10; // Указываем пакет, в котором находится класс игрока

import java.util.ArrayList; // Подключаем ArrayList, чтобы хранить карты игрока в списке
import java.util.Objects; // Подключаем Objects для удобной реализации equals и hashCode
import java.util.Scanner; // Подключаем Scanner, чтобы считывать ответ игрока из консоли

// Класс Player описывает обычного игрока
public class Player {
    private final String name; // Имя игрока, оно задается при создании и потом уже не меняется
    private ArrayList<Card> hand = new ArrayList<>(); // Список карт на руках у игрока

    // Конструктор игрока
    public Player(String name) {
        this.name = name; // Сохраняем переданное имя в поле объекта
    }

    /**
     * Взять в руки карту
     * @param card Карта
     */
    public void addCardToHand(Card card) {
        hand.add(card); // Добавляем переданную карту в список карт игрока
    }

    /**
     * Нужна ли еще карта
     * @return true - если нужна, false - если не нужна
     */
    public boolean doYouNeedMoreCards() {
        if (!isCanWin()) { // Если игрок уже перебрал больше 21 очка, новую карту давать нельзя
            System.out.println(name + " достиг/достигла значения " + countNominalInHand() + ", больше нельзя брать карты"); // Сообщаем игроку, что он уже не может брать карты
            return false; // Возвращаем false, то есть карта больше не нужна
        }

        // Показываем все карты, которые сейчас лежат на руках у игрока
        for (Card card : hand) {
            System.out.println(card); // Печатаем одну карту за другой
        }
        System.out.println(name + ", у вас " + countNominalInHand() + " очков/очка, хотите ли вы взять следующую карту?"); // Спрашиваем, хочет ли игрок взять еще карту
        Scanner scanner = new Scanner(System.in); // Создаем Scanner для чтения ответа из консоли
        String answer = scanner.nextLine(); // Считываем введенную строку целиком

        if (answer.equalsIgnoreCase("yes") || answer.equalsIgnoreCase("да")) { // Проверяем, написал ли пользователь yes или да без учета регистра
            return true; // Если написал да, значит игрок хочет еще одну карту
        }

        return false; // Во всех остальных случаях считаем, что игрок не хочет брать карту
    }

    /**
     * Проверка, можем ли выиграть
     * @return true - если да, false - если нет
     */
    public boolean isCanWin() {
        return countNominalInHand() <= 21; // Выиграть можно только если сумма очков не больше 21
    }

    /**
     * Подсчет номинала на руках
     * @return int значение по сумме очков на картах
     */
    public int countNominalInHand() {
        int totalNominal = 0; // Создаем переменную, в которой будем накапливать общую сумму очков
        for (Card card : hand) { // Проходим по каждой карте в руке игрока
            totalNominal += card.getNominal(); // Берем очки карты и добавляем их к общей сумме
        }

        return totalNominal; // Возвращаем итоговую сумму очков на руках
    }

    // Геттер для имени игрока
    public String getName() {
        return name; // Возвращаем имя игрока
    }

    // Переопределяем equals, чтобы корректно сравнивать игроков между собой
    @Override
    public boolean equals(Object o) {
        if (this == o) return true; // Если сравниваем объект сам с собой, то он равен
        if (o == null || getClass() != o.getClass()) return false; // Если второй объект null или не Player, равенства нет
        Player player = (Player) o; // Приводим Object к Player
        return Objects.equals(name, player.name) && Objects.equals(hand, player.hand); // Игроки равны, если совпадают имя и список карт
    }

    // Переопределяем hashCode, чтобы он соответствовал equals
    @Override
    public int hashCode() {
        return Objects.hash(name, hand); // Строим хеш на основе имени и списка карт
    }

    // Переопределяем toString, чтобы игрок красиво отображался как строка
    @Override
    public String toString() {
        return "Игрок по имени " + name; // Возвращаем понятную текстовую информацию об игроке
    }
}