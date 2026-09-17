package utils;

import org.openqa.selenium.WebDriver;

public class Base {

    static final WebDriver driver = browserFactory.startBrowser("edge", "\"https://ndosisimplifiedautomation.vercel.app/\"");

}
