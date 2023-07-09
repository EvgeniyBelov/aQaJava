package aqaJava;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class aqaJava3 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\tools\\chromedriver\\chromedriver.exe");
        WebDriver lesson2  = new ChromeDriver();
        lesson2.get("https:/ya.ru/");
        WebElement input1 = lesson2.findElement(By.xpath("//html/body/main/div[3]/form/div[2]/div/input"));
        input1.sendKeys("Пригожин", Keys.ENTER);
                                            /* Метод sendKeys вставляет значение "Пригожин" в элемент input1
                                            Выбрать команду после заполнения оля можно после  Keys.*/
        WebElement input2 = lesson2.findElement(By.xpath("//html/body/header/div/div/div[3]/form/div[1]/span/span/input"));
        input2.clear(); // очищает поле input2

    }
}
