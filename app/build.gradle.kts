plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
}

android {
    namespace = "com.mustafaoguzdemirel.gamifiedstepcounterapp"
    compileSdk = 34

    buildFeatures {
        buildConfig = true
        viewBinding = true
    }

    defaultConfig {
        applicationId = "com.mustafaoguzdemirel.gamifiedstepcounterapp"
        minSdk = 24
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
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
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
}

dependencies {

    implementation("androidx.core:core-ktx:1.13.0")
    implementation("androidx.appcompat:appcompat:1.6.1")
    implementation("com.google.android.material:material:1.11.0")
    implementation("androidx.constraintlayout:constraintlayout:2.1.4")
    testImplementation("junit:junit:4.13.2")
    androidTestImplementation("androidx.test.ext:junit:1.1.5")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1")
    implementation("com.makeramen:roundedimageview:2.3.0")
    implementation("org.greenrobot:eventbus:3.3.1")
    implementation("com.sothree.slidinguppanel:library:3.4.0")
    implementation("com.github.bumptech.glide:glide:4.13.1")
    annotationProcessor("com.github.bumptech.glide:compiler:4.13.0")
}