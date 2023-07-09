package aqaJava;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;


public class aqaJava {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\tools\\chromedriver\\chromedriver.exe"); // подключаем драйвер которые будет работать с брауезорм предварительно скачанный на диск С
        WebDriver numb2 = new ChromeDriver();

        numb2.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10)); // неявное ожидание времени на поиск элементов. В случа если элеиент не найдет - ищет 10 секунд а потом выдает сообщение что не найденно
        numb2.get("https://kwork.ru/projects");


        WebElement entrance = numb2.findElement(By.xpath("//html/body/div[5]/div[2]/div[1]/div/div[2]/div[4]/ul/li[1]/a"));// создаём элемент,присваеваем значение используя xpath  нужного объекта
            entrance.click(); // вызываем метод клик элемента

        WebElement passwchek = numb2.findElement(By.xpath("//html/body/div[2]/div/div[1]/div/div/div[2]/div/div[1]/form/div[4]/a"));// создали элемент и присвоили ему значение (Xpath) ссылки на сброс пароля
            passwchek.click(); // клик ссылки сброс пароля
            String mail = "zakaz0412@yandex.ru"; // объявили переменную в которой храним незарегистрированный в системе емейл
        WebElement inputMail = numb2.findElement(By.xpath("//html/body/div[2]/div/div[1]/div/div/div[2]/div/form/div/div/input")); // объявляем переменную InputMail и присваеваем (Xpath) поля ввода мела для востонавления пароля
            inputMail.findElement(By.xpath("//html/body/div[2]/div/div[1]/div/div/div[2]/div/form/div/div/input")).sendKeys(mail); // вызываем метод для переменной InputMail и заполняем поле переменной Mail
        WebElement resetpassw = numb2.findElement(By.xpath("//html/body/div[2]/div/div[1]/div/div/div[2]/div/form/button"));
            resetpassw.click();
        WebElement str = (new WebDriverWait(numb2,Duration.ofSeconds(10)).
                until(ExpectedConditions.elementToBeClickable(By.xpath("//html/body/div[2]/div/div[1]/div/div/div[2]/div/form/div/div[2]"))));
                    // создаём элемент и определяем для него явное ожидание(выбираем что ждём от него через "ExpectedConditions.")
        String parametr = str.getAttribute("innerText"); /* создаем переменную parametr и используя
         getAttribute ищем атрибут "innerText" в переменной str и выводим его на просмотр*/
            System.out.println(parametr);

        WebElement iks = numb2.findElement(By.xpath("//html/body/div[2]/div/div[1]/div/div/div[1]/div[1]"));
            iks.click();

        WebElement sumproject = numb2.findElement(By.xpath("//html/body/div[6]/div[3]/div/div[2]/div[2]/div[1]/div[2]/div[3]/span[2]"));
            String txtsumproject = sumproject.getText();
                System.out.println(txtsumproject); /* Использование getText для получения текста из html тега */






    }
}