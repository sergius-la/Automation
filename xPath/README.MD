# xPath

- [_XMLQuire App_](http://qutoric.com/xmlquire/)


```
https://www.w3schools.com/xml/xpath_axes.asp

/ -- Absolute Path
// -- Relative Path
.// -- Relative to Curent Element

It's possible to locate parent WebElements with XPath
/..
//input[@name='password']/..


Go UP - /..
driver.findElement(By.className("quickLinkText")).findElement(By.xpath(".//../img"));





-- How to find Xpath by Class -- 

//*[contains(@class, 'Test')]
//div[contains(@class, 'Test')]
--



//IOS va carifull with tag name. We can't get elements using that tag


Select by Tag and Attribute
  Tag   Atribute
//input[@name='username']


Select by Tag with multiple Attribute
    Tag   Atribute         Atribute
//input[@type='submit' and @value='Login' and  ...]


Link:
//a[text()='Features']
//a[contains(text(), 'Features')]

Button:
//button[@type='button' and @class='btn']
//button[contains(text(), 'Sing Up')]




From Parent to Child //__TAG__//__TAG__

Parent // Child HTML Tag // Contains Text 
//a//font[contains(text(), Sign_Up)]

//div[@class='bd-example']//div[@class='dropdown']//button[@class='btn btn-secondary dropdown-toggle' and @id='dropdownMenuButton']





From Element to Parent to Sibling to Child
 Element                  Parent                            Sibling                                     Child
//a[text()='test2 test2']//parent::td[@class='datalistrow']//preceding-sibling::td[@class='datalistrow']//input[@name='contract_id']

###

xPath - Child

//First Child -- /*[1]
//li[@class='location']/*[1]

###

xPath - contains()

Button:
//button[@type='button' and @class='btn']
//button[contains(text(), 'Sing Up')]

###

xPath - Dropdown menu

<select>
<option value="first option"> 1 </option>
<option value="second option"> 2 </option>
<option value="third option"> 3 </option>
</select>

by Position     --  //select/option[1] 
by Text         --  //select[@id='__id__']/option[text() = '__first option__']
by Value        --  //select[@id='__id__']/option[@value='__first option__']

###

xPath - ends-with()

ends-with(@id, '__test__')   -- All elements whitch Id's ending on

###

xPath - following

// following -- Selects everything in the document after the closing tag of the current node

  Element                                                                         Following Element
//input[@class='form-control ng-scope ng-pristine ng-valid ng-valid-required']//following::input[@type='text' and @placeholder='Yrs Exp']

###

xPath - Parent

Parent:
/..
//parent::__tag__

//a[text()='Buy']/../../..
//a[text()='Buy']//parent::h3//parent::li//parent::ul

###

xPath - starts-with()

//select[@id='gh-cat']/option[starts-with(text(), 'C')]     -- Find All elements there text stating with C leter
starts-with(@id, '__test__')                                -- All elements there Id's starts with

###

xPath - WebTools (console)

//Check the xPath Result
At the Console
$x("__xPath__")