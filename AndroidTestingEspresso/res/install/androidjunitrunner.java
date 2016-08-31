apply plugin: 'com.android.application'

android {
    compileSdkVersion 22
    buildToolsVersion '22.0.1'
    defaultConfig {
        applicationId "com.example.android.testing.espresso.BasicSample"
        minSdkVersion 10
        targetSdkVersion 22
        versionCode 1
        versionName "1.0"

        testInstrumentationRunner "android.support.test.runner.AndroidJUnitRunner"
    }
    packagingOptions {
        exclude 'LICENSE.txt'
    }
    lintOptions {
        abortOnError false
    }
}

dependencies {
    // as before.......
}
