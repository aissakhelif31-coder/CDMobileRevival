plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
}

android {
    namespace = "com.cdmobile.revival"
    compileSdk = 35

    defaultConfig {
        applicationId = "com.cdmobile.revival"
        minSdk = 23
        targetSdk = 28
        versionCode = 1
        versionName = "0.1"
    }
}
