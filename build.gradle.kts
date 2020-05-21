import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm").version("1.3.72")
    id("org.jlleitschuh.gradle.ktlint").version("9.2.1")
    id("com.github.ben-manes.versions").version("0.28.0")
    id("info.solidsoft.pitest").version("1.5.1")
}

tasks {
    withType<KotlinCompile> {
        kotlinOptions.jvmTarget = "1.8"
    }

    test {
        useJUnitPlatform()
        testLogging {
            events("passed", "skipped", "failed")
        }
    }
}

repositories {
    mavenLocal()
    jcenter()
}

configurations {
    all {
        resolutionStrategy {
            force(
                "com.pinterest:ktlint:0.36.0",
                "com.pinterest.ktlint:ktlint-reporter-checkstyle:0.36.0"
            )
        }
    }
}

pitest {
    this.targetClasses.set(setOf("com.albertattard.example.*"))
    this.testPlugin.set("junit5")
    this.failWhenNoMutations.set(true)
}

dependencies {
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8:1.3.72")
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.3.7")

    testImplementation("org.jetbrains.kotlin:kotlin-test:1.3.72")
    testImplementation("org.jetbrains.kotlin:kotlin-test-junit5:1.3.72")
    testImplementation("org.junit.jupiter:junit-jupiter:5.7.0-M1")

    testRuntimeOnly("org.pitest:pitest-junit5-plugin:0.12")
}

defaultTasks("clean", "ktlintFormat", "dependencyUpdates", "test")
