<!-- [_Appium docs: _]() -->

# Appium

## Appium server

### Terminal

Start server - `appium`

| Key | Description |
| --- | --- |
| -p | port |
| -bp |  |
| -U | iOS UDID |
| --log-timestamp | Log with time stamp |

## Appium Desired Capabilities

- [_Appium docs: Desired Capabilities_](http://appium.io/docs/en/writing-running-appium/caps/)
- [__Desired Capabilities__](/Appium/DesiredCapabilities.md)

## Device

- `Activity`
- `App`
    - [_`Background App`_](https://appium.readthedocs.io/en/latest/en/commands/device/app/background-app/)
    ```java
    driver.runAppInBackground(Duration.ofSeconds(10));
    ```
- `Emulator`
- `Files`
- `System`
- [_`KeyCode / adb KeyEvent`_](http://appium.io/docs/en/commands/device/keys/press-keycode/)
    ```java
    driver.pressKeyCode(AndroidKeyCode.HOME);
    ```

## Activity

[_`Get Page Source`_](http://appium.io/docs/en/commands/session/source/)
```java
String pageSource = driver.getPageSource();
``` 

## Element

#### Element locators

- `xPath`
- `resource-id` - id
- `content-desc` - accessibility id
- `text` - element attribute

#### Element attributes

[_`Get Element Attribute`_](https://appium.readthedocs.io/en/stable/en/commands/element/attributes/attribute/)
```java
MobileElement element = (MobileElement) driver.findElementByAccessibilityId("SomeAccessibilityID");
String tagName = element.getAttribute("content-desc");
```

- `text`
- `location`
- `size`
- `displayed`
- [_`bounds / coordinate`_](https://discuss.appium.io/t/is-there-anyway-to-get-the-bounds-properties-of-element-using-appium/17215)
    ```java
    [el.getLocation().getX(), el.getLocation().getY()] // first [x,y]
    [el.getLocation().getX() +el.getSize().getWidth(), el.getLocation().getY()+el.getSize().getHeight()] // second [x,y]
    ```

## adb

[__adb commands__](https://github.com/sergius-la/Cheatsheet/blob/master/adb.md)