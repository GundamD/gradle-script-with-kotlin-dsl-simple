plugins {
    id(PlugIns.androidLibrary)
    kotlin(PlugIns.kotlinAndroid)
    kotlin(PlugIns.kotlinExtension)
}
android {
    compileSdkVersion(Android.compileSdkVersion)
    buildToolsVersion = Android.buildToolsVersion
    defaultConfig {
        minSdkVersion(Android.minSdkVersion)
        targetSdkVersion(Android.targetSdkVersion)
        versionCode = Android.versionCode
        versionName = Android.versionName

        testInstrumentationRunner = Android.testInstrumentationRunner
        consumerProguardFiles(
            file("proguard-rules.pro")
        )
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
    testImplementation(TestLibs.junit)
    androidTestImplementation(TestLibs.junitExt)
    androidTestImplementation(TestLibs.espressoCore)

    implementation(project(Modules.core))
}
