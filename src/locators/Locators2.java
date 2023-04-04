package org.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators2 {
    public static void main(String[] args) {
        By string = By.id("ez-accept-all");
        //Поиск элементов при помощи css
        System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        //пробелы заменяем точками
        //поиск по тегу
        /*driver.get("https://www.guinnessworldrecords.com/search");
        driver.findElement(By.id("ez-accept-all")).click();
        WebElement element = (driver.findElements(By.cssSelector("input"))).get(1);
        element.sendKeys("input");*/

        //поиск по id. Используем символ #
        /*driver.get("https://www.guinnessworldrecords.com/search");
        driver.findElement(By.cssSelector("#ez-accept-all")).click();*/

        //поиск по классу .имя_класса
        /*driver.get("https://www.guinnessworldrecords.com/Account/Login");
        driver.findElement(By.cssSelector("#ez-accept-all")).click();
        driver.findElement(By.cssSelector(".btn.btn-primary.blue")).click();
        //driver.findElement(By.cssSelector("button.btn.btn-primary.blue")).click();*/

        //Любой другой атрибут пишем в []
        driver.get("https://www.guinnessworldrecords.com/records/apply-to-set-or-break-a-record");
        driver.findElement(string).click();
        //driver.findElement(By.cssSelector("[title='Search']")).click();

        //нахождение по буквосочетанию
        //driver.findElement(By.cssSelector("[title*='ear']")).click();

        //нахождение по первым символам
        //driver.findElement(By.cssSelector("[title^='Sea']")).click();

        //нахождение по последним символам
        /*driver.findElement(By.cssSelector("[title*='arch']")).click();
        //несколько классов плюс через пробел можем двигаться к дочерним вложенностям
        driver.findElement(By.cssSelector(".record-search.search-form-container div input")).sendKeys("few classes");*/

        //еще один пример вложенности
        driver.findElement(By.cssSelector("div.secondary_menu_wrapper.block.block-12-12.no-margin" +
                " a[href='/records/the-application-process']")).click();

        //для поиска непосредственного ребенка можно использовать >



    }
}
