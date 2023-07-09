package aqaJava;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class aqaJava2 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\tools\\chromedriver\\chromedriver.exe");
        WebDriver part2 = new ChromeDriver(); //Автоматизация тестирования css Вёрстки стилей//
        part2.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));

        part2.get("https://kwork.ru/");
        WebElement enter = part2.findElement(By.xpath("//html/body/div[5]/div[2]/div[1]/div/div[2]/div[4]/ul/li[2]/a"));
        /* Создаём переменную "enter"
        и присваеваем ей значение-ссылку на xpath кнопки "Регистрация" */


        String parametr = enter.getCssValue("color"); /* объявляем текстовую переменную String,
         присваем ей результат посика параметра стиля "color" */
            System.out.println(parametr);





    }
}
