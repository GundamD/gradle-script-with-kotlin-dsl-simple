
buildscript {


    repositories {
        google()
        jcenter()
    }


    dependencies {
        classpath(Libs.gradleTools)
        classpath(kotlin(Libs.kotlinGradlePlugin))
    }
}


allprojects {
    repositories {
        google()
        jcenter()
    }
}

tasks.register("clean", Delete::class) {
    delete(rootProject.buildDir)
}
