// Top-level build file where you can add configuration options common to all sub-projects/modules.

buildscript {
    // Define the versions of dependencies here using Kotlin syntax
    extra["activityVersion"] = "1.2.3"
    extra["appCompatVersion"] = "1.3.0"
    extra["constraintLayoutVersion"] = "2.0.4"
    extra["coreTestingVersion"] = "2.1.0"
    extra["coroutines"] = "1.5.0"
    extra["lifecycleVersion"] = "2.3.1"
    extra["materialVersion"] = "1.3.0"
    extra["roomVersion"] = "2.3.0"
    extra["junitVersion"] = "4.13.2"
    extra["espressoVersion"] = "3.1.0"
    extra["androidxJunitVersion"] = "1.1.2"
    extra["kotlinVersion"] = "1.9.10"
}

plugins {
    id("com.android.application") version "8.2.0-rc01" apply false
    id("org.jetbrains.kotlin.android") version "1.9.10" apply false
}

