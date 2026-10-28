package defpackage;

import android.os.Build;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class afws {
    private static final agrf a = agrf.h("com/google/apps/tiktok/tracing/TraceThreadContextElementKt");

    public static /* synthetic */ afwr a() {
        return new afwr(new ahno(), false, false);
    }

    public static final void b(awut awutVar) {
        ahx ahxVar = afwr.a;
        if (awutVar != null) {
            if (awutVar.b().get(ahxVar) != null) {
                return;
            }
            if (awrc.c(awutVar.getClass().getName(), "androidx.compose.runtime.RememberedCoroutineScope") && ((Boolean) awutVar.b().fold(Boolean.FALSE, new akm(12))).booleanValue()) {
                return;
            }
        }
        IllegalStateException illegalStateException = new IllegalStateException("TikTok coroutine tracing methods should only be called in a TikTok CoroutineContext: go/tiktok/dev/concurrent/coroutines/tracing#trace-propagation");
        if (awrc.c(Build.FINGERPRINT, "robolectric")) {
            throw illegalStateException;
        }
        if (awrc.c(Build.HARDWARE, "ranchu")) {
            String str = Build.FINGERPRINT;
            str.getClass();
            if (awrc.l(str, "test-keys", false)) {
                throw illegalStateException;
            }
        }
        boolean z = afty.a;
        ((agrc) ((agrc) a.b()).j(illegalStateException).k("com/google/apps/tiktok/tracing/TraceThreadContextElementKt", "checkHasTraceElement", 62, "TraceThreadContextElement.kt")).t("Missing trace context element");
    }
}
