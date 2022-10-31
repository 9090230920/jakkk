package org.example;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;


public class Main {
    public static void main(String[] args) throws InterruptedException
    {
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.setBinary("Yandex\\YandexBrowser\\Application\\browser.exe");
        WebDriver gdriver = new ChromeDriver(options);

        gdriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10000));

        //WebElement shtuka = (new WebDriverWait(gdriver, Duration.ofSeconds(10)).
        //        until(ExpectedConditions.presenceOfElementLocated(By.id("123"))));


gdriver.get("https://d05f0773-427f-4467-b2cc-d733291d281e.serverhub.praktikum-services.ru/");
        //WebElement searchField = gdriver.findElement(By.cssSelector("input.search3__input.mini-suggest__input"));
        //searchField.sendKeys("hjkvgetgb");
        //searchField.click();
        //WebElement element1 = gdriver.findElement(By.xpath("//div.dzen-top-controls-desktop__buttonText-3_"));
        //element1.click();
        WebElement buttonCookie = gdriver.findElement(By.cssSelector("button[class='App_CookieButton__3cvqF']")); //Кнопка Куки
        buttonCookie.click();
        WebElement buttonOrder = gdriver.findElement(By.cssSelector("button[class='Button_Button__ra12g']")); // Кнопка Заказать
        buttonOrder.click();
        Thread.sleep(1000);
        WebElement nameInput = gdriver.findElement(By.cssSelector("input[placeholder='* Имя']")); //Поиск поля Имя и запись
        nameInput.sendKeys("Иван");
        Thread.sleep(1000);
        WebElement surnameInput = gdriver.findElement(By.cssSelector("input[placeholder='* Фамилия']")); //Поиск поля Фамилия и запись
        surnameInput.sendKeys("Петров");
        Thread.sleep(1000);
        WebElement addressInput = gdriver.findElement(By.cssSelector("input[placeholder='* Адрес: куда привезти заказ']")); //Поиск поля Адрес и запись
        addressInput.sendKeys("Февраль");
            Thread.sleep(1000);
        WebElement metroInput = gdriver.findElement(By.cssSelector("input[placeholder='* Станция метро']"));//Поиск поля Станция метро, клик саджеста
        metroInput.click();
            Thread.sleep(1000);
        WebElement sudjestMetro = gdriver.findElement(By.cssSelector("div[class='select-search__select']"));
        sudjestMetro.click();
            Thread.sleep(1000);
        WebElement telefonInput = gdriver.findElement(By.cssSelector("input[placeholder='* Телефон: на него позвонит курьер']")); //Поиск поля Телефон, ввод
        telefonInput.sendKeys("+1029384756");
            Thread.sleep(1000);
        WebElement buttonDalshe = gdriver.findElement(By.cssSelector("button[class='Button_Button__ra12g Button_Middle__1CSJM']"));//Кнопка Дальше
        buttonDalshe.click();
//await page.waitForNavigation(); //Ожидание формы Про аренду
        Thread.sleep(1000);
        WebElement dataInput = gdriver.findElement(By.cssSelector("input[placeholder='* Когда привезти самокат']"));//Поле дата, выбор даты
        dataInput.click();
        Thread.sleep(1000);
        WebElement data = gdriver.findElement(By.cssSelector("div[class='react-datepicker__day react-datepicker__day--020']"));
        data.click();
        Thread.sleep(1000);
        WebElement periodInput = gdriver.findElement(By.cssSelector("div[class='Dropdown-control']"));//Поле Срок аренды, выбор срока
        periodInput.click();
        Thread.sleep(1000);
        WebElement period = gdriver.findElement(By.cssSelector("div[class='Dropdown-menu']>div[class='Dropdown-option']:nth-child(2)"));
        period.click();
        Thread.sleep(1000);
        WebElement color = gdriver.findElement(By.cssSelector("input[id='black']"));//Чек-бокс Цвет, отметка
        color.click();
        Thread.sleep(1000);
        WebElement order = gdriver.findElement(By.xpath("//*[@id='root']/div/div[2]/div[3]/button[2]"));//Кнопка Заказать
        order.click();
        //await page.waitForSelector('div[class="Order_Modal__YZ-d3"]');
        Thread.sleep(1000);
        WebElement approve = gdriver.findElement(By.xpath("//*[@id='root']/div/div[2]/div[5]/div[2]/button[2]"));//Кнопка Да в окне Хотите оформить заказ?
        approve.click();
        Thread.sleep(1000);
        WebElement status = gdriver.findElement(By.xpath("//*[@id='root']/div/div[2]/div[5]/div[2]/button"));//Кнопка Статус заказа
        status.click();


    }
}
