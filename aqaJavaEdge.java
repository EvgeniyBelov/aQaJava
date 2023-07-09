package aqaJava;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class aqaJavaEdge {
    public static void main(String[] args) {
        System.setProperty("webdriver.edge.driver", "C:\\tools\\edgedriver\\msedgedriver.exe"); // подключаем драйвер которые будет работать с брауезорм предварительно скачанный на диск С
        WebDriver numb1 = new EdgeDriver();
        numb1.get("https://kwork.ru/");

    }
}