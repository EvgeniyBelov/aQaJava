package aqaJava;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.WebDriver;

import java.time.Duration;
import java.util.Set;

import static java.time.Duration.*;

public class polyana {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\tools\\chromedriver\\chromedriver.exe");
        WebDriver poly  = new ChromeDriver();
        poly.manage().timeouts().implicitlyWait(ofSeconds(10)); // явное ожидание

        WebDriverWait weit = new WebDriverWait(poly,ofSeconds(5)); // класс вейт для неявного ожидания



        JavascriptExecutor js = (JavascriptExecutor)poly; // подключаем джаваскрипт



        try {
            poly.get("https://polyana.ai/");
            Thread.sleep(3000);
            WebElement ent = poly.findElement(By.xpath("//html/body/div/div[4]/div/div/div[3]/a"));

            String wind1 = poly.getWindowHandle(); // переменная wind1 содержит индетификатор окна1
            js.executeScript("window.open()"); // открытие нового окна через джаваскрипт
            Set<String> currentWind = poly.getWindowHandles(); /* создаём переменную currentWind типа сет строк(неупорядочное множество   )
                                                                и присваеваем метод который сохраня ет в переменную список наших открытых окон*/

            String wind2 = null;

            for (String window : currentWind) { // запускаем цикл перебора строк из сета currentWind
                if (!window.equals(wind1)) {
                    wind2 = window;
                    break;
                }
            }
            poly.switchTo().window(wind2); //открываем вкладку 2
            poly.get("https://ya.ru"); // открываем во второй вкладке сайт
            Thread.sleep(5000); // ждём 5 сек
            poly.close(); // закрываем вкладку2
            poly.switchTo().window(wind1);







        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
}
