plugins {
    id("com.android.library")
    kotlin("android")
    kotlin("kapt")
}

repositories {
	jcenter()
}

android {
    compileSdkVersion(30)
}

dependencies {
    kapt(project(":library"))
}
