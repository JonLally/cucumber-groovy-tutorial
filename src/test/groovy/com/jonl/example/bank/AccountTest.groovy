package com.jonl.example.bank

import cucumber.api.CucumberOptions
import cucumber.api.junit.Cucumber
import org.junit.runner.RunWith

@RunWith(Cucumber)
@CucumberOptions(features = 'src/test/resources/features', glue = 'src/test/groovy/com/jonl/example/cucumber/steps')
class AccountTest {
}
