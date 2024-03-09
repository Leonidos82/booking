package com.example;

import java.net.MalformedURLException;
import java.net.URL;

import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;

public class BookingAutomationTest {

    static AppiumDriver driver;

    @SuppressWarnings("deprecation")
    @BeforeClass
    public static void setUp() throws MalformedURLException {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("appium:automationName", "UiAutomator2");
        capabilities.setCapability("appium:platformVersion", "14");
        capabilities.setCapability("appium:deviceName", "Device Testing");
        capabilities.setCapability("appium:app", "booking-com-32-9.apk");

        // Inicia la sesión de Appium
        driver = new AndroidDriver(new URL("http://127.0.0.1:4723"), capabilities);
    }

    @Test
    public void reservarAlojamiento() throws MalformedURLException {
        driver.findElement(By.xpath("//android.widget.ImageButton[@content-desc=\"Navigate up\"]")).click();
        waiter(3000);
        driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"Dismiss this info\"]")).click();
        waiter(3000);
        driver.findElement(By.xpath(
                "//android.widget.TextView[@resource-id=\"com.booking:id/facet_search_box_basic_field_label\" and @text=\"Enter your destination\"]"))
                .click();
        waiter(2000);
        driver.findElement(By.xpath(
                "//android.widget.EditText[@resource-id=\"com.booking:id/facet_with_bui_free_search_booking_header_toolbar_content\"]"))
                .sendKeys("CUSCO");
        waiter(2000);
        driver.findElement(By.xpath(
                "(//android.widget.TextView[@resource-id=\"com.booking:id/view_disambiguation_destination_title\"])[1]"))
                .click();
        waiter(2000);
        driver.findElement(By.xpath("//android.view.View[@content-desc=\"14 March 2024\"]")).click();
        waiter(2000);
        driver.findElement(By.xpath("//android.view.View[@content-desc=\"28 March 2024\"]")).click();
        waiter(2000);
        driver.findElement(
                By.xpath("//android.widget.Button[@resource-id=\"com.booking:id/facet_date_picker_confirm\"]")).click();
        waiter(2000);
        driver.findElement(By.xpath(
                "//android.widget.TextView[@resource-id=\"com.booking:id/facet_search_box_basic_field_label\" and @text=\"1 room · 2 adults · 0 children\"]"))
                .click();
        waiter(2000);
        driver.findElement(
                By.xpath("(//android.widget.Button[@resource-id=\"com.booking:id/bui_input_stepper_add_button\"])[3]"))
                .click();
        waiter(2000);
        driver.findElement(By.xpath(
                "//android.widget.ScrollView[@resource-id=\"android:id/buttonPanel\"]/android.widget.LinearLayout"))
                .click();
        waiter(2000);
        driver.findElement(By.xpath("//android.widget.Button[@text=\"< 1 year old\"]")).click();
        driver.findElement(By.xpath("//android.widget.Button[@text=\"1 year old\"]")).click();
        driver.findElement(By.xpath("//android.widget.Button[@text=\"2 years old\"]")).click();
        driver.findElement(By.xpath("//android.widget.Button[@text=\"3 years old\"]")).click();
        driver.findElement(By.xpath("//android.widget.Button[@text=\"4 years old\"]")).click();
        driver.findElement(By.xpath("//android.widget.Button[@text=\"5 years old\"]")).click();
        waiter(2000);
        driver.findElement(By.xpath("//android.widget.Button[@resource-id=\"android:id/button1\"]")).click();
        waiter(2000);
        driver.findElement(
                By.xpath("//android.widget.Button[@resource-id=\"com.booking:id/group_config_apply_button\"]")).click();
        waiter(2000);
        driver.findElement(By.xpath("//android.widget.Button[@resource-id=\"com.booking:id/facet_search_box_cta\"]"))
                .click();
        waiter(8000);
        driver.findElement(
                By.xpath("//android.widget.TextView[@text=\"Palacio del Inka, a Luxury Collection Hotel, Cusco\"]"))
                .click();
        waiter(2000);
        driver.findElement(By.xpath(
                "//android.widget.FrameLayout[@resource-id=\"com.booking:id/property_availability_cta_facetframe\"]/android.view.ViewGroup"))
                .click();
        waiter(2000);
        driver.findElement(
                By.xpath("//android.widget.Button[@resource-id=\"com.booking:id/recommended_block_reserve_button\"]"))
                .click();
        waiter(2000);
        driver.findElement(
                By.xpath("(//android.widget.EditText[@resource-id=\"com.booking:id/bui_input_container_content\"])[1]"))
                .sendKeys("Jose");
        waiter(1000);
        driver.findElement(
                By.xpath("(//android.widget.EditText[@resource-id=\"com.booking:id/bui_input_container_content\"])[2]"))
                .sendKeys("Hurtado");
        waiter(1000);
        driver.findElement(By.xpath(
                "(//android.widget.AutoCompleteTextView[@resource-id=\"com.booking:id/bui_input_container_content\"])[1]"))
                .sendKeys("josehurtado@mail.com");
        waiter(1000);
        driver.findElement(
                By.xpath("(//android.widget.EditText[@resource-id=\"com.booking:id/bui_input_container_content\"])[3]"))
                .sendKeys("Av. Las Flores 234");
        waiter(1000);
        driver.findElement(
                By.xpath("(//android.widget.EditText[@resource-id=\"com.booking:id/bui_input_container_content\"])[4]"))
                .sendKeys("Lima41");
        waiter(1000);
        driver.findElement(
                By.xpath("(//android.widget.EditText[@resource-id=\"com.booking:id/bui_input_container_content\"])[5]"))
                .sendKeys("Lima");
        waiter(1000);
        driver.findElement(By.xpath(
                "//android.widget.AutoCompleteTextView[@resource-id=\"com.booking:id/bui_input_container_content\" and @text=\"United States of America\"]"))
                .clear();
        waiter(1000);
        driver.findElement(By.xpath(
                "//android.widget.AutoCompleteTextView[@resource-id=\"com.booking:id/bui_input_container_content\" and @text=\"\"]"))
                .sendKeys("Colombia");
        waiter(1000);

        driver.findElement(new AppiumBy.ByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0))" + ".scrollIntoView(new UiSelector()" + ".textMatches(\"" + "Business" + "\").instance(0))"));

        driver.findElement(
                By.xpath("(//android.widget.EditText[@resource-id=\"com.booking:id/bui_input_container_content\"])[5]"))
                .sendKeys("930731660");
        waiter(1000);
        driver.findElement(
                By.xpath("//android.widget.RadioButton[@resource-id=\"com.booking:id/business_purpose_leisure\"]"))
                .click();
        waiter(1000);
        driver.findElement(By.xpath("//android.widget.Button[@resource-id=\"com.booking:id/action_button\"]")).click();
        waiter(2000);
        driver.findElement(By.xpath("//android.widget.Button[@resource-id=\"com.booking:id/action_button\"]")).click();
        waiter(3000);
        driver.findElement(
                By.xpath("//android.widget.EditText[@resource-id=\"com.booking:id/new_credit_card_number_edit\"]"))
                .sendKeys("4555788865443333");
        waiter(1000);
        driver.findElement(
                By.xpath("//android.widget.EditText[@resource-id=\"com.booking:id/new_credit_card_expiry_date_edit\"]"))
                .sendKeys("02/25");
        waiter(1000);
        String costoReserva = driver
                .findElement(By.xpath(
                        "//android.widget.TextView[@resource-id=\"com.booking:id/subtitle\"]"))
                .getAttribute("text");
        System.out.println("El costo de la reserva es: " + costoReserva);

        // Cierra la sesión de Appium
        driver.quit();
    }

    public static void waiter(int miliSegundos) {
        try {
            Thread.sleep(miliSegundos);
        } catch (Exception e) {
            System.out.println("Algo ocurrió");
        }
    }


}
