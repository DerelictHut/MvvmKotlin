import org.gradle.api.JavaVersion

/**
 * @author wjl
 */
object DhAndroid {
    const val applicationId = "com.derelicthut.basecode.mvvmkotlin"
    const val compileSdkVersion = 30
    const val buildToolsVersion = "30.0.2"
    const val minSdkVersion = 21
    const val targetSdkVersion = 30
    const val versionCode = 1
    const val versionName = "1.0"
    const val testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    const val consumerProguardFiles = "consumer-rules.pro"
    val sourceCompatibility = JavaVersion.VERSION_1_8
    val targetCompatibility = JavaVersion.VERSION_1_8
    val jvmTarget = "1.8"
}

object DhVersion {
    const val kotlin_version = "1.3.72"
    const val room_version = "2.3.0"
    const val arouter_version = "1.5.1"
    const val navigation_version = "2.3.4"
}

object DhTest {
    const val junit = "junit:junit:4.+"
    const val androidx_test_ext_junit = "androidx.test.ext:junit:1.1.2"
    const val espresso_core = "androidx.test.espresso:espresso-core:3.3.0"
}

object DhDependencies {
    const val kotlin_stdlib = "org.jetbrains.kotlin:kotlin-stdlib:${DhVersion.kotlin_version}"
    const val core_ktx = "androidx.core:core-ktx:1.3.2"
    const val appcompat = "androidx.appcompat:appcompat:1.2.0"
    const val material = "com.google.android.material:material:1.2.1"
    const val constraint_layout = "androidx.constraintlayout:constraintlayout:2.0.4"
    const val gson = "com.google.code.gson:gson:2.8.8"

    //三方
    const val utilcode = "com.blankj:utilcode:1.30.6"
    const val navigation_fragment_ktx = "androidx.navigation:navigation-fragment-ktx:${DhVersion.navigation_version}"
    const val navigation_ui_ktx = "androidx.navigation:navigation-ui-ktx:${DhVersion.navigation_version}"
    const val noober_background = "com.noober.background:core:1.6.5"
    const val arouter = "com.alibaba:arouter-api:${DhVersion.arouter_version}"
    const val room = "androidx.room:room-runtime:${DhVersion.room_version}"
    const val room_ktx = "androidx.room:room-ktx:${DhVersion.room_version}"
}

object DhDependenciesCompiler {
    const val arouter_compiler = "com.alibaba:arouter-compiler:${DhVersion.arouter_version}"
    const val room_compiler = "androidx.room:room-compiler:${DhVersion.room_version}"
}