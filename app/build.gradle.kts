plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
}

android {
    namespace = "com.afghanistandigital.admin"
    compileSdk = 35

    defaultConfig {
        applicationId = "com.afghanistandigital.admin"
        minSdk = 24
        targetSdk = 35
        versionCode = 1
        versionName = "1.0"
    }
}
