package com.google.android.libraries.multiplatform.elements.runtime;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class NativeLibraryInitializer {
    private static volatile boolean a = false;

    private NativeLibraryInitializer() {
    }

    public static void a() {
        if (a) {
            return;
        }
        synchronized (NativeLibraryInitializer.class) {
            if (!a) {
                jniInitialize();
                a = true;
            }
        }
    }

    private static native void jniInitialize();
}
