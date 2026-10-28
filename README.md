# YouTube Music decompiled

Static decompilation of YouTube Music 9.42.52 (Android, arm64-v8a) using JADX 1.5.6. The APK SHA-256 is `9c38d63907362715f6172545bcb36f11ddbd45f014938626068016f06dcc3c56`.

`sources/` contains decompiled Java and `resources/` contains decoded application resources. This is reconstructed code, not Google's original source project. Names may be obfuscated and the output is not necessarily buildable. JADX reported 170 errors during decompilation; some portions may be incomplete.

## Build a resource-editable test APK

The recovered Java in `sources/` is for analysis and is not an Android Studio project. It cannot currently be compiled into the original app. The workflow below builds from the original APK's DEX bytecode and apktool-decoded resources instead. Changes to `sources/*.java` are **not** included. To alter code, use a compatible bytecode patching workflow or decode and edit smali separately.

Requirements: Java, your own copy of the unmodified YouTube Music 9.42.52 APK, [Apktool 3.0.3](https://github.com/iBotPeaches/Apktool/releases/tag/v3.0.3) and [uber-apk-signer 1.3.0](https://github.com/patrickfav/uber-apk-signer/releases/tag/v1.3.0). Supply local paths to the two JAR files and the APK; these files are not distributed in this repository.

```sh
./scripts/prepare-apk.sh /path/to/youtube-music.apk /path/to/apktool.jar work/decoded
# Optional: edit work/decoded/res or work/decoded/AndroidManifest.xml.
./scripts/build-apk.sh work/decoded /path/to/apktool.jar /path/to/uber-apk-signer.jar artifacts/test-build
```

The signed test APK is saved under `artifacts/test-build/signed/`. Both scripts refuse to replace an existing output directory. The signer uses its built-in debug key, so the result has a different signature from Google's app. Android will not install it over an app with the same package name and a different signing certificate; backup app data before considering removal of an existing installation. The changed signature may also affect Google services and login. Signature validation and APK building do not prove that the app runs; device or emulator testing is required.
