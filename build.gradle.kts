plugins {
    id("java")
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.9.1"))
    testImplementation("org.junit.jupiter:junit-jupiter")
    implementation ("org.testng:testng:7.9.0")
    implementation ("io.appium:java-client:9.1.0")
    implementation ("org.seleniumhq.selenium:selenium-java:4.18.1")
}

tasks.test {

    useJUnitPlatform()
// discover and execute TestNG-based tests
    useTestNG()


    }

