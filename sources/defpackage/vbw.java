package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class vbw {
    private static final agrf a = agrf.h("com/google/android/libraries/youtube/creation/effects/util/DrishtiJniLoader");
    private static final AtomicBoolean b = new AtomicBoolean();

    public static synchronized void a() {
        AtomicBoolean atomicBoolean = b;
        if (!atomicBoolean.get()) {
            try {
                System.loadLibrary("drishti_jni_native");
                atomicBoolean.set(true);
            } catch (UnsatisfiedLinkError e) {
                zvj zvjVarA = zvk.a();
                zvjVarA.c(ajtv.ERROR_LEVEL_ERROR);
                zvjVarA.j = 71;
                zvjVarA.i = 260;
                zvjVarA.d("drishti_jni_native library failed to load.");
                zvjVarA.f(e);
                zvs.a(zvjVarA.a());
                ((agrc) ((agrc) ((agrc) a.b()).j(e)).k("com/google/android/libraries/youtube/creation/effects/util/DrishtiJniLoader", "load", ')', "DrishtiJniLoader.java")).t("Load library: drishti_jni_native - Failed to load");
            }
        }
    }
}
