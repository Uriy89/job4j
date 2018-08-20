package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * @author Yuriy Averianov
 * @version 1
 * @since 16.07.2018
 */

public class DummyBotTest {
   @Test
   public void whenGreetBot() {
       DummyBot bot = new DummyBot();
       assertThat(
               bot.answer("Привет Бот"),
               is("Привет, умник.")
       );
   }

   @Test
    public void byOnBot() {
       DummyBot bot = new DummyBot();
       assertThat(
               bot.answer("Пока"),
               is("Пока, умник.")
       );
   }

   @Test
    public void whenUnknownBot() {
       DummyBot bot = new DummyBot();
       assertThat(
               bot.answer("Сколько будет 2 + 2?"),
               is("Это ставит меня в тупик. Задайте другой вопрос")
       );
   }
}
