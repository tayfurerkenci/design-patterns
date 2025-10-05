plugins {
    kotlin("jvm")
    application
}

group = "org.hf_design_patterns"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation(kotlin("stdlib"))
    testImplementation(kotlin("test"))
}

application {
    // Top-level Kotlin main ends up in a class named <FileName>Kt
    mainClass.set("org.hf_design_patterns.DuckSimulatorKt")
}

tasks.test {
    useJUnitPlatform()
}

kotlin {
    jvmToolchain(21)
}