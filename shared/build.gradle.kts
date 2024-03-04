plugins {
    alias(libs.plugins.kotlinMultiplatform)
    alias(libs.plugins.androidLibrary)
    alias(libs.plugins.compose)
    id ("dev.icerock.mobile.multiplatform-resources")
}

kotlin {
    android {
        compilations.all {
            kotlinOptions {
                jvmTarget = "1.8"
            }
        }
    }

    listOf(
        iosX64(),
        iosArm64(),
        iosSimulatorArm64()
    ).forEach {
        it.binaries.framework {
            baseName = "shared"
            isStatic = true
        }
    }

    sourceSets {
        val commonMain by getting {
            dependencies {
                implementation(compose.runtime)
                implementation(compose.material)
                implementation(compose.foundation)
                implementation("org.jetbrains.kotlinx:atomicfu:0.20.2")
            }
        }
        val iosX64Main by getting {
            resources.srcDirs("build/generated/moko/iosX64Main/src")
        }
        val iosArm64Main by getting {
            resources.srcDirs("build/generated/moko/iosX64Main/src")
        }
        val iosSimulatorArm64Main by getting {
            resources.srcDirs("build/generated/moko/iosX64Main/src")
        }
        val iosMain by creating {
            dependsOn(commonMain)
            iosX64Main.dependsOn(this)
            iosArm64Main.dependsOn(this)
            iosSimulatorArm64Main.dependsOn(this)
        }
    }
}

android {
    namespace = "com.korea.history"
    compileSdk = 34
    defaultConfig {
        minSdk = 24
    }

    dependencies {
        commonMainApi(libs.bundles.moko.resources)
    }

    sourceSets {
        named("main") {
            java.srcDirs("build/generated/moko/androidMain/src")
        }
    }
}

multiplatformResources {
    multiplatformResourcesPackage = "com.korea.history"
    iosBaseLocalizationRegion = "ko"
}

configurations.all {
    resolutionStrategy {
        force("org.jetbrains.skiko:skiko:0.7.88")
    }
}