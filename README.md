# Steps to solve status baar issue in android device API 35

1. Add **enableEdgeToEdge** with status bar style.
   
   ```
   enableEdgeToEdge(
            statusBarStyle = SystemBarStyle.dark(
                scrim = Color.Red.toArgb()
            )
        )
   ```
   
2. Change **target sdk from 35 to 34**, but compile sdk will be the same 35.
   
   ```
   android {
    namespace = "com.cutech.changestatusbarcolor"
    compileSdk = 35
    defaultConfig {
        applicationId = "com.cutech.changestatusbarcolor"
        minSdk = 24
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"
        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
       }
   }

3. If you still face issues with the toolbar, such as shrinking or collapsing, then just add the code below to the toolbar.

```
CenterAlignedTopAppBar(
   modifier = Modifier.windowInsetsPadding(WindowInsets.systemBars).fillMaxWidth(),
   title = { Text(text = "Toolbar", color = Color.White) },
   colors = TopAppBarDefaults.topAppBarColors(containerColor = Color.DarkGray)
)
```

> If you are satisfied with our solution, then please share it with others as well.
   
