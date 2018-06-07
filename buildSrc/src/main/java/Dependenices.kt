object Version {
    val compile_version = 27
    val min_version = 16
    val target_version = 27
    val kotlin_version = "1.2.41"
    val support_version = "27.1.1"
    val lifecycle_version = "1.1.1"
    val room_version = "1.1.0"
    val glide = "4.7.1"
}

object Libs {
    val kotlin_support = "org.jetbrains.kotlin:kotlin-stdlib-jdk7:${Version.kotlin_version}"
    val appcompat_v7 = "com.android.support:appcompat-v7:${Version.support_version}"
    val design = "com.android.support:design:${Version.support_version}"
    val percent = "com.android.support:percent:${Version.support_version}"
    val lifecycle = "android.arch.lifecycle:runtime:${Version.lifecycle_version}"
    val lifecycle_annotationProcessor = "android.arch.lifecycle:compiler:${Version.lifecycle_version}"
    val room = "android.arch.persistence.room:runtime:${Version.room_version}"
    val room_annotationProcessor = "android.arch.persistence.room:compiler:${Version.room_version}"
    val glide = "com.github.bumptech.glide:glide:${Version.glide}"
    val glide_annotationProcessor = "com.github.bumptech.glide:compiler:${Version.glide}"

}