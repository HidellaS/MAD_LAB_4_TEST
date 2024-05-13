plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
    id("kotlin-kapt")
}


android {
    namespace = "com.hidellas.task_manager"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.hidellas.task_manager"
        minSdk = 25
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

    packagingOptions {
        exclude("META-INF/atomicfu.kotlin_module")
    }
}


dependencies {
    implementation("androidx.appcompat:appcompat:${rootProject.extra["appCompatVersion"]}")
    implementation("androidx.activity:activity-ktx:${rootProject.extra["activityVersion"]}")

    // Room components
    implementation("androidx.room:room-ktx:${rootProject.extra["roomVersion"]}")
    kapt("androidx.room:room-compiler:${rootProject.extra["roomVersion"]}")
    androidTestImplementation("androidx.room:room-testing:${rootProject.extra["roomVersion"]}")

    // Lifecycle components
    implementation("androidx.lifecycle:lifecycle-viewmodel-ktx:${rootProject.extra["lifecycleVersion"]}")
    implementation("androidx.lifecycle:lifecycle-livedata-ktx:${rootProject.extra["lifecycleVersion"]}")
    implementation("androidx.lifecycle:lifecycle-common-java8:${rootProject.extra["lifecycleVersion"]}")

    // Kotlin components
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk7:${rootProject.extra["kotlinVersion"]}")
    api("org.jetbrains.kotlinx:kotlinx-coroutines-core:${rootProject.extra["coroutines"]}")
    api("org.jetbrains.kotlinx:kotlinx-coroutines-android:${rootProject.extra["coroutines"]}")

    // UI
    implementation("androidx.constraintlayout:constraintlayout:${rootProject.extra["constraintLayoutVersion"]}")
    implementation("com.google.android.material:material:${rootProject.extra["materialVersion"]}")

    // Testing
    testImplementation("junit:junit:${rootProject.extra["junitVersion"]}")
    androidTestImplementation("androidx.arch.core:core-testing:${rootProject.extra["coreTestingVersion"]}")
    androidTestImplementation("androidx.test.espresso:espresso-core:${rootProject.extra["espressoVersion"]}") {
        exclude(group = "com.android.support", module = "support-annotations")
    }
    androidTestImplementation("androidx.test.ext:junit:${rootProject.extra["androidxJunitVersion"]}")
}
