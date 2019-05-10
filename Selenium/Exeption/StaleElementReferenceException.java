    // При обращие к элементу JavaScript перегрудает дом и драйвер должен еще раз вернуть элемент
    
    protected void typeText(By by, String text) {
        try {
            WebElement webElement = getWebElement(by);
            webElement.sendKeys(text);
        } catch (org.openqa.selenium.StaleElementReferenceException ex) {
            WebElement webElement = getWebElement(by);
            webElement.sendKeys(text);
        }
    }

    // Helper method for getting web elements, with delay for loading page.
    private WebElement getWebElement(By by) {
        return wait.until(ExpectedConditions.presenceOfElementLocated(by));
    }

