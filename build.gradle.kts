plugins {
    id("java")
    id("jacoco")
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
//    implementation("com.google.code.gson:gson:2.10.1")
    implementation ("com.google.code.gson:gson:2.11.0")
    implementation("com.opencsv:opencsv:5.8")
    testImplementation("org.junit.jupiter:junit-jupiter:5.10.1")
}

tasks.test {
    useJUnitPlatform()
}