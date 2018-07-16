package ru.job4j.condition;
/**
 * @author Yuriy Averianov
 * @version 1
 * @since 16.07.2018
 */
public class DummyBot {
    /**
     * Отвечает на вопросы
     * @param question Вопрос от клиента
     * @return Ответ
     */
    public String answer(String question) {
        String srl = "Это ставит меня в тупик. Задайте другой вопрос";

        if("Привет Бот".equals(question)) {
            srl = "Привет, умник.";
        } else if("Пока".equals(question)) {
            srl = "Пока, умник.";
        }

        return srl;
    }
}
