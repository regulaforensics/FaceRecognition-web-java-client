plugins {
    java
    id("com.github.sherter.google-java-format") version "0.9"
    id("maven-publish")
}

java {
    sourceCompatibility = JavaVersion.VERSION_1_7
    targetCompatibility = JavaVersion.VERSION_1_7
    withSourcesJar()
}

sourceSets.main {
    java.srcDirs("src/main/java", "src/main/generated")
}

dependencies {
    implementation("com.squareup.okhttp3:okhttp:3.14.7")
    implementation("com.squareup.okhttp3:logging-interceptor:3.14.7")
    implementation("com.google.code.gson:gson:2.8.6")
    implementation("io.gsonfire:gson-fire:1.8.4")
    implementation("org.threeten:threetenbp:1.4.3")
    implementation("io.swagger:swagger-annotations:1.5.24")
    implementation("javax.annotation:javax.annotation-api:1.3.2")
    implementation("com.google.code.findbugs:jsr305:3.0.2")
}