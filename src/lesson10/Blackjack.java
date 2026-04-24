package lesson10; // Указываем пакет, в котором находится основной класс игры

import java.util.ArrayList; // Подключаем список ArrayList для хранения игроков
import java.util.Scanner; // Подключаем Scanner для ввода имен игроков

// Класс Blackjack управляет всей логикой игры и заставляет объекты работать вместе
public class Blackjack {
    private ArrayList<Player> players = new ArrayList<>(); // Список всех участников игры: и обычных игроков, и дилера
    private Dealer dealer = new Dealer(); // Отдельно создаем дилера
    private Deck deck = new Deck(); // Создаем колоду, из которой будут раздаваться карты

    // Метод start запускает игру
    public void start(int playersQuantity) {
        // Проверяем, что количество игроков вообще допустимо
        if (playersQuantity < 1) {
            System.out.println("Нельзя создать игру на " + playersQuantity + ". Укажите количество более 0."); // Сообщаем, что игроков не может быть меньше 1
            return; // Останавливаем метод, потому что игра в таком виде невозможна
        }

        if (playersQuantity > 5) {
            System.out.println("Нельзя создать игру на " + playersQuantity + ". Укажите количество игроков менее 6 человек"); // Сообщаем, что игроков слишком много
            return; // Останавливаем метод, потому что игра по правилам программы невозможна
        }

        // 1 шаг: создаем всех игроков
        createPlayers(playersQuantity);
        // 2 шаг: раздаем каждому участнику по 2 стартовые карты
        dealTwoCardsToPlayers();
        // 3 шаг: продолжаем раздавать карты, пока участники хотят брать еще
        dealRestCardsToPlayers();
        // 4 шаг: выводим, сколько очков набрал каждый участник
        printPlayersTotalNominal();
        // 5 шаг: определяем победителя и печатаем результат
        printWinner();
    }

    /**
     * Создание игроков
     *
     * @param playersQuantity кол-во игроков
     */
    private void createPlayers(int playersQuantity) {
        players.add(dealer); // Сначала добавляем в список дилера, чтобы он тоже участвовал в игре
        for (int playerNumber = 1; playerNumber <= playersQuantity; playerNumber++) { // Запускаем цикл создания обычных игроков
            System.out.println("Введите желаемое имя игрока " + playerNumber + ":"); // Просим ввести имя очередного игрока

            Scanner scanner = new Scanner(System.in); // Создаем Scanner для чтения текста из консоли
            String playerName = scanner.nextLine(); // Считываем введенное имя

            Player player = new Player(playerName); // Создаем нового игрока с этим именем
            players.add(player); // Добавляем игрока в общий список участников

            System.out.println("Игрок " + playerName + " успешно создан!\n"); // Сообщаем, что игрок был создан
        }
    }

    /**
     * Раздать по 2 карты каждому (при старте игры)
     */
    private void dealTwoCardsToPlayers() {
        for (Player player : players) { // Проходим по каждому участнику игры
            Card card1 = deck.getRandomCard(); // Достаем первую случайную карту из колоды
            Card card2 = deck.getRandomCard(); // Достаем вторую случайную карту из колоды
            player.addCardToHand(card1); // Передаем первую карту в руку игроку
            player.addCardToHand(card2); // Передаем вторую карту в руку игроку
        }
    }

    /**
     * Раздать все остальные карты
     */
    private void dealRestCardsToPlayers() {
        for (Player player : players) { // По очереди даем возможность добирать карты каждому участнику
            while (player.doYouNeedMoreCards()) { // Пока участник говорит, что ему нужна еще карта, цикл продолжается
                Card card = deck.getRandomCard(); // Достаем из колоды еще одну случайную карту
                player.addCardToHand(card); // Кладем эту карту игроку в руку
            }
        }
    }

    /**
     * Вывод результатов по очкам
     */
    private void printPlayersTotalNominal() {
        for (Player player : players) { // Проходим по всем участникам игры
            System.out.println(player.getName() + " - " + player.countNominalInHand() + " очков/очка"); // Печатаем имя и общее количество очков
        }
    }

    /**
     * Определение и печать победителей
     */
    private void printWinner() {
        int maxTotalNominal = 0; // Здесь будем хранить лучший результат, который не превышает 21
        for (Player player : players) { // Проходим по всем участникам
            int playerTotalNominal = player.countNominalInHand(); // Считаем очки текущего игрока
            if (playerTotalNominal > maxTotalNominal && player.isCanWin()) { // Если очков больше текущего максимума и игрок не перебрал
                maxTotalNominal = playerTotalNominal; // Обновляем лучший результат
            }
        }

        if (dealer.countNominalInHand() == maxTotalNominal) { // Проверяем, совпадает ли результат дилера с лучшим результатом
            System.out.println("Дилер выиграл"); // Если да, объявляем победителем дилера
            return; // Завершаем метод, потому что победитель уже определен
        }

        // Проходим по всем игрокам и ищем тех, кто набрал столько же, сколько лучший результат
        for (Player player : players) {
            int playerTotalNominal = player.countNominalInHand(); // Сохраняем количество очков текущего игрока
            if (playerTotalNominal == maxTotalNominal) { // Если очки совпали с лучшим результатом
                System.out.println(player.getName() + " победил, набрав " + playerTotalNominal + " очков"); // Печатаем победителя
            }
        }
    }
}