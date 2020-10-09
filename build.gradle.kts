import org.gradle.plugins.ide.idea.model.IdeaLanguageLevel

plugins {
    idea
}

allprojects {
    group = "com.regula.facerecognition"

    repositories {
        jcenter()
    }
}

idea {
    project {
        languageLevel = IdeaLanguageLevel(JavaVersion.VERSION_1_7)
    }
}