plugins {
    id("java")
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    // https://mvnrepository.com/artifact/org.apache.kafka/kafka-clients
    implementation("org.apache.kafka:kafka-clients:3.1.0")

    // https://mvnrepository.com/artifact/org.slf4j/slf4j-api
    implementation("org.slf4j:slf4j-api:1.7.36")

    // https://mvnrepository.com/artifact/org.slf4j/slf4j-log4j12
    implementation("org.slf4j:slf4j-log4j12:1.7.36")

}

tasks.test {
    useJUnitPlatform()
}