object Modules{
    val app = ":app"
    const val feature1 =":feature:feature1"
    const val feature2 =":feature:feature2"
    const val feature3 =":feature:feature3"
    const val core =":core"
    const val hybridGradleModule =":hybrid_gradle_module"


}

object PlugIns {
    const val androidApplication = "com.android.application"
    const val androidLibrary = "com.android.library"
    const val kotlinAndroid = "android"
    const val kotlinExtension = "android.extensions"
    const val kotlinKapt = "kapt"
}
object Android {
    const val compileSdkVersion = 29
    const val buildToolsVersion = "29.0.2"
    const val applicationId = "com.example.gradle_script_with_kotlin_dsl_simple"
    const val feature1Id = "com.example.gradle_script_with_kotlin_dsl_simple"
    const val minSdkVersion = 19
    const val minSdkVersion21 = 21
    const val targetSdkVersion = 29
    const val versionCode = 1
    const val versionName = "1.0"
    const val testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"

    const val proguardFile ="proguard-android-optimize.txt"
    const val proguardRules = "proguard-rules.pro"
}

object BuildType{
    const val debug = "debug"
    const val release = "release"
}


object Version {
    const val gradleToolsVersion = "3.5.3"
    const val kotlinVersion = "1.3.60"
    const val googleServiceVersion = "4.3.3"
    const val appCompatVersion = "1.1.0"
    const val androidKTXVersion = "1.1.0"
    const val googleMaterialVersion ="1.0.0"
    const val constraintLayoutVersion = "1.1.3"

    const val junitVersion = "4.12"
    const val junitExtVersion = "1.1.1"
    const val espressoCoreVersion = "3.2.0"

}

object Libs{
    const val gradleTools = "com.android.tools.build:gradle:${Version.gradleToolsVersion}"
    const val kotlinGradlePlugin = "gradle-plugin:${Version.kotlinVersion}"
    const val googleService = "com.google.gms:google-services:${Version.googleServiceVersion}"
    const val kotlinStd = "stdlib-jdk8:${Version.kotlinVersion}"
    const val appCompat = "androidx.appcompat:appcompat:${Version.appCompatVersion}"
    const val googleMaterial = "com.google.android.material:material:${Version.googleMaterialVersion}"


    const val androidKTX = "androidx.core:core-ktx:${Version.androidKTXVersion}"
    const val constraintLayout = "androidx.constraintlayout:constraintlayout:${Version.constraintLayoutVersion}"
}

object TestLibs{
    const val junit = "junit:junit:${Version.junitVersion}"
    const val junitExt = "androidx.test.ext:junit:${Version.junitExtVersion}"
    const val espressoCore = "androidx.test.espresso:espresso-core:${Version.espressoCoreVersion}"
}