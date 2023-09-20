plugins {
    id("com.android.library")
    id("org.jetbrains.kotlin.android")
    id("com.google.dagger.hilt.android")
    id("com.google.devtools.ksp")
}

android {
    namespace = "com.example.core"
    compileSdk = 34

    defaultConfig {
        minSdk = 24

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        consumerProguardFiles("consumer-rules.pro")
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }
    kotlinOptions {
        jvmTarget = "17"
    }
}

dependencies {
    implementation(Dependencies.android)
    implementation(Dependencies.appCompat)
    implementation(Dependencies.material)
    implementation(Dependencies.retrofit)
    implementation(Dependencies.navigatonUi)
    implementation(Dependencies.navigatonFragment)
//    implementation(Dependencies.roomRuntime)
    implementation(Dependencies.hilt)
    ksp(Dependencies.hiltCompiler)
    testImplementation(Dependencies.Test.junit)
    androidTestImplementation(Dependencies.AndroidTest.extJunit)
    androidTestImplementation(Dependencies.AndroidTest.espresso)
}