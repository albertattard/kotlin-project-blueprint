# Kotlin Project Blueprint

A bare minimum [Kotlin](https://kotlinlang.org/) project that:

* Uses [Gradle](https://gradle.org/) with [Kotlin DSL](https://docs.gradle.org/current/userguide/kotlin_dsl.html)
* Targeted to [Java 1.8](https://www.oracle.com/technetwork/java/javase/overview/index.html)
* Uses [JUnit 5](https://junit.org/junit5/) test runner
* Uses [ktlint](https://github.com/pinterest/ktlint) as code linter
* Uses [Ben Manes gradle plugin](https://github.com/ben-manes/gradle-versions-plugin) as a dependency check to make sure that the project is using the latest dependencies


## How to use this repository

1. Clone this repository

    ```
    $ git clone https://github.com/albertattard/kotlin-project-blueprint.git <new-project-name>
    ```

1. Change the repository remote url

    ```
    $ git remote set-url origin <path-to-new-project-repository>.git
    ```

    Verify that repository remote url is properly set

    ```
    $ git remote -v
    ```

    This should return two paths pointing to the new repository

    ```
    origin <path-to-new-project-repository>.git (fetch)
    origin <path-to-new-project-repository>.git (push)
    ```

1. Change the project root name in the `settings.gradle.kts` file

    ```
    rootProject.name = "<new-project-name>"
    ```

1. Change the `README.md` file and the sample code
