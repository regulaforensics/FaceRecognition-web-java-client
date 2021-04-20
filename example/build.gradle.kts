plugins {
    java
    application
}


application {
    mainClass.set("com.regula.facesdk.webclient.Main")
}

java {
    sourceCompatibility = JavaVersion.VERSION_11
    targetCompatibility = JavaVersion.VERSION_11
}

dependencies {
    implementation(project(":client", "default"))
}