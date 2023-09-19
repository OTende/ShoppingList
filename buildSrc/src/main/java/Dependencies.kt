object Dependencies {
    val appCompat by lazy { "androidx.appcompat:appcompat:${Versions.appCompat}" }
    val android by lazy { "androidx.core:core-ktx:${Versions.android}"}
    val navigatonFragment by lazy { "androidx.navigation:navigation-fragment-ktx:${Versions.navigation}" }
    val navigatonUi by lazy { "androidx.navigation:navigation-ui-ktx:${Versions.navigation}" }
    val material by lazy { "com.google.android.material:material:${Versions.material}" }
    val retrofit by lazy { "com.squareup.retrofit2:retrofit:${Versions.retrofit}" }
    val constraintLayout by lazy { "androidx.constraintlayout:constraintlayout:${Versions.constraintLayout}" }
    val roomRuntime by lazy { "androidx.room:room-runtime:${Versions.room}" }
    val roomCompiler by lazy { "androidx.room:room-compiler:${Versions.room}" }
    val hilt by lazy { "com.google.dagger:hilt-android:${Versions.hilt}" }
    val hiltCompiler by lazy { "com.google.dagger:hilt-compiler:${Versions.hilt}" }

    object Test {
        val junit by lazy { "junit:junit:${Versions.junit}" }
    }

    object AndroidTest {
        val extJunit by lazy { "androidx.test.ext:junit:${Versions.extJunit}" }
        val espresso by lazy { "androidx.test.espresso:espresso-core:${Versions.espresso}" }
    }
}