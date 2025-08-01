package dev.bartuzen.qbitcontroller

import org.gradle.api.JavaVersion as GradleJavaVersion

object Versions {
    const val AppVersion = "2.0.4"
    const val AppVersionCode = 26

    object Android {
        const val CompileSdk = 36
        const val TargetSdk = 36
        const val MinSdk = 21

        val JavaVersion = GradleJavaVersion.VERSION_21
        const val JvmTarget = "21"
    }
}
