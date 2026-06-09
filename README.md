 # Roman Numeral Converter

  A simple Java library built with TDD to convert Roman numerals to integers and integers to Roman numerals.

  ## Prerequisites

  - Java 17
  - Maven 3.8+

  ## Project Structure
```
  demo/
  ├── pom.xml
  └── src
      ├── main
      │   └── java
      │       └── com
      │           └── example
      │               └── RomanConverter.java
      └── test
          └── java
              └── com
                  └── example
                      └── RomanConverterTest.java
```

  ## How to Run the Tests and View the JaCoCo Report

  From the demo directory, run:

 ```
 mvn test
 ```

  This executes the JUnit Jupiter test suite and generates the JaCoCo coverage report.

  After the build completes, open the report at:
```
  target/site/jacoco/index.html
```

  If you are starting from the repository root, first move into the project module:

```
cd demo
mvn test
```