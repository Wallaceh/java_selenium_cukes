# BDD: Java Maven Cucumber Selenium Setup

## Setup

### Install on Local Machine

Install Java & Maven on your local machine

= To Run (Maven command line) =

Local machine with browser name (ie / chrome / firefox / safari)

- Test with Google Chrome (Mac / Windows for machineType):
```
> mvn test -DsiteUrl=http://www.google.com -DbrowserName="googlechrome" -DmachineType="mac"
```

- Test with Firefox (Mac / Windows for machineType):
```
> mvn test -DsiteUrl=http://www.google.com -DbrowserName="firefox" -DmachineType="mac"
```

- Test with IE (Windows Only):
```
> mvn test -DsiteUrl=http://www.google.com -DbrowserName="ie"
```

- Test with Safari (After install Safari extension, see /drivers/README.md):
```
> mvn test -DsiteUrl=http://www.google.com -DbrowserName="safari"
```

# WebDriver Update
See README inside /drivers folder


# Before we start

## Feature file: Gherkin Syntax
Gherkin is the language that Cucumber understands. You can find more Gherin Syntax here:
https://github.com/cucumber/cucumber/wiki/Gherkin

## Selenium Syntax
Selenium is an automated web browser testing. You can find some commonly used Selenium commands here:
http://www.seleniumhq.org/docs/02_selenium_ide.jsp#commonly-used-selenium-commands


# Configure your project siteUrl

You can update the siteUrl in the pom.xml property (default is http://www.google.com for my example) for your application need, also you can pass in from command line