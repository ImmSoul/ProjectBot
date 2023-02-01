package ru.mindigulov.projectbot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.telegram.telegrambots.meta.TelegramBotsApi;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;
import org.telegram.telegrambots.updatesreceivers.DefaultBotSession;

@SpringBootApplication
public class ProjectBotApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProjectBotApplication.class, args);
        try {
            TelegramBotsApi telegramBotsApi = new TelegramBotsApi(DefaultBotSession.class);
            telegramBotsApi.registerBot(new Bot("TechnicsSS_bot", "6103321472:AAHf1AD0v3BQsEAGxJR0fa8TxUsOy62N7_8"));

        } catch (TelegramApiException e) {
            e.printStackTrace();
        }

    }

}
