# cucumber-groovy-tutorial
Simple project to show cucumber and groovy configured by maven

There wasn't much problems getting this to run through intellij but maven<br> 
would not execute the tests.

In the AccountTest.groovy class adding the location of the feature files and<br> 
the location of the test steps solved this.

```groovy
@RunWith(Cucumber)
@CucumberOptions(features = 'src/test/resources/features',
        glue = 'src/test/groovy/com/jonl/example/cucumber/steps')
class AccountTest {
}
```

