plugins {
    alias(libs.plugins.mifos.android.feature)
    alias(libs.plugins.mifos.android.library.compose)
    alias(libs.plugins.kotlin.parcelize)
}


android {
    namespace = "org.mifos.mobile.feature.third.party.transfer"
}

dependencies {
    implementation(projects.ui)
    implementation(projects.core.common)
    implementation(projects.core.model)
    implementation(projects.core.data)

    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.test.ext.junit)
    androidTestImplementation(libs.espresso.core)
}