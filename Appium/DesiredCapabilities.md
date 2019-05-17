# Desired Capabilities

## Java

```java
public class Main {
        public static void main(String[] args) throws MalformedURLException {
        AndroidDriver driver = null;
        try {
            DesiredCapabilities capabilities = new DesiredCapabilities();
            capabilities.setCapability("deviceName", "<serial>");
            capabilities.setCapability("platformName", "Android");
            capabilities.setCapability("app", "<path>/<mane.apr>.apk");
            driver = new AndroidDriver(new URL("http://0.0.0.0:4723/wd/hub"), capabilities);
        } finally {
            if(driver != null) 
            driver.quit();
        }
    }
}
```