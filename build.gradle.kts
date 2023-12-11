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
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine:5.8.2")
    implementation("com.sparkjava:spark-core:2.9.4")
    implementation("com.sparkjava:spark-template-handlebars:2.7.1")
    implementation("com.github.jknack:handlebars:4.3.0")
    implementation("org.slf4j:slf4j-simple:1.7.36")

}
    tasks.test {

    useJUnitPlatform()
}