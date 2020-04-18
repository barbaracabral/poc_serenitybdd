## Automated web tests using Serenity, Cucumber and Maven

A simple project with BDD-style automated acceptance criteria

Install all the frameworks with Maven using pom.xml
```
mvn clean install
```

Run all the tests like this passing the environment profile parameter:
```
mvn clean verify -Denvironment=prod
```

Run a specific feature file like this:
```
mvn clean verify -Denvironment=dev -Dcucumber.options=“src/test/resources/features/home.feature”
```

Run ALL tests with annotation tag:
```
mvn clean verify -Denvironment=prod -Dcucumber.options="--tags @all"
```

Run a specific annotation tag like this:
```
mvn clean verify -Denvironment=prod -Dcucumber.options="--tags @demo"
```


By default, the tests run with Chrome. Otherwise, if you prefer Firefox, modify the serenity.properties file or run the tests like this:
```
mvn clean verify -Denvironment=prod -Dwebdriver.driver=firefox
```

The reports will be generated in "target/site/serenity"
