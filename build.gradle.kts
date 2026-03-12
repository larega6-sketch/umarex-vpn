plugins { 
    kotlin("android")
    kotlin("kapt")
    id("com.android.application")
}

android { 
    compileSdk = 31

    defaultConfig { 
        applicationId = "com.example.umarexvpn"
        minSdk = 21
        targetSdk = 31
        versionCode = 1
        versionName = "1.0"
    }
    buildTypes { 
        release { 
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
    }
}

dependencies { 
    implementation(kotlin("stdlib"))
    // Add more dependencies here
}