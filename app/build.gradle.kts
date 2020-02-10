plugins {
    id(PlugIns.androidApplication)
    kotlin(PlugIns.kotlinAndroid)
    kotlin(PlugIns.kotlinExtension)
    kotlin(PlugIns.kotlinKapt)
}

android {
    compileSdkVersion(Android.compileSdkVersion)
    buildToolsVersion = Android.buildToolsVersion
    defaultConfig {
        applicationId = Android.applicationId
        minSdkVersion(Android.minSdkVersion)
        targetSdkVersion(Android.targetSdkVersion)
        versionCode = Android.versionCode
        versionName = Android.versionName
        testInstrumentationRunner = Android.testInstrumentationRunner
    }
    buildTypes {
        getByName(BuildType.release) {
            isMinifyEnabled = true
            proguardFiles(getDefaultProguardFile(Android.proguardFile), Android.proguardRules)
        }
    }
}
dependencies {
    implementation(fileTree(mapOf("dir" to "libs", "include" to listOf("*.jar"))))
    implementation(kotlin(Libs.kotlinStd))
    implementation(Libs.appCompat)
    implementation(Libs.androidKTX)
    implementation(Libs.constraintLayout)
    implementation(Libs.googleMaterial)

    implementation(project(Modules.feature1))
    implementation(project(Modules.feature2))
    implementation(project(Modules.core))
    implementation(project(":feature:feature3"))

    testImplementation(TestLibs.junit)
    androidTestImplementation(TestLibs.junitExt)
    androidTestImplementation(TestLibs.espressoCore)
}
