package gFormsBotPure;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;


import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;

public class gFormsBotPure {
    public static void main(String[] args) {
        //https://docs.google.com/forms/d/e/1FAIpQLSe6AUFbvY2cJnvU9pjaRJfjF96pdsjlWmtk0aAQrgKn_tiL3Q/viewform?usp=sf_link
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\sbako\\Desktop\\ChromeDriver\\chromedriver.exe");

        for(int i = 0; i < 800; i++) {
            WebDriver driver = new ChromeDriver();
            //driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
            String baseUrl = "https://docs.google.com/forms/d/e/1FAIpQLSe6AUFbvY2cJnvU9pjaRJfjF96pdsjlWmtk0aAQrgKn_tiL3Q/viewform?usp=sf_link";
            driver.get(baseUrl);


            WebElement location = driver.findElement(By.xpath("//*[@id=\"mG61Hd\"]/div/div/div[2]/div[2]/div/div[2]/div/div[1]/div/div[1]/input"));
            location.click();
            location.clear();
            location.sendKeys("Σύνταγμα");

            WebElement next_page1 = driver.findElement(By.xpath("//*[@id=\"mG61Hd\"]/div/div/div[3]/div[1]/div[1]/div"));
            next_page1.click();

            try {
                Thread.sleep(3 * 1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            WebElement next_page2 = driver.findElement(By.xpath("//*[@id=\"mG61Hd\"]/div/div/div[3]/div[1]/div[1]/div[2]"));
            next_page2.click();

            try {
                Thread.sleep(3 * 1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            WebElement q1_1 = driver.findElement(By.xpath("//*[@id=\"mG61Hd\"]/div/div/div[2]/div[2]/div/div[2]/div/span/div/div[1]/label/div/div[1]/div"));
            WebElement q1_2 = driver.findElement(By.xpath("//*[@id=\"mG61Hd\"]/div/div/div[2]/div[2]/div/div[2]/div/span/div/div[2]/label/div/div[1]/div"));
            WebElement q1_3 = driver.findElement(By.xpath("//*[@id=\"mG61Hd\"]/div/div/div[2]/div[2]/div/div[2]/div/span/div/div[3]/label/div/div[1]/div"));
            WebElement q1_4 = driver.findElement(By.xpath("//*[@id=\"mG61Hd\"]/div/div/div[2]/div[2]/div/div[2]/div/span/div/div[4]/label/div/div[1]/div"));
            WebElement q1_5 = driver.findElement(By.xpath("//*[@id=\"mG61Hd\"]/div/div/div[2]/div[2]/div/div[2]/div/span/div/div[5]/label/div/div[1]/div"));
            WebElement[] question1 = new WebElement[]{q1_1, q1_2, q1_3, q1_4, q1_5};
            int rand = new Random().nextInt(5);
            question1[rand].click();

            WebElement q2_1 = driver.findElement(By.xpath("//*[@id=\"mG61Hd\"]/div/div/div[2]/div[3]/div/div[2]/div/div[1]/div/div[2]/span/div[2]/div/div"));
            WebElement q2_2 = driver.findElement(By.xpath("//*[@id=\"mG61Hd\"]/div/div/div[2]/div[3]/div/div[2]/div/div[1]/div/div[2]/span/div[3]/div/div"));
            WebElement q2_3 = driver.findElement(By.xpath("//*[@id=\"mG61Hd\"]/div/div/div[2]/div[3]/div/div[2]/div/div[1]/div/div[2]/span/div[4]/div/div"));
            WebElement q2_4 = driver.findElement(By.xpath("//*[@id=\"mG61Hd\"]/div/div/div[2]/div[3]/div/div[2]/div/div[1]/div/div[2]/span/div[5]/div/div"));
            WebElement[] question2 = new WebElement[]{q2_1, q2_2, q2_3, q2_4};
            rand = new Random().nextInt(4);
            question2[rand].click();

            WebElement q3_1 = driver.findElement(By.xpath("//*[@id=\"mG61Hd\"]/div/div/div[2]/div[3]/div/div[2]/div/div[1]/div/div[4]/span/div[2]/div/div"));
            WebElement q3_2 = driver.findElement(By.xpath("//*[@id=\"mG61Hd\"]/div/div/div[2]/div[3]/div/div[2]/div/div[1]/div/div[4]/span/div[3]/div/div"));
            WebElement q3_3 = driver.findElement(By.xpath("//*[@id=\"mG61Hd\"]/div/div/div[2]/div[3]/div/div[2]/div/div[1]/div/div[4]/span/div[4]/div/div"));
            WebElement q3_4 = driver.findElement(By.xpath("//*[@id=\"mG61Hd\"]/div/div/div[2]/div[3]/div/div[2]/div/div[1]/div/div[4]/span/div[5]/div/div"));
            WebElement[] question3 = new WebElement[]{q3_1, q3_2, q3_3, q3_4};
            rand = new Random().nextInt(4);
            question3[rand].click();

            WebElement q4_1 = driver.findElement(By.xpath("//*[@id=\"mG61Hd\"]/div/div/div[2]/div[3]/div/div[2]/div/div[1]/div/div[6]/span/div[2]/div/div"));
            WebElement q4_2 = driver.findElement(By.xpath("//*[@id=\"mG61Hd\"]/div/div/div[2]/div[3]/div/div[2]/div/div[1]/div/div[6]/span/div[3]/div/div"));
            WebElement q4_3 = driver.findElement(By.xpath("//*[@id=\"mG61Hd\"]/div/div/div[2]/div[3]/div/div[2]/div/div[1]/div/div[6]/span/div[4]/div/div"));
            WebElement q4_4 = driver.findElement(By.xpath("//*[@id=\"mG61Hd\"]/div/div/div[2]/div[3]/div/div[2]/div/div[1]/div/div[6]/span/div[5]/div/div"));
            WebElement[] question4 = new WebElement[]{q4_1, q4_2, q4_3, q4_4};
            rand = new Random().nextInt(4);
            question4[rand].click();

            WebElement q5_1 = driver.findElement(By.xpath("//*[@id=\"mG61Hd\"]/div/div/div[2]/div[3]/div/div[2]/div/div[1]/div/div[8]/span/div[2]/div/div"));
            WebElement q5_2 = driver.findElement(By.xpath("//*[@id=\"mG61Hd\"]/div/div/div[2]/div[3]/div/div[2]/div/div[1]/div/div[8]/span/div[3]/div/div"));
            WebElement q5_3 = driver.findElement(By.xpath("//*[@id=\"mG61Hd\"]/div/div/div[2]/div[3]/div/div[2]/div/div[1]/div/div[8]/span/div[4]/div/div"));
            WebElement q5_4 = driver.findElement(By.xpath("//*[@id=\"mG61Hd\"]/div/div/div[2]/div[3]/div/div[2]/div/div[1]/div/div[8]/span/div[5]/div/div"));
            WebElement[] question5 = new WebElement[]{q5_1, q5_2, q5_3, q5_4};
            rand = new Random().nextInt(4);
            question5[rand].click();

            WebElement q6_1 = driver.findElement(By.xpath("//*[@id=\"mG61Hd\"]/div/div/div[2]/div[3]/div/div[2]/div/div[1]/div/div[10]/span/div[2]/div/div"));
            WebElement q6_2 = driver.findElement(By.xpath("//*[@id=\"mG61Hd\"]/div/div/div[2]/div[3]/div/div[2]/div/div[1]/div/div[10]/span/div[3]/div/div"));
            WebElement q6_3 = driver.findElement(By.xpath("//*[@id=\"mG61Hd\"]/div/div/div[2]/div[3]/div/div[2]/div/div[1]/div/div[10]/span/div[4]/div/div"));
            WebElement q6_4 = driver.findElement(By.xpath("//*[@id=\"mG61Hd\"]/div/div/div[2]/div[3]/div/div[2]/div/div[1]/div/div[10]/span/div[5]/div/div"));
            WebElement[] question6 = new WebElement[]{q6_1, q6_2, q6_3, q6_4};
            rand = new Random().nextInt(4);
            question6[rand].click();

            WebElement q7_1 = driver.findElement(By.xpath("//*[@id=\"mG61Hd\"]/div/div/div[2]/div[4]/div/div[2]/div/div[1]/div/div[2]/span/div[2]/div/div"));
            WebElement q7_2 = driver.findElement(By.xpath("//*[@id=\"mG61Hd\"]/div/div/div[2]/div[4]/div/div[2]/div/div[1]/div/div[2]/span/div[3]/div/div"));
            WebElement q7_3 = driver.findElement(By.xpath("//*[@id=\"mG61Hd\"]/div/div/div[2]/div[4]/div/div[2]/div/div[1]/div/div[2]/span/div[4]/div/div"));
            WebElement q7_4 = driver.findElement(By.xpath("//*[@id=\"mG61Hd\"]/div/div/div[2]/div[4]/div/div[2]/div/div[1]/div/div[2]/span/div[5]/div/div"));
            WebElement[] question7 = new WebElement[]{q7_1, q7_2, q7_3, q7_4};
            rand = new Random().nextInt(4);
            question7[rand].click();

            WebElement q8_1 = driver.findElement(By.xpath("//*[@id=\"mG61Hd\"]/div/div/div[2]/div[4]/div/div[2]/div/div[1]/div/div[4]/span/div[2]/div/div"));
            WebElement q8_2 = driver.findElement(By.xpath("//*[@id=\"mG61Hd\"]/div/div/div[2]/div[4]/div/div[2]/div/div[1]/div/div[4]/span/div[3]/div/div"));
            WebElement q8_3 = driver.findElement(By.xpath("//*[@id=\"mG61Hd\"]/div/div/div[2]/div[4]/div/div[2]/div/div[1]/div/div[4]/span/div[4]/div/div"));
            WebElement q8_4 = driver.findElement(By.xpath("//*[@id=\"mG61Hd\"]/div/div/div[2]/div[4]/div/div[2]/div/div[1]/div/div[4]/span/div[5]/div/div"));
            WebElement[] question8 = new WebElement[]{q8_1, q8_2, q8_3, q8_4};
            rand = new Random().nextInt(4);
            question8[rand].click();

            WebElement q9_1 = driver.findElement(By.xpath("//*[@id=\"mG61Hd\"]/div/div/div[2]/div[4]/div/div[2]/div/div[1]/div/div[6]/span/div[2]/div/div"));
            WebElement q9_2 = driver.findElement(By.xpath("//*[@id=\"mG61Hd\"]/div/div/div[2]/div[4]/div/div[2]/div/div[1]/div/div[6]/span/div[3]/div/div"));
            WebElement q9_3 = driver.findElement(By.xpath("//*[@id=\"mG61Hd\"]/div/div/div[2]/div[4]/div/div[2]/div/div[1]/div/div[6]/span/div[4]/div/div"));
            WebElement q9_4 = driver.findElement(By.xpath("//*[@id=\"mG61Hd\"]/div/div/div[2]/div[4]/div/div[2]/div/div[1]/div/div[6]/span/div[5]/div/div"));
            WebElement[] question9 = new WebElement[]{q9_1, q9_2, q9_3, q9_4};
            rand = new Random().nextInt(4);
            question9[rand].click();

            WebElement q10_1 = driver.findElement(By.xpath("//*[@id=\"mG61Hd\"]/div/div/div[2]/div[4]/div/div[2]/div/div[1]/div/div[8]/span/div[2]/div/div"));
            WebElement q10_2 = driver.findElement(By.xpath("//*[@id=\"mG61Hd\"]/div/div/div[2]/div[4]/div/div[2]/div/div[1]/div/div[8]/span/div[3]/div/div"));
            WebElement q10_3 = driver.findElement(By.xpath("//*[@id=\"mG61Hd\"]/div/div/div[2]/div[4]/div/div[2]/div/div[1]/div/div[8]/span/div[4]/div/div"));
            WebElement q10_4 = driver.findElement(By.xpath("//*[@id=\"mG61Hd\"]/div/div/div[2]/div[4]/div/div[2]/div/div[1]/div/div[8]/span/div[5]/div/div"));
            WebElement[] question10 = new WebElement[]{q10_1, q10_2, q10_3, q10_4};
            rand = new Random().nextInt(4);
            question10[rand].click();

            WebElement q11_1 = driver.findElement(By.xpath("//*[@id=\"mG61Hd\"]/div/div/div[2]/div[4]/div/div[2]/div/div[1]/div/div[10]/span/div[2]/div/div"));
            WebElement q11_2 = driver.findElement(By.xpath("//*[@id=\"mG61Hd\"]/div/div/div[2]/div[4]/div/div[2]/div/div[1]/div/div[10]/span/div[3]/div/div"));
            WebElement q11_3 = driver.findElement(By.xpath("//*[@id=\"mG61Hd\"]/div/div/div[2]/div[4]/div/div[2]/div/div[1]/div/div[10]/span/div[4]/div/div"));
            WebElement q11_4 = driver.findElement(By.xpath("//*[@id=\"mG61Hd\"]/div/div/div[2]/div[4]/div/div[2]/div/div[1]/div/div[10]/span/div[5]/div/div"));
            WebElement[] question11 = new WebElement[]{q11_1, q11_2, q11_3, q11_4};
            rand = new Random().nextInt(4);
            question11[rand].click();

            WebElement q12_1 = driver.findElement(By.xpath("//*[@id=\"mG61Hd\"]/div/div/div[2]/div[5]/div/div[2]/div/div[1]/div/div[2]/span/div[2]/div/div"));
            WebElement q12_2 = driver.findElement(By.xpath("//*[@id=\"mG61Hd\"]/div/div/div[2]/div[5]/div/div[2]/div/div[1]/div/div[2]/span/div[3]/div/div"));
            WebElement q12_3 = driver.findElement(By.xpath("//*[@id=\"mG61Hd\"]/div/div/div[2]/div[5]/div/div[2]/div/div[1]/div/div[2]/span/div[4]/div/div"));
            WebElement q12_4 = driver.findElement(By.xpath("//*[@id=\"mG61Hd\"]/div/div/div[2]/div[5]/div/div[2]/div/div[1]/div/div[2]/span/div[5]/div/div"));
            WebElement[] question12 = new WebElement[]{q12_1, q12_2, q12_3, q12_4};
            rand = new Random().nextInt(4);
            question12[rand].click();

            WebElement q13_1 = driver.findElement(By.xpath("//*[@id=\"mG61Hd\"]/div/div/div[2]/div[5]/div/div[2]/div/div[1]/div/div[4]/span/div[2]/div/div"));
            WebElement q13_2 = driver.findElement(By.xpath("//*[@id=\"mG61Hd\"]/div/div/div[2]/div[5]/div/div[2]/div/div[1]/div/div[4]/span/div[3]/div/div"));
            WebElement q13_3 = driver.findElement(By.xpath("//*[@id=\"mG61Hd\"]/div/div/div[2]/div[5]/div/div[2]/div/div[1]/div/div[4]/span/div[4]/div/div"));
            WebElement q13_4 = driver.findElement(By.xpath("//*[@id=\"mG61Hd\"]/div/div/div[2]/div[5]/div/div[2]/div/div[1]/div/div[4]/span/div[5]/div/div"));
            WebElement[] question13 = new WebElement[]{q13_1, q13_2, q13_3, q13_4};
            rand = new Random().nextInt(4);
            question13[rand].click();

            WebElement q14_1 = driver.findElement(By.xpath("//*[@id=\"mG61Hd\"]/div/div/div[2]/div[5]/div/div[2]/div/div[1]/div/div[6]/span/div[2]/div/div"));
            WebElement q14_2 = driver.findElement(By.xpath("//*[@id=\"mG61Hd\"]/div/div/div[2]/div[5]/div/div[2]/div/div[1]/div/div[6]/span/div[3]/div/div"));
            WebElement q14_3 = driver.findElement(By.xpath("//*[@id=\"mG61Hd\"]/div/div/div[2]/div[5]/div/div[2]/div/div[1]/div/div[6]/span/div[4]/div/div"));
            WebElement q14_4 = driver.findElement(By.xpath("//*[@id=\"mG61Hd\"]/div/div/div[2]/div[5]/div/div[2]/div/div[1]/div/div[6]/span/div[5]/div/div"));
            WebElement[] question14 = new WebElement[]{q14_1, q14_2, q14_3, q14_4};
            rand = new Random().nextInt(4);
            question14[rand].click();

            WebElement q15_1 = driver.findElement(By.xpath("//*[@id=\"mG61Hd\"]/div/div/div[2]/div[5]/div/div[2]/div/div[1]/div/div[8]/span/div[2]/div/div"));
            WebElement q15_2 = driver.findElement(By.xpath("//*[@id=\"mG61Hd\"]/div/div/div[2]/div[5]/div/div[2]/div/div[1]/div/div[8]/span/div[3]/div/div"));
            WebElement q15_3 = driver.findElement(By.xpath("//*[@id=\"mG61Hd\"]/div/div/div[2]/div[5]/div/div[2]/div/div[1]/div/div[8]/span/div[4]/div/div"));
            WebElement q15_4 = driver.findElement(By.xpath("//*[@id=\"mG61Hd\"]/div/div/div[2]/div[5]/div/div[2]/div/div[1]/div/div[8]/span/div[5]/div/div"));
            WebElement[] question15 = new WebElement[]{q15_1, q15_2, q15_3, q15_4};
            rand = new Random().nextInt(4);
            question15[rand].click();

            WebElement q16_1 = driver.findElement(By.xpath("//*[@id=\"mG61Hd\"]/div/div/div[2]/div[5]/div/div[2]/div/div[1]/div/div[10]/span/div[2]/div/div"));
            WebElement q16_2 = driver.findElement(By.xpath("//*[@id=\"mG61Hd\"]/div/div/div[2]/div[5]/div/div[2]/div/div[1]/div/div[10]/span/div[3]/div/div"));
            WebElement q16_3 = driver.findElement(By.xpath("//*[@id=\"mG61Hd\"]/div/div/div[2]/div[5]/div/div[2]/div/div[1]/div/div[10]/span/div[4]/div/div"));
            WebElement q16_4 = driver.findElement(By.xpath("//*[@id=\"mG61Hd\"]/div/div/div[2]/div[5]/div/div[2]/div/div[1]/div/div[10]/span/div[5]/div/div"));
            WebElement[] question16 = new WebElement[]{q16_1, q16_2, q16_3, q16_4};
            rand = new Random().nextInt(4);
            question16[rand].click();

            WebElement q17_1 = driver.findElement(By.xpath("//*[@id=\"mG61Hd\"]/div/div/div[2]/div[6]/div/div[2]/div/div[1]/div/div[2]/label[1]/div/div"));
            WebElement q17_2 = driver.findElement(By.xpath("//*[@id=\"mG61Hd\"]/div/div/div[2]/div[6]/div/div[2]/div/div[1]/div/div[2]/label[2]/div/div"));
            WebElement q17_3 = driver.findElement(By.xpath("//*[@id=\"mG61Hd\"]/div/div/div[2]/div[6]/div/div[2]/div/div[1]/div/div[2]/label[3]/div/div"));
            WebElement q17_4 = driver.findElement(By.xpath("//*[@id=\"mG61Hd\"]/div/div/div[2]/div[6]/div/div[2]/div/div[1]/div/div[2]/label[4]/div/div"));
            WebElement q17_5 = driver.findElement(By.xpath("//*[@id=\"mG61Hd\"]/div/div/div[2]/div[6]/div/div[2]/div/div[1]/div/div[2]/label[5]/div/div"));
            WebElement[] question17 = new WebElement[]{q17_1, q17_2, q17_3, q17_4, q17_5};
            rand = new Random().nextInt(5);
            question17[rand].click();

            WebElement q18_1 = driver.findElement(By.xpath("//*[@id=\"mG61Hd\"]/div/div/div[2]/div[6]/div/div[2]/div/div[1]/div/div[4]/label[1]/div/div"));
            WebElement q18_2 = driver.findElement(By.xpath("//*[@id=\"mG61Hd\"]/div/div/div[2]/div[6]/div/div[2]/div/div[1]/div/div[4]/label[2]/div/div"));
            WebElement q18_3 = driver.findElement(By.xpath("//*[@id=\"mG61Hd\"]/div/div/div[2]/div[6]/div/div[2]/div/div[1]/div/div[4]/label[3]/div/div"));
            WebElement q18_4 = driver.findElement(By.xpath("//*[@id=\"mG61Hd\"]/div/div/div[2]/div[6]/div/div[2]/div/div[1]/div/div[4]/label[4]/div/div"));
            WebElement q18_5 = driver.findElement(By.xpath("//*[@id=\"mG61Hd\"]/div/div/div[2]/div[6]/div/div[2]/div/div[1]/div/div[4]/label[5]/div/div"));
            WebElement[] question18 = new WebElement[]{q18_1, q18_2, q18_3, q18_4, q18_5};
            rand = new Random().nextInt(5);
            question18[rand].click();

            WebElement q19_1 = driver.findElement(By.xpath("//*[@id=\"mG61Hd\"]/div/div/div[2]/div[6]/div/div[2]/div/div[1]/div/div[6]/label[1]/div/div"));
            WebElement q19_2 = driver.findElement(By.xpath("//*[@id=\"mG61Hd\"]/div/div/div[2]/div[6]/div/div[2]/div/div[1]/div/div[6]/label[1]/div/div"));
            WebElement q19_3 = driver.findElement(By.xpath("//*[@id=\"mG61Hd\"]/div/div/div[2]/div[6]/div/div[2]/div/div[1]/div/div[6]/label[3]/div/div"));
            WebElement q19_4 = driver.findElement(By.xpath("//*[@id=\"mG61Hd\"]/div/div/div[2]/div[6]/div/div[2]/div/div[1]/div/div[6]/label[4]/div/div"));
            WebElement q19_5 = driver.findElement(By.xpath("//*[@id=\"mG61Hd\"]/div/div/div[2]/div[6]/div/div[2]/div/div[1]/div/div[6]/label[5]/div/div"));
            WebElement[] question19 = new WebElement[]{q19_1, q19_2, q19_3, q19_4, q19_5};
            rand = new Random().nextInt(5);
            question19[rand].click();

            WebElement q20_1 = driver.findElement(By.xpath("//*[@id=\"mG61Hd\"]/div/div/div[2]/div[6]/div/div[2]/div/div[1]/div/div[8]/label[1]/div/div"));
            WebElement q20_2 = driver.findElement(By.xpath("//*[@id=\"mG61Hd\"]/div/div/div[2]/div[6]/div/div[2]/div/div[1]/div/div[8]/label[2]/div/div"));
            WebElement q20_3 = driver.findElement(By.xpath("//*[@id=\"mG61Hd\"]/div/div/div[2]/div[6]/div/div[2]/div/div[1]/div/div[8]/label[3]/div/div"));
            WebElement q20_4 = driver.findElement(By.xpath("//*[@id=\"mG61Hd\"]/div/div/div[2]/div[6]/div/div[2]/div/div[1]/div/div[8]/label[4]/div/div"));
            WebElement q20_5 = driver.findElement(By.xpath("//*[@id=\"mG61Hd\"]/div/div/div[2]/div[6]/div/div[2]/div/div[1]/div/div[8]/label[5]/div/div"));
            WebElement[] question20 = new WebElement[]{q20_1, q20_2, q20_3, q20_4, q20_5};
            rand = new Random().nextInt(5);
            question20[rand].click();

            WebElement q21_1 = driver.findElement(By.xpath("//*[@id=\"mG61Hd\"]/div/div/div[2]/div[6]/div/div[2]/div/div[1]/div/div[10]/label[1]/div/div"));
            WebElement q21_2 = driver.findElement(By.xpath("//*[@id=\"mG61Hd\"]/div/div/div[2]/div[6]/div/div[2]/div/div[1]/div/div[10]/label[2]/div/div"));
            WebElement q21_3 = driver.findElement(By.xpath("//*[@id=\"mG61Hd\"]/div/div/div[2]/div[6]/div/div[2]/div/div[1]/div/div[10]/label[3]/div/div"));
            WebElement q21_4 = driver.findElement(By.xpath("//*[@id=\"mG61Hd\"]/div/div/div[2]/div[6]/div/div[2]/div/div[1]/div/div[10]/label[4]/div/div"));
            WebElement q21_5 = driver.findElement(By.xpath("//*[@id=\"mG61Hd\"]/div/div/div[2]/div[6]/div/div[2]/div/div[1]/div/div[10]/label[5]/div/div"));
            WebElement[] question21 = new WebElement[]{q21_1, q21_2, q21_3, q21_4, q21_5};
            rand = new Random().nextInt(5);
            question21[rand].click();

            WebElement q22_1 = driver.findElement(By.xpath("//*[@id=\"mG61Hd\"]/div/div/div[2]/div[7]/div/div[2]/div/span/div/div[1]/label/div/div[1]/div"));
            WebElement q22_2 = driver.findElement(By.xpath("//*[@id=\"mG61Hd\"]/div/div/div[2]/div[7]/div/div[2]/div/span/div/div[2]/label/div/div[1]/div"));
            WebElement q22_3 = driver.findElement(By.xpath("//*[@id=\"mG61Hd\"]/div/div/div[2]/div[7]/div/div[2]/div/span/div/div[3]/label/div/div[1]/div"));
            WebElement[] question22 = new WebElement[]{q22_1, q22_2, q22_3};
            rand = new Random().nextInt(3);
            question22[rand].click();

            WebElement q23_1 = driver.findElement(By.xpath("//*[@id=\"mG61Hd\"]/div/div/div[2]/div[8]/div/div[2]/div/span/div/div[1]/label/div/div[1]/div"));
            WebElement q23_2 = driver.findElement(By.xpath("//*[@id=\"mG61Hd\"]/div/div/div[2]/div[8]/div/div[2]/div/span/div/div[2]/label/div/div[1]/div"));
            WebElement q23_3 = driver.findElement(By.xpath("//*[@id=\"mG61Hd\"]/div/div/div[2]/div[8]/div/div[2]/div/span/div/div[3]/label/div/div[1]/div"));
            WebElement[] question23 = new WebElement[]{q23_1, q23_2, q23_3};
            rand = new Random().nextInt(3);
            question23[rand].click();

            WebElement q24_1 = driver.findElement(By.xpath("//*[@id=\"mG61Hd\"]/div/div/div[2]/div[9]/div/div[2]/div/span/div/div[1]/label/div/div[1]/div"));
            WebElement q24_2 = driver.findElement(By.xpath("//*[@id=\"mG61Hd\"]/div/div/div[2]/div[9]/div/div[2]/div/span/div/div[2]/label/div/div[1]/div"));
            WebElement q24_3 = driver.findElement(By.xpath("//*[@id=\"mG61Hd\"]/div/div/div[2]/div[9]/div/div[2]/div/span/div/div[3]/label/div/div[1]/div"));
            WebElement q24_4 = driver.findElement(By.xpath("//*[@id=\"mG61Hd\"]/div/div/div[2]/div[9]/div/div[2]/div/span/div/div[4]/label/div/div[1]/div"));
            WebElement[] question24 = new WebElement[]{q24_1, q24_2, q24_3, q24_4};
            rand = new Random().nextInt(4);
            question24[rand].click();

            WebElement q25_1 = driver.findElement(By.xpath("//*[@id=\"mG61Hd\"]/div/div/div[2]/div[10]/div/div[2]/div/span/div/div[1]/label/div/div[1]/div"));
            WebElement q25_2 = driver.findElement(By.xpath("//*[@id=\"mG61Hd\"]/div/div/div[2]/div[10]/div/div[2]/div/span/div/div[2]/label/div/div[1]/div"));
            WebElement q25_3 = driver.findElement(By.xpath("//*[@id=\"mG61Hd\"]/div/div/div[2]/div[10]/div/div[2]/div/span/div/div[3]/label/div/div[1]/div"));
            WebElement q25_4 = driver.findElement(By.xpath("//*[@id=\"mG61Hd\"]/div/div/div[2]/div[10]/div/div[2]/div/span/div/div[4]/label/div/div[1]/div"));
            WebElement[] question25 = new WebElement[]{q25_1, q25_2, q25_3, q25_4};
            rand = new Random().nextInt(4);
            question25[rand].click();

            WebElement q26_1 = driver.findElement(By.xpath("//*[@id=\"mG61Hd\"]/div/div/div[2]/div[11]/div/div[2]/div/span/div/div[1]/label/div/div[1]/div"));
            WebElement q26_2 = driver.findElement(By.xpath("//*[@id=\"mG61Hd\"]/div/div/div[2]/div[11]/div/div[2]/div/span/div/div[2]/label/div/div[1]/div"));
            WebElement q26_3 = driver.findElement(By.xpath("//*[@id=\"mG61Hd\"]/div/div/div[2]/div[11]/div/div[2]/div/span/div/div[3]/label/div/div[1]/div"));
            WebElement q26_4 = driver.findElement(By.xpath("//*[@id=\"mG61Hd\"]/div/div/div[2]/div[11]/div/div[2]/div/span/div/div[4]/label/div/div[1]/div"));
            WebElement[] question26 = new WebElement[]{q26_1, q26_2, q26_3, q26_4};
            rand = new Random().nextInt(4);
            question26[rand].click();

            WebElement q27_1 = driver.findElement(By.xpath("//*[@id=\"mG61Hd\"]/div/div/div[2]/div[12]/div/div[2]/div/span/div/div[1]/label/div/div[1]/div"));
            WebElement q27_2 = driver.findElement(By.xpath("//*[@id=\"mG61Hd\"]/div/div/div[2]/div[12]/div/div[2]/div/span/div/div[2]/label/div/div[1]/div"));
            WebElement q27_3 = driver.findElement(By.xpath("//*[@id=\"mG61Hd\"]/div/div/div[2]/div[12]/div/div[2]/div/span/div/div[3]/label/div/div[1]/div"));
            WebElement q27_4 = driver.findElement(By.xpath("//*[@id=\"mG61Hd\"]/div/div/div[2]/div[12]/div/div[2]/div/span/div/div[4]/label/div/div[1]/div"));
            WebElement[] question27 = new WebElement[]{q27_1, q27_2, q27_3, q27_4};
            rand = new Random().nextInt(4);
            question27[rand].click();

            WebElement q28_1 = driver.findElement(By.xpath("//*[@id=\"mG61Hd\"]/div/div/div[2]/div[13]/div/div[2]/div/span/div/div[1]/label/div/div[1]/div"));
            WebElement q28_2 = driver.findElement(By.xpath("//*[@id=\"mG61Hd\"]/div/div/div[2]/div[13]/div/div[2]/div/span/div/div[2]/label/div/div[1]/div"));
            WebElement q28_3 = driver.findElement(By.xpath("//*[@id=\"mG61Hd\"]/div/div/div[2]/div[13]/div/div[2]/div/span/div/div[3]/label/div/div[1]/div"));
            WebElement q28_4 = driver.findElement(By.xpath("//*[@id=\"mG61Hd\"]/div/div/div[2]/div[13]/div/div[2]/div/span/div/div[4]/label/div/div[1]/div"));
            WebElement[] question28 = new WebElement[]{q28_1, q28_2, q28_3, q28_4};
            rand = new Random().nextInt(4);
            question28[rand].click();

            WebElement q29_1 = driver.findElement(By.xpath("//*[@id=\"mG61Hd\"]/div/div/div[2]/div[14]/div/div[2]/div/div[1]/div/div[2]/span/div[2]/div/div"));
            WebElement q29_2 = driver.findElement(By.xpath("//*[@id=\"mG61Hd\"]/div/div/div[2]/div[14]/div/div[2]/div/div[1]/div/div[2]/span/div[3]/div/div"));
            WebElement q29_3 = driver.findElement(By.xpath("//*[@id=\"mG61Hd\"]/div/div/div[2]/div[14]/div/div[2]/div/div[1]/div/div[2]/span/div[4]/div/div"));
            WebElement q29_4 = driver.findElement(By.xpath("//*[@id=\"mG61Hd\"]/div/div/div[2]/div[14]/div/div[2]/div/div[1]/div/div[2]/span/div[5]/div/div"));
            WebElement q29_5 = driver.findElement(By.xpath("//*[@id=\"mG61Hd\"]/div/div/div[2]/div[14]/div/div[2]/div/div[1]/div/div[2]/span/div[6]/div/div"));
            WebElement[] question29 = new WebElement[]{q29_1, q29_2, q29_3, q29_4, q29_5};
            rand = new Random().nextInt(5);
            question29[rand].click();

            WebElement q30_1 = driver.findElement(By.xpath("//*[@id=\"mG61Hd\"]/div/div/div[2]/div[14]/div/div[2]/div/div[1]/div/div[4]/span/div[2]/div/div"));
            WebElement q30_2 = driver.findElement(By.xpath("//*[@id=\"mG61Hd\"]/div/div/div[2]/div[14]/div/div[2]/div/div[1]/div/div[4]/span/div[3]/div/div"));
            WebElement q30_3 = driver.findElement(By.xpath("//*[@id=\"mG61Hd\"]/div/div/div[2]/div[14]/div/div[2]/div/div[1]/div/div[4]/span/div[4]/div/div"));
            WebElement q30_4 = driver.findElement(By.xpath("//*[@id=\"mG61Hd\"]/div/div/div[2]/div[14]/div/div[2]/div/div[1]/div/div[4]/span/div[5]/div/div"));
            WebElement q30_5 = driver.findElement(By.xpath("//*[@id=\"mG61Hd\"]/div/div/div[2]/div[14]/div/div[2]/div/div[1]/div/div[4]/span/div[6]/div/div"));
            WebElement[] question30 = new WebElement[]{q30_1, q30_2, q30_3, q30_4, q30_5};
            rand = new Random().nextInt(5);
            question30[rand].click();

            WebElement q31_1 = driver.findElement(By.xpath("//*[@id=\"mG61Hd\"]/div/div/div[2]/div[14]/div/div[2]/div/div[1]/div/div[6]/span/div[2]/div/div"));
            WebElement q31_2 = driver.findElement(By.xpath("//*[@id=\"mG61Hd\"]/div/div/div[2]/div[14]/div/div[2]/div/div[1]/div/div[6]/span/div[3]/div/div"));
            WebElement q31_3 = driver.findElement(By.xpath("//*[@id=\"mG61Hd\"]/div/div/div[2]/div[14]/div/div[2]/div/div[1]/div/div[6]/span/div[4]/div/div"));
            WebElement q31_4 = driver.findElement(By.xpath("//*[@id=\"mG61Hd\"]/div/div/div[2]/div[14]/div/div[2]/div/div[1]/div/div[6]/span/div[5]/div/div"));
            WebElement q31_5 = driver.findElement(By.xpath("//*[@id=\"mG61Hd\"]/div/div/div[2]/div[14]/div/div[2]/div/div[1]/div/div[6]/span/div[6]/div/div"));
            WebElement[] question31 = new WebElement[]{q31_1, q31_2, q31_3, q31_4, q31_5};
            rand = new Random().nextInt(5);
            question31[rand].click();

            WebElement q32_1 = driver.findElement(By.xpath("//*[@id=\"mG61Hd\"]/div/div/div[2]/div[14]/div/div[2]/div/div[1]/div/div[8]/span/div[2]/div/div"));
            WebElement q32_2 = driver.findElement(By.xpath("//*[@id=\"mG61Hd\"]/div/div/div[2]/div[14]/div/div[2]/div/div[1]/div/div[8]/span/div[3]/div/div"));
            WebElement q32_3 = driver.findElement(By.xpath("//*[@id=\"mG61Hd\"]/div/div/div[2]/div[14]/div/div[2]/div/div[1]/div/div[8]/span/div[4]/div/div"));
            WebElement q32_4 = driver.findElement(By.xpath("//*[@id=\"mG61Hd\"]/div/div/div[2]/div[14]/div/div[2]/div/div[1]/div/div[8]/span/div[5]/div/div"));
            WebElement q32_5 = driver.findElement(By.xpath("//*[@id=\"mG61Hd\"]/div/div/div[2]/div[14]/div/div[2]/div/div[1]/div/div[8]/span/div[6]/div/div"));
            WebElement[] question32 = new WebElement[]{q32_1, q32_2, q32_3, q32_4, q32_5};
            rand = new Random().nextInt(5);
            question32[rand].click();

            WebElement q33_1 = driver.findElement(By.xpath("//*[@id=\"mG61Hd\"]/div/div/div[2]/div[14]/div/div[2]/div/div[1]/div/div[10]/span/div[2]/div/div"));
            WebElement q33_2 = driver.findElement(By.xpath("//*[@id=\"mG61Hd\"]/div/div/div[2]/div[14]/div/div[2]/div/div[1]/div/div[10]/span/div[3]/div/div"));
            WebElement q33_3 = driver.findElement(By.xpath("//*[@id=\"mG61Hd\"]/div/div/div[2]/div[14]/div/div[2]/div/div[1]/div/div[10]/span/div[4]/div/div"));
            WebElement q33_4 = driver.findElement(By.xpath("//*[@id=\"mG61Hd\"]/div/div/div[2]/div[14]/div/div[2]/div/div[1]/div/div[10]/span/div[5]/div/div"));
            WebElement q33_5 = driver.findElement(By.xpath("//*[@id=\"mG61Hd\"]/div/div/div[2]/div[14]/div/div[2]/div/div[1]/div/div[10]/span/div[6]/div/div"));
            WebElement[] question33 = new WebElement[]{q33_1, q33_2, q33_3, q33_4, q33_5};
            rand = new Random().nextInt(5);
            question33[rand].click();

            WebElement q34_1 = driver.findElement(By.xpath("//*[@id=\"mG61Hd\"]/div/div/div[2]/div[14]/div/div[2]/div/div[1]/div/div[12]/span/div[2]/div/div"));
            WebElement q34_2 = driver.findElement(By.xpath("//*[@id=\"mG61Hd\"]/div/div/div[2]/div[14]/div/div[2]/div/div[1]/div/div[12]/span/div[3]/div/div"));
            WebElement q34_3 = driver.findElement(By.xpath("//*[@id=\"mG61Hd\"]/div/div/div[2]/div[14]/div/div[2]/div/div[1]/div/div[12]/span/div[4]/div/div"));
            WebElement q34_4 = driver.findElement(By.xpath("//*[@id=\"mG61Hd\"]/div/div/div[2]/div[14]/div/div[2]/div/div[1]/div/div[12]/span/div[5]/div/div"));
            WebElement q34_5 = driver.findElement(By.xpath("//*[@id=\"mG61Hd\"]/div/div/div[2]/div[14]/div/div[2]/div/div[1]/div/div[12]/span/div[6]/div/div"));
            WebElement[] question34 = new WebElement[]{q34_1, q34_2, q34_3, q34_4, q34_5};
            rand = new Random().nextInt(5);
            question34[rand].click();

            WebElement q35_1 = driver.findElement(By.xpath("//*[@id=\"mG61Hd\"]/div/div/div[2]/div[14]/div/div[2]/div/div[1]/div/div[14]/span/div[2]/div/div"));
            WebElement q35_2 = driver.findElement(By.xpath("//*[@id=\"mG61Hd\"]/div/div/div[2]/div[14]/div/div[2]/div/div[1]/div/div[14]/span/div[3]/div/div"));
            WebElement q35_3 = driver.findElement(By.xpath("//*[@id=\"mG61Hd\"]/div/div/div[2]/div[14]/div/div[2]/div/div[1]/div/div[14]/span/div[4]/div/div"));
            WebElement q35_4 = driver.findElement(By.xpath("//*[@id=\"mG61Hd\"]/div/div/div[2]/div[14]/div/div[2]/div/div[1]/div/div[14]/span/div[5]/div/div"));
            WebElement q35_5 = driver.findElement(By.xpath("//*[@id=\"mG61Hd\"]/div/div/div[2]/div[14]/div/div[2]/div/div[1]/div/div[14]/span/div[6]/div/div"));
            WebElement[] question35 = new WebElement[]{q35_1, q35_2, q35_3, q35_4, q35_5};
            rand = new Random().nextInt(5);
            question35[rand].click();

            WebElement q36_1 = driver.findElement(By.xpath("//*[@id=\"mG61Hd\"]/div/div/div[2]/div[14]/div/div[2]/div/div[1]/div/div[16]/span/div[2]/div/div"));
            WebElement q36_2 = driver.findElement(By.xpath("//*[@id=\"mG61Hd\"]/div/div/div[2]/div[14]/div/div[2]/div/div[1]/div/div[16]/span/div[3]/div/div"));
            WebElement q36_3 = driver.findElement(By.xpath("//*[@id=\"mG61Hd\"]/div/div/div[2]/div[14]/div/div[2]/div/div[1]/div/div[16]/span/div[4]/div/div"));
            WebElement q36_4 = driver.findElement(By.xpath("//*[@id=\"mG61Hd\"]/div/div/div[2]/div[14]/div/div[2]/div/div[1]/div/div[16]/span/div[5]/div/div"));
            WebElement q36_5 = driver.findElement(By.xpath("//*[@id=\"mG61Hd\"]/div/div/div[2]/div[14]/div/div[2]/div/div[1]/div/div[16]/span/div[6]/div/div"));
            WebElement[] question36 = new WebElement[]{q36_1, q36_2, q36_3, q36_4, q36_5};
            rand = new Random().nextInt(5);
            question36[rand].click();

            WebElement q37_1 = driver.findElement(By.xpath("//*[@id=\"mG61Hd\"]/div/div/div[2]/div[15]/div/div[2]/div/div[1]/div/div[2]/span/div[2]/div/div"));
            WebElement q37_2 = driver.findElement(By.xpath("//*[@id=\"mG61Hd\"]/div/div/div[2]/div[15]/div/div[2]/div/div[1]/div/div[2]/span/div[3]/div/div"));
            WebElement[] question37 = new WebElement[]{q37_1, q37_2};
            rand = new Random().nextInt(2);
            question37[rand].click();

            WebElement q38_1 = driver.findElement(By.xpath("//*[@id=\"mG61Hd\"]/div/div/div[2]/div[15]/div/div[2]/div/div[1]/div/div[4]/span/div[2]/div/div"));
            WebElement q38_2 = driver.findElement(By.xpath("//*[@id=\"mG61Hd\"]/div/div/div[2]/div[15]/div/div[2]/div/div[1]/div/div[4]/span/div[3]/div/div"));
            WebElement[] question38 = new WebElement[]{q38_1, q38_2};
            rand = new Random().nextInt(2);
            question38[rand].click();

            WebElement q39_1 = driver.findElement(By.xpath("//*[@id=\"mG61Hd\"]/div/div/div[2]/div[15]/div/div[2]/div/div[1]/div/div[6]/span/div[2]/div/div"));
            WebElement q39_2 = driver.findElement(By.xpath("//*[@id=\"mG61Hd\"]/div/div/div[2]/div[15]/div/div[2]/div/div[1]/div/div[6]/span/div[3]/div/div"));
            WebElement[] question39 = new WebElement[]{q39_1, q39_2};
            rand = new Random().nextInt(2);
            question39[rand].click();

            WebElement q40_1 = driver.findElement(By.xpath("//*[@id=\"mG61Hd\"]/div/div/div[2]/div[15]/div/div[2]/div/div[1]/div/div[8]/span/div[2]/div/div"));
            WebElement q40_2 = driver.findElement(By.xpath("//*[@id=\"mG61Hd\"]/div/div/div[2]/div[15]/div/div[2]/div/div[1]/div/div[8]/span/div[3]/div/div"));
            WebElement[] question40 = new WebElement[]{q40_1, q40_2};
            rand = new Random().nextInt(2);
            question40[rand].click();

            WebElement q41_1 = driver.findElement(By.xpath("//*[@id=\"mG61Hd\"]/div/div/div[2]/div[15]/div/div[2]/div/div[1]/div/div[10]/span/div[2]/div/div"));
            WebElement q41_2 = driver.findElement(By.xpath("//*[@id=\"mG61Hd\"]/div/div/div[2]/div[15]/div/div[2]/div/div[1]/div/div[10]/span/div[3]/div/div"));
            WebElement[] question41 = new WebElement[]{q41_1, q41_2};
            rand = new Random().nextInt(2);
            question41[rand].click();

            WebElement q42_1 = driver.findElement(By.xpath("//*[@id=\"mG61Hd\"]/div/div/div[2]/div[15]/div/div[2]/div/div[1]/div/div[12]/span/div[2]/div/div"));
            WebElement q42_2 = driver.findElement(By.xpath("//*[@id=\"mG61Hd\"]/div/div/div[2]/div[15]/div/div[2]/div/div[1]/div/div[12]/span/div[3]/div/div"));
            WebElement[] question42 = new WebElement[]{q42_1, q42_2};
            rand = new Random().nextInt(2);
            question42[rand].click();

            WebElement q43_1 = driver.findElement(By.xpath("//*[@id=\"mG61Hd\"]/div/div/div[2]/div[16]/div/div[2]/div[1]/div/label/div/div[1]"));
            WebElement q43_2 = driver.findElement(By.xpath("//*[@id=\"mG61Hd\"]/div/div/div[2]/div[16]/div/div[2]/div[2]/div/label/div/div[1]"));
            WebElement q43_3 = driver.findElement(By.xpath("//*[@id=\"mG61Hd\"]/div/div/div[2]/div[16]/div/div[2]/div[3]/div/label/div/div[1]"));
            WebElement[] question43 = new WebElement[]{q43_1, q43_2, q43_3};
            rand = new Random().nextInt(3);
            question43[rand].click();

            WebElement q44_1 = driver.findElement(By.xpath("//*[@id=\"mG61Hd\"]/div/div/div[2]/div[17]/div/div[2]/div[1]/div/label/div/div[1]"));
            WebElement q44_2 = driver.findElement(By.xpath("//*[@id=\"mG61Hd\"]/div/div/div[2]/div[17]/div/div[2]/div[2]/div/label/div/div[1]"));
            WebElement q44_3 = driver.findElement(By.xpath("//*[@id=\"mG61Hd\"]/div/div/div[2]/div[17]/div/div[2]/div[3]/div/label/div/div[1]"));
            WebElement[] question44 = new WebElement[]{q44_1, q44_2, q44_3};
            rand = new Random().nextInt(3);
            question44[rand].click();

            WebElement next_page3 = driver.findElement(By.xpath("//*[@id=\"mG61Hd\"]/div/div/div[3]/div[1]/div[1]/div[2]"));
            next_page3.click();

            try {
                Thread.sleep(3 * 1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            WebElement q45_1 = driver.findElement(By.xpath("//*[@id=\"mG61Hd\"]/div/div/div[2]/div[3]/div/div[2]/div/div[1]/div/div[2]/span/div[2]/div/div"));
            WebElement q45_2 = driver.findElement(By.xpath("//*[@id=\"mG61Hd\"]/div/div/div[2]/div[3]/div/div[2]/div/div[1]/div/div[2]/span/div[3]/div/div"));
            WebElement[] question45 = new WebElement[]{q45_1, q45_2};
            rand = new Random().nextInt(2);
            question45[rand].click();

            WebElement q46_1 = driver.findElement(By.xpath("//*[@id=\"mG61Hd\"]/div/div/div[2]/div[3]/div/div[2]/div/div[1]/div/div[4]/span/div[2]/div/div"));
            WebElement q46_2 = driver.findElement(By.xpath("//*[@id=\"mG61Hd\"]/div/div/div[2]/div[3]/div/div[2]/div/div[1]/div/div[4]/span/div[3]/div/div"));
            WebElement[] question46 = new WebElement[]{q46_1, q46_2};
            rand = new Random().nextInt(2);
            question46[rand].click();

            WebElement q47_1 = driver.findElement(By.xpath("//*[@id=\"mG61Hd\"]/div/div/div[2]/div[3]/div/div[2]/div/div[1]/div/div[6]/span/div[3]/div/div"));
            WebElement q47_2 = driver.findElement(By.xpath("//*[@id=\"mG61Hd\"]/div/div/div[2]/div[3]/div/div[2]/div/div[1]/div/div[6]/span/div[3]/div/div"));
            WebElement[] question47 = new WebElement[]{q47_1, q47_2};
            rand = new Random().nextInt(2);
            question47[rand].click();

            WebElement q48_1 = driver.findElement(By.xpath("//*[@id=\"mG61Hd\"]/div/div/div[2]/div[3]/div/div[2]/div/div[1]/div/div[8]/span/div[3]/div/div"));
            WebElement q48_2 = driver.findElement(By.xpath("//*[@id=\"mG61Hd\"]/div/div/div[2]/div[3]/div/div[2]/div/div[1]/div/div[8]/span/div[3]/div/div"));
            WebElement[] question48 = new WebElement[]{q48_1, q48_2};
            rand = new Random().nextInt(2);
            question48[rand].click();

            WebElement q49_1 = driver.findElement(By.xpath("//*[@id=\"mG61Hd\"]/div/div/div[2]/div[3]/div/div[2]/div/div[1]/div/div[10]/span/div[3]/div/div"));
            WebElement q49_2 = driver.findElement(By.xpath("//*[@id=\"mG61Hd\"]/div/div/div[2]/div[3]/div/div[2]/div/div[1]/div/div[10]/span/div[3]/div/div"));
            WebElement[] question49 = new WebElement[]{q49_1, q49_2};
            rand = new Random().nextInt(2);
            question49[rand].click();

            WebElement q50_1 = driver.findElement(By.xpath("//*[@id=\"mG61Hd\"]/div/div/div[2]/div[3]/div/div[2]/div/div[1]/div/div[12]/span/div[3]/div/div"));
            WebElement q50_2 = driver.findElement(By.xpath("//*[@id=\"mG61Hd\"]/div/div/div[2]/div[3]/div/div[2]/div/div[1]/div/div[12]/span/div[3]/div/div"));
            WebElement[] question50 = new WebElement[]{q50_1, q50_2};
            rand = new Random().nextInt(2);
            question50[rand].click();

            WebElement q51_1 = driver.findElement(By.xpath("//*[@id=\"mG61Hd\"]/div/div/div[2]/div[4]/div/div[2]/div/span/div/div[1]/label/div/div[1]/div"));
            WebElement q51_2 = driver.findElement(By.xpath("//*[@id=\"mG61Hd\"]/div/div/div[2]/div[4]/div/div[2]/div/span/div/div[2]/label/div/div[1]/div"));
            WebElement q51_3 = driver.findElement(By.xpath("//*[@id=\"mG61Hd\"]/div/div/div[2]/div[4]/div/div[2]/div/span/div/div[3]/label/div/div[1]/div"));
            WebElement q51_4 = driver.findElement(By.xpath("//*[@id=\"mG61Hd\"]/div/div/div[2]/div[4]/div/div[2]/div/span/div/div[4]/label/div/div[1]/div"));
            WebElement[] question51 = new WebElement[]{q51_1, q51_2, q51_3, q51_4};
            rand = new Random().nextInt(4);
            int check = rand;
            question51[rand].click();

            WebElement next_page4 = driver.findElement(By.xpath("//*[@id=\"mG61Hd\"]/div/div/div[3]/div[1]/div[1]/div[2]"));
            next_page4.click();

            try {
                Thread.sleep(3 * 1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
                if(check != 3) {
                WebElement q59_1 = driver.findElement(By.xpath("//*[@id=\"mG61Hd\"]/div/div/div[2]/div[2]/div/div[3]/div/span/div/div[1]/label/div/div[1]/div"));
                WebElement q59_2 = driver.findElement(By.xpath("//*[@id=\"mG61Hd\"]/div/div/div[2]/div[2]/div/div[3]/div/span/div/div[2]/label/div/div[1]/div"));
                WebElement q59_3 = driver.findElement(By.xpath("//*[@id=\"mG61Hd\"]/div/div/div[2]/div[2]/div/div[3]/div/span/div/div[3]/label/div/div[1]/div"));
                WebElement q59_4 = driver.findElement(By.xpath("//*[@id=\"mG61Hd\"]/div/div/div[2]/div[2]/div/div[3]/div/span/div/div[4]/label/div/div[1]/div"));
                WebElement[] question59 = new WebElement[]{q59_1, q59_2, q59_3, q59_4};
                rand = new Random().nextInt(4);
                question59[rand].click();

                WebElement q60_1 = driver.findElement(By.xpath("//*[@id=\"mG61Hd\"]/div/div/div[2]/div[3]/div/div[2]/div[1]/div/label/div/div[1]"));
                WebElement q60_2 = driver.findElement(By.xpath("//*[@id=\"mG61Hd\"]/div/div/div[2]/div[3]/div/div[2]/div[2]/div/label/div/div[1]"));
                WebElement q60_3 = driver.findElement(By.xpath("//*[@id=\"mG61Hd\"]/div/div/div[2]/div[3]/div/div[2]/div[3]/div/label/div/div[1]"));
                WebElement q60_4 = driver.findElement(By.xpath("//*[@id=\"mG61Hd\"]/div/div/div[2]/div[3]/div/div[2]/div[4]/div/label/div/div[1]"));
                WebElement q60_5 = driver.findElement(By.xpath("//*[@id=\"mG61Hd\"]/div/div/div[2]/div[3]/div/div[2]/div[5]/div/label/div/div[1]"));
                WebElement[] question60 = new WebElement[]{q60_1, q60_2, q60_3, q60_4, q60_5};
                rand = new Random().nextInt(5);
                question60[rand].click();

                WebElement q61_1 = driver.findElement(By.xpath("//*[@id=\"mG61Hd\"]/div/div/div[2]/div[4]/div/div[2]/div[1]/div/label/div/div[1]"));
                WebElement q61_2 = driver.findElement(By.xpath("//*[@id=\"mG61Hd\"]/div/div/div[2]/div[4]/div/div[2]/div[2]/div/label/div/div[1]"));
                WebElement q61_3 = driver.findElement(By.xpath("//*[@id=\"mG61Hd\"]/div/div/div[2]/div[4]/div/div[2]/div[3]/div/label/div/div[1]"));
                WebElement q61_4 = driver.findElement(By.xpath("//*[@id=\"mG61Hd\"]/div/div/div[2]/div[4]/div/div[2]/div[4]/div/label/div/div[1]"));
                WebElement[] question61 = new WebElement[]{q61_1, q61_2, q61_3, q61_4};
                rand = new Random().nextInt(4);
                question61[rand].click();

                WebElement next_page6 = driver.findElement(By.xpath("//*[@id=\"mG61Hd\"]/div/div/div[3]/div[1]/div[1]/div[2]"));
                next_page6.click();

                try {
                    Thread.sleep(3 * 1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }else {
                    WebElement q590_1 = driver.findElement(By.xpath("//*[@id=\"mG61Hd\"]/div/div/div[2]/div[2]/div/div[2]/div[1]/div/label/div/div[1]"));
                    WebElement q590_2 = driver.findElement(By.xpath("//*[@id=\"mG61Hd\"]/div/div/div[2]/div[2]/div/div[2]/div[2]/div/label/div/div[1]"));
                    WebElement q590_3 = driver.findElement(By.xpath("//*[@id=\"mG61Hd\"]/div/div/div[2]/div[2]/div/div[2]/div[3]/div/label/div/div[1]"));
                    WebElement q590_4 = driver.findElement(By.xpath("//*[@id=\"mG61Hd\"]/div/div/div[2]/div[2]/div/div[2]/div[4]/div/label/div/div[1]"));
                    WebElement[] question590 = new WebElement[]{q590_1, q590_2, q590_3, q590_4};
                    rand = new Random().nextInt(4);
                    question590[rand].click();

                    WebElement q591_1 = driver.findElement(By.xpath("//*[@id=\"mG61Hd\"]/div/div/div[2]/div[3]/div/div[2]/div[1]/div/label/div/div[1]"));
                    WebElement q591_2 = driver.findElement(By.xpath("//*[@id=\"mG61Hd\"]/div/div/div[2]/div[3]/div/div[2]/div[2]/div/label/div/div[1]"));
                    WebElement q591_3 = driver.findElement(By.xpath("//*[@id=\"mG61Hd\"]/div/div/div[2]/div[3]/div/div[2]/div[3]/div/label/div/div[1]"));
                    WebElement q591_4 = driver.findElement(By.xpath("//*[@id=\"mG61Hd\"]/div/div/div[2]/div[3]/div/div[2]/div[4]/div/label/div/div[1]"));
                    WebElement[] question591 = new WebElement[]{q591_1, q591_2, q591_3, q591_4};
                    rand = new Random().nextInt(4);
                    question591[rand].click();

                    WebElement q592_1 = driver.findElement(By.xpath("//*[@id=\"mG61Hd\"]/div/div/div[2]/div[4]/div/div[3]/div/span/div/div[1]/label/div/div[1]/div"));
                    WebElement q592_2 = driver.findElement(By.xpath("//*[@id=\"mG61Hd\"]/div/div/div[2]/div[4]/div/div[3]/div/span/div/div[2]/label/div/div[1]/div"));
                    WebElement q592_3 = driver.findElement(By.xpath("//*[@id=\"mG61Hd\"]/div/div/div[2]/div[4]/div/div[3]/div/span/div/div[3]/label/div/div[1]/div"));
                    WebElement q592_4 = driver.findElement(By.xpath("//*[@id=\"mG61Hd\"]/div/div/div[2]/div[4]/div/div[3]/div/span/div/div[4]/label/div/div[1]/div"));
                    WebElement[] question592 = new WebElement[]{q592_1, q592_2, q592_3, q592_4};
                    rand = new Random().nextInt(4);
                    question592[rand].click();

                    WebElement next_page_alt = driver.findElement(By.xpath("//*[@id=\"mG61Hd\"]/div/div/div[3]/div[1]/div[1]/div[2]"));
                    next_page_alt.click();

                    try {
                        Thread.sleep(3 * 1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

            }

            WebElement q62_1 = driver.findElement(By.xpath("//*[@id=\"mG61Hd\"]/div/div/div[2]/div[3]/div/div[2]/div/span/div/div[1]/label/div/div[1]/div"));
            WebElement q62_2 = driver.findElement(By.xpath("//*[@id=\"mG61Hd\"]/div/div/div[2]/div[3]/div/div[2]/div/span/div/div[2]/label/div/div[1]/div"));
            WebElement q62_3 = driver.findElement(By.xpath("//*[@id=\"mG61Hd\"]/div/div/div[2]/div[3]/div/div[2]/div/span/div/div[3]/label/div/div[1]/div"));
            WebElement q62_4 = driver.findElement(By.xpath("//*[@id=\"mG61Hd\"]/div/div/div[2]/div[3]/div/div[2]/div/span/div/div[4]/label/div/div[1]/div"));
            WebElement[] question62 = new WebElement[]{q62_1, q62_2, q62_3, q62_4};
            rand = new Random().nextInt(4);
            question62[rand].click();

            WebElement q63_1 = driver.findElement(By.xpath("//*[@id=\"mG61Hd\"]/div/div/div[2]/div[4]/div/div[2]/div/div[1]/div/div[2]/span/div[2]/div/div"));
            WebElement q63_2 = driver.findElement(By.xpath("//*[@id=\"mG61Hd\"]/div/div/div[2]/div[4]/div/div[2]/div/div[1]/div/div[2]/span/div[3]/div/div"));
            WebElement q63_3 = driver.findElement(By.xpath("//*[@id=\"mG61Hd\"]/div/div/div[2]/div[4]/div/div[2]/div/div[1]/div/div[2]/span/div[4]/div/div"));
            WebElement[] question63 = new WebElement[]{q63_1, q63_2, q63_3};
            rand = new Random().nextInt(3);
            question63[rand].click();

            WebElement q64_1 = driver.findElement(By.xpath("//*[@id=\"mG61Hd\"]/div/div/div[2]/div[4]/div/div[2]/div/div[1]/div/div[4]/span/div[2]/div/div"));
            WebElement q64_2 = driver.findElement(By.xpath("//*[@id=\"mG61Hd\"]/div/div/div[2]/div[4]/div/div[2]/div/div[1]/div/div[4]/span/div[3]/div/div"));
            WebElement q64_3 = driver.findElement(By.xpath("//*[@id=\"mG61Hd\"]/div/div/div[2]/div[4]/div/div[2]/div/div[1]/div/div[4]/span/div[4]/div/div"));
            WebElement[] question64 = new WebElement[]{q64_1, q64_2, q64_3};
            rand = new Random().nextInt(3);
            question64[rand].click();

            WebElement q65_1 = driver.findElement(By.xpath("//*[@id=\"mG61Hd\"]/div/div/div[2]/div[4]/div/div[2]/div/div[1]/div/div[6]/span/div[2]/div/div"));
            WebElement q65_2 = driver.findElement(By.xpath("//*[@id=\"mG61Hd\"]/div/div/div[2]/div[4]/div/div[2]/div/div[1]/div/div[6]/span/div[3]/div/div"));
            WebElement q65_3 = driver.findElement(By.xpath("//*[@id=\"mG61Hd\"]/div/div/div[2]/div[4]/div/div[2]/div/div[1]/div/div[6]/span/div[4]/div/div"));
            WebElement[] question65 = new WebElement[]{q65_1, q65_2, q65_3};
            rand = new Random().nextInt(3);
            question65[rand].click();

            WebElement q66_1 = driver.findElement(By.xpath("//*[@id=\"mG61Hd\"]/div/div/div[2]/div[4]/div/div[2]/div/div[1]/div/div[8]/span/div[2]/div/div"));
            WebElement q66_2 = driver.findElement(By.xpath("//*[@id=\"mG61Hd\"]/div/div/div[2]/div[4]/div/div[2]/div/div[1]/div/div[8]/span/div[3]/div/div"));
            WebElement q66_3 = driver.findElement(By.xpath("//*[@id=\"mG61Hd\"]/div/div/div[2]/div[4]/div/div[2]/div/div[1]/div/div[8]/span/div[4]/div/div"));
            WebElement[] question66 = new WebElement[]{q66_1, q66_2, q66_3};
            rand = new Random().nextInt(3);
            question66[rand].click();

            WebElement q67_1 = driver.findElement(By.xpath("//*[@id=\"mG61Hd\"]/div/div/div[2]/div[4]/div/div[2]/div/div[1]/div/div[10]/span/div[2]/div/div"));
            WebElement q67_2 = driver.findElement(By.xpath("//*[@id=\"mG61Hd\"]/div/div/div[2]/div[4]/div/div[2]/div/div[1]/div/div[10]/span/div[3]/div/div"));
            WebElement q67_3 = driver.findElement(By.xpath("//*[@id=\"mG61Hd\"]/div/div/div[2]/div[4]/div/div[2]/div/div[1]/div/div[10]/span/div[4]/div/div"));
            WebElement[] question67 = new WebElement[]{q67_1, q67_2, q67_3};
            rand = new Random().nextInt(3);
            question67[rand].click();

            WebElement q68_1 = driver.findElement(By.xpath("//*[@id=\"mG61Hd\"]/div/div/div[2]/div[4]/div/div[2]/div/div[1]/div/div[12]/span/div[2]/div/div"));
            WebElement q68_2 = driver.findElement(By.xpath("//*[@id=\"mG61Hd\"]/div/div/div[2]/div[4]/div/div[2]/div/div[1]/div/div[12]/span/div[3]/div/div"));
            WebElement q68_3 = driver.findElement(By.xpath("//*[@id=\"mG61Hd\"]/div/div/div[2]/div[4]/div/div[2]/div/div[1]/div/div[12]/span/div[4]/div/div"));
            WebElement[] question68 = new WebElement[]{q68_1, q68_2, q68_3};
            rand = new Random().nextInt(3);
            question68[rand].click();

            WebElement q69_1 = driver.findElement(By.xpath("//*[@id=\"mG61Hd\"]/div/div/div[2]/div[5]/div/div[2]/div[1]/div/label/div/div[1]"));
            WebElement q69_2 = driver.findElement(By.xpath("//*[@id=\"mG61Hd\"]/div/div/div[2]/div[5]/div/div[2]/div[2]/div/label/div/div[1]"));
            WebElement q69_3 = driver.findElement(By.xpath("//*[@id=\"mG61Hd\"]/div/div/div[2]/div[5]/div/div[2]/div[3]/div/label/div/div[1]"));
            WebElement q69_4 = driver.findElement(By.xpath("//*[@id=\"mG61Hd\"]/div/div/div[2]/div[5]/div/div[2]/div[4]/div/label/div/div[1]"));
            WebElement[] question69 = new WebElement[]{q69_1, q69_2, q69_3, q69_4};
            rand = new Random().nextInt(4);
            question69[rand].click();

            WebElement q70_1 = driver.findElement(By.xpath("//*[@id=\"mG61Hd\"]/div/div/div[2]/div[6]/div/div[3]/div/span/div/label[1]/div[2]/div/div"));
            WebElement q70_2 = driver.findElement(By.xpath("//*[@id=\"mG61Hd\"]/div/div/div[2]/div[6]/div/div[3]/div/span/div/label[2]/div[2]/div/div"));
            WebElement q70_3 = driver.findElement(By.xpath("//*[@id=\"mG61Hd\"]/div/div/div[2]/div[6]/div/div[3]/div/span/div/label[3]/div[2]/div/div"));
            WebElement q70_4 = driver.findElement(By.xpath("//*[@id=\"mG61Hd\"]/div/div/div[2]/div[6]/div/div[3]/div/span/div/label[4]/div[2]/div/div"));
            WebElement q70_5 = driver.findElement(By.xpath("//*[@id=\"mG61Hd\"]/div/div/div[2]/div[6]/div/div[3]/div/span/div/label[5]/div[2]/div/div"));
            WebElement[] question70 = new WebElement[]{q70_1, q70_2, q70_3, q70_4, q70_5};
            rand = new Random().nextInt(5);
            question70[rand].click();

            WebElement q71_1 = driver.findElement(By.xpath("//*[@id=\"mG61Hd\"]/div/div/div[2]/div[7]/div/div[3]/div/span/div/label[1]/div[2]/div/div"));
            WebElement q71_2 = driver.findElement(By.xpath("//*[@id=\"mG61Hd\"]/div/div/div[2]/div[7]/div/div[3]/div/span/div/label[2]/div[2]/div/div"));
            WebElement q71_3 = driver.findElement(By.xpath("//*[@id=\"mG61Hd\"]/div/div/div[2]/div[7]/div/div[3]/div/span/div/label[3]/div[2]/div/div"));
            WebElement q71_4 = driver.findElement(By.xpath("//*[@id=\"mG61Hd\"]/div/div/div[2]/div[7]/div/div[3]/div/span/div/label[4]/div[2]/div/div"));
            WebElement q71_5 = driver.findElement(By.xpath("//*[@id=\"mG61Hd\"]/div/div/div[2]/div[7]/div/div[3]/div/span/div/label[5]/div[2]/div/div"));
            WebElement[] question71 = new WebElement[]{q71_1, q71_2, q71_3, q71_4, q71_5};
            rand = new Random().nextInt(5);
            question71[rand].click();

            WebElement q72_1 = driver.findElement(By.xpath("//*[@id=\"mG61Hd\"]/div/div/div[2]/div[8]/div/div[3]/div/span/div/label[1]/div[2]/div/div"));
            WebElement q72_2 = driver.findElement(By.xpath("//*[@id=\"mG61Hd\"]/div/div/div[2]/div[8]/div/div[3]/div/span/div/label[2]/div[2]/div/div"));
            WebElement q72_3 = driver.findElement(By.xpath("//*[@id=\"mG61Hd\"]/div/div/div[2]/div[8]/div/div[3]/div/span/div/label[3]/div[2]/div/div"));
            WebElement q72_4 = driver.findElement(By.xpath("//*[@id=\"mG61Hd\"]/div/div/div[2]/div[8]/div/div[3]/div/span/div/label[4]/div[2]/div/div"));
            WebElement q72_5 = driver.findElement(By.xpath("//*[@id=\"mG61Hd\"]/div/div/div[2]/div[8]/div/div[3]/div/span/div/label[5]/div[2]/div/div"));
            WebElement[] question72 = new WebElement[]{q72_1, q72_2, q72_3, q72_4, q72_5};
            rand = new Random().nextInt(5);
            question72[rand].click();

            WebElement next_page7 = driver.findElement(By.xpath("//*[@id=\"mG61Hd\"]/div/div/div[3]/div[1]/div[1]/div[2]"));
            next_page7.click();

            try {
                Thread.sleep(3 * 1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            WebElement q73_1 = driver.findElement(By.xpath("//*[@id=\"mG61Hd\"]/div/div/div[2]/div[3]/div/div[3]/div/div[1]/div/div[2]/span/div[2]/div/div"));
            WebElement q73_2 = driver.findElement(By.xpath("//*[@id=\"mG61Hd\"]/div/div/div[2]/div[3]/div/div[3]/div/div[1]/div/div[2]/span/div[3]/div/div"));
            WebElement q73_3 = driver.findElement(By.xpath("//*[@id=\"mG61Hd\"]/div/div/div[2]/div[3]/div/div[3]/div/div[1]/div/div[2]/span/div[4]/div/div"));
            WebElement q73_4 = driver.findElement(By.xpath("//*[@id=\"mG61Hd\"]/div/div/div[2]/div[3]/div/div[3]/div/div[1]/div/div[2]/span/div[5]/div/div"));
            WebElement q73_5 = driver.findElement(By.xpath("//*[@id=\"mG61Hd\"]/div/div/div[2]/div[3]/div/div[3]/div/div[1]/div/div[2]/span/div[6]/div/div"));
            WebElement[] question73 = new WebElement[]{q73_1, q73_2, q73_3, q73_4, q73_5};
            rand = new Random().nextInt(5);
            question73[rand].click();

            WebElement q74_1 = driver.findElement(By.xpath("//*[@id=\"mG61Hd\"]/div/div/div[2]/div[3]/div/div[3]/div/div[1]/div/div[4]/span/div[2]/div/div"));
            WebElement q74_2 = driver.findElement(By.xpath("//*[@id=\"mG61Hd\"]/div/div/div[2]/div[3]/div/div[3]/div/div[1]/div/div[4]/span/div[3]/div/div"));
            WebElement q74_3 = driver.findElement(By.xpath("//*[@id=\"mG61Hd\"]/div/div/div[2]/div[3]/div/div[3]/div/div[1]/div/div[4]/span/div[4]/div/div"));
            WebElement q74_4 = driver.findElement(By.xpath("//*[@id=\"mG61Hd\"]/div/div/div[2]/div[3]/div/div[3]/div/div[1]/div/div[4]/span/div[5]/div/div"));
            WebElement q74_5 = driver.findElement(By.xpath("//*[@id=\"mG61Hd\"]/div/div/div[2]/div[3]/div/div[3]/div/div[1]/div/div[4]/span/div[6]/div/div"));
            WebElement[] question74 = new WebElement[]{q74_1, q74_2, q74_3, q74_4, q74_5};
            rand = new Random().nextInt(5);
            question74[rand].click();

            WebElement q75_3 = driver.findElement(By.xpath("//*[@id=\"mG61Hd\"]/div/div/div[2]/div[4]/div/div[2]/div/span/div/label[3]/div[2]/div/div"));
            WebElement q75_4 = driver.findElement(By.xpath("//*[@id=\"mG61Hd\"]/div/div/div[2]/div[4]/div/div[2]/div/span/div/label[4]/div[2]/div/div"));
            WebElement q75_5 = driver.findElement(By.xpath("//*[@id=\"mG61Hd\"]/div/div/div[2]/div[4]/div/div[2]/div/span/div/label[5]/div[2]/div/div"));
            WebElement[] question75 = new WebElement[]{q75_3, q75_4, q75_5};
            rand = new Random().nextInt(3);
            question75[rand].click();


            WebElement q76_1 = driver.findElement(By.xpath("//*[@id=\"mG61Hd\"]/div/div/div[2]/div[5]/div/div[3]/div/div[1]/div/div[2]/span/div[2]/div/div"));
            WebElement q76_2 = driver.findElement(By.xpath("//*[@id=\"mG61Hd\"]/div/div/div[2]/div[5]/div/div[3]/div/div[1]/div/div[2]/span/div[3]/div/div"));
            WebElement q76_3 = driver.findElement(By.xpath("//*[@id=\"mG61Hd\"]/div/div/div[2]/div[5]/div/div[3]/div/div[1]/div/div[2]/span/div[4]/div/div"));
            WebElement q76_4 = driver.findElement(By.xpath("//*[@id=\"mG61Hd\"]/div/div/div[2]/div[5]/div/div[3]/div/div[1]/div/div[2]/span/div[5]/div/div"));
            WebElement q76_5 = driver.findElement(By.xpath("//*[@id=\"mG61Hd\"]/div/div/div[2]/div[5]/div/div[3]/div/div[1]/div/div[2]/span/div[6]/div/div"));
            WebElement[] question76 = new WebElement[]{q76_1, q76_2, q76_3, q76_4, q76_5};
            rand = new Random().nextInt(5);
            question76[rand].click();

            WebElement q77_1 = driver.findElement(By.xpath("//*[@id=\"mG61Hd\"]/div/div/div[2]/div[5]/div/div[3]/div/div[1]/div/div[4]/span/div[2]/div/div"));
            WebElement q77_2 = driver.findElement(By.xpath("//*[@id=\"mG61Hd\"]/div/div/div[2]/div[5]/div/div[3]/div/div[1]/div/div[4]/span/div[3]/div/div"));
            WebElement q77_3 = driver.findElement(By.xpath("//*[@id=\"mG61Hd\"]/div/div/div[2]/div[5]/div/div[3]/div/div[1]/div/div[4]/span/div[4]/div/div"));
            WebElement q77_4 = driver.findElement(By.xpath("//*[@id=\"mG61Hd\"]/div/div/div[2]/div[5]/div/div[3]/div/div[1]/div/div[4]/span/div[5]/div/div"));
            WebElement q77_5 = driver.findElement(By.xpath("//*[@id=\"mG61Hd\"]/div/div/div[2]/div[5]/div/div[3]/div/div[1]/div/div[4]/span/div[6]/div/div"));
            WebElement[] question77 = new WebElement[]{q77_1, q77_2, q77_3, q77_4, q77_5};
            rand = new Random().nextInt(5);
            question77[rand].click();

            WebElement q78_3 = driver.findElement(By.xpath("//*[@id=\"mG61Hd\"]/div/div/div[2]/div[6]/div/div[2]/div/span/div/label[3]/div[2]/div/div"));
            WebElement q78_4 = driver.findElement(By.xpath("//*[@id=\"mG61Hd\"]/div/div/div[2]/div[6]/div/div[2]/div/span/div/label[4]/div[2]/div/div"));
            WebElement q78_5 = driver.findElement(By.xpath("//*[@id=\"mG61Hd\"]/div/div/div[2]/div[6]/div/div[2]/div/span/div/label[5]/div[2]/div/div"));
            WebElement[] question78 = new WebElement[]{q78_3, q78_4, q78_5};
            rand = new Random().nextInt(3);
            question78[rand].click();

            WebElement q79_1 = driver.findElement(By.xpath("//*[@id=\"mG61Hd\"]/div/div/div[2]/div[7]/div/div[3]/div/div[1]/div/div[2]/span/div[2]/div/div"));
            WebElement q79_2 = driver.findElement(By.xpath("//*[@id=\"mG61Hd\"]/div/div/div[2]/div[7]/div/div[3]/div/div[1]/div/div[2]/span/div[3]/div/div"));
            WebElement q79_3 = driver.findElement(By.xpath("//*[@id=\"mG61Hd\"]/div/div/div[2]/div[7]/div/div[3]/div/div[1]/div/div[2]/span/div[4]/div/div"));
            WebElement q79_4 = driver.findElement(By.xpath("//*[@id=\"mG61Hd\"]/div/div/div[2]/div[7]/div/div[3]/div/div[1]/div/div[2]/span/div[5]/div/div"));
            WebElement q79_5 = driver.findElement(By.xpath("//*[@id=\"mG61Hd\"]/div/div/div[2]/div[7]/div/div[3]/div/div[1]/div/div[2]/span/div[6]/div/div"));
            WebElement[] question79 = new WebElement[]{q79_1, q79_2, q79_3, q79_4, q79_5};
            rand = new Random().nextInt(5);
            question79[rand].click();

            WebElement q80_1 = driver.findElement(By.xpath("//*[@id=\"mG61Hd\"]/div/div/div[2]/div[7]/div/div[3]/div/div[1]/div/div[4]/span/div[2]/div/div"));
            WebElement q80_2 = driver.findElement(By.xpath("//*[@id=\"mG61Hd\"]/div/div/div[2]/div[7]/div/div[3]/div/div[1]/div/div[4]/span/div[3]/div/div"));
            WebElement q80_3 = driver.findElement(By.xpath("//*[@id=\"mG61Hd\"]/div/div/div[2]/div[7]/div/div[3]/div/div[1]/div/div[4]/span/div[4]/div/div"));
            WebElement q80_4 = driver.findElement(By.xpath("//*[@id=\"mG61Hd\"]/div/div/div[2]/div[7]/div/div[3]/div/div[1]/div/div[4]/span/div[5]/div/div"));
            WebElement q80_5 = driver.findElement(By.xpath("//*[@id=\"mG61Hd\"]/div/div/div[2]/div[7]/div/div[3]/div/div[1]/div/div[4]/span/div[6]/div/div"));
            WebElement[] question80 = new WebElement[]{q80_1, q80_2, q80_3, q80_4, q80_5};
            rand = new Random().nextInt(5);
            question80[rand].click();

            WebElement q81_3 = driver.findElement(By.xpath("//*[@id=\"mG61Hd\"]/div/div/div[2]/div[8]/div/div[2]/div/span/div/label[3]/div[2]/div/div"));
            WebElement q81_4 = driver.findElement(By.xpath("//*[@id=\"mG61Hd\"]/div/div/div[2]/div[8]/div/div[2]/div/span/div/label[4]/div[2]/div/div"));
            WebElement q81_5 = driver.findElement(By.xpath("//*[@id=\"mG61Hd\"]/div/div/div[2]/div[8]/div/div[2]/div/span/div/label[5]/div[2]/div/div"));
            WebElement[] question81 = new WebElement[]{q81_3, q81_4, q81_5};
            rand = new Random().nextInt(3);
            question81[rand].click();

            WebElement q82_1 = driver.findElement(By.xpath("//*[@id=\"mG61Hd\"]/div/div/div[2]/div[9]/div/div[3]/div/div[1]/div/div[2]/span/div[2]/div/div"));
            WebElement q82_2 = driver.findElement(By.xpath("//*[@id=\"mG61Hd\"]/div/div/div[2]/div[9]/div/div[3]/div/div[1]/div/div[2]/span/div[3]/div/div"));
            WebElement q82_3 = driver.findElement(By.xpath("//*[@id=\"mG61Hd\"]/div/div/div[2]/div[9]/div/div[3]/div/div[1]/div/div[2]/span/div[4]/div/div"));
            WebElement q82_4 = driver.findElement(By.xpath("//*[@id=\"mG61Hd\"]/div/div/div[2]/div[9]/div/div[3]/div/div[1]/div/div[2]/span/div[5]/div/div"));
            WebElement q82_5 = driver.findElement(By.xpath("//*[@id=\"mG61Hd\"]/div/div/div[2]/div[9]/div/div[3]/div/div[1]/div/div[2]/span/div[6]/div/div"));
            WebElement[] question82 = new WebElement[]{q82_1, q82_2, q82_3, q82_4, q82_5};
            rand = new Random().nextInt(5);
            question82[rand].click();

            WebElement q83_1 = driver.findElement(By.xpath("//*[@id=\"mG61Hd\"]/div/div/div[2]/div[9]/div/div[3]/div/div[1]/div/div[4]/span/div[2]/div/div"));
            WebElement q83_2 = driver.findElement(By.xpath("//*[@id=\"mG61Hd\"]/div/div/div[2]/div[9]/div/div[3]/div/div[1]/div/div[4]/span/div[3]/div/div"));
            WebElement q83_3 = driver.findElement(By.xpath("//*[@id=\"mG61Hd\"]/div/div/div[2]/div[9]/div/div[3]/div/div[1]/div/div[4]/span/div[4]/div/div"));
            WebElement q83_4 = driver.findElement(By.xpath("//*[@id=\"mG61Hd\"]/div/div/div[2]/div[9]/div/div[3]/div/div[1]/div/div[4]/span/div[5]/div/div"));
            WebElement q83_5 = driver.findElement(By.xpath("//*[@id=\"mG61Hd\"]/div/div/div[2]/div[9]/div/div[3]/div/div[1]/div/div[4]/span/div[6]/div/div"));
            WebElement[] question83 = new WebElement[]{q83_1, q83_2, q83_3, q83_4, q83_5};
            rand = new Random().nextInt(5);
            question83[rand].click();

            WebElement q84_3 = driver.findElement(By.xpath("//*[@id=\"mG61Hd\"]/div/div/div[2]/div[10]/div/div[2]/div/span/div/label[3]/div[2]/div/div"));
            WebElement q84_4 = driver.findElement(By.xpath("//*[@id=\"mG61Hd\"]/div/div/div[2]/div[10]/div/div[2]/div/span/div/label[4]/div[2]/div/div"));
            WebElement q84_5 = driver.findElement(By.xpath("//*[@id=\"mG61Hd\"]/div/div/div[2]/div[10]/div/div[2]/div/span/div/label[5]/div[2]/div/div"));
            WebElement[] question84 = new WebElement[]{q84_3, q84_4, q84_5};
            rand = new Random().nextInt(3);
            question84[rand].click();

            WebElement q85_1 = driver.findElement(By.xpath("//*[@id=\"mG61Hd\"]/div/div/div[2]/div[11]/div/div[3]/div/div[1]/div/div[2]/span/div[2]/div/div"));
            WebElement q85_2 = driver.findElement(By.xpath("//*[@id=\"mG61Hd\"]/div/div/div[2]/div[11]/div/div[3]/div/div[1]/div/div[2]/span/div[3]/div/div"));
            WebElement q85_3 = driver.findElement(By.xpath("//*[@id=\"mG61Hd\"]/div/div/div[2]/div[11]/div/div[3]/div/div[1]/div/div[2]/span/div[4]/div/div"));
            WebElement q85_4 = driver.findElement(By.xpath("//*[@id=\"mG61Hd\"]/div/div/div[2]/div[11]/div/div[3]/div/div[1]/div/div[2]/span/div[5]/div/div"));
            WebElement q85_5 = driver.findElement(By.xpath("//*[@id=\"mG61Hd\"]/div/div/div[2]/div[11]/div/div[3]/div/div[1]/div/div[2]/span/div[6]/div/div"));
            WebElement[] question85 = new WebElement[]{q85_1, q85_2, q85_3, q85_4, q85_5};
            rand = new Random().nextInt(5);
            question85[rand].click();

            WebElement q86_1 = driver.findElement(By.xpath("//*[@id=\"mG61Hd\"]/div/div/div[2]/div[11]/div/div[3]/div/div[1]/div/div[4]/span/div[2]/div/div"));
            WebElement q86_2 = driver.findElement(By.xpath("//*[@id=\"mG61Hd\"]/div/div/div[2]/div[11]/div/div[3]/div/div[1]/div/div[4]/span/div[3]/div/div"));
            WebElement q86_3 = driver.findElement(By.xpath("//*[@id=\"mG61Hd\"]/div/div/div[2]/div[11]/div/div[3]/div/div[1]/div/div[4]/span/div[4]/div/div"));
            WebElement q86_4 = driver.findElement(By.xpath("//*[@id=\"mG61Hd\"]/div/div/div[2]/div[11]/div/div[3]/div/div[1]/div/div[4]/span/div[5]/div/div"));
            WebElement q86_5 = driver.findElement(By.xpath("//*[@id=\"mG61Hd\"]/div/div/div[2]/div[11]/div/div[3]/div/div[1]/div/div[4]/span/div[6]/div/div"));
            WebElement[] question86 = new WebElement[]{q86_1, q86_2, q86_3, q86_4, q86_5};
            rand = new Random().nextInt(5);
            question86[rand].click();

            WebElement q87_3 = driver.findElement(By.xpath("//*[@id=\"mG61Hd\"]/div/div/div[2]/div[12]/div/div[2]/div/span/div/label[3]/div[2]/div/div"));
            WebElement q87_4 = driver.findElement(By.xpath("//*[@id=\"mG61Hd\"]/div/div/div[2]/div[12]/div/div[2]/div/span/div/label[4]/div[2]/div/div"));
            WebElement q87_5 = driver.findElement(By.xpath("//*[@id=\"mG61Hd\"]/div/div/div[2]/div[12]/div/div[2]/div/span/div/label[5]/div[2]/div/div"));
            WebElement[] question87 = new WebElement[]{q87_3, q87_4, q87_5};
            rand = new Random().nextInt(3);
            question87[rand].click();

            WebElement q88_1 = driver.findElement(By.xpath("//*[@id=\"mG61Hd\"]/div/div/div[2]/div[13]/div/div[3]/div/div[1]/div/div[2]/span/div[2]/div/div"));
            WebElement q88_2 = driver.findElement(By.xpath("//*[@id=\"mG61Hd\"]/div/div/div[2]/div[13]/div/div[3]/div/div[1]/div/div[2]/span/div[3]/div/div"));
            WebElement q88_3 = driver.findElement(By.xpath("//*[@id=\"mG61Hd\"]/div/div/div[2]/div[13]/div/div[3]/div/div[1]/div/div[2]/span/div[4]/div/div"));
            WebElement q88_4 = driver.findElement(By.xpath("//*[@id=\"mG61Hd\"]/div/div/div[2]/div[13]/div/div[3]/div/div[1]/div/div[2]/span/div[5]/div/div"));
            WebElement q88_5 = driver.findElement(By.xpath("//*[@id=\"mG61Hd\"]/div/div/div[2]/div[13]/div/div[3]/div/div[1]/div/div[2]/span/div[6]/div/div"));
            WebElement[] question88 = new WebElement[]{q88_1, q88_2, q88_3, q88_4, q88_5};
            rand = new Random().nextInt(5);
            question88[rand].click();

            WebElement q89_1 = driver.findElement(By.xpath("//*[@id=\"mG61Hd\"]/div/div/div[2]/div[13]/div/div[3]/div/div[1]/div/div[4]/span/div[2]/div/div"));
            WebElement q89_2 = driver.findElement(By.xpath("//*[@id=\"mG61Hd\"]/div/div/div[2]/div[13]/div/div[3]/div/div[1]/div/div[4]/span/div[3]/div/div"));
            WebElement q89_3 = driver.findElement(By.xpath("//*[@id=\"mG61Hd\"]/div/div/div[2]/div[13]/div/div[3]/div/div[1]/div/div[4]/span/div[4]/div/div"));
            WebElement q89_4 = driver.findElement(By.xpath("//*[@id=\"mG61Hd\"]/div/div/div[2]/div[13]/div/div[3]/div/div[1]/div/div[4]/span/div[5]/div/div"));
            WebElement q89_5 = driver.findElement(By.xpath("//*[@id=\"mG61Hd\"]/div/div/div[2]/div[13]/div/div[3]/div/div[1]/div/div[4]/span/div[6]/div/div"));
            WebElement[] question89 = new WebElement[]{q89_1, q89_2, q89_3, q89_4, q89_5};
            rand = new Random().nextInt(5);
            question89[rand].click();

            WebElement q90_3 = driver.findElement(By.xpath("//*[@id=\"mG61Hd\"]/div/div/div[2]/div[14]/div/div[2]/div/span/div/label[3]/div[2]/div/div"));
            WebElement q90_4 = driver.findElement(By.xpath("//*[@id=\"mG61Hd\"]/div/div/div[2]/div[14]/div/div[2]/div/span/div/label[4]/div[2]/div/div"));
            WebElement q90_5 = driver.findElement(By.xpath("//*[@id=\"mG61Hd\"]/div/div/div[2]/div[14]/div/div[2]/div/span/div/label[5]/div[2]/div/div"));
            WebElement[] question90 = new WebElement[]{q90_3, q90_4, q90_5};
            rand = new Random().nextInt(3);
            question90[rand].click();

            WebElement next_page8 = driver.findElement(By.xpath("//*[@id=\"mG61Hd\"]/div/div/div[3]/div[1]/div[1]/div[2]"));
            next_page8.click();

            try {
                Thread.sleep(3 * 1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            WebElement q91_1 = driver.findElement(By.xpath("//*[@id=\"mG61Hd\"]/div/div/div[2]/div[2]/div/div[2]/div/div[1]/div/div[2]/span/div[2]/div/div"));
            WebElement q91_2 = driver.findElement(By.xpath("//*[@id=\"mG61Hd\"]/div/div/div[2]/div[2]/div/div[2]/div/div[1]/div/div[2]/span/div[3]/div/div"));
            WebElement[] question91 = new WebElement[]{q91_1, q91_2};
            rand = new Random().nextInt(2);
            question91[rand].click();

            WebElement q92_1 = driver.findElement(By.xpath("//*[@id=\"mG61Hd\"]/div/div/div[2]/div[2]/div/div[2]/div/div[1]/div/div[4]/span/div[2]/div/div"));
            WebElement q92_2 = driver.findElement(By.xpath("//*[@id=\"mG61Hd\"]/div/div/div[2]/div[2]/div/div[2]/div/div[1]/div/div[4]/span/div[3]/div/div"));
            WebElement[] question92 = new WebElement[]{q92_1, q92_2};
            rand = new Random().nextInt(2);
            question92[rand].click();

            WebElement q93_1 = driver.findElement(By.xpath("//*[@id=\"mG61Hd\"]/div/div/div[2]/div[2]/div/div[2]/div/div[1]/div/div[6]/span/div[2]/div/div"));
            WebElement q93_2 = driver.findElement(By.xpath("//*[@id=\"mG61Hd\"]/div/div/div[2]/div[2]/div/div[2]/div/div[1]/div/div[6]/span/div[3]/div/div"));
            WebElement[] question93 = new WebElement[]{q93_1, q93_2};
            rand = new Random().nextInt(2);
            question93[rand].click();

            WebElement q94_1 = driver.findElement(By.xpath("//*[@id=\"mG61Hd\"]/div/div/div[2]/div[2]/div/div[2]/div/div[1]/div/div[8]/span/div[2]/div/div"));
            WebElement q94_2 = driver.findElement(By.xpath("//*[@id=\"mG61Hd\"]/div/div/div[2]/div[2]/div/div[2]/div/div[1]/div/div[8]/span/div[3]/div/div"));
            WebElement[] question94 = new WebElement[]{q94_1, q94_2};
            rand = new Random().nextInt(2);
            question94[rand].click();

            WebElement q95_1 = driver.findElement(By.xpath("//*[@id=\"mG61Hd\"]/div/div/div[2]/div[2]/div/div[2]/div/div[1]/div/div[10]/span/div[2]/div/div"));
            WebElement q95_2 = driver.findElement(By.xpath("//*[@id=\"mG61Hd\"]/div/div/div[2]/div[2]/div/div[2]/div/div[1]/div/div[10]/span/div[3]/div/div"));
            WebElement[] question95 = new WebElement[]{q95_1, q95_2};
            rand = new Random().nextInt(2);
            question95[rand].click();

            WebElement next_page9 = driver.findElement(By.xpath("//*[@id=\"mG61Hd\"]/div/div/div[3]/div[1]/div[1]/div[2]"));
            next_page9.click();

            try {
                Thread.sleep(3 * 1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            WebElement q96_1 = driver.findElement(By.xpath("//*[@id=\"mG61Hd\"]/div/div/div[2]/div[2]/div/div[2]/div/span/div/div[1]/label/div/div[1]/div"));
            WebElement q96_2 = driver.findElement(By.xpath("//*[@id=\"mG61Hd\"]/div/div/div[2]/div[2]/div/div[2]/div/span/div/div[2]/label/div/div[1]/div"));
            WebElement[] question96 = new WebElement[]{q96_1, q96_2};
            rand = new Random().nextInt(2);
            question96[rand].click();

            WebElement q97_1 = driver.findElement(By.xpath("//*[@id=\"mG61Hd\"]/div/div/div[2]/div[3]/div/div[2]/div/span/div/div[1]/label/div/div[1]/div"));
            WebElement q97_2 = driver.findElement(By.xpath("//*[@id=\"mG61Hd\"]/div/div/div[2]/div[3]/div/div[2]/div/span/div/div[2]/label/div/div[1]/div"));
            WebElement q97_3 = driver.findElement(By.xpath("//*[@id=\"mG61Hd\"]/div/div/div[2]/div[3]/div/div[2]/div/span/div/div[3]/label/div/div[1]/div"));
            WebElement q97_4 = driver.findElement(By.xpath("//*[@id=\"mG61Hd\"]/div/div/div[2]/div[3]/div/div[2]/div/span/div/div[4]/label/div/div[1]/div"));
            WebElement q97_5 = driver.findElement(By.xpath("//*[@id=\"mG61Hd\"]/div/div/div[2]/div[3]/div/div[2]/div/span/div/div[5]/label/div/div[1]/div"));
            WebElement q97_6 = driver.findElement(By.xpath("//*[@id=\"mG61Hd\"]/div/div/div[2]/div[3]/div/div[2]/div/span/div/div[6]/label/div/div[1]/div"));
            WebElement[] question97 = new WebElement[]{q97_1, q97_2, q97_3, q97_4, q97_5, q97_6};
            rand = new Random().nextInt(6);
            question97[rand].click();

            WebElement q98_1 = driver.findElement(By.xpath("//*[@id=\"mG61Hd\"]/div/div/div[2]/div[4]/div/div[2]/div/span/div/div[1]/label/div/div[1]/div"));
            WebElement q98_2 = driver.findElement(By.xpath("//*[@id=\"mG61Hd\"]/div/div/div[2]/div[4]/div/div[2]/div/span/div/div[2]/label/div/div[1]/div"));
            WebElement q98_3 = driver.findElement(By.xpath("//*[@id=\"mG61Hd\"]/div/div/div[2]/div[4]/div/div[2]/div/span/div/div[3]/label/div/div[1]/div"));
            WebElement[] question98 = new WebElement[]{q98_1, q98_2, q98_3};
            rand = new Random().nextInt(3);
            question98[rand].click();

            WebElement q99_1 = driver.findElement(By.xpath("//*[@id=\"mG61Hd\"]/div/div/div[2]/div[5]/div/div[2]/div/div[1]/div/div[1]/input"));
            q99_1.click();
            rand = new Random().nextInt(3);
            String rando = Integer.toString(rand + 1);
            q99_1.sendKeys(rando);

            WebElement q100_1 = driver.findElement(By.xpath("//*[@id=\"mG61Hd\"]/div/div/div[2]/div[6]/div/div[2]/div/div[1]/div/div[1]/input"));
            q100_1.click();
            rand = new Random().nextInt(3);
            rando = Integer.toString(rand);
            q100_1.sendKeys(rando);

            WebElement q101_1 = driver.findElement(By.xpath("//*[@id=\"mG61Hd\"]/div/div/div[2]/div[7]/div/div[2]/div/span/div/div[1]/label/div/div[1]/div"));
            WebElement q101_2 = driver.findElement(By.xpath("//*[@id=\"mG61Hd\"]/div/div/div[2]/div[7]/div/div[2]/div/span/div/div[2]/label/div/div[1]/div"));
            WebElement q101_3 = driver.findElement(By.xpath("//*[@id=\"mG61Hd\"]/div/div/div[2]/div[7]/div/div[2]/div/span/div/div[3]/label/div/div[1]/div"));
            WebElement q101_4 = driver.findElement(By.xpath("//*[@id=\"mG61Hd\"]/div/div/div[2]/div[7]/div/div[2]/div/span/div/div[4]/label/div/div[1]/div"));
            WebElement q101_5 = driver.findElement(By.xpath("//*[@id=\"mG61Hd\"]/div/div/div[2]/div[7]/div/div[2]/div/span/div/div[5]/label/div/div[1]/div"));
            WebElement q101_6 = driver.findElement(By.xpath("//*[@id=\"mG61Hd\"]/div/div/div[2]/div[7]/div/div[2]/div/span/div/div[6]/label/div/div[1]/div"));
            WebElement[] question101 = new WebElement[]{q101_1, q101_2, q101_3, q101_4, q101_5, q101_6};
            rand = new Random().nextInt(6);
            question101[rand].click();

            WebElement q102_1 = driver.findElement(By.xpath("//*[@id=\"mG61Hd\"]/div/div/div[2]/div[8]/div/div[2]/div/span/div/div[1]/label/div/div[1]/div"));
            WebElement q102_2 = driver.findElement(By.xpath("//*[@id=\"mG61Hd\"]/div/div/div[2]/div[8]/div/div[2]/div/span/div/div[2]/label/div/div[1]/div"));
            WebElement q102_3 = driver.findElement(By.xpath("//*[@id=\"mG61Hd\"]/div/div/div[2]/div[8]/div/div[2]/div/span/div/div[3]/label/div/div[1]/div"));
            WebElement q102_4 = driver.findElement(By.xpath("//*[@id=\"mG61Hd\"]/div/div/div[2]/div[8]/div/div[2]/div/span/div/div[4]/label/div/div[1]/div"));
            WebElement q102_5 = driver.findElement(By.xpath("//*[@id=\"mG61Hd\"]/div/div/div[2]/div[8]/div/div[2]/div/span/div/div[5]/label/div/div[1]/div"));
            WebElement q102_6 = driver.findElement(By.xpath("//*[@id=\"mG61Hd\"]/div/div/div[2]/div[8]/div/div[2]/div/span/div/div[6]/label/div/div[1]/div"));
            WebElement[] question102 = new WebElement[]{q102_1, q102_2, q102_3, q102_4, q102_5, q102_6};
            rand = new Random().nextInt(6);
            question102[rand].click();

            WebElement q103_1 = driver.findElement(By.xpath("//*[@id=\"mG61Hd\"]/div/div/div[2]/div[9]/div/div[2]/div/div[1]/div/div[2]/span/div[2]/div/div"));
            WebElement q103_2 = driver.findElement(By.xpath("//*[@id=\"mG61Hd\"]/div/div/div[2]/div[9]/div/div[2]/div/div[1]/div/div[2]/span/div[3]/div/div"));
            WebElement q103_3 = driver.findElement(By.xpath("//*[@id=\"mG61Hd\"]/div/div/div[2]/div[9]/div/div[2]/div/div[1]/div/div[2]/span/div[4]/div/div"));
            WebElement q103_4 = driver.findElement(By.xpath("//*[@id=\"mG61Hd\"]/div/div/div[2]/div[9]/div/div[2]/div/div[1]/div/div[2]/span/div[5]/div/div"));
            WebElement q103_5 = driver.findElement(By.xpath("//*[@id=\"mG61Hd\"]/div/div/div[2]/div[9]/div/div[2]/div/div[1]/div/div[2]/span/div[6]/div/div"));
            WebElement[] question103 = new WebElement[]{q103_1, q103_2, q103_3, q103_4, q103_5};
            rand = new Random().nextInt(5);
            question103[rand].click();

            WebElement q104_1 = driver.findElement(By.xpath("//*[@id=\"mG61Hd\"]/div/div/div[2]/div[9]/div/div[2]/div/div[1]/div/div[4]/span/div[2]/div/div"));
            WebElement q104_2 = driver.findElement(By.xpath("//*[@id=\"mG61Hd\"]/div/div/div[2]/div[9]/div/div[2]/div/div[1]/div/div[4]/span/div[3]/div/div"));
            WebElement q104_3 = driver.findElement(By.xpath("//*[@id=\"mG61Hd\"]/div/div/div[2]/div[9]/div/div[2]/div/div[1]/div/div[4]/span/div[4]/div/div"));
            WebElement q104_4 = driver.findElement(By.xpath("//*[@id=\"mG61Hd\"]/div/div/div[2]/div[9]/div/div[2]/div/div[1]/div/div[4]/span/div[5]/div/div"));
            WebElement q104_5 = driver.findElement(By.xpath("//*[@id=\"mG61Hd\"]/div/div/div[2]/div[9]/div/div[2]/div/div[1]/div/div[4]/span/div[6]/div/div"));
            WebElement[] question104 = new WebElement[]{q104_1, q104_2, q104_3, q104_4, q104_5};
            rand = new Random().nextInt(5);
            question104[rand].click();

            WebElement q105_1 = driver.findElement(By.xpath("//*[@id=\"mG61Hd\"]/div/div/div[2]/div[9]/div/div[2]/div/div[1]/div/div[6]/span/div[2]/div/div"));
            WebElement q105_2 = driver.findElement(By.xpath("//*[@id=\"mG61Hd\"]/div/div/div[2]/div[9]/div/div[2]/div/div[1]/div/div[6]/span/div[3]/div/div"));
            WebElement q105_3 = driver.findElement(By.xpath("//*[@id=\"mG61Hd\"]/div/div/div[2]/div[9]/div/div[2]/div/div[1]/div/div[6]/span/div[4]/div/div"));
            WebElement q105_4 = driver.findElement(By.xpath("//*[@id=\"mG61Hd\"]/div/div/div[2]/div[9]/div/div[2]/div/div[1]/div/div[6]/span/div[5]/div/div"));
            WebElement q105_5 = driver.findElement(By.xpath("//*[@id=\"mG61Hd\"]/div/div/div[2]/div[9]/div/div[2]/div/div[1]/div/div[6]/span/div[6]/div/div"));
            WebElement[] question105 = new WebElement[]{q105_1, q105_2, q105_3, q105_4, q105_5};
            rand = new Random().nextInt(5);
            question105[rand].click();

            WebElement q106_1 = driver.findElement(By.xpath("//*[@id=\"mG61Hd\"]/div/div/div[2]/div[10]/div/div[2]/div/span/div/div[1]/label/div/div[1]/div"));
            WebElement q106_2 = driver.findElement(By.xpath("//*[@id=\"mG61Hd\"]/div/div/div[2]/div[10]/div/div[2]/div/span/div/div[2]/label/div/div[1]/div"));
            WebElement q106_3 = driver.findElement(By.xpath("//*[@id=\"mG61Hd\"]/div/div/div[2]/div[10]/div/div[2]/div/span/div/div[3]/label/div/div[1]/div"));
            WebElement q106_4 = driver.findElement(By.xpath("//*[@id=\"mG61Hd\"]/div/div/div[2]/div[10]/div/div[2]/div/span/div/div[4]/label/div/div[1]/div"));
            WebElement q106_5 = driver.findElement(By.xpath("//*[@id=\"mG61Hd\"]/div/div/div[2]/div[10]/div/div[2]/div/span/div/div[5]/label/div/div[1]/div"));
            WebElement[] question106 = new WebElement[]{q106_1, q106_2, q106_3, q106_4, q106_5};
            rand = new Random().nextInt(5);
            question106[rand].click();

            WebElement q107_1 = driver.findElement(By.xpath("//*[@id=\"mG61Hd\"]/div/div/div[2]/div[11]/div/div[2]/div/span/div/div[1]/label/div/div[1]/div"));
            WebElement q107_2 = driver.findElement(By.xpath("//*[@id=\"mG61Hd\"]/div/div/div[2]/div[11]/div/div[2]/div/span/div/div[2]/label/div/div[1]/div"));
            WebElement q107_3 = driver.findElement(By.xpath("//*[@id=\"mG61Hd\"]/div/div/div[2]/div[11]/div/div[2]/div/span/div/div[3]/label/div/div[1]/div"));
            WebElement q107_4 = driver.findElement(By.xpath("//*[@id=\"mG61Hd\"]/div/div/div[2]/div[11]/div/div[2]/div/span/div/div[4]/label/div/div[1]/div"));
            WebElement q107_5 = driver.findElement(By.xpath("//*[@id=\"mG61Hd\"]/div/div/div[2]/div[11]/div/div[2]/div/span/div/div[5]/label/div/div[1]/div"));
            WebElement q107_6 = driver.findElement(By.xpath("//*[@id=\"mG61Hd\"]/div/div/div[2]/div[11]/div/div[2]/div/span/div/div[6]/label/div/div[1]/div"));
            WebElement[] question107 = new WebElement[]{q107_1, q107_2, q107_3, q107_4, q107_5, q107_6};
            rand = new Random().nextInt(5);
            question107[rand].click();

            WebElement q108_1 = driver.findElement(By.xpath("//*[@id=\"mG61Hd\"]/div/div/div[2]/div[12]/div/div[2]/div/span/div/div[1]/label/div/div[1]/div"));
            WebElement q108_2 = driver.findElement(By.xpath("//*[@id=\"mG61Hd\"]/div/div/div[2]/div[12]/div/div[2]/div/span/div/div[2]/label/div/div[1]/div"));
            WebElement q108_3 = driver.findElement(By.xpath("//*[@id=\"mG61Hd\"]/div/div/div[2]/div[12]/div/div[2]/div/span/div/div[3]/label/div/div[1]/div"));
            WebElement q108_4 = driver.findElement(By.xpath("//*[@id=\"mG61Hd\"]/div/div/div[2]/div[12]/div/div[2]/div/span/div/div[4]/label/div/div[1]/div"));
            WebElement q108_5 = driver.findElement(By.xpath("//*[@id=\"mG61Hd\"]/div/div/div[2]/div[12]/div/div[2]/div/span/div/div[5]/label/div/div[1]/div"));
            WebElement q108_6 = driver.findElement(By.xpath("//*[@id=\"mG61Hd\"]/div/div/div[2]/div[12]/div/div[2]/div/span/div/div[6]/label/div/div[1]/div"));
            WebElement q108_7 = driver.findElement(By.xpath("//*[@id=\"mG61Hd\"]/div/div/div[2]/div[12]/div/div[2]/div/span/div/div[7]/label/div/div[1]/div"));
            WebElement[] question108 = new WebElement[]{q108_1, q108_2, q108_3, q108_4, q108_5, q108_6, q108_7};
            rand = new Random().nextInt(5);
            question108[rand].click();

            WebElement next_page10_submit = driver.findElement(By.xpath("//*[@id=\"mG61Hd\"]/div/div/div[3]/div[1]/div[1]/div[2]"));
            next_page10_submit.click();

            try {
                Thread.sleep(3 * 1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            driver.close();
        }
    }
}
