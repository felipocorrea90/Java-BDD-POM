The purpose of this project is to clearly define the different layers of a test automation design that uses the Page Object Model pattern.

Each package represents a different purpose in the following way:

##Elements
Each class added in the elements package represents a page object, some projects also separate modules and/or components as the page object unit. In this case, our class is a Page unit and with the help of Selenium PageFactory we can locate the elements we interact with by using the @FindBy annotation. Any methods that interact with those elements are also added in this class.

##Steps
This is the place to add your Cucumber step definitions that will match via regular expression the content of your feature files. 

##Utils
This package is to add classes of general/global utilities. Like getting the WebDriver.

##Resources
This is the place to add your feature files and your drivers (chromedriver in this example)

### What is the current example

1. The driver goes to the El Tiempo website (a news site from Colombia, where I'm from)
2. Clicks the Colombia option from the site menu
3.Validates that after the page redirection the driver is located where it should.

The behavior of the above example is very trivial however the point of this project is not to add a complex test scenario but instead represent an example of a POM implementation.
