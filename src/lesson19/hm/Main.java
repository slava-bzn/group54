package lesson19.hm;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws CustomException {
        StringUtils stringUtils = new StringUtilsImpl();

        System.out.println("Выведем результат деления двух чисел number1 и number2:");
        System.out.println(stringUtils.div("15", "3"));

        System.out.println("Выведем массив количества вхождений слова в текст:");
        System.out.println(Arrays.toString(stringUtils.findWord("VPN помогает создать защищённое соединение " +
                "между устройством пользователя и удалённым сервером. Многие используют VPN для повышения приватности," +
                " особенно при подключении к общественным Wi-Fi сетям. При этом VPN не делает человека полностью " +
                "анонимным, но может заметно повысить безопасность в интернете.", "VPN")));

        System.out.println("Выведем массив чисел из текста:");
        System.out.println(Arrays.toString(stringUtils.findNumbers("VPN-сервис может снижать скорость соединения," +
                " например с 95.8 Мбит/с до 72.4 Мбит/с, если сервер находится далеко.\n" +
                "Средняя задержка при подключении через VPN иногда увеличивается с 18.5 мс до 43.2 мс.\n" +
                "При этом хороший VPN всё равно может работать стабильно, если нагрузка на сервер " +
                "не превышает 65.7 процента.")));
    }
}
